import java.util.Scanner;
import java.text.DecimalFormat;

public class carpete{
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Favor inserir a largura da sala (metros) ");   
        float largura = in.nextFloat();
        System.out.println("Favor inserir o comprimento (metros) ");   
        float comprimento = in.nextFloat();
        System.out.println("Favor inserir o preco do metro quadrado de carpete ");   
        float precom2 = in.nextFloat();
        float area = largura*comprimento;
        float precofinal = precom2*area;
        System.out.println ("O preco final do carpete foi de: " + (new DecimalFormat(".##").format(precofinal)));
        in.close();
    }
}
