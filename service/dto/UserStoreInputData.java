package service.dto;

public class UserStoreInputData {

    public String Name;
    public String Email;
    public String Password;

    public UserStoreInputData(String name, String email, String password){
        this.Name = name;
        this.Email = email;
        this.Password = password;
    }
}
