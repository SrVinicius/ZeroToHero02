import java.util.Scanner;
import java.text.DecimalFormat;

public class montante{
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Favor inserir o capital: ");   
        float capital = in.nextFloat();
        System.out.println("Favor inserir a taxa de juros mensal fixa: ");   
        float juros = in.nextFloat();
        System.out.println("Favor inserir um periodo de aplicacao (meses): ");   
        int periodoaplicacao = in.nextInt();
        double montante = capital*Math.pow((1+juros/100), periodoaplicacao);
        System.out.println ("O montade final foi de: " + (new DecimalFormat(".##").format(montante)));
        in.close();
    }
}
