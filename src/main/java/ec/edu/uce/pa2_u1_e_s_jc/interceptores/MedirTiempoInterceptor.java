package ec.edu.uce.pa2_u1_e_s_jc.interceptores;

import ec.edu.uce.pa2_u1_e_s_jc.Pedido;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MedirTiempo 
@Interceptor 
public class MedirTiempoInterceptor {

    
    @AroundInvoke 
    public Object interceptar(InvocationContext context) throws Exception {

        long inicio = System.currentTimeMillis();

        Object resultado = context.proceed();
        long fin = System.currentTimeMillis();
        Object [] parametros = context.getParameters();
        Pedido pedido = (Pedido) parametros[0];
        System.out.println("DURACION::" + pedido.getCodigo() + "|MS: " + (fin - inicio));
        System.out.println("TIEMPO: " + pedido.getCodigo() + "|OK");
        return resultado;
    }
}
