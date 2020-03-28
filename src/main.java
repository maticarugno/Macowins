import Estados.Liquidacion;
import Estados.Nueva;
import Estados.Promocion;
import FormasDePago.Efectivo;
import FormasDePago.PagoTarjeta;
import Prendas.Prenda;
import Ventas.Venta;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static List<Venta> ventas= new ArrayList<Venta>();

    public static void main( String[] args ){
        // se crean los estados
        Liquidacion liq = new Liquidacion();
        Nueva nueva = new Nueva();
        Promocion promocion = new Promocion(50);

        //se crean las formas de pago
        Efectivo efectivo = new Efectivo();
        PagoTarjeta pagoTarjeta = new PagoTarjeta(3);

        //se crean las prendas con su precio y estado
        Prenda saco = new Prenda(3000, liq );
        Prenda pantalon = new Prenda(600,nueva);
        Prenda camisa = new Prenda(700,promocion);

        //se crea una venta con su fecha, forma de pago y se van agregando prendas
        Venta venta1 = new Venta(28032020,pagoTarjeta);
        venta1.agregarPrenda(saco);
        venta1.agregarPrenda(camisa);

        Venta venta2 = new Venta(28032020,pagoTarjeta);
        venta2.agregarPrenda(pantalon);
        venta2.agregarPrenda(camisa);

        ventas.add(venta1);
        ventas.add(venta2);
        
        //una vez finalizado el dia se imprime el total y se reinician las ventas
        System.out.println("Precio Total del Dia: "+calcularTotalDia());
        ventas.clear();

    }

    public static double calcularTotalDia() {
        double total=0;
        for(Venta venta:ventas) {
            total+=venta.precioTotal();
        }
        return total;
    }

}
