package myUser;

import java.util.Scanner;
import java.util.ArrayList;

import myTudu.Options;
import myPassword.PassGenerator;
import myAttendance.UserAttendance;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to College_Space");

        Authentication a1 = new Authentication();
        UserDetails u1 = new UserDetails("Purvi", "b", "a");
        UserAttendance ua = new UserAttendance();
        PassGenerator pg = new PassGenerator();
        Scanner sc = new Scanner(System.in);

        ArrayList<UserDetails> users = new ArrayList<>();
        users.add(u1);

        while (true) {
            System.out.println("\n Menu:");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter User Name: ");
                    String userName = sc.next();

                    System.out.println("Enter Email: ");
                    String userEmail = sc.next();

                    System.out.println("Enter Password: ");
                    String pass = sc.next();

                    if (a1.authenticateUser(users, userName, userEmail, pass)) {
                        System.out.println("Authentication successful. Welcome, " + userName + "!");

                        while (true) {
                            System.out.println("1. Track Assignments");
                            System.out.println("2. Track Attendance");
                            System.out.println("3. Exit");
                            System.out.print("Enter your choice: ");
                            int inProject = sc.nextInt();

                            switch (inProject) {
                                case 1:
                                    Options o1 = new Options();
                                    o1.printOptions();
                                    int choice2 = sc.nextInt();
                                    o1.selectOptions(choice2);
                                    break;
                                case 2:
                                    ua.inputData();
                                    break;
                                case 3:
                                    System.out.println("Exiting...");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Invalid choice. Please try again.");
                            }
                        }
                    } else {
                        System.out.println("Authentication failed. Please check your username and password.");
                    }
                    break;
                case 2:
                    System.out.println("Enter User Name: ");
                    userName = sc.next();
                    System.out.println("Enter User Email: ");
                    userEmail = sc.next();

                    System.out.println("Enter Password: ");
                    System.out.println("      i) Create a password: Enter 0");
                    System.out.println("      ii) Auto generate a password: Enter 1");
                    int choice1 = sc.nextInt();
                    String passw;
                    if (choice1 == 0) {
                        passw = sc.next();
                    } else {
                        passw = pg.generator();
                    }
                    System.out.println("Password: " + passw);

                    UserDetails newUser = new UserDetails(userName, userEmail, passw);
                    users.add(newUser);
                    System.out.println("Registration successful. Welcome, " + userName + "!");

                    while (true) {
                        System.out.println("1. Track Assignments");
                        System.out.println("Track Attendance");
                        System.out.println("3. Exit");
                        System.out.print("Enter your choice: ");
                        int inProject1 = sc.nextInt();

                        switch (inProject1) {
                            case 1:
                                Options o1 = new Options();
                                o1.printOptions();
                                int choice2 = sc.nextInt();
                                o1.selectOptions(choice2);
                                break;
                            case 2:
                                ua.inputData();
                                break;
                            case 3:
                                System.out.println("Exiting...");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Invalid choice. Please try again.");
                        }
                    }

                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
