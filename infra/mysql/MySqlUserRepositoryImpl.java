package infra.mysql;

import domain.model.User;
import repository.UserRepository;

public class MySqlUserRepositoryImpl implements UserRepository {
    public void storeUser(User u) {
        System.out.println("MySQLにUserを保存しました。");
    }
}
