package systemdesign.inventorymanagement;

import java.util.List;

public class UserController {
    List<User> userList;

    UserController(List<User> userList) {
        this.userList = userList;
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void removeUser(User user) {
        userList.remove(user);
    }

    public User getUser(int id) {
        for (User user : userList) {
            if (user.userId == id) {
                return user;
            }
        }

        return null;
    }
}
