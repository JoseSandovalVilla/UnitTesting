public class NotificadorEmail {
    private EmailCLiente emailCliente;

    public NotificadorEmail(EmailCLiente emailCliente) {
        this.emailCliente = emailCliente;
    }

    public void notificar(String direccion, String mensaje) {
        // Validar que la dirección no sea nula o vacía
        if (direccion == null || direccion.isEmpty()) {
            System.out.println("Dirección de correo no puede estar vacía");
            return;
        }
        // Validar que el mensaje no sea nulo
        if (mensaje == null) {
            System.out.println("El mensaje no puede ser nulo");
            return;
        }
        // Enviar el correo electrónico
        emailCliente.enviarCorreo(direccion, mensaje);
    }
}
