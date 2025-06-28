package ticketBookingService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ticketBookingService.entity.BookingEntity;

import java.util.UUID;
@Repository
public interface BookingRepo extends JpaRepository<BookingEntity, UUID> {

}
