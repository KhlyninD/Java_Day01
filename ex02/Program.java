public class Program {

    public static void main(String[] args) {
	    User tom = new User("TOM", 500);
        User sara = new User("Sara", 1000);
        User ted = new User("Ted", -100);

        UsersArrayList listUsers = new UsersArrayList();
        listUsers.addUser(tom);
        listUsers.addUser(ted);
        listUsers.addUser(sara);
        listUsers.addUser(sara);
        listUsers.addUser(sara);
        listUsers.addUser(sara);
        listUsers.addUser(sara);
        listUsers.addUser(sara);
        listUsers.addUser(sara);
        listUsers.addUser(sara);
        listUsers.addUser(sara);
        listUsers.addUser(sara);
        try {
            System.out.printf("User: %s ID: %d\n", listUsers.getUserId(1).getName(), listUsers.getUserId(1).getId());
            System.out.printf("User: %s ID: %d\n", listUsers.getUserIndex(1).getName(), listUsers.getUserIndex(1).getId());
            System.out.printf("Size: %d\n", listUsers.getUserNum());
            System.out.printf("User: %s ID: %d\n", listUsers.getUserId(25).getName(), listUsers.getUserId(1).getId());
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }


    }
}
