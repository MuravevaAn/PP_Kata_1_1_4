package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Seva", "Sidorov", (byte) 50);
        userService.saveUser("Petr", "Ivanov", (byte) 19);
        userService.saveUser("Sveta", "Ivanova", (byte) 35);
        userService.saveUser("Olga", "Ivanova", (byte) 35);
        userService.removeUserById(3);
        userService.getAllUsers();
        for (User user : userService.getAllUsers()) {
            System.out.println(user.toString());
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
