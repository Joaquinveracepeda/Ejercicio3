package clase;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el seundo numero"));

        Operaciones op = new Operaciones();

        System.out.println("la suma es: "+ op.sumar(n1, n2));
        System.out.println("La multiplicacion es: "+ op.multiplicar(n1, n2));
        System.out.println("La division es: "+ op.dividir(n1, n2));
    }
}
hola
hola2