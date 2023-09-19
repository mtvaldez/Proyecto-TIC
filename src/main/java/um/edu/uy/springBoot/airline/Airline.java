package um.edu.uy.springBoot.airline;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Airline")
@Table(name = "airlines")
public class Airline {
    @Id
    private String name;

    public Airline(String name) {
        this.name = name;
    }

}
