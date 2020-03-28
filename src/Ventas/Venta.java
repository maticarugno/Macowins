package Ventas;

import FormasDePago.FormaPago;
import Prendas.Prenda;

import java.util.ArrayList;
import java.util.List;

public class Venta {
    int fecha;
    FormaPago formaPago;
    List<Prenda> prendas=new ArrayList<Prenda>();


    public Venta(int fecha, FormaPago formaPago){
        this.fecha = fecha;
        this.formaPago = formaPago;
    }

    public void agregarPrenda(Prenda prenda){
        prendas.add(prenda);
    }

    public double precioTotal(){
        double precioFinal = 0;

        for(Prenda prenda:prendas){
             precioFinal += formaPago.modificarPrecio(prenda.getPrecio());
        }

        return precioFinal;
    }


}
