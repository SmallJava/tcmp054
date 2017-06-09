package cn.bdqn.tangcco.entity;

/**
 * Created by Administrator on 2017/6/9.
 */
public class User {
    private String userName="admin";
    private String passWord="1234";

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassWord() {
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
