/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author gjang
 */
public class user {
    private int id;
    private String name;
    private String user_name;
    private String pw;
    private int level;
    private int status;

    public user(int id, String name, String user_name, String pw, int level, int status) {
        this.id = id;
        this.name = name;
        this.user_name = user_name;
        this.pw = pw;
        this.level = level;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getPw() {
        return pw;
    }

    public int getLevel() {
        return level;
    }

    public int getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "user{" + "id=" + id + ", name=" + name + ", user_name=" + user_name + ", pw=" + pw + ", level=" + level + ", status=" + status + '}';
    }
    
    public user(){
        
    }
}
