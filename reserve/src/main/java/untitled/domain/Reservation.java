package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.ReserveApplication;
import untitled.domain.Reserved;

@Entity
@Table(name = "Reservation_table")
@Data
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        untitled.external.Notification notification = new untitled.external.Notification();
        // mappings goes here
        ReserveApplication.applicationContext
            .getBean(untitled.external.NotificationService.class)
            .notifyToCustomaer(notification);

        Reserved reserved = new Reserved(this);
        reserved.publishAfterCommit();
    }

    public static ReservationRepository repository() {
        ReservationRepository reservationRepository = ReserveApplication.applicationContext.getBean(
            ReservationRepository.class
        );
        return reservationRepository;
    }
}
