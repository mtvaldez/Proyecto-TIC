package um.edu.uy.springBoot.airline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirlineService {
    private final AirlineRepository airlineRepository;

    @Autowired
    public AirlineService(AirlineRepository airlineRepository) {
        this.airlineRepository = airlineRepository;
    }


    public void saverAirline(String name) {
        Airline alreadyExists = airlineRepository.findByName(name);
        if (alreadyExists == null) {
            airlineRepository.save(new Airline(name));
        }
    }


}
