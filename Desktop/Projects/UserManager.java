    public class UserManager {
        private int userCounter;
        // private User user;
        private User[] users = new User[100];

        public void createUserAccount(User user) {
            users[userCounter++] = user;

        }
        public void removeUserAccount(Long id) {
            int index = -1;
            for (int i = 0; i < userCounter; i++) {
                if (users[i].getUserId() == id) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                for (int i = index; i < userCounter; i++) {
                    users[i] = users[i + 1];
                }
                userCounter--;

            } else {
                System.out.println("Kullanıcı Bulunamadı...");
            }
        }

        public void findUser(Long id) {
            for (int i = 0; i < userCounter; i++) {
                if (users[i].getUserId().equals(id)) {
                    System.out.println(users[i]);
                    break;
                } else
                    System.out.println("Kullanıcı Bulunamadı!!!!");
            }
        }


    }


