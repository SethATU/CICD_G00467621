package ie.atu.sample.client;

import ie.atu.sample.model.Booking;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "room-service", url = "http://localhost:8082")
public interface Client {
    @GetMapping("/booking/{id}")
    ResponseEntity<Booking> getBookingById(@PathVariable("id") Long id);
}
