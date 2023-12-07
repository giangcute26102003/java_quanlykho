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
    private String pass_words;
    private int level;

    public user(int id, String name, String user_name, String pass_words, int level) {
        this.id = id;
        this.name = name;
        this.user_name = user_name;
        this.pass_words = pass_words;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPass_words() {
        return pass_words;
    }

    public void setPass_words(String pass_words) {
        this.pass_words = pass_words;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "user{" + "id=" + id + ", name=" + name + ", user_name=" + user_name + ", pass_words=" + pass_words + ", level=" + level + '}';
    }
    public user(){
        
    }
}
