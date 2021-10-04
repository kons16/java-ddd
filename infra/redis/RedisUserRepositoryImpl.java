package infra.redis;

import domain.model.User;
import repository.UserRepository;

public class RedisUserRepositoryImpl implements UserRepository {
    public void storeUser(User u) {
        System.out.println("RedisにUserを保存しました。");
    }
}
