public class AppManagement {
    private String name;
    private String version;
    private int size;

    public AppManagement(String name, String version, int size) {
        this.name = name;
        this.version = version;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setSize(int size) {
        this.size = size;
    }
    @Override
    public String toString() {
        return "AppManagement{" +
                "Name='" + name + '\'' +
                ", Version='" + version + '\'' +
                ", Size=" + size +
                '}';
    }
}
