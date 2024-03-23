import java.util.Scanner;
public class pro_4{
  public static void main(String[] args) {
    int x, y;
    Scanner lectura = new Scanner (System.in);
    System.out.print("Introduzca primer número: ");
    x=lectura.nextInt();
    System.out.print("Introduzca segundo número: ");
    y=lectura.nextInt();
    System.out.println(x + "+" + y + "=" + (x+y));
    System.out.println(x + "*" + y + "=" + (x*y));
    System.out.println(x + "-" + y + "=" + (x-y));
    System.out.println(x + "/" + y + "=" + (x/y));
  

  }
}