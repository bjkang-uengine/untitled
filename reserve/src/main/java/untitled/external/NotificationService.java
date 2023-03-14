package untitled.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "notify", url = "${api.url.notify}")
public interface NotificationService {
    @RequestMapping(method = RequestMethod.POST, path = "/notifications")
    public void notifyToCustomaer(@RequestBody Notification notification);
}
