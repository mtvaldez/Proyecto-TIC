package um.edu.uy.springBoot.user;

import jakarta.persistence.*;
import static jakarta.persistence.GenerationType.SEQUENCE;

@Table(name = "users")
@Entity(name = "User")
public class User {

    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "user_sequence")
    private Long id;

    @Column(
            name = "user_name",
            nullable = false,
            unique = true
    )
    private String userName;

    @Column(
            name = "password",
            nullable = false
    )
    private String password;

    @Column(
            name = "type",
            nullable = false
    )
    private int type;

    public User() {
    }

    public User(String userName, String password, int type) {
        this.userName = userName;
        this.password = password;
        this.type = type;
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", type=" + type +
                '}';
    }

}
