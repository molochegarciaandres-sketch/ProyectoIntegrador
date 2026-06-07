/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jersson
 */
public class ProductoDTO {

    private String codigo;
    private String nom_pro;
    private String descrip_pro;
    private String categoria_pro;
    private double pre_pro;
    private int stock_pro;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNom_pro() {
        return nom_pro;
    }

    public void setNom_pro(String nom_pro) {
        this.nom_pro = nom_pro;
    }

    public String getDescrip_pro() {
        return descrip_pro;
    }

    public void setDescrip_pro(String descrip_pro) {
        this.descrip_pro = descrip_pro;
    }

    public String getCategoria_pro() {
        return categoria_pro;
    }

    public void setCategoria_pro(String categoria_pro) {
        this.categoria_pro = categoria_pro;
    }

    public double getPre_pro() {
        return pre_pro;
    }

    public void setPre_pro(double pre_pro) {
        this.pre_pro = pre_pro;
    }

    public int getStock_pro() {
        return stock_pro;
    }

    public void setStock_pro(int stock_pro) {
        this.stock_pro = stock_pro;
    }
}
