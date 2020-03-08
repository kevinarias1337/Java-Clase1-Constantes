package main;

public enum Mensajes {

    PETICION_RADIO("Ingrese el radio del circulo"),
    MENSAJE_RESPUESTA("El area del circulo es");

    private String mensaje;

    Mensajes(String s) {
        this.mensaje = s;
    }
    public String getMensaje() {
        return mensaje;
    }

}
