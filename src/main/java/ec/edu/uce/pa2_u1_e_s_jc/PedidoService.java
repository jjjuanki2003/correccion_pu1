package ec.edu.uce.pa2_u1_e_s_jc;

import ec.edu.uce.pa2_u1_e_s_jc.extensiones.Descuento;
import ec.edu.uce.pa2_u1_e_s_jc.interceptores.MedirTiempo;
import ec.edu.uce.pa2_u1_e_s_jc.interceptores.Notificacion;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PedidoService {

    @MedirTiempo 
    @Notificacion 
    public void procesarPedido(Pedido pedido, Descuento descuento) {
  
        double totalFinal = descuento.calcularDescuento(pedido.getPrecio()); 
       
        System.out.println("PEDIDO: " + pedido.getCodigo() + "|TOTAL: " + totalFinal);

 
    }
}
