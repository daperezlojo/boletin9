package boletin9_6;
import java.util.Scanner;
public class Sueldos {
    Scanner sc = new Scanner(System.in);

   
    public void mostrarSueldos(){
     
        int i=0, j=0;
        float sueldo;

        do{
            System.out.println("Introduza el sueldo");
            sueldo = sc.nextFloat();
            if(sueldo>=1000 && sueldo<=1750){
                i++;
            }
            else if (sueldo<1000 && sueldo>0){
                j++;
            }
            else{
                System.out.println("Cantidad errónea");
            }
        }while(sueldo!=0);
   
        System.out.println("Trabajadores con sueldo entre 1000€ y 1750€: "+i);
        System.out.println("Trabajadores con sueldo inferior a 1000€: "+j);
    
    }
    
}
