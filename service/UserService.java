package service;

import domain.model.User;
import repository.UserRepository;
import service.dto.UserStoreInputData;

public class UserService {

    private final UserRepository ur;

    public UserService(UserRepository ur) {
       this.ur = ur;
    }

    public void storeUser(UserStoreInputData u) {
        // UserStoreInputData の password をハッシュ化する
        User user = new User();
        user.Id = user.GenerateUserId();
        user.Name = u.Name;
        user.Email = u.Email;
        user.PasswordHash = user.PasswordToHash(u.Password);

        ur.storeUser(user);
    }
}
