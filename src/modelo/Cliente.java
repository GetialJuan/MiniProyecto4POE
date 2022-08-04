/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Juan
 */
public class Cliente implements Serializable{
    
    private String nombre;
    private String iD;
    private ArrayList<HashMap<String,String>> carrito;

    public Cliente(String nombre, String iD) {
        this.nombre = nombre;
        this.iD = iD;
        carrito = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getNombre() {
        return nombre;
    }

    public String getiD() {
        return iD;
    }

    public ArrayList<HashMap<String, String>> getCarrito() {
        return carrito;
    }
    
    public void agregarProductoAlCarrito(String cualProducto, int presio){
        HashMap<String,String> producto = new HashMap<>();
        int cantidad = 1;
        int indice = 0;
        boolean encontrado = false;
        for(HashMap<String, String> p : carrito){
            if(p.get("nombre").equals(cualProducto)){
                encontrado = true;
                cantidad = Integer.parseInt(p.get("cantidad")) + 1;
                break;
            }
            indice++;
        }
        
        producto.put("nombre", cualProducto);
        producto.put("presio", Integer.toString(presio));
        producto.put("cantidad", Integer.toString(cantidad));
        
        if(encontrado){
            carrito.set(indice, producto);
        }
        else{
            carrito.add(producto);
        }
    }
    
    public void eliminarProducto(int cualProducto){
        carrito.remove(cualProducto);
    }
    
    public void limpiarCarrito(){
        carrito.clear();
    }
    
}
