
import Heranca.Aluno;
import Heranca.Funcionario;
import Heranca.Pessoa;
import HerancaAnimais.*;


import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        //Inicio Aula1 =========================================================
        //-----------------------------------------------------------


       /*aluno novoAluno = new aluno();

       novoAluno.setMatricula("123dfg");
       novoAluno.setCEP("000000-000");*/

       /*Aluno aluno01 = new Aluno("1234567", "Michele", 22, "POO", 2);

        aluno01.retornaNome();*/


        //Inicio Aula2 =========================================================
        //-----------------------------------------------------------

        /*Cachorro dog = new Cachorro( "Totó",  "Marrom",  false);
        Gato cat = new Gato( "Missi",  "Tricolor", true);
        Sapo frog = new Sapo( "Kako",  "verde");
        Morcego bat = new Morcego( "Dracula",  "branca",  false );


        System.out.println(" \nO cachorro " +dog.nome+ "da cor "+dog.corPelo+ " está ");
        //dog.andar();
        System.out.println(" \nO gato " +cat.nome+ "da cor "+cat.corPelo+ " está ");
        //cat.andar();
        System.out.println(" \nO sapo " +frog.nome+ "da cor "+frog.corPele+ " está ");
       // frog.andar();
        System.out.println(" \nO morcego " +bat.nome+ "da cor "+bat.corPelo+ " está ");
       bat.andar();*/

       /*Scanner ler = new Scanner(System.in);
       int opc;
        
       System.out.println("Escolha o animal a ser apresentado!");
       System.out.println("[1] Totó\n[2] Missi\n[3] Kako\n[4] Dracula");
       System.out.print("Escolha sua opção: ");
       opc = ler.nextInt();

       switch (opc){
           case 1:
               Cachorro dog = new Cachorro( "Totó",  " Marrom",  false);
               System.out.println(dog.nome+" da cor"+dog.corPelo);
               System.out.println("Locomover: "+dog.locomover());
               System.out.println("Comunicar: "+dog.comunicar());
               System.out.println("Atacar: "+dog.atacar());
               System.out.println("Comer: "+dog.comer());
               break;
           case 2:
               Gato cat = new Gato( "Missi",  " Tricolor", true);
               System.out.println(cat.nome+" da cor"+cat.corPelo);
               System.out.println("Locomover: "+cat.locomover());
               System.out.println("Comunicar: "+cat.comunicar());
               System.out.println("Atacar: "+cat.atacar());
               System.out.println("Comer: "+cat.comer());
               break;
           case 3:
               Sapo frog = new Sapo( "Kako",  " verde");
               System.out.println(frog.nome+" da cor"+frog.corPele);
               System.out.println("Locomover: "+frog.locomover());
               System.out.println("Comunicar: "+frog.comunicar());
               System.out.println("Atacar: "+frog.atacar());
               System.out.println("Comer: "+frog.comer());
               break;
           case 4:
               Morcego bat = new Morcego( "Dracula",  " branca",  false );
               System.out.println(bat.nome+" da cor"+bat.corPelo);
               System.out.println("Locomover: "+bat.locomover());
               System.out.println("Comunicar: "+bat.comunicar());
               System.out.println("Atacar: "+bat.atacar());
               System.out.println("Comer: "+bat.comer());
               break;
           default:
               System.out.println("Código Invalido");


       }*/

       // Pessoa pessoa01 = new Aluno("111.111.111-33" , "Michele" , 22, "Química", 1);
        //Pessoa pessoa02 = new Funcionario("222.222.222-33" , "Mirela" , 25, 5000);

        //ArrayList<Aluno> listaAlunos = new ArrayList<>();

        //ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        //istaPessoas.add(pessoa01);
        //listaPessoas.add(pessoa02);


        //listaAlunos.add((Aluno)pessoa01);

        //System.out.println(pessoa01.getClass());
        //System.out.println(pessoa02.getClass());


        int opc =0;
        String nome;

        ArrayList<Animal> listaAnimais = new ArrayList<>();


        System.out.println("Escolha o animal a ser cadastrado!");
        System.out.println("[1] Cachorro\n[2] Gato\n[3] Morcego\n[4] Sapo\n[5] Sair");
        System.out.print("Escolha sua opção: ");


        do{
            Scanner ler = new Scanner(System.in);
            System.out.println("Escolha o animal a ser cadastrado!");
            System.out.println("[1] Cachorro\n[2] Gato\n[3] Morcego\n[4] Sapo\n[5] Sair");
            System.out.print("Escolha sua opção: ");
            opc = ler.nextInt();

            switch (opc){
                case 1:
                    //Adição do cachorro
                    System.out.print("\nNome do Cachorro: ");
                    nome = ler.nextLine();
                    Animal novoDog = new Cachorro(nome, "Preto", false);
                    listaAnimais.add(novoDog);
                    break;
                default:
                    System.out.println("Opção inválida!!");


            }



        }while (opc != 5);


    }

   }
