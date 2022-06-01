public class UsersArrayList implements UsersList {

    private final int DEFAULT_SIZE = 10;

    private int size;

    private int len;

    private User [] userArrayList;

    public UsersArrayList() {

        userArrayList = new User[DEFAULT_SIZE];

        size = 0;

        len = userArrayList.length;
    }

    private void increaseSize() {

        len *= 2;

        User[] temp = new User[len];

        for (int i = 0; i < size; i++) {
            temp[i] = userArrayList[i];
        }

        userArrayList = temp;
    }
    @Override
    public void addUser(User user) {

        if (size == len - 1) {
            increaseSize();
        }

        userArrayList[size++] = user;
    }

    @Override
    public User getUserId(int id) throws UserNotFoundException {

        for (int i = 0; i < size; i++) {
            if (userArrayList[i].getId() == id) {
                return (userArrayList[i]);
            }
        }

        throw new UserNotFoundException();
    }

    @Override
    public User getUserIndex(int index) {
        return userArrayList[index];
    }

    @Override
    public int getUserNum() {
        return size;
    }
}
