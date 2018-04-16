package com.coderyu.Domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private String userName;
    private Long userId;
    private Date birthday;

    public User(){}
    public User(Long userId,String userName,Date birthday){
        this.userId=userId;
        this.userName=userName;
        this.birthday=birthday;
    }

    public void setUserName(String userName){
        this.userName=userName;
    }

    public String getUserName(){
        return this.userName;
    }

    public void setUserId(Long userId){
        this.userId=userId;
    }

    public Long getUserId(){
        return this.userId;
    }

    public void setBirthday(Date birthday){
        this.birthday=birthday;
    }

    public Date getBirthday(){
        return this.birthday;
    }

    @Override
    public String toString() {
        return String.format("ID=%s,Name=%s,Birthday=%tT",userId,userName,birthday);
    }
}
