import java.util.Scanner;
import java.text.DecimalFormat;

public class consumo {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Favor inserir a distancia percorrida (quilometros) ");   
        float distancia = in.nextFloat();
        System.out.println("Favor inserir o total gasto de combustivel (litros)");
        float gastocomb = in.nextFloat();
        float consumo = distancia/gastocomb;
        System.out.println ("O consumo medio de combustivel foi de: " + (new DecimalFormat(".##").format(consumo)) + " Km/L" );
        in.close();
    }
}
