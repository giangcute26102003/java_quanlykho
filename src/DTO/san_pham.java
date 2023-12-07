/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author gjang
 */
public class san_pham {
    private int id;
    private String name;
    private String desc;
    private String photo;
    private int id_nsx;

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getId_nsx() {
        return id_nsx;
    }

    public void setId_nsx(int id_nsx) {
        this.id_nsx = id_nsx;
    }

    public san_pham() {
    }

    @Override
    public String toString() {
        return  "id=" + id + ", name=" + name + ", desc=" + desc + ", photo=" + photo + ", id_nsx=" + id_nsx ;
    }
    
    
}
