package LibraryManager;

public class Employee extends Human {
    private String password;

    public Employee(int id, String name, String password) {

        super(id, name);
        this.password = password;
    }

    public String getPassword(){
        return password;
    }
}
