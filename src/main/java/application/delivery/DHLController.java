package application.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/dhl_delivery")
@RestController
public class DHLController {
    @GetMapping
    public List<? extends Delivery> getDeliveries() {
        return List.of(new DHLDeliveryStrategy());
    }
}
