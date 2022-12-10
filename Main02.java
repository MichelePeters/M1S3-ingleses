import java.util.InputMismatchException;
import java.util.Scanner;

public class Main02 {

    public static void main(String[] args)  {
        Scanner ler = new Scanner(System.in);
        int menu =0;

        try {

            System.out.println("[1] Fazer divisão\n[2] Sair");
            System.out.println("Escolha sua opção: ");
            menu = ler.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("O resultado é: " + fazDivisao());
                    break;
                case 2:
                    System.out.println("Saindo..... ");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        }catch (InputMismatchException ex) {
            System.out.println("A opção deveria ser numérica!!");


        }catch (Exception ex){
            System.out.println(ex.getMessage());

        }

    }

    public static  int fazDivisao() throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = ler.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = ler.nextInt();

        if(num2 == 0){
            throw new Exception("A divisão não pode ser por 0");
        }



        return num1/num2;
    }

}
