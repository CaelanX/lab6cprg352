
package ca.sait.lab6cprg352.models;
import java.io.Serializable;

/**
 * Represents a user
 * @author caelan
 */
public class User implements Serializable {
    private String email;
    private boolean active;
    private String firstName;
    private String lastName;
    private String password;
    
    
    public User(){
        
    }
    
    public User(String email, boolean active, String firstName, String lastName, String password){
        this.email = email;
        this.active = active;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActive() {
        return active;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }
    
}
