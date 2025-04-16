package co.com.project.enums;

public enum Message {
    MSG_ERR_ID("el id no corresponde al consultado");

    String mensaje;

    private Message(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
