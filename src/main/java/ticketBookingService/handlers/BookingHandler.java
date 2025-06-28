package ticketBookingService.handlers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class BookingHandler {

    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public void methodArgumentNotvalidException(MethodArgumentNotValidException exception){
        log.info(exception.getMessage());
    }
}
