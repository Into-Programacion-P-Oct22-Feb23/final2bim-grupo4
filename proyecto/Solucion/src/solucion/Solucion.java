/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solucion;

import paquete01.Funciones;
import paquete02.Funciones02;
import paquete03.obtenerMensaje;
import java.util.Scanner;

/**
 *
 * @author darav
 */
public class Solucion {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int opcion;
        int salida;
        int contador = 0;
        boolean bandera = true;

        while (bandera) {
            System.out.println("""
                           --------------------------------------
                           Ingrese:
                           1 para crear una cuenta de Facebook
                           2 para crear una cuenta de Twitter
                           3 para crear una cuenta de Whatsapp
                           4 para crear una cuenta de Telegram
                           5 para crear una cuenta de Signal
                           6 para crear una cuenta de Instagram
                           7 para crear una cuenta de Flickr
                           --------------------------------------
                           """);
            opcion = entrada.nextInt();

            if (opcion == 1) {
                System.out.println(Funciones.crearFacebook());
            }
            if (opcion == 2) {
                Funciones.crearTwitter();
            }
            if (opcion == 3) {
                System.out.println(Funciones.crearWhatsapp());
            }
            if (opcion == 4) {
                Funciones02.crearTelegram();
            }
            if (opcion == 5) {
                System.out.println(Funciones02.crearSignal());
            }
            if (opcion == 6) {
                Funciones02.crearInstagram();
            }
            if (opcion == 7) {
                System.out.println(Funciones02.crearFlickr());
            }
            if (opcion < 1 || 7 < opcion) {
                System.out.println("Error en opcion seleccionada");
            }
            contador = contador + 1;
            System.out.println("Ingrese 1 para salir o 2 para crear mas cuentas\n");
            salida = entrada.nextInt();
            if (salida == 1) {
                bandera = false;
            }
        }
        obtenerMensaje.obtenerMensaje(contador);
    }

}
