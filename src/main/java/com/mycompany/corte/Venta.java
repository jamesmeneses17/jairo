/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corte;

import java.util.Date;

public class Venta {
    private String codigo;
    //private String codigoArticulo;
    private Articulo codigoArticulo;
    private String nombre;
    private double cantidad;
    private double precio;
    private double subtotal;
 
    public Venta() {
    }
    
    public Venta(String codigo,Articulo codigoArticulo,String nombre, double cantidad) {
        this.codigo = codigo;
        this.codigoArticulo = codigoArticulo;
        this.nombre = nombre;
    
        this.cantidad = cantidad;
        this.precio = 0.0;
        this.subtotal=subtotal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Articulo getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(Articulo codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void showInfo(){
        System.out.println("  ");
      
        System.out.println("Nombre producto: "+this.getNombre());
        System.out.println("Cantidad vendida: "+this.getCantidad());
        System.out.println("Subtotal: "+this.getSubtotal());
        System.out.println(" ");
    } 
    public void calcularTotal(ListaArticulos listaArticulos){
        for (Articulo articulo : listaArticulos.getArticuloList()){
            if (articulo.getCodigo().equals(this.codigoArticulo.getCodigo())){
                this.precio=articulo.getValorVenta();
               this.nombre=articulo.getNombre();
            this.subtotal=this.precio*this.cantidad;
            }} } 
}

