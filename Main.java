
// //Fazer um programa para ler um número inteiro poisitivo N (máximo = 10), depois ler
// N números quaisquer e armazená-los em um vetor. Em seguida, mostrar na tela todos elementos
// do vetor.

import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        int N;

        System.out.println("Quantos números você vai digitar?");
        N = sc.nextInt();

        double [] vet = new double [N];

        for (int i = 0; i < N; i++){
            System.out.println("Digite um número: ");
            vet [i] = sc.nextDouble();

        }
        System.out.println();
        System.out.println("Números Digitados: ");

        for (int i = 0; i < N; i++){
            System.out.println(String.format ("%.1f", vet [i]));
        }



        sc.close ();
    }
}