

public class Customer {


private int id;
private String name;
private String email;
private String phone;
private String password;

public Customer(int id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        }

public int getId() {
        return id;
        }

public String getName() {
        return name;
        }

public String getEmail() {
        return email;
        }

public String getPhone() {
        return phone;
        }

public void setId(int id) {
        this.id = id;
        }

public void setName(String name) {
        this.name = name;
        }

public void setEmail(String email) {
        this.email = email;
        }

public void setPhone(String phone) {
        this.phone = phone;
}
public void setPassword(String password) {
                this.password = password;
        }

@Override
public String toString() {
        return "ID: " + id + ", Name: " + name + ", Email: " + email + ", Phone: " + phone;
        }
        }


