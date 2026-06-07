/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import interfaces.ProductoInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.ProductoDTO;
import util.conexion;

/**
 *
 * @author Jersson
 */

public class ProductoDAO implements ProductoInterface{
    conexion con = new conexion();
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    ProductoDTO P;
    ArrayList<ProductoDTO> vp = new ArrayList<>();
    
    public boolean insertar(ProductoDTO p) {        
        try {
            String sql = "insert into producto (cod_pro, nombre_pro, precio_pro, stock_pro, descripcion_pro, categoria_pro) values(?, ?, ?, ?, ?, ?)";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, p.getCodigo());
            ps.setString(2, p.getNom_pro());
            ps.setString(3, Double.toString(p.getPre_pro()));
            ps.setString(4, String.valueOf(p.getStock_pro()));
            ps.setString(5, p.getDescrip_pro());
            ps.setString(6, p.getCategoria_pro());
            ps.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;        
    }

    public boolean eliminar(String codigo) {
        try {
            String sql = "delete from producto where cod_pro = ?";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, codigo);
            ps.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;   
    }

    public boolean actualizar(ProductoDTO p) {
        try {
            String sql = "update producto set cod_pro=?, nombre_pro=? ,precio_pro=?, stock_pro=?, descripcion_pro=?, categoria_pro=? where cod_pro = ?";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, p.getCodigo());
            ps.setString(2, p.getNom_pro());
            ps.setString(3, Double.toString(p.getPre_pro()));
            ps.setString(4, String.valueOf(p.getStock_pro()));
            ps.setString(5, p.getDescrip_pro());
            ps.setString(6, p.getCategoria_pro());
            ps.setString(7, p.getCodigo());
            ps.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;   
    }


    public ArrayList<ProductoDTO> listar() {
        try {
            String sql = "select * from producto";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                P = new ProductoDTO();
                P.setCodigo(rs.getString("cod_pro"));
                P.setNom_pro(rs.getString("nombre_pro"));
                P.setPre_pro(rs.getDouble("precio_pro"));
                P.setStock_pro(rs.getInt("stock_pro"));
                P.setDescrip_pro(rs.getString("descripcion_pro"));
                P.setCategoria_pro(rs.getString("categoria_pro"));
                
                vp.add(P);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vp;   
    }

    @Override
    public ProductoDTO buscar(String codigo) {
        try {
            String sql = "select * from producto where cod_pro= ?";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            while(rs.next()){
                P = new ProductoDTO();
                P.setCodigo(rs.getString("cod_pro"));
                P.setNom_pro(rs.getString("nombre_pro"));
                P.setPre_pro(rs.getDouble("precio_pro"));
                P.setStock_pro(rs.getInt("stock_pro"));
                P.setDescrip_pro(rs.getString("descripcion_pro"));
                P.setCategoria_pro(rs.getString("categoria_pro"));
                
                
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return P;
    }
    public boolean ActualizarStock(int cant, String cod){
        
        try{
            String sql = "update producto set stock_pro = ? where cod_pro = ?";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, cant);
            ps.setString(2, cod);
            ps.execute();
        } catch (SQLException e){
            System.out.println(e.toString());
        }
        return false;
    }
    
}
