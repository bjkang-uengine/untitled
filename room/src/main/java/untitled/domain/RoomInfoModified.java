package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class RoomInfoModified extends AbstractEvent {

    private Long id;

    public RoomInfoModified(Room aggregate) {
        super(aggregate);
    }

    public RoomInfoModified() {
        super();
    }
}
