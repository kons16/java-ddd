package service;

import repository.UserRepository;

public class UserService {

    private final UserRepository ur;

    public UserService(UserRepository ur) {
       this.ur = ur;
    }

    public void storeUser() {
        ur.storeUser();
    }
}
