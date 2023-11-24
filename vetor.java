import java.util.Scanner;

import java.util.Random;



public class trabalho {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[11];



        while (true) {

            System.out.println("==========================================================================");

            System.out.println("Menu de opções: ");

            System.out.println("1ª Opção: Coleta de dados do Vetor");

            System.out.println("2ª Opção: Gerar valores randômicos para o Vetor");

            System.out.println("3ª Opção: Imprimir dado do Vetor");

            System.out.println("4ª Opção: Imprimir Vetor invertido");

            System.out.println("5ª Opção: Soma valores do Vetor");

            System.out.println("6ª Opção: Soma personalizada de valores do Vetor");

            System.out.println("7ª Opção: Média dos valores do Vetor");

            System.out.println("8ª Opção: Maior valor dentro do Vetor");

            System.out.println("9ª Opção: Menor valor dentro do Vetor");

            System.out.println("Digite 0 se quiser sair");

            System.out.print("Digite a opção desejada: ");



            int opcao = scanner.nextInt();

            if (opcao == 0) {

                System.out.println("Fim do algoritmo!");

                break;

            }



            switch (opcao) {

                case 1:

                    coletaVetor(vetor);

                    break;

                case 2:

                    System.out.print("Qual é o valor máximo desse vetor? ");

                    int max = scanner.nextInt();

                    geraVetorRandomico(vetor, max);

                    break;

                case 3:

                    System.out.print("Dados do Vetor: ");

                    imprimeVetor(vetor);

                    break;

                case 4:

                    System.out.print("Vetor invertido: ");

                    imprimeVetorInvertido(vetor);

                    break;

                case 5:

                    System.out.println("Soma de todos os valores do vetor: " + somaTodos(vetor));

                    break;

                case 6:

                    System.out.print("Indice de início: ");

                    int inicio = scanner.nextInt();

                    System.out.print("Indice de término: ");

                    int termino = scanner.nextInt();

                    if (inicio < termino && inicio >= 0 && termino < vetor.length) {

                        System.out.println("Soma Personalizada: " + somaPersonalizada(vetor, inicio, termino));

                    } else {

                        System.out.println("Verifique restrições do algoritmo!");

                    }

                    break;

                case 7:

                    System.out.println("Média dos vetores: " + media(vetor));

                    break;

                case 8:

                    System.out.println("O maior valor do vetor é: " + maiorValor(vetor));

                    break;

                case 9:

                    System.out.println("O menor valor do vetor é: " + menorValor(vetor));

                    break;

                default:

                    System.out.println("Opção inválida. Tente novamente.");

            }

        }

    }



    public static int[] coletaVetor(int[] vetor) {

        Scanner scanner = new Scanner(System.in);

        for (int cont = 0; cont < vetor.length; cont++) {

            System.out.print("Informe o " + (cont + 1) + "º valor do vetor: ");

            vetor[cont] = scanner.nextInt();

        }

        return vetor;

    }



    public static int[] geraVetorRandomico(int[] vetor, int max) {

        Random random = new Random();

        System.out.print("Valores randômicos gerados: ");

        for (int cont = 0; cont < vetor.length; cont++) {

            vetor[cont] = random.nextInt(max);



            if (cont < vetor.length - 1) {

                System.out.print(vetor[cont] + ", ");

            } else {

                System.out.print(vetor[cont]);

                System.out.println(" ");

            }

        }

        return vetor;

    }



    public static void imprimeVetor(int[] vetor) {

        for (int cont = 0; cont < vetor.length; cont++) {

            if (cont < vetor.length - 1) {

                System.out.print(vetor[cont] + ", ");

            } else {

                System.out.print(vetor[cont]);

                System.out.println(" ");

            }

        }

    }



    public static void imprimeVetorInvertido(int[] vetor) {

        for (int cont = vetor.length - 1; cont >= 0; cont--) {

            if (cont > 0) {

                System.out.print(vetor[cont] + ", ");

            } else {

                System.out.print(vetor[cont]);

                System.out.println(" ");

            }

        }

    }



    public static int somaTodos(int[] vetor) {

        int soma = 0;

        for (int cont = 0; cont < vetor.length; cont++) {

            soma += vetor[cont];

        }

        return soma;

    }



    public static int somaPersonalizada(int[] vetor, int inicio, int termino) {

        int somaPerso = 0;

        for (int cont = inicio; cont <= termino; cont++) {

            somaPerso += vetor[cont];

        }

        return somaPerso;

    }



    public static double media(int[] vetor) {

        double soma = somaTodos(vetor);

        return soma / vetor.length;

    }



    public static int maiorValor(int[] vetor) {

        int maior = vetor[0];

        for (int cont = 1; cont < vetor.length; cont++) {

            if (maior < vetor[cont]) {

                maior = vetor[cont];

            }

        }

        return maior;

    }



    public static int menorValor(int[] vetor) {

        int menor = vetor[0];

        for (int cont = 1; cont < vetor.length; cont++) {

        

            if (menor > vetor[cont]) {

                menor = vetor[cont];

            }

            

        }

        return menor;

    }

}