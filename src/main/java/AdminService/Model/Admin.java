package AdminService.Model;

import core.model.Employee;

public class Admin extends Employee {

    public int remove(Integer id) {
        System.out.println("Removing user with ID: " + id);
        return 1;
    }

    public void remove() {
        System.out.println("Removing all users or default user.");
    }

    public String toString() {
        return "Admin extends " + super.toString();
    }
}
