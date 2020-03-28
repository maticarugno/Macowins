package Prendas;


import Estados.Estado;

public class Prenda {
    double precio;
    Estado estado;

    public Prenda(double precio, Estado estado){
        this.precio = precio;
        this.estado = estado;
    }

    public double getPrecio(){
        return estado.modificarPrecio(precio);
    }

}
