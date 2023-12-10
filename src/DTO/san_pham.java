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
    private int price;
    private int quantity;
    private int status;
    private int id_nsx;

    public san_pham(int id, String name, String desc, String photo, int price, int quantity, int status, int id_nsx) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.photo = photo;
        this.price = price;
        this.quantity = quantity;
        this.status = status;
        this.id_nsx = id_nsx;
    }

    public san_pham() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public String getPhoto() {
        return photo;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getStatus() {
        return status;
    }

    public int getId_nsx() {
        return id_nsx;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setId_nsx(int id_nsx) {
        this.id_nsx = id_nsx;
    }

    @Override
    public String toString() {
        return "san_pham{" + "id=" + id + ", name=" + name + ", desc=" + desc + ", photo=" + photo + ", price=" + price + ", quantity=" + quantity + ", status=" + status + ", id_nsx=" + id_nsx + '}';
    }


}
