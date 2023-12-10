/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.user;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author gjang
 */

    public class userDAO extends connect{
    public user dangnhap(String username, String password)
    {
        user nd = null;
        try
        {
            String sql="select * from user where user_name=? and pw=?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, username);
            pre.setString(2, password);
            ResultSet rs= pre.executeQuery();
            if(rs.next())
            {
                nd= new user();
                 nd.setId(rs.getInt(1));
                 nd.setName(rs.getString(2));
                 nd.setUser_name(rs.getString(2));
                 nd.setPass_words(rs.getString(3));
                 nd.setLevel(rs.getInt(4));
             }
        }
            catch (Exception ex)
                    {
                        ex.printStackTrace();
                    }            
        return nd;
    }


}
