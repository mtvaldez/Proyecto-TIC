package um.edu.uy.springBoot.plane;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "planes")
@Entity(name = "Plane")
public class Plane {

    @Id
    private String plate;
    @Column(
            name = "type",
            nullable = false
    )
    private String type;
    @Column(
            name = "capacity",
            nullable = false
    )
    private String capacity;
    @Column(
            name = "seats",
            nullable = false
    )
    private String seats;
    @Column(
            name = "state",
            nullable = false
    )
    private String state;


    public String getPlate() {
        return plate;
    }
    public void setPlate(String plate) {
        this.plate = plate;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getCapacity() {
        return capacity;
    }
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
    public String getSeats() {
        return seats;
    }
    public void setSeats(String seats) {
        this.seats = seats;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public Plane(String plate, String type, String capacity, String seats) {
        this.plate = plate;
        this.type = type;
        this.capacity = capacity;
        this.seats = seats;
        this.state = "Disponible";
    }

    @Override
    public String toString() {
        return "Plane{" +
                "plate='" + plate + '\'' +
                ", type='" + type + '\'' +
                ", capacity='" + capacity + '\'' +
                ", seats='" + seats + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

}
