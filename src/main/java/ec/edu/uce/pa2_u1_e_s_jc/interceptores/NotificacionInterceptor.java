package ec.edu.uce.pa2_u1_e_s_jc.interceptores;

import ec.edu.uce.pa2_u1_e_s_jc.NotificacionMailService;
import ec.edu.uce.pa2_u1_e_s_jc.Pedido;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Notificacion
@Interceptor 

public class NotificacionInterceptor {

    @Inject 
    private NotificacionMailService notificacionMailService;

    @AroundInvoke 
    public Object interceptar(InvocationContext context) throws Exception {


        
        Object resultado = context.proceed();

        Object[] parametros = context.getParameters();
        Pedido pedido = (Pedido) parametros[0];
        this.notificacionMailService.enviarNotificacion("NOTIFICACION: " + pedido.getCodigo());

        return resultado;
    }
}
