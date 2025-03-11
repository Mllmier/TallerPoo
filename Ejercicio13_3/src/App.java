public class App {
    public static void main(String[] args) throws Exception {
     Mensajero correo=new MensajeCorreo();
     correo.enviarMensaje();
     Mensajero sms=new MensajeSMS();
     sms.enviarMensaje();
     Mensajero push=new MensajePush();
     push.enviarMensaje();
    }
}
