/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jersson
 */
public class FacturaDTO {

    private int cod_fac;
    private String Fecha_fac;
    private double Precio_IGV_fac;
    private String cod_cli;
    private int Cod_log;

    public int getCod_fac() {
        return cod_fac;
    }

    public void setCod_fac(int cod_fac) {
        this.cod_fac = cod_fac;
    }

    public String getFecha_fac() {
        return Fecha_fac;
    }

    public void setFecha_fac(String Fecha_fac) {
        this.Fecha_fac = Fecha_fac;
    }

    public double getPrecio_IGV_fac() {
        return Precio_IGV_fac;
    }

    public void setPrecio_IGV_fac(double Precio_IGV_fac) {
        this.Precio_IGV_fac = Precio_IGV_fac;
    }

    public String getCod_cli() {
        return cod_cli;
    }

    public void setCod_cli(String cod_cli) {
        this.cod_cli = cod_cli;
    }

    public int getCod_log() {
        return Cod_log;
    }

    public void setCod_log(int Cod_log) {
        this.Cod_log = Cod_log;
    }

}
