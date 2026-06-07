/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import interfaces.ClienteInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.ClienteDTO;
import util.conexion;

/**
 *
 * @author Jersson
 */

public class ClienteDAO implements ClienteInterface{  
    conexion con = new conexion();
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    ClienteDTO P;
    ArrayList<ClienteDTO> vc = new ArrayList<>();
    
    public boolean insertar(ClienteDTO P) {        
        try {
            String sql = "insert into cliente (cod_cli, nom_cli, ape_cli, dni_cli, tel_cli) values(?, ?, ?, ?, ?)";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, P.getCod_cli());
            ps.setString(2, P.getNom_cli());
            ps.setString(3, P.getApe_cli());
            ps.setString(4, P.getDni_cli());
            ps.setString(5, P.getTel_cli());
            ps.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;        
    }

    public ArrayList<ClienteDTO> listar() {
        vc.clear();
        try {
            String sql = "select * from cliente";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                P = new ClienteDTO();
                P.setCod_cli(rs.getString("cod_cli"));
                P.setNom_cli(rs.getString("nom_cli"));
                P.setApe_cli(rs.getString("ape_cli"));
                P.setDni_cli(rs.getString("dni_cli"));
                P.setTel_cli(rs.getString("tel_cli"));
                
                vc.add(P);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vc;   
    }

    @Override
    public boolean eliminar(String codigo) {
        try {
            String sql = "delete from cliente where cod_cli = ?";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, codigo);
            ps.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean actualizar(ClienteDTO P) {
        try {
            String sql = "update cliente set cod_cli=?, nom_cli=?, ape_cli=?, dni_cli=?, tel_cli=? where cod_cli=?";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, P.getCod_cli());
            ps.setString(2, P.getNom_cli());
            ps.setString(3, P.getApe_cli());
            ps.setString(4, P.getDni_cli());
            ps.setString(5, P.getTel_cli());
            ps.setString(6, P.getCod_cli());
            ps.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public ClienteDTO buscar(String codigo) {
        try {
            String sql = "select * from cliente where cod_cli = ?";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            while(rs.next()){
                P = new ClienteDTO();
                P.setCod_cli(rs.getString("cod_cli"));
                P.setNom_cli(rs.getString("nom_cli"));
                P.setApe_cli(rs.getString("ape_cli"));
                P.setDni_cli(rs.getString("dni_cli"));
                P.setTel_cli(rs.getString("tel_cli"));
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return P;
    }
}
    

    

