package ticketBookingService.service;

import org.springframework.stereotype.Service;
import ticketBookingService.dtos.BookingDto;

@Service
public interface BookingService {

    public void createBooking(BookingDto bookingDto);
}
