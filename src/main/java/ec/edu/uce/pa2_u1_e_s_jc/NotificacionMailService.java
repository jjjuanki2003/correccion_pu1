package ec.edu.uce.pa2_u1_e_s_jc;

import jakarta.inject.Singleton;

@Singleton
public class NotificacionMailService {

    public void enviarNotificacion(String mensaje) {
        // Lógica para enviar la notificación por correo electrónico
        System.out.println("Enviando notificación: " + mensaje);
    }
}
