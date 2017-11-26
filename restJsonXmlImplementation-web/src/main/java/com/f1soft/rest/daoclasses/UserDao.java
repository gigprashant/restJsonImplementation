package com.f1soft.rest.daoclasses;

import com.f1soft.rest.pojoClasses.User;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sadhana.dahal
 */
public class UserDao {

    public List<User> getAllUsers() {

        List<User> userList = new ArrayList<>();
        try {

            File file = new File("Users.txt");
            if (!file.exists()) {
                User user1 = new User(1, "Asmita Shrestha", "Developer");
                userList.add(user1);
                User user2 = new User(2, "Chandra Neupane", "Intern");
                userList.add(user2);
                User user3 = new User(3, "Prashant Adhikari", "Developer");
                userList.add(user3);
                User user4 = new User(4, "Jikesh Prajapati", "Developer");
                userList.add(user4);
                User user5 = new User(5, "Sadhana Dahal", "Developer");
                userList.add(user5);
                User user6 = new User(6, "Yogesh Bhattarai", "CTO");
                userList.add(user6);
                saveUserList(userList);
            } else {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                userList = (List<User>) ois.readObject();
                ois.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return userList;
    }

    public User getUser(int id) {
        List<User> users = getAllUsers();

        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public int addUser(User pUser) {
        List<User> userList = getAllUsers();
        boolean userExists = false;
        for (User user : userList) {
            if (user.getId() == pUser.getId()) {
                userExists = true;
                break;
            }
        }
        if (!userExists) {
            userList.add(pUser);
            saveUserList(userList);
            return 1;
        }
        return 0;
    }

    public int updateUser(User pUser) {
        List<User> userList = getAllUsers();

        for (User user : userList) {
            if (user.getId() == pUser.getId()) {
                int index = userList.indexOf(user);
                userList.set(index, pUser);
                saveUserList(userList);
                return 1;
            }
        }
        return 0;
    }

    public int deleteUser(int id) {
        System.out.println("Id: " + id);
        List<User> userList = getAllUsers();
        System.out.println("UserList: " + userList.size());
        for (User user : userList) {
            if (user.getId() == id) {
                System.out.println("Id are equal");
                int index = userList.indexOf(user);
                System.out.println("Index: " + index);
                userList.remove(index);
                saveUserList(userList);
                return 1;
            }
        }
        return 0;
    }

    private void saveUserList(List<User> userList) {
        try {
            File file = new File("Users.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fos;

            fos = new FileOutputStream(file);

            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(userList);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
