package application.users;

import java.time.LocalDate;

public class Sender extends MyUser {
    public Sender(int id, String email, LocalDate dob, int age) {
        super(id, email, dob, age);
    }
    @Override
    public void update (String status) {
        System.out.println("Sender status" + status);
    }
}
