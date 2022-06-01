public class User {

    private int id;

    private String name;

    private int balance = 0;

    public TransactionsLinkedList getTransactions() {
        return transactions;
    }

    public void setTransactions(TransactionsLinkedList transactions) {
        this.transactions = transactions;
    }

    private TransactionsLinkedList transactions;

    public User (String name, int balance){

        this.name = name;

        this.id = UserIdsGenerator.getInstance().generateId();

        if (balance > 0) {
            this.balance = balance;
        }

        transactions = new TransactionsLinkedList();
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

    public int getId() {
        return id;
    }
}
