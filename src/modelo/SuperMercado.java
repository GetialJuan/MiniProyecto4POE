/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

/**
 *
 * @author Juan
 */
public class SuperMercado {
    
    private ArrayList<Cliente> clientes;
    private ArrayList<Proveedor> proveedores;
    private ArrayList<Producto> productos;
    private ArrayList<FacturaVenta> ventas;
    private int clienteSeleccionado;
    
    public SuperMercado(){
        clientes = new ArrayList<>();
        proveedores = new ArrayList<>();
        productos = new ArrayList<>();
        ventas = new ArrayList<>();
        clienteSeleccionado = 0;
        
        //productos momentaneos para pruebas (Se debe borrar luego)
        productos.add(new Producto("lechuga", 10, 1000));
        productos.add(new Producto("leche", 5, 2000));
        productos.add(new Producto("Doritos", 20, 1500));
        productos.add(new Producto("Cebolla", 3, 500));
        
        //clientes momentaneos para pruebas (Se debe borrar luego)
        clientes.add(new Cliente("juan", "123456"));
        clientes.add(new Cliente("nauj", "654321"));
        clientes.add(new Cliente("anju", "111222"));
    }
    
    public void agregarCliente(String nombre, String iD){
        clientes.add(new Cliente(nombre, iD));
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    public int getClienteSeleccionado(){
        return clienteSeleccionado;
    }

    public ArrayList<FacturaVenta> getVentas() {
        return ventas;
    }
    
    
    public void setCopias(){
        ///falta
    }
    
    public void restablecerDatos() {
        //falta
    }    
        
    public void cancelarVenta(ArrayList< ArrayList<String>> productos){
        for(ArrayList<String> p : productos){
            restablecerProducto(p);
        }
        clientes.get(clienteSeleccionado).limpiarCarrito();
    }
    
    public void restablecerProducto(ArrayList<String> producto){
        String nombre = producto.get(0);
        int cantidad = Integer.parseInt(producto.get(1));
        
        for(Producto p : productos){
            if(p.getNombre().equals(nombre)){
                int cantidadP = p.getCantidad();
                p.setCantidad(cantidad + cantidadP);
                break;
            }
        }
    }
    
    public void setClienteSeleccionado(int n){
        clienteSeleccionado = n;
    }
    
    public boolean buscarCliente(String iD){
        boolean encontrado = false;
        int indice = 0;
        for(Cliente c : clientes){
            if(c.getiD().equals(iD)){
                encontrado = true;
                break;
            }
            indice++;
        }
        clienteSeleccionado = indice;
        return encontrado;
    }
    
    public int getTotalCarritoCliente(){
        int total = 0;
        
        ArrayList<HashMap<String,String>> carrito = 
                clientes.get(clienteSeleccionado).getCarrito();
        for(HashMap<String,String> producto : carrito){
            int presio = Integer.parseInt(producto.get("presio"));
            int cantidad = Integer.parseInt(producto.get("cantidad"));
            
            total += (presio * cantidad);
        }
        
        return total;
    }
    
    public void agregarVenta(FacturaVenta fv){
        ventas.add(fv);
    }
}
