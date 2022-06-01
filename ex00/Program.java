public class Program {

    public static void main(String[] args) {
	    User tom = new User("TOM", 500);
        System.out.printf("User: %s Balanse: %d\n", tom.getName(), tom.getBalance());
        User sara = new User("Sara", 1000);
        System.out.printf("User: %s Balanse: %d\n", sara.getName(), sara.getBalance());
        User ted = new User("Ted", -100);
        System.out.printf("User: %s Balanse: %d\n", ted.getName(), ted.getBalance());
        sara.setBalance(-1000);
        System.out.printf("User: %s Balanse: %d\n", sara.getName(), sara.getBalance());

        Transaction t1 = new Transaction(tom, sara, 100);
        System.out.printf("Amount: %d Transaction: %s\n", t1.getTransferAmount(), t1.getTransferCategory());
        System.out.printf("User: %s Balanse: %d\n", tom.getName(), tom.getBalance());
        System.out.printf("User: %s Balanse: %d\n", sara.getName(), sara.getBalance());
        Transaction t2 = new Transaction(tom, sara, -100);
        System.out.printf("Amount: %d Transaction: %s\n", t2.getTransferAmount(), t2.getTransferCategory());
        System.out.printf("User: %s Balanse: %d\n", tom.getName(), tom.getBalance());
        System.out.printf("User: %s Balanse: %d\n", sara.getName(), sara.getBalance());
    }
}
