package Abstraction;

public class UserServiceImpl implements UserService,CommaonService {
    @Override
    public void addUser() {
        System.out.println("Added");
    }

    @Override
    public void deleteUser() {
        System.out.println("deleted");
    }

    @Override
    public void print() {
        System.out.println("printing");
    }
}
