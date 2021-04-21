
package test;
import java.util.Scanner;
import modelo.ClsDatos;
        
        
public class ClsTest {

    public static void main(String[] args) {       
        ClsDatos objDatos=LeerDatos();      
        Mostrar(objDatos);    
    }
   
    public static ClsDatos LeerDatos(){
        
        ClsDatos objDatos=new ClsDatos();
        System.out.println("=============================================");
        System.out.println("====Calculadora de ecuaciones cuadraticas====");
        System.out.println("Forma Ecuacion cuadratica: ");
        System.out.println("");
        System.out.println(" -b ± √(b^2 - 4ac)");
        System.out.println("__________________");
        System.out.println("        2a        ");
        Scanner objScanner=new Scanner(System.in);
        System.out.println("Digite el dato de A: ");
        float DatoA=objScanner.nextFloat();
        System.out.println("Digite el dato de B: ");
        float DatoB=objScanner.nextFloat();
        System.out.println("Digite el dato de C: ");
        float DatoC=objScanner.nextFloat();
        System.out.println("============================================");
        objDatos.setDatoA(DatoA);
        objDatos.setDatoB(DatoB);
        objDatos.setDatoC(DatoC);
        return objDatos;
    } 
    public static void Mostrar(ClsDatos objDatos){
        
        float x1=objDatos.parteReal();
        float x2=objDatos.parteImaginaria();
        float raiz=objDatos.calcularRaiz();
        float r1=x1+raiz;
        float r2=x1-raiz;
        
        if(x2==0){
            System.out.println("Se presetan raices repetidas");
            System.out.println("Raiz1: "+objDatos.parteReal() + " + "+objDatos.calcularRaiz() + " = "+r1);
            System.out.println("Raiz2: "+objDatos.parteReal() + " - "+objDatos.calcularRaiz() + " = "+r2);
            System.out.println("============================================");
        }
        
        else if(x2>0){
            System.out.println("Se presetan raices diferentes");
            System.out.println("Raiz1: "+objDatos.parteReal() + " + "+objDatos.calcularRaiz() + " = "+r1);
            System.out.println("Raiz2: "+objDatos.parteReal() + " - "+objDatos.calcularRaiz() + " = "+r2);
            System.out.println("============================================");
        }     
        else {       
            System.out.println("Se presentan raices imaginarias");    
            System.out.println("Raiz1: "+objDatos.parteReal() + " + "+objDatos.calculoParteImaginaria() + "i");
            System.out.println("Raiz2: "+objDatos.parteReal() + " - "+objDatos.calculoParteImaginaria() + "i");
            System.out.println("============================================");
        }
          
    }
}
