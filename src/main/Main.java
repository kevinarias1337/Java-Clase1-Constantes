package main;

import java.util.Scanner;
import static main.Mensajes.PETICION_RADIO;
import static main.Mensajes.MENSAJE_RESPUESTA;

public class Main {

    public static void main(String args[]) {
        Geometria geometria = new Geometria();
        Scanner teclado = new Scanner(System.in);
        System.out.println(PETICION_RADIO.getMensaje());
        double radio = teclado.nextFloat();
        double area;

        area = geometria.pi * Math.pow(radio,2);
        System.out.println(MENSAJE_RESPUESTA.getMensaje() + " " + area);
    }
}
