package ticketBookingService.dtos;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import ticketBookingService.enums.BookingStatus;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDto {


    @NotNull(message ="user id is mandatory")
    private int userId;

    @Positive(message = "provide a movie id")
    private Integer movieId;

    @NotBlank(message = "You need to select atleast one seat to create a booking ")
    private List<String> seatSelected;

    @NotBlank(message = "please select a show date")
    private LocalDate showDate;

    @NotBlank(message ="Please select a show time")
    private LocalTime showTime;

    private double bookingAmount;

}
