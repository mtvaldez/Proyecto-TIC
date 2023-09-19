package um.edu.uy.springBoot.airport;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends JpaRepository<Airport, String> {
    Airport findByName(String name);

    Airport findByCity(String city);

    Airport findByCountry(String country);

}
