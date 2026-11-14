package ec.edu.uce.pa2_u1_e_s_jc.extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class DescuentoVIP implements Descuento {

    @Override
    public double calcularDescuento(double precio) {
        double descuento = (precio *10)/100;

        return precio - descuento;
    }

}
