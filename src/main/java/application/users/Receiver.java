package application.users;

import java.time.LocalDate;

public class Receiver extends MyUser {
    public Receiver(int id, String email, LocalDate dob, int age) {
        super(id, email, dob, age);
    }

    @Override
    public void update (String status) {
        System.out.println("Receiver status" + status);
    }
}
