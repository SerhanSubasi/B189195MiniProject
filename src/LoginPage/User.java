package LoginPage;

public class User {
    // ve içine variablelar oluşturup sonra onlarla constructor oluşturalım
    public String name;
    public String email;
    public String password;


    public User(String name, String email, String password) {   // alt + ins'den constructor açtık daha kısa oldu
        this.name = name;
        this.email = email;
        this.password = password;
    }

}
