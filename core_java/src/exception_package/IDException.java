package exception_package;

@SuppressWarnings("serial")
public class IDException extends RuntimeException {

    public IDException(String message) {
        super(message);
    }
}

// ------------------ User Class ------------------
class User {

    int id;

    User(int id) {
        this.id = id;
    }

    void checkId() {
        if (id > 0) {
            System.out.println("ID is valid: " + id);
        } else {
            throw new IDException("Invalid ID: " + id); // using throw
        }
    }
}

// ------------------ Driver Class ------------------
class UserDriver {

    public static void main(String[] args) {

        User u1 = new User(-10);   // object creation

        try {
            u1.checkId();          // method call
        }
        catch (IDException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
