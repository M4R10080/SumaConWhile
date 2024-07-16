import java.util.Scanner;
public class Sumas{
   public static void main(String args[]){
      Scanner leer = new Scanner(System.in);
      System.out.print("la condicion tendra una operacion con la cual" + 
                       "empezara que es primer numero mas"+
                       "tercer numero entre segundo numero\n");
      int n1,n2,n3;
      float condicion;
      System.out.print("Ingrese primer numero: \n");
      n1 = leer.nextInt();
      System.out.print("Ingrese segundo numero: \n");
      n2 = leer.nextInt();
      System.out.print("Ingrese tercer numero: \n");
      n3 = leer.nextInt();
      System.out.printf("El numero con el la condicion inicia con: %.3f\n",condicion =(n1 + n3)/n2);
      System.out.println("Pulse ENTER para continuar");
      leer.nextLine();//Limpia enter
      leer.nextLine();//pausa
      do{
         n1++;
         n3++;
         condicion =(n1 + n3)/1.1f;
         System.out.printf("La condicion actual es: %.3f\n",condicion);
      }while(condicion < 200);//while
      System.out.print("\nProgramador: MEVA\n");
      
   }//main
   
}//class