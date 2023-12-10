/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.san_pham;
import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;


/**
 *
 * @author gjang
 */
public class sanphamDAO extends connect{
    public ArrayList<san_pham> allsanpham(){
        ArrayList<san_pham> allsp = new ArrayList<san_pham>();
        try {
            String sql = "Select * from sanpham";
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet  rs = pre.executeQuery(sql);
            while(rs.next()){
                san_pham sp = new san_pham();
                
                sp.setId(rs.getInt("id"));
                sp.setName(rs.getString("name"));
                sp.setDesc(rs.getString("desc"));
                sp.setPhoto(rs.getString("photo"));
                sp.setPrice(rs.getInt("price"));
                sp.setQuantity(rs.getInt("quantity"));
                sp.setStatus(rs.getInt("status"));
                sp.setId_nsx(rs.getInt("id_nsx"));
                
                allsp.add(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return allsp;
    }
    public ArrayList<san_pham> allsanphambyId(){
        ArrayList<san_pham> allsp = new ArrayList<san_pham>();
        try {
            String sql = "Select * from sanpham where id= ?";
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet  rs = pre.executeQuery(sql);
            while(rs.next()){
                san_pham sp = new san_pham();
             
                sp.setId(rs.getInt("id"));
                sp.setName(rs.getString("name"));
                sp.setDesc(rs.getString("desc"));
                sp.setPhoto(rs.getString("photo"));
                sp.setPrice(rs.getInt("price"));
                sp.setQuantity(rs.getInt("quantity"));
                sp.setStatus(rs.getInt("status"));
                sp.setId_nsx(rs.getInt("id_nsx"));
                
                allsp.add(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return allsp;
    }
//    public Vector<san_pham> allsp()
//   {
//       Vector<san_pham> vec = new Vector<san_pham>();
//       try
//       {
//           String sql="select * from san_pham";
//           Statement statement= con.createStatement();
//           ResultSet rs =statement.executeQuery(sql);
//           while(rs.next())
//           {
//              san_pham sp = new san_pham();
//              sp.setId(rs.getInt(1));
//               sp.setName(rs.getString(2));
//               sp.setDesc(rs.getString(3));
//               sp.setPhoto(rs.getString(4));
//              sp.setId_nsx(rs.getInt(5));
//              vec.add(sp);
//           }
//       }
//       catch(Exception ex)
//       {
//          ex.printStackTrace();
//       }
//       
//       return vec;
//   }
    public int luusp(san_pham sp){
        String sql = "INSERT INTO `sanpham`(`name`, `desc`, `photo`, `price`, `quantity`, `status`, `id_nsx`) VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, sp.getName());
            pre.setString(2, sp.getDesc());
            pre.setString(3, sp.getPhoto());
            pre.setInt(4, sp.getPrice());
            pre.setInt(5, sp.getQuantity());
            pre.setInt(6, sp.getStatus());
            pre.setInt(7, sp.getId_nsx());

            return pre.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
   
        return -1;
    }
}
