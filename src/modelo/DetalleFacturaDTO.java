/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jersson
 */
public class DetalleFacturaDTO {

    private int cod_detalle;
    private int Cantidad_ven;
    private double precio_ven;
    private int cod_fac;
    private String cod_pro;

    public int getCod_detalle() {
        return cod_detalle;
    }

    public void setCod_detalle(int cod_detalle) {
        this.cod_detalle = cod_detalle;
    }

    public int getCantidad_ven() {
        return Cantidad_ven;
    }

    public void setCantidad_ven(int Cantidad_ven) {
        this.Cantidad_ven = Cantidad_ven;
    }

    public double getPrecio_ven() {
        return precio_ven;
    }

    public void setPrecio_ven(double precio_ven) {
        this.precio_ven = precio_ven;
    }

    public int getCod_fac() {
        return cod_fac;
    }

    public void setCod_fac(int cod_fac) {
        this.cod_fac = cod_fac;
    }

    public String getCod_pro() {
        return cod_pro;
    }

    public void setCod_pro(String cod_pro) {
        this.cod_pro = cod_pro;
    }

}
