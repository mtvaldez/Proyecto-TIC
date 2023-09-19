package um.edu.uy.springBoot.airport;

import org.springframework.stereotype.Service;

@Service
public class AirportService {

        private final AirportRepository airportRepository;

        public AirportService(AirportRepository airportRepository) {
            this.airportRepository = airportRepository;
        }

        public void saveAirport(String name, String city, String country) {
            Airport alreadyExists = airportRepository.findByName(name);
            if (alreadyExists == null) {
                airportRepository.save(new Airport(name, city, country));
            }
        }
}
