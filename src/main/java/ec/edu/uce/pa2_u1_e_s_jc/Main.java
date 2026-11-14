package ec.edu.uce.pa2_u1_e_s_jc;

import ec.edu.uce.pa2_u1_e_s_jc.extensiones.DescuentoNormal;
import ec.edu.uce.pa2_u1_e_s_jc.extensiones.DescuentoTerceraEdad;
import ec.edu.uce.pa2_u1_e_s_jc.extensiones.DescuentoVIP;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain 
public class Main implements QuarkusApplication {


    @Inject 
    private DescuentoNormal descuentoNormal;

    @Inject 
    private DescuentoVIP descuentoVIP;

    @Inject 
    private DescuentoTerceraEdad descuentoTerceraEdad;

    @Inject 
    private PedidoService pedidoService;
    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }


    @Override
    public int run(String... args) throws Exception {
        System.out.println("Hello, Quarkus!");

        Pedido p1 = new Pedido("P001", "Producto 1", 10.0);
        this.pedidoService.procesarPedido(p1, this.descuentoNormal);

        Pedido p2 = new Pedido("P002", "Producto 2", 20.0);
        this.pedidoService.procesarPedido(p2, this.descuentoVIP);

        Pedido p3 = new Pedido("P003", "Producto 3", 30.0);
        this.pedidoService.procesarPedido(p3, this.descuentoTerceraEdad);

        System.out.println("Código proporcionado por el docente");
        
        return 0;
    }

}
