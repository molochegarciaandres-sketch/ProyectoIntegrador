/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.UsuarioDTO;
import util.conexion;

/**
 *
 * @author Jersson
 */

public class UsuarioDAO {

    conexion con = new conexion();
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    UsuarioDTO u = new UsuarioDTO();
    ArrayList<UsuarioDTO> vu = new ArrayList<>();
    
   

    public UsuarioDTO validarUsu(String nombre, String password){
        u = new UsuarioDTO();

        try{
            String sql = "select * from login where Usuario_log = ? and Password_log = ?";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, password);
            rs = ps.executeQuery();

            while(rs.next()){
                u.setCod_log(rs.getInt("Cod_log"));
                u.setNombre(rs.getString("Usuario_log"));
                u.setPassword(rs.getString("Password_log"));
            }

            conn.close();

        } catch(SQLException e){
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        return u;
    }
}