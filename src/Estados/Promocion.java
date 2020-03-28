package Estados;

public class Promocion extends Estado {
    double valor;

    public  Promocion(double valor){
        this.valor = valor;
    }

    @Override
    public double modificarPrecio(double precio){
        return precio - valor;
    }

}
