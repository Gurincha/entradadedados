import java.util.Scanner;
public class Media{
    //gitpod.io#
    public static void main(String[] args) {
        
        double numero1;
        double numero2;
        double media;

        Scanner leitura=new Scanner(System.in);
        
        System.out.println("Digite uma nota: ");
        numero1 = leitura.nextDouble();
        System.out.println("Digite a outra nota: ");
        numero2 = leitura.nextDouble();
        media = (numero1 + numero2)/2;

        System.out.printf("Sua media foi de: %.2f\n", media);
      
        if(media>=6){
            System.out.print("voce passou ");
        }else {
            System.out.print("voce não passou ");
        }
    }
}