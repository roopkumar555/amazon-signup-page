package amazon.models;

public class CreateAccount {
    
    String yourName;
    long mobileNumber;
    String password;

public CreateAccount(){

}

    
    public CreateAccount(String yourName, long mobileNumber, String password) {
        this.yourName = yourName;
        this.mobileNumber = mobileNumber;
        this.password = password;
    }
    public String getYourName() {
        return yourName;
    }
    public long getMobileNumber() {
        return mobileNumber;
    }
    public String getPassword() {
        return password;
    }
    public void setYourName(String yourName) {
        this.yourName = yourName;
    }
    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
}
