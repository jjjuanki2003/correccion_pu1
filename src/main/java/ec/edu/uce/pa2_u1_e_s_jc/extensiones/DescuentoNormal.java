package ec.edu.uce.pa2_u1_e_s_jc.extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class DescuentoNormal implements Descuento {

    @Override
    public double calcularDescuento(double precio) {
        // Lógica para calcular el descuento normal
        return precio; // Ejemplo: 10% de descuento
    }

}
