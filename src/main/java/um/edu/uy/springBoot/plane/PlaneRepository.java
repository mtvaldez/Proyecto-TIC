package um.edu.uy.springBoot.plane;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaneRepository extends JpaRepository<Plane, Long> {

    Plane findByPlate(String plate);

    Plane findByType(String type);

    Plane findByCapacity(String capacity);

    Plane findBySeats(String seats);

    Plane findByState(String state);

}
