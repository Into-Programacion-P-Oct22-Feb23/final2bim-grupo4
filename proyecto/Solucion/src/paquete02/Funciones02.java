/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author darav
 */
public class Funciones02 {

    static Scanner entrada = new Scanner(System.in);

    public static void crearTelegram() {
        String nombreUsuario;
        String ciudad;
        String pais;
        String areaInteres;
        String mensaje;
        int edad;
        int telefono;
        System.out.println("Ingrese el nombre de usuario:");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingrese el nombre de su pais");
        pais = entrada.nextLine();
        System.out.println("Ingrese el nombre su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su area de interes");
        areaInteres = entrada.nextLine();
        System.out.println("Ingrese su numero de telefono:");
        telefono = entrada.nextInt();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        mensaje = String.format("""
                                ------------------------------------
                                Cuenta creada con los siguientes datos
                                Nombre de usuario: %s
                                Numero de telefono: %s                      
                                Ciudad: %s
                                Pais: %s
                                Edad: %s
                                Area de interes: %s
                                ---------------------------------------
                                """, nombreUsuario, telefono,
                ciudad, pais, edad, areaInteres);

        System.out.println(mensaje);
    }

    public static String crearSignal() {
        String nombreUsuario;
        String ciudad;
        String pais;
        String hobby;
        String mensaje;
        int telefono;
        System.out.println("Ingrese el nombre de usuario:");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingrese el nombre de su pais");
        pais = entrada.nextLine();
        System.out.println("Ingrese el nombre su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su hobby principal:");
        hobby = entrada.nextLine();
        System.out.println("Ingrese su numero de telefono:");
        telefono = entrada.nextInt();
        entrada.nextLine();
        mensaje = String.format("""
                                ----------------------------------------
                                Cuenta creada con los siguientes datos
                                Nombre de usuario: %s
                                Numero de telefono: %s                      
                                Ciudad: %s
                                Pais: %s
                                Hobby principal: %s
                                ----------------------------------------
                                """, nombreUsuario, telefono,
                ciudad, pais, hobby);

        return (mensaje);
    }

    public static void crearInstagram() {
        String nombreUsuario;
        String ciudad;
        String pais;
        String mail;
        String mensaje;
        int edad;
        System.out.println("Ingrese el nombre de usuario:");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingrese el nombre de su pais");
        pais = entrada.nextLine();
        System.out.println("Ingrese el nombre su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su correo electronico:");
        mail = entrada.nextLine();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        mensaje = String.format("""
                                ---------------------------------------
                                Cuenta creada con los siguientes datos
                                Nombre de usuario: %s                                               
                                Ciudad: %s
                                Pais: %s
                                Edad: %s
                                Correo electronico: %s
                                ----------------------------------------
                                """, nombreUsuario,
                ciudad, pais, edad, mail);

        System.out.println(mensaje);
    }

    public static String crearFlickr() {
        String nombreUsuario;
        String mail;
        String mensaje;
        System.out.println("Ingrese el nombre de usuario:");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingrese su correo electronico:");
        mail = entrada.nextLine();
        mensaje = String.format("""
                                ---------------------------------------
                                Cuenta creada con los siguientes datos
                                Nombre de usuario: %s
                                Correo electronico: %s
                                ----------------------------------------
                                """,
                nombreUsuario, mail);

        return (mensaje);
    }
}
