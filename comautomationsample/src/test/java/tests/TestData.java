package tests;

public class TestData {
    private String testCase;
    private String username;
    private String password;
    private boolean rememberMe;

    public String getTestCase() {
        return testCase;
    }

    public void setTestCase(String testCase) {
        this.testCase = testCase;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "TestData{" +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}