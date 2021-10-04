package repository;

import domain.model.User;

public interface UserRepository {
    void storeUser(User u);
}
