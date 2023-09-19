package springBoot.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

        User findUserByUserName(String userName);

        User findUserById(long id);

        List<User> findUserByType(int type);

}
