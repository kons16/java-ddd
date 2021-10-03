import infra.redis.RedisUserRepositoryImpl;
import infra.mysql.MySqlUserRepositoryImpl;
import repository.UserRepository;
import service.UserService;

public class MainApplication {
    public static void main(String[] args) {
        // UserRepository ur = new RedisUserRepositoryImpl();
        UserRepository ur = new MySqlUserRepositoryImpl();
        UserService us = new UserService(ur);
        us.storeUser();
    }
}
