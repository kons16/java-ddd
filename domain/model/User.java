package domain.model;

public class User {
    public int Id;
    public String Name;
    public String Email;
    public String PasswordHash;

    // PasswordToHash は引数で受け取った password をハッシュ化する
    public String PasswordToHash(String password) {
        return password+"abcdefg12456";
    }

    // GenerateUserId は UserId を生成する
    // TODO: Uuserのentityに置くべきではないかも
    public int GenerateUserId() {
        return 1;
    }
}