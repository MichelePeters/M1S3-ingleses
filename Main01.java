import Login.Login;

import java.util.ArrayList;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        try {
            System.out.print("Digite seu nome: ");
            String nome = ler.nextLine();

            if (nome.isBlank()) {
                throw new Exception("O nome não foi informado!!!!");
            }

            System.out.print("Meu nome é: " + nome);

        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        } finally {
            System.out.print("Programa desenvolvido no FuturoDEV");
        }
    }}





        //Lista de logins

        /*ArrayList<Login> listaLogin = new ArrayList<>();
        Login log01 = new Login("Michele", 12345);
        listaLogin.add(log01);
        Login log02 = new Login("Peters", 12346);
        listaLogin.add(log02);
        Login log03 = new Login("Matheus", 12347);
        listaLogin.add(log03);
        Login log04 = new Login("Augusto", 12348);
        listaLogin.add(log04);
        Login log05 = new Login("Stefani", 12349);
        listaLogin.add(log05);

        //Variáveis

        String usuario;
        int senha;
        boolean acesso = false;
        Scanner ler = new Scanner(System.in);

        try {
            System.out.print("Digite o usuário: ");
            usuario = ler.nextLine();
            System.out.print("Digite a senha: ");
            senha = ler.nextInt();

            //if(senha.)

            //Lista de logins
            for (Login item : listaLogin) {
                if(usuario.equals(item.usuário)){
                    if(senha == item.senha){
                        acesso = true;
                    }
                }
            }
        }catch (Exception ex){
            System.out.print("Erro!!!");
        }*/




        /*Scanner ler = new Scanner(System.in);
        final String senhaSecreta = "123456";

        try {
            System.out.print("Digite a senha: ");
            String senha = ler.nextLine();

        if(senha.equals(senhaSecreta)){
            System.out.println("BEM VINDO AO FUTURODEV!!!");
        }
            else{
                throw new Exception("Senha Inválida!!!");
            }

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }*/

        /*try{
            System.out.print("Digite o 1° número: ");
            int num1 = ler.nextInt();
            System.out.print("Digite o 2° número: ");
            int num2 = ler.nextInt();

            System.out.print("\n"+num1+" + "+num2+" = "+(num1+num2));

        }

        catch (Exception ex){
            System.out.println("ERRO - Valor informado não é um número!!");
        }*/




    //}
//}
