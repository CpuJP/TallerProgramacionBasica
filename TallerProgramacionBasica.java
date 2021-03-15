/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerprogramacionbasica;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.*;

/**
 *
 * @author jp-co
 */
public class TallerProgramacionBasica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        punto9();
    }
    public static void punto1() {
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el primer valor: ");
        a= sc.nextDouble();
        System.out.println("Digite el segundo valor: ");
        b= sc.nextDouble();
        c=a+b;
        System.out.println("La suma de los dos valores es: " + c);
        c=0;
        c=a-b;
        System.out.println("La resta de los dos valores es: " + c );
    }
    public static void punto2() {
        String animal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de un ser vivo");
        animal = sc.nextLine();
        if ("perro".equalsIgnoreCase(animal)||"gato".equalsIgnoreCase(animal)||"vaca".equalsIgnoreCase(animal)||"caballo".equalsIgnoreCase(animal)||"conejo".equalsIgnoreCase(animal)) {
            System.out.println("Pertenece al reino animalia.");
        }else{
            if ("algas".equalsIgnoreCase(animal)||"musgo".equalsIgnoreCase(animal)||"helechos".equalsIgnoreCase(animal)||"orquideas".equalsIgnoreCase(animal)||"flores".equalsIgnoreCase(animal)) {
                System.out.println("Pertenece al reino Plantae.");
            }else{
                if ("champiñon".equalsIgnoreCase(animal)||"matamoscas".equalsIgnoreCase(animal)||"penicillium".equalsIgnoreCase(animal)||"hongo de pino".equalsIgnoreCase(animal)||"levadura".equalsIgnoreCase(animal)) {
                    System.out.println("Pertenece al reino Fungi.");
                }else{
                    if ("protozoo".equalsIgnoreCase(animal)||"paramecio".equalsIgnoreCase(animal)||"volvox".equalsIgnoreCase(animal)||"laurencia".equalsIgnoreCase(animal)||"amoeba".equalsIgnoreCase(animal)) {
                        System.out.println("Pertenece al reino Protista.");
                    } else {
                        if ("salmonella".equalsIgnoreCase(animal)||"coli".equalsIgnoreCase(animal)||"subtilit".equalsIgnoreCase(animal)||"tetani".equalsIgnoreCase(animal)||"aerogenes".equalsIgnoreCase(animal)) {
                            System.out.println("Pertenece al reino Bacteria.");
                        } else {
                            if ("halofilos".equalsIgnoreCase(animal)||"termoacidofilos".equalsIgnoreCase(animal)||"metanogenos".equalsIgnoreCase(animal)||"odinarchaeota".equalsIgnoreCase(animal)||"thorarchaeota".equalsIgnoreCase(animal)) {
                                System.out.println("Pertenece al reino Archea.");
                            } else {
                                System.out.println("Ingrese un ser vivo que esté regustrado en el programa.");
                            }
                        }
                    }
                }
            }
        }
    }
    public static void punto3() {
        int x;
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese u número desde 1 hasta 7"));
        switch (x) {
            case 1:
                JOptionPane.showMessageDialog(null, "La nota es DO");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "La nota es RE");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "La nota es MI");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "La nota es FA");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "La nota es SOL");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "La nota es LA");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "La nota es SI");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ingrese un número valido");
                break;
        }
    }
    public static void punto4(){
        int x;
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese hasta que número quiere contar"));
        for (int i = 0; i <= x; i++) {
            JOptionPane.showMessageDialog(null, i);
        }
    }
    public static void punto5(){
        int x;
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese hasta que número quiere contar"));
        for (int i = 0; i <= x; i+=3) {
            JOptionPane.showMessageDialog(null, i);
        }
    }
    public static void punto6(){
        int x;
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número para hallar si es par o no"));
        if (x%2==0) {
            JOptionPane.showMessageDialog(null, "El número "+x+" es par");
        } else {
            JOptionPane.showMessageDialog(null, "El número "+x+" NO es par");
        }
    }
    public static void punto7(){
        int x, num, num2,acumulador,contador;
        //int vec[];
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese hasta que serie quiere hallar la secuencia de FIBONACCI"));
        num=0;
        num2=1;
        acumulador=0;
        contador=1;
        //vec = new int[aux];
        while (contador<=x) {      
            JOptionPane.showMessageDialog(null,+ acumulador);
            acumulador= num + num2;
            num = num2;
            num2=acumulador;
            contador++;
            //vec[aux]=suma;
        }
        
        /*for (int i = 0; i < aux; i++) {
            JOptionPane.showMessageDialog(null,vec[aux]);
        }
        */
    }
    public static void punto8(){
        int ad,com;
        Random r = new Random();
        ad = r.nextInt(9)+1;
        
        for (int i = 0; i <= 2; i++) {
            com = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la clave secreta: "));
            if (com==ad) {
                JOptionPane.showMessageDialog(null, "Acceso permitido.");
                i-=i;
                break;
            }else{
                if (i==2) {
                    JOptionPane.showMessageDialog(null, "Acceso BLOQUEADO.");
                } else {
                    JOptionPane.showMessageDialog(null, "Acceso Denegado.");
                }
                
            }
        }
    }
    public static void punto9(){
        int x,y,z,a,b;
        Random r = new Random();
        z= r.nextInt(100)+10;
        a= r.nextInt(10)+1;
        JOptionPane.showMessageDialog(null,"Tienes que ir recordando el número que te queda después de cada resta");
        JOptionPane.showMessageDialog(null, "Restar al número "+z+" de "+a+" en "+a+" hasta que no se pueda seguir reduciendo");
        
        
        x=z;
        for (int i = 0; i <=x; i++) {
            //JOptionPane.showMessageDialog(null,x);
            y = Integer.parseInt(JOptionPane.showInputDialog(null,""));
            b=x-a;
            //x=b;
            //JOptionPane.showMessageDialog(null, b+" , "+x);
            if (b==y) {
                x=x-a;
                JOptionPane.showMessageDialog(null, "Resta correcta");
            } else {
                JOptionPane.showMessageDialog(null, "Resta incorrecta, intentalo de nuevo");
                b=x+a;
            }
            
            
        }
      
            
            
            
        
        
    }
    public static void punto10(){
        double a,b,h;
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la longitud de un cateto en cm: "));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la longitud del catetto sobrande en cm: "));
        h= Math.sqrt((a*a)+(b*b));
        JOptionPane.showMessageDialog(null, "La hipotenusa es: "+h+" cm^2");
        
    }
}
