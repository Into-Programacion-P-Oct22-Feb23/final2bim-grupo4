/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author darav
 */
public class obtenerMensaje {

    public static void obtenerMensaje(int a) {
        String[] mensajeFinal = {"Campaña con poca afluencia", "Campaña moderada siga adelante", "Excelente campaña"};
        if (a >= 1 && a <= 5) {
            System.out.println(mensajeFinal[0]);
        }
        if (a >= 6 && a <= 15) {
            System.out.println(mensajeFinal[1]);
        }
        if (a >= 16) {
            System.out.println(mensajeFinal[2]);
        }
        if (a == 0) {
            System.out.println("Campaña sin influencia");
        }
    }
}
