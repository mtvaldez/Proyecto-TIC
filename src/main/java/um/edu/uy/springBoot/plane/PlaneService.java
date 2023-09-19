package um.edu.uy.springBoot.plane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaneService {

    private final PlaneRepository planeRepository;

    @Autowired
    public PlaneService(PlaneRepository planeRepository){
        this.planeRepository = planeRepository;
    }

    public void savePlane(String plate, String type, String capacity, String seats) {
        Plane alreadyExists = planeRepository.findByPlate(plate);
        if (alreadyExists == null) {
            planeRepository.save(new Plane(plate, type, capacity, seats));
        }
    }

}
