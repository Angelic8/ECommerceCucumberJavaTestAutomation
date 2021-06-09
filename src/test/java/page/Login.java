package page;

public class Login {
    private String userName;
    private String password;

    public Login(String userName, String password){
        this.userName = userName;
        this.password = password;
    } // end constructor

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getUserName(){
        return userName;
    }

    public String getPassword(){
        return password;
    }



} // end Login
