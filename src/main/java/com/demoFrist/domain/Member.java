package com.demoFrist.domain;

/**
 * @ProjectName: SSMIntegration
 * @Package: com.demoFrist.domain
 * @ClassName: Member
 * @Author: Lenovo
 * @Description: ${description}
 * @Date: 2019/3/5 21:42
 * @Version: 1.0
 */
public class Member {
    private int id;
    private String username;
    private String password;
    private String usercode;

    public Member(){};

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", usercode='" + usercode + '\'' +
                '}';
    }

    public Member(int id, String username, String password, String usercode) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.usercode = usercode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }
}
