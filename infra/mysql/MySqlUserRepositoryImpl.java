package infra.mysql;

import repository.UserRepository;

public class MySqlUserRepositoryImpl implements UserRepository {
    public void storeUser() {
        System.out.println("MySQLにUserを保存しました。");
    }
}
