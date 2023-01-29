/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author darav
 */
public class Funciones {

    static Scanner entrada = new Scanner(System.in);

    public static String crearFacebook() {
        String nombre;
        String ciudad;
        String pais;
        String mail;
        String mensaje;
        int edad;
        System.out.println("Ingrese el nombre de usuario:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el nombre de su pais");
        pais = entrada.nextLine();
        System.out.println("Ingrese el nombre su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su correo electrónico:");
        mail = entrada.nextLine();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        mensaje = String.format("""
                                \nCuenta creada con los siguientes datos
                                Nombre de usuario: %s
                                Edad: %s
                                Pais: %s
                                Ciudad: %s
                                Correo electronico: %s\n
                                """, nombre, edad, pais, ciudad, mail);
        return mensaje;
    }

    public static void crearTwitter() {
        String nombres;
        String nombreUsuario;
        String apellidos;
        String ciudad;
        String pais;
        String mail;
        String mensaje;
        int edad;
        System.out.println("Ingrese el nombre de usuario:");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingrese sus nombres completos:");
        nombres = entrada.nextLine();
        System.out.println("Ingrese sus apellidos completos");
        apellidos = entrada.nextLine();
        System.out.println("Ingrese el nombre de su pais");
        pais = entrada.nextLine();
        System.out.println("Ingrese el nombre su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su correo electrónico:");
        mail = entrada.nextLine();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        mensaje = String.format("""
                                \nCuenta creada con los siguientes datos
                                Nombre de usuario: %s
                                Nombres: %s
                                Apellidos: %s
                                Edad: %s
                                Pais: %s
                                Ciudad: %s
                                Correo electronico: %s\n
                                """, nombreUsuario, nombres,
                apellidos, edad, pais, ciudad,
                mail);

        System.out.println(mensaje);
    }

    public static String crearWhatsapp() {
        String nombre;
        String ciudad;
        String pais;
        String mensaje;
        int edad;
        int telefono;
        System.out.println("Ingrese el nombre de usuario:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el nombre de su pais");
        pais = entrada.nextLine();
        System.out.println("Ingrese el nombre su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su numero de telefono:");
        telefono = entrada.nextInt();
        System.out.println("Ingrese su numero de telefono:");
        edad = entrada.nextInt();
        entrada.nextLine();
        mensaje = String.format("""
                                \nCuenta creada con los siguientes datos
                                Nombre de usuario: %s
                                Edad: %s
                                Pais: %s
                                Ciudad: %s
                                Numero de telefono: %s\n
                                """, nombre, edad, pais, ciudad, telefono);
        return mensaje;
    }

}
