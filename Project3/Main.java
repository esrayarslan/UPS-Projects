import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Phone> phones = new ArrayList<>();
        List<AppManagement> appManagements = new ArrayList<>();
        List<PersonManagement> personManagements = new ArrayList<>();

        System.out.print("How many phones do you want to add? : ");
        int phoneNumber = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < phoneNumber; i++) {
            System.out.println("Phone #" + (i + 1));
            System.out.print("Brand : ");
            String brand = scanner.nextLine();

            System.out.print("Model : ");
            String model = scanner.nextLine();

            System.out.print("Serial Number : ");
            String serialNumber = scanner.nextLine();

            System.out.print("Memory Space : ");
            int memorySpace = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Operating System : ");
            String operatingSystem = scanner.nextLine();

            Phone phone = new Phone(brand, model, serialNumber, memorySpace, operatingSystem);
            phones.add(phone);
        }
        System.out.println("Added Phones :");
        phones.forEach(System.out::println);

        while (true) {
            System.out.println("--APP Management--");
            System.out.println("1. Application Add");
            System.out.println("2. Application Remove");
            System.out.println("3. Update Application");
            System.out.println("4. Show Applications");
            System.out.println("0. Exit");

            System.out.print("Make your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("Exiting the program...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Application Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Application Version: ");
                    String version = scanner.nextLine();

                    System.out.print("Application Size: ");
                    int size = scanner.nextInt();
                    scanner.nextLine();

                    AppManagement newAppManagement = new AppManagement(name, version, size);
                    appManagements.add(newAppManagement);
                    System.out.println("The application was successfully added.");
                    break;

                case 2:
                    System.out.print("Application Name to Be Removed: ");
                    String appRemove = scanner.nextLine();

                    boolean removed = false;
                    for (AppManagement appManagement : appManagements) {
                        if (appManagement.getName().equalsIgnoreCase(appRemove)) {
                            appManagements.remove(appManagement);
                            removed = true;
                            break;
                        }
                    }

                    if (removed) {
                        System.out.println("The application was successfully removed.");
                    } else {
                        System.out.println("An application with the specified name was not found.");
                    }
                    break;

                case 3:
                    System.out.print("Name of the Application to be Updated: ");
                    String updateName = scanner.nextLine();

                    boolean updated = false;
                    for (AppManagement appManagement : appManagements) {
                        if (appManagement.getName().equalsIgnoreCase(updateName)) {
                            System.out.print("New App Version: ");
                            String newVersion = scanner.nextLine();

                            System.out.print("New Application Size: ");
                            int newSize = scanner.nextInt();
                            scanner.nextLine();

                            appManagement.setVersion(newVersion);
                            appManagement.setSize(newSize);

                            updated = true;
                            break;
                        }
                    }

                    if (updated) {
                        System.out.println("The application has been successfully updated.");
                    } else {
                        System.out.println("An application with the specified name was not found.");
                    }
                    break;

                case 4:
                    System.out.println("Applications:");
                    for (AppManagement appManagement : appManagements) {
                        System.out.println(appManagement);
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
            System.out.println();
        }

        while (true) {
            System.out.println("--Person Management--");
            System.out.println("1. Person Add");
            System.out.println("2. Person Edit");
            System.out.println("3. Person Remove");
            System.out.println("4. Person Show");
            System.out.println("0. Exit");

            System.out.print("Make your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("Exiting the program...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Person Name : ");
                    String name = scanner.nextLine();

                    System.out.print("Person Surname : ");
                    String surname = scanner.nextLine();

                    System.out.print("Person Phone : ");
                    String phone = scanner.nextLine();

                    System.out.print("Person Email : ");
                    String email = scanner.nextLine();

                    PersonManagement newPerson = new PersonManagement(name, surname, phone, email);
                    personManagements.add(newPerson);
                    System.out.println("Person was successfully added.");
                    break;

                case 2:
                    System.out.print("The Phone Number of the Person to Be Edited: ");
                    String editPhone = scanner.nextLine();

                    boolean edited = false;
                    for (PersonManagement personManagement : personManagements) {
                        if (personManagement.getPhoneNumber().equals(editPhone)) {
                            System.out.print("New Person Name : ");
                            String newName = scanner.nextLine();

                            System.out.print("New Person Surname : ");
                            String newSurname = scanner.nextLine();

                            System.out.print("New Person Phone : ");
                            String newPhone = scanner.nextLine();

                            System.out.print("New Person E-mail : ");
                            String newEmail = scanner.nextLine();

                            personManagement.setName(newName);
                            personManagement.setSurname(newSurname);
                            personManagement.setPhoneNumber(newPhone);
                            personManagement.setEmail(newEmail);

                            edited = true;
                            break;
                        }
                    }

                    if (edited) {
                        System.out.println("The person was successfully edited.");
                    } else {
                        System.out.println("A person with the specified phone number could not be found.");
                    }
                    break;

                case 3:
                    System.out.print("The Phone of the Person to Be Removed: ");
                    String removePhone = scanner.nextLine();

                    boolean removed = false;
                    for (PersonManagement personManagement : personManagements) {
                        if (personManagement.getPhoneNumber().equals(removePhone)) {
                            personManagements.remove(personManagement);
                            removed = true;
                            break;
                        }
                    }

                    if (removed) {
                        System.out.println("The person was successfully removed.");
                    } else {
                        System.out.println("A person with the specified phone number could not be found.");
                    }
                    break;

                case 4:
                    System.out.println("Person :");
                    for (PersonManagement personManagement : personManagements) {
                        System.out.println(personManagement);
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
            System.out.println();
        }

        while (true) {
            System.out.println("--Memory Space Control--");
            System.out.println("1. Add Phone");
            System.out.println("2. Check The Memory Space");
            System.out.println("0. Exit");

            System.out.print("Make your choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("Exiting the program...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Phone Brand : ");
                    String brand = scanner.nextLine();

                    System.out.print("Phone Model : ");
                    String model = scanner.nextLine();

                    System.out.print("Phone Serial Number : ");
                    String serialNumber = scanner.nextLine();

                    System.out.print("Memory Space (GB) : ");
                    int memorySpace = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Operating System : ");
                    String operatingSystem = scanner.nextLine();

                    Phone newPhone = new Phone(brand, model, serialNumber, memorySpace, operatingSystem);
                    phones.add(newPhone);
                    System.out.println("The phone was successfully added.");
                    break;

                case 2:
                    int totalMemorySpace = 0;
                    for (Phone phone : phones) {
                        totalMemorySpace += phone.getMemorySpace();
                    }

                    System.out.println("Total Memory Space : " + totalMemorySpace + " GB");
                    System.out.println("Available Empty Space: " + (1000 - totalMemorySpace) + " GB");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

            System.out.println();
        }

        while (true) {
                System.out.println("--Data Backup and Restore--");
                System.out.println("1. Backup Data");
                System.out.println("2. Restore Data");
                System.out.println("0. Exit");

                System.out.print("Make your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 0) {
                    System.out.println("Exiting the program...");
                    break;
                }

                switch (choice) {
                    case 1:
                        System.out.print("Backup file name: ");
                        String backupFileName = scanner.nextLine();
                        PhoneManagement.backup(phones, backupFileName);
                        break;
                    case 2:
                        System.out.print("Restore file name: ");
                        String restoreFileName = scanner.nextLine();
                        phones = PhoneManagement.restore(restoreFileName);
                        break;
                    default:
                        System.out.println("You have made an invalid choice.");
                        break;
                }
            }
        }
    }



