package controller;

import domain.model.User;
import service.UserService;
import service.dto.UserStoreInputData;

public class UserController {

    private final UserService us;

    public UserController(UserService us) {
        this.us = us;
    }

    public void StoreUser(String name, String email, String password) {
        UserStoreInputData userInputData = new UserStoreInputData(name,email,password);
        us.storeUser(userInputData);
    }
}