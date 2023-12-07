/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.nha_san_xuat;
import com.mysql.cj.PreparedQuery;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;
import com.mysql.cj.xdevapi.Result;
import com.mysql.cj.xdevapi.Statement;
import java.security.interfaces.RSAKey;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author gjang
 */
public class nsxDAO extends connect{
    public Vector<nha_san_xuat> allnsx(){
        Vector<nha_san_xuat> listnsx = new Vector<nha_san_xuat>();
        try {
            String sql = "select * from nha_san_xuat";
            PreparedStatement pstm=con.prepareStatement(sql);
            ResultSet rs= pstm.executeQuery(sql);
            while (rs.next()) {
                   nha_san_xuat nsx = new nha_san_xuat();
                   nsx.setId(rs.getInt(1));
                   nsx.setName(rs.getString(2));
                   nsx.setAddress(rs.getString(3));
                   nsx.setPhone(rs.getString(4));
                   listnsx.add(nsx);
                
            }
        } catch (Exception e) {
        }
        
        return listnsx;
        
    }
    public ArrayList<nha_san_xuat> allnsxbyName(String namensx){
        ArrayList<nha_san_xuat> listnsx = new ArrayList<nha_san_xuat>();
        try {
            String sql = "select * from nha_san_xuat where name = '"+namensx+"' ";
            PreparedStatement pstm=con.prepareStatement(sql);
            ResultSet rs= pstm.executeQuery(sql);
            while (rs.next()) {
                   nha_san_xuat nsx = new nha_san_xuat();
                   nsx.setId(rs.getInt(1));
                   nsx.setName(rs.getString(2));
                   nsx.setAddress(rs.getString(3));
                   nsx.setPhone(rs.getString(4));
                   listnsx.add(nsx);
                
            }
        } catch (Exception e) {
        }
        
        return listnsx;
        
    }
    public int returnID(String namensx){
       int idnsx=-1;
        try { 
            
            String sql = "select id from nha_san_xuat where name = '"+namensx+"' ";
            PreparedStatement pre=con.prepareStatement(sql);
            ResultSet a = pre.executeQuery(sql);
            while(a.next()){
                idnsx = a.getInt("id");
            }
        } catch (SQLException e) {
            
        }
      return idnsx;
    }
      public int luusp(nha_san_xuat nsx){
        String sql = "INSERT INTO `nha_san_xuat` (`id`, `name`, `address`, `phone`) VALUES ( null,?,?,?)";
        try {
              PreparedStatement pre = con.prepareStatement(sql);
              pre.setString(1, nsx.getName());
              pre.setString(2, nsx.getPhone());
              pre.setString(3, nsx.getAddress());
              return pre.executeUpdate();
        } catch (Exception e) {
        }
      
        return -1;
    }
     public int update(nha_san_xuat nsx){
        String sql = "UPDATE `nha_san_xuat` SET `name`=?,`address`=?,`phone`=? WHERE id = ?";
        try {
              PreparedStatement pre = con.prepareStatement(sql);
              pre.setString(1, nsx.getName());
              pre.setString(3, nsx.getPhone());
              pre.setString(2, nsx.getAddress());
              pre.setInt(4, nsx.getId());
              return pre.executeUpdate();
        } catch (Exception e) {
        }
      
        return -1;
    }
     
     public int delete(int idnsx){
        String sql = "DELETE FROM `nha_san_xuat` WHERE id= '"+idnsx+"' ";
        try {
              PreparedStatement pre = con.prepareStatement(sql);
              return pre.executeUpdate();
        } catch (Exception e) {
        }
      
        return -1;
    }
}
