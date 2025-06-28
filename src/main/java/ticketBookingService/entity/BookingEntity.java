package ticketBookingService.entity;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.NoArgsConstructor;
import ticketBookingService.enums.BookingStatus;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="booking_details")
@NoArgsConstructor
public class BookingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID bookingId;
    private int userId;
    private Integer movieId;

    //@ElementCollection is an annotation used to
    // map collections of basic types or embeddable
    // types (not entities) to a separate table.
    @ElementCollection
    private List<String> seatSelected;

    private LocalDate showDate;
    private LocalTime showTime;

    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;
    private double bookingAmount;

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public double getBookingAmount() {
        return bookingAmount;
    }

    public void setBookingAmount(double bookingAmount) {
        this.bookingAmount = bookingAmount;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public UUID getBookingId() {
        return bookingId;
    }

    public void setBookingId(UUID bookingId) {
        this.bookingId = bookingId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<String> getSeatSelected() {
        return seatSelected;
    }

    public void setSeatSelected(List<String> seatSelected) {
        this.seatSelected = seatSelected;
    }

    public LocalDate getShowDate() {
        return showDate;
    }

    public void setShowDate(LocalDate showDate) {
        this.showDate = showDate;
    }

    public LocalTime getShowTime() {
        return showTime;
    }

    public void setShowTime(LocalTime showTime) {
        this.showTime = showTime;
    }

    public BookingEntity(UUID bookingId, int userId, Integer movieId, List<String> seatSelected, LocalDate showDate, LocalTime showTime) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.movieId = movieId;
        this.seatSelected = seatSelected;
        this.showDate = showDate;
        this.showTime = showTime;
    }

    @Override
    public String toString() {
        return "BookingEntity{" +
                "bookingId=" + bookingId +
                ", userId=" + userId +
                ", movieId=" + movieId +
                ", seatSelected=" + seatSelected +
                ", showDate=" + showDate +
                ", showTime=" + showTime +
                '}';
    }
}
