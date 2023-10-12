
package com.mycompany.corte;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ListaVentas {
    private List <Venta> ventaList;
    private double totalVenta;

    public ListaVentas(List<Venta> ventaList) {
        this.ventaList = ventaList;
        this.totalVenta=0.0;
    }
    public ListaVentas(){
        this.ventaList= new ArrayList<>();

    }
    public void addVentaToList(Venta v){
        this.ventaList.add(v);
    }
 
    public void showList(){
        for (Venta v: this.ventaList){
            v.showInfo();
        }
    } 

      
  public void generarTotalVentas(ListaArticulos listaArticulos){
    for (Venta venta : ventaList){
        venta.calcularTotal(listaArticulos);
        totalVenta += venta.getSubtotal();
    }
    System.out.println("Total de ventas: "+totalVenta);
}
   
}






