package service;

import repository.UserRepository;
import service.dto.UserStoreInputData;

public class UserService {

    private final UserRepository ur;

    public UserService(UserRepository ur) {
       this.ur = ur;
    }

    public void storeUser(UserStoreInputData u) {
        // UserStoreInputData の password をハッシュ化する

        ur.storeUser();
    }
}
