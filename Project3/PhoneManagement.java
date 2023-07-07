import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneManagement {
    private List<Phone> phones;
    private List<AppManagement> appManagements;
    private List<PersonManagement> personManagements;

    public PhoneManagement() {
        phones = new ArrayList<>();
        appManagements = new ArrayList<>();
        personManagements = new ArrayList<>();
    }

    public void phoneRemove(Phone phone) {
        phones.removeIf(p -> p.equals(phone));
    }

    public void appManagementRemove(AppManagement appManagement) {
        appManagements.removeIf(a -> a.equals(appManagement));
    }

    public void personManagementRemove(PersonManagement personManagement) {
        personManagements.removeIf(m -> m.equals(personManagement));
    }

    public void showPhones() {
        phones.stream().forEach(System.out::println);
    }

    public void showApps() {
        appManagements.forEach(System.out::println);
    }

    public void showPerson() {
        personManagements.stream().forEach(System.out::println);
    }

    public static void backup(List<Phone> phones, String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println(phones.size());
            for (Phone phone : phones) {
                phone.save(writer);
            }
            System.out.println("Data has been backed up.");
        } catch (IOException e) {
            System.out.println("Backup operation failed: " + e.getMessage());
        }
    }
    public static List<Phone> restore(String fileName) {
        List<Phone> phones = new ArrayList<>();

        try (Scanner scanner = new Scanner(new FileReader(fileName))) {
            int numberOfPhones = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < numberOfPhones; i++) {
                Phone phone = Phone.load(scanner);
                phones.add(phone);
            }
            System.out.println("Data has been restored.");
        } catch (FileNotFoundException e) {
            System.out.println("The specified file was not found: " + fileName);
        } catch (IOException e) {
            System.out.println("The restore operation failed: " + e.getMessage());
        }

        return phones;
    }
}




