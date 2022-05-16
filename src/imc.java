import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class imc {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Favor inserir seu peso (Kg) ");   
        float peso = in.nextFloat();
        System.out.println("Favor inserir sua altura (Metros)");
        float altura = in.nextFloat();
        double indice = peso/(Math.pow(altura, 2));
        System.out.println ("Seu IMC eh de: " + (new DecimalFormat(".##").format(indice)));
        in.close();
    }
}
