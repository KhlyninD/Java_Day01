import java.util.UUID;

public class Program {

    public static void main(String[] args) {
	    User tom = new User("Tom", 500);
        User sara = new User("Sara", 1000);
        User ted = new User("Ted", -100);

        System.out.printf("User: %s Balance: %d\n", tom.getName(), tom.getBalance());
        System.out.printf("User: %s Balance: %d\n", sara.getName(), sara.getBalance());
        Transaction t1 = new Transaction(tom, sara, -100);
        System.out.printf("User: %s Balance: %d\n", tom.getName(), tom.getBalance());
        System.out.printf("User: %s Balance: %d\n", sara.getName(), sara.getBalance());
        Transaction t2 = new Transaction(tom, sara, -100);
        System.out.printf("User: %s Balance: %d\n", tom.getName(), tom.getBalance());
        System.out.printf("User: %s Balance: %d\n", sara.getName(), sara.getBalance());
        System.out.printf("User: %s TR: %d\n", tom.getName(), tom.getTransactions().toArray().length);
        System.out.printf("User: %s TR: %d\n", sara.getName(), sara.getTransactions().toArray().length);
        for (int i = 0; i < tom.getTransactions().toArray().length; i++) {
            System.out.printf("User: %s Tr: %s    %s\n", tom.getName(), tom.getTransactions().toArray()[i].getIdentifier(), tom.getTransactions().toArray()[i].getTransferCategory());
        }
        for (int i = 0; i < tom.getTransactions().toArray().length; i++) {
            System.out.printf("User: %s Tr: %s   %s\n", sara.getName(), sara.getTransactions().toArray()[i].getIdentifier(), sara.getTransactions().toArray()[i].getTransferCategory());
        }

        try {
            System.out.printf("User: %s Tr: %s\n", sara.getName(), sara.getTransactions().toArray()[0].getIdentifier());
            sara.getTransactions().deleteTransaction(sara.getTransactions().toArray()[0].getIdentifier());
            System.out.printf("User: %s Tr: %s\n", sara.getName(), sara.getTransactions().toArray()[0].getIdentifier());
        } catch (TransactionNotFoundException e) {
            e.printStackTrace();
        }


    }
}
