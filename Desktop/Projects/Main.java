import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        MovieManager manager = new MovieManager();
        UserManager usermanager = new UserManager();

        printMenu();
        do {
            System.out.print("Seçiminiz : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> { //Kullanıcı Hesabı Oluşturmak İçin
                    System.out.println("--------------------------------");
                    System.out.print("Id : ");
                    Long id = sc.nextLong();
                    System.out.print("Ad Soyad : ");
                    sc.nextLine();
                    String userName = sc.nextLine();
                    System.out.print("Şifre : ");
                    String password = sc.nextLine();
                    System.out.print("Email Adresi : ");
                    String email = sc.nextLine();
                    User user = new User(id,userName,password,email);
                    usermanager.createUserAccount(user);
                    System.out.println(" -Kullanıcı Oluşturuldu- \nHoşgeldiniz");
                    System.out.println("--------------------------------");
                }
                case 2 -> { //Kullanıcı Hesabı Silmek İçin
                    System.out.println("--------------------------------");
                    System.out.print("Silmek İstediğiniz Kullanıcı Id'si : ");
                    Long id = sc.nextLong();
                    usermanager.removeUserAccount(id);
                    System.out.println(" -Hesabınız Silindi-");
                    System.out.println("--------------------------------");
                }
                case 3 -> { //Kullanıcı Hesabı Aramak İçin
                    System.out.println("--------------------------------");
                    System.out.print("Aramak İstediğiniz Kullanıcı Id'si Giriniz : ");
                    sc.nextLine();
                    Long id = sc.nextLong();
                    usermanager.findUser(id);
                    System.out.println("--------------------------------");
                }
                case 4 -> { //Film Eklemek İçin
                    System.out.println("--------------------------------");
                    System.out.print("Film Id'si : ");
                    Long movieId = sc.nextLong();
                    System.out.print("Film İsmi : ");
                    sc.nextLine();
                    String movieTitle = sc.nextLine();
                    System.out.print("Yönetmeni : ");
                    String director = sc.nextLine();
                    System.out.print("Oyuncular : ");
                    String cast = sc.nextLine();
                    System.out.print("Yayın Tarihi : ");
                    String movieDate = sc.nextLine();
                    System.out.print("Açıkllaması : ");
                    String description = sc.nextLine();
                    System.out.print("Türü : ");
                    String type = sc.nextLine();
                    Movie movie = new Movie(movieId, movieTitle, director, cast, movieDate, description, type);
                    manager.createMovieList(movie);
                    System.out.println(" -Film Eklendi- ");
                    System.out.println("--------------------------------");
                }
                case 5 -> { //Film Silmek İçin
                    System.out.println("--------------------------------");
                    System.out.println("Silmek İstediğiniz Filmin Id'sini Giriniz :");
                    Long id = sc.nextLong();
                    manager.removeMovie(id);
                    System.out.println("--------------------------------");
                }
                case 6 -> {
                    System.out.println("--------------------------------");
                    System.out.println("Aramak İstediğiniz Filmin I'sini Giriniz : ");
                    sc.nextLine();
                    Long id = sc.nextLong();
                    manager.findMovie(id);
                    System.out.println("--------------------------------");
                }

                case -1 -> {
                    System.out.println("İyi Günler");
                }
                default -> printMenu();
            }
        } while (choice != -1);
    }

    private static void printMenu() {
        System.out.println("##### Menu #####");
        System.out.println("1: Kullanıcı Hesabı Oluşturmak İçin");
        System.out.println("2: Kullanıcı Hesabı Silmek İçin");
        System.out.println("3: Kullanıcı Hesabı Aramak İçin");
        System.out.println("4: Film Eklemek İçin");
        System.out.println("5: Film Silmek İçin");
        System.out.println("6: Film Aramak İçin");
        System.out.println("-1: Çıkış Yapmak İçin \n\n");
    }
}




