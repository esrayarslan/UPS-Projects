public class User {
    private final Long userId;
    private final String userName;
    private String password;
    private String email;

    public User(Long userId, String userName, String password, String email) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public Long getUserId() {
        return userId;
    }
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", fullName='" + userName + '\'' +
                '}' + '\n';
    }
}
