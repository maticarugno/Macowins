package FormasDePago;

public class PagoTarjeta extends  FormaPago{

    int cuotas;
    double coeficiente = 0.15;

    public  PagoTarjeta(int cuotas){
        this.cuotas = cuotas;
    }

    @Override
    public double modificarPrecio(double precioPrenda){
        return precioPrenda+(cuotas*coeficiente+(precioPrenda*0.01));
    }

}
