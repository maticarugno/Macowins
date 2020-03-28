package Estados;

public class Liquidacion extends Estado {

    @Override
    public double modificarPrecio(double precio){
        return precio*0.5;
    }

}
