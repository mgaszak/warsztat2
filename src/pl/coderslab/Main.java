package pl.coderslab;

import pl.coderslab.DAO.UserDAO;
import pl.coderslab.model.User;

public class Main {

    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();

        //User newUser=new User("admin","admin@gmail.com","admin");
        //System.out.println(newUser.toString());

        //UserDAO userDAO=new UserDAO();
        //userDAO.create(newUser);
        //System.out.println(newUser.toString());
        // User readUser=userDAO.read(1);
        //System.out.println(readUser);
        //readUser.setUserName("new username");
        //userDAO.update(readUser);
        //User updateUser=userDAO.read(1);
        //System.out.println(updateUser);
        // User toBeDelited=userDAO.read(1);
        //  System.out.println(toBeDelited);
        //  userDAO.delete(toBeDelited.getId());
        // User deleted=userDAO.read(1);
        // System.out.println(deleted);
        for (int i = 0; i < 5; i++) {
            userDAO.create(
                    new User("user"+ i, "email" + i + "@gmail.com", "haslo")

            );
        }
        User[] users = userDAO.findAll();
        for (User user : users) {
            System.out.println(user);
        }


    }
}
