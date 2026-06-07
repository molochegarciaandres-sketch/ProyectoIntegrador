/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author Jersson
 */
public interface CRUD <P>{
    public boolean insertar(P p);
    public boolean eliminar(String codigo);
    public boolean actualizar(P p);
    public P buscar(String codigo);
    public ArrayList<P> listar();
}
