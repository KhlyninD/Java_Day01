public class User {

    private int identifier;

    private String name;

    private int balance;

    {
        identifier = 0;
        name = "Undefined";
        balance = 0;
    }

    public User (String name, int balance){

        this.name = name;

        if (balance > 0) {
            this.balance = balance;
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setBalance(int balance){

        if (balance > 0) {
            this.balance = balance;
        }
    }

    public int getBalance(){
        return balance;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }
}
