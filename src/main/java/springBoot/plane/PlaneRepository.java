package springBoot.plane;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaneRepository extends JpaRepository<Plane, Long> {

    Plane findByPlate(String plate);



}
