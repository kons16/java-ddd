package infra.redis;

import repository.UserRepository;

public class RedisUserRepositoryImpl implements UserRepository {
    public void storeUser() {
        System.out.println("RedisにUserを保存しました。");
    }
}
