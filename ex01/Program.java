public class Program {

    public static void main(String[] args) {
	    User tom = new User("Tom", 500);
        System.out.printf("User: %s Balanse: %d ID: %d\n", tom.getName(), tom.getBalance(), tom.getIdentifier());
        User sara = new User("Sara", 1000);
        System.out.printf("User: %s Balanse: %d ID: %d\n", sara.getName(), sara.getBalance(), sara.getIdentifier());
        User ted = new User("Ted", -100);
        System.out.printf("User: %s Balanse: %d ID: %d\n", ted.getName(), ted.getBalance(), ted.getIdentifier());
        sara.setBalance(-1000);
        System.out.printf("User: %s Balanse: %d ID: %d\n", sara.getName(), sara.getBalance(), sara.getIdentifier());
    }
}
