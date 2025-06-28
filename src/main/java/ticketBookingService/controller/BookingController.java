package ticketBookingService.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ticketBookingService.dtos.BookingDto;

@RestController
@RequestMapping("/booking")
public class BookingController {
    @PostMapping
    public void createBooking(@RequestBody BookingDto bookingDto)
    {


    }
}
