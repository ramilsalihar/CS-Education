package activity_4;
public class Customer {
    String firstName;
    String lastname;
    String address;
    String cardNumber;
    int pin;
    String username;
    String password = "DefaultPassword@20";

    public Customer(String firstName, String lastname, String address, String cardNumber, int pin, String username, String password) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.address = address;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.username = username;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getPin() {
        return pin;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if(isValidPassword(password) || password !=

                "SearAhmad"){
            this.password = password;
        } else {
            this.password = "DefaultPassword@20";
        }

    }

    @Override
    public String toString() {
        return "Customer[" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", pin=" + pin +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ']';
    }

    public boolean isValidPassword(String password){
        boolean check = true;
        int lenOfPassword = password.length();

        if(!(lenOfPassword >= 8 && lenOfPassword <= 20)){
            check = false;
            return check;
        }

        if(!(password.contains("@") || password.contains("#") || password.contains("$") || password.contains("%"))){
            check = false;
            return check;
        }

        for(int i = 0; i < lenOfPassword; i++){
            if(Character.isUpperCase(password.charAt(i))){
                check = true;
            } else {
                check = false;
            }
            if(Character.isLowerCase(password.charAt(i))){
                check = true;
            } else {
                check = false;
            }
        }



        return check;
    }
}
