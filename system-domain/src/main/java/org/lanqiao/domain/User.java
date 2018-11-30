package org.lanqiao.domain;

public class User {
    private int id;
    private String userame;
    private String password;

    public User() {
    }

    public User(String userame, String password) {
        this.userame = userame;
        this.password = password;
    }

    public User(int id, String userame, String password) {
        this.id = id;
        this.userame = userame;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserame() {
        return userame;
    }

    public void setUserame(String userame) {
        this.userame = userame;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void showInfo(String username,String password){
        System.out.println(username + "----" + password);
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userame='" + userame + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
