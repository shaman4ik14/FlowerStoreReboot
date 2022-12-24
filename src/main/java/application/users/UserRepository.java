package application.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<MyUser, Integer> {
//    @Query("SELECT u FROM my_user u WHERE u.email = ?1")
    Optional<MyUser> findMyUserByEmail(String email);
}
