package ca.sait.lab6cprg352.services;

import ca.sait.lab6cprg352.dataaccess.UserDB;
import java.util.List;
import ca.sait.lab6cprg352.models.User;

public class UserService {
    private UserDB userDB = new UserDB();
    
    public User get(String email) throws Exception {
        
        User user = this.userDB.get(email);
        return user;
    }
    
    public List<User> getAll() throws Exception {
        
        List<User> users = this.userDB.getAll();
        return users;
    }
    
    public boolean insert(String email, boolean active, String firstName, String lastName, String password) throws Exception {
        User user = new User(email, active, firstName, lastName,  password);
       
        return userDB.insert(user);
    }
    
    public boolean update(String email, boolean active, String firstName, String lastName, String password) throws Exception {
        User user = new User(email, active, firstName, lastName,  password);
        
        return userDB.update(user);
    }
    
    public boolean delete(String email) throws Exception {
        User user = new User();
        user.setEmail(email);
     
        return this.userDB.delete(user);
    }
}
