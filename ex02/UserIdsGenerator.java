public class UserIdsGenerator {

    private static int id = 0;

    private static UserIdsGenerator userIdsGenerator = null;

    private UserIdsGenerator() {};

    public static UserIdsGenerator getInstance() {

        if (userIdsGenerator == null)
            userIdsGenerator = new UserIdsGenerator();

        return userIdsGenerator;
    }

    public int generateId () {
        return id++;
    }
}
