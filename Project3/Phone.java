import java.io.PrintWriter;
import java.util.Scanner;

public class Phone {
    private String brand;
    private String model;
    private String serialNumber;
    private int memorySpace;
    private String operatingSystem;

    public Phone(String brand, String model, String serialNumber, int memorySpace, String operatingSystem) {
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
        this.memorySpace = memorySpace;
        this.operatingSystem = operatingSystem;
    }
    public int getMemorySpace() {
        return memorySpace;
    }
    @Override
    public String toString() {
        return "Phone{" +
                "Brand='" + brand + '\'' +
                ", Model='" + model + '\'' +
                ", SerialNumber='" + serialNumber + '\'' +
                ", MemorySpace=" + memorySpace +
                ", OperatingSystem='" + operatingSystem + '\'' +
                '}';
    }

    public void save(PrintWriter writer) {
        writer.println(brand);
        writer.println(model);
        writer.println(serialNumber);
        writer.println(memorySpace);
        writer.println(operatingSystem);
    }

    public static Phone load(Scanner scanner) {
        String brand = scanner.nextLine();
        String model = scanner.nextLine();
        String serialNumber = scanner.nextLine();
        int memorySpace = Integer.parseInt(scanner.nextLine());
        String operatingSystem = scanner.nextLine();

        return new Phone(brand, model, serialNumber, memorySpace, operatingSystem);
    }
}
