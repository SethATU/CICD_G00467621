package ie.atu.sample.controller;

import ie.atu.sample.dto.CreateBookingRequest;
import ie.atu.sample.model.Booking;
import ie.atu.sample.service.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {
    private final BookingService bookingService;
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Booking createBooking(@RequestBody CreateBookingRequest request) { return bookingService.createBooking(request); }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Booking> getAllBookings() { return bookingService.getAllBookings(); }

    @GetMapping("/{id}")
    public Booking getById(@PathVariable Long id){ return bookingService.getById(id);}
}
