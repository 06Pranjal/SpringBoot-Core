package com.jpa.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entites.User;

@SpringBootApplication
public class BootJpAexampleApplication {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        ApplicationContext context = SpringApplication.run(BootJpAexampleApplication.class, args);
        UserRepository userRepository = context.getBean(UserRepository.class);

        boolean go = true;

        while (go) {
            System.out.println("\n***** MENU *****");
            System.out.println("1. Add User");
            System.out.println("2. Delete User by ID");
            System.out.println("3. Delete All Users");
            System.out.println("4. Update User by ID");
            System.out.println("5. Show All Users");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = Integer.parseInt(in.readLine());

            switch (choice) {
                case 1:
                    // Add User
                    User user = new User();
                    System.out.print("Enter Name: ");
                    user.setName(in.readLine());
                    System.out.print("Enter City: ");
                    user.setCity(in.readLine());
                    System.out.print("Enter Status: ");
                    user.setStatus(in.readLine());

                    User savedUser = userRepository.save(user);
                    System.out.println("User Added: " + savedUser);
                    break;

                case 2:
                    // Delete User by ID
                    System.out.print("Enter User ID to delete: ");
                    int idToDelete = Integer.parseInt(in.readLine());
                    userRepository.deleteById(idToDelete);
                    System.out.println("User with ID " + idToDelete + " deleted (if exists).");
                    break;

                case 3:
                    // Delete All Users
                    userRepository.deleteAll();
                    System.out.println("All users deleted.");
                    break;

                case 4:
                    // Update User by ID
                    System.out.print("Enter User ID to update: ");
                    int idToUpdate = Integer.parseInt(in.readLine());

                    Optional<User> optionalUser = userRepository.findById(idToUpdate);
                    if (optionalUser.isPresent()) {
                        User updateUser = optionalUser.get();
                        System.out.print("Enter New Name: ");
                        updateUser.setName(in.readLine());
                        System.out.print("Enter New City: ");
                        updateUser.setCity(in.readLine());
                        System.out.print("Enter New Status: ");
                        updateUser.setStatus(in.readLine());

                        User updated = userRepository.save(updateUser);
                        System.out.println("User Updated: " + updated);
                    } else {
                        System.out.println("User with ID " + idToUpdate + " not found.");
                    }
                    break;

                case 5:
                    // Print All Users
                    List<User> allUsers = (List<User>) userRepository.findAll();
                    if (allUsers.isEmpty()) {
                        System.out.println("No users found.");
                    } else {
                        System.out.println("All Users:");
                        allUsers.forEach(System.out::println);
                    }
                    break;

                case 6:
                    // Exit
                    go = false;
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
