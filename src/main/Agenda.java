package main;

import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Contactos manu = new Contactos("Manuel", "mgomez@ceinmark.net", 622000000);
        System.out.println(manu.getNombre() + "\n" + manu.getEmail() + "\n" + manu.getTelefono());

        System.out.println(manu.mostrarInfo());

        /*************************************************************************/

        System.out.println("Introduce datos del contacto: ");
        Contactos vacio = new Contactos();
        vacio.setNombre(entrada.nextLine());
        vacio.setTelefono(Integer.parseInt(entrada.nextLine()));
        vacio.setEmail(entrada.nextLine());

        System.out.println(vacio.mostrarInfo());

        entrada.close();
    }

}
