package ec.edu.uce.pa2_u1_e_s_jc.extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class DescuentoTerceraEdad implements Descuento {

    @Override
    public double calcularDescuento(double precio) {
        // Lógica para calcular el descuento para tercera edad
        return precio * 0.8; // Ejemplo: 20% de descuento
    }

}
