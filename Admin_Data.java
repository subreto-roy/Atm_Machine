package newpackage;

public class Admin_Data {

    private String Account_id;
    private String User_name;
    private String pass;
    private String amount;

    public String getAccount_id() {
        return Account_id;
    }

    public String getUser_name() {
        return User_name;
    }

    public String getpass() {
        return pass;
    }
     public String getamount() {
        return amount;
    }

    public void setAccount_id(String newAccount) {
        Account_id = newAccount;
    }

    public void setName(String newName) {
        User_name = newName;
    }

    public void setpass(String newpass) {
        pass = newpass;
    }
    public void setAmount(String newamount) {
        amount = newamount;
    }
}
