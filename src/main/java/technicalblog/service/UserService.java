package technicalblog.service;

import org.springframework.stereotype.Service;
import technicalblog.Model.User;
@Service
public class UserService {
    public boolean login(User user) {
        if(user.getUsername().equals("valid user")) {
            return true;
        }
        else {
            return false;
        }
    }
}
