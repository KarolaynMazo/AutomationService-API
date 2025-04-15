package co.com.proyecto.enums;

public enum Mensaje {
    MSG_ERR_ID("el id no corresponde al consultado");

    String mensaje;

    private Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
