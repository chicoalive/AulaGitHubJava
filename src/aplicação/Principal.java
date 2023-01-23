package aplicação;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Exercício sobre Matrizes");
        System.out.print("Tamanho das linhas e colunas: ");
        int linhas = teclado.nextInt();
        int colunas = teclado.nextInt();
        int matriz[][] = new int[linhas][colunas];
        System.out.println("");
        System.out.println("Lembrese são " + linhas + " linhas e " + colunas + " Colunas");
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Digite os numeros da " + (i + 1) + "ª linha: ");
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = teclado.nextInt();
            }
        }
        /* System.out.print("Você digitou: ");
        for (int i = 0; i < linhas; i++) {
            for(int j=0; j<colunas; j++){
                System.out.print(matriz[i][j]+" ");
               
            }
             System.out.println("");
        } */
        System.out.println("");
        System.out.print("Digite o numero que deseja saber a posição: ");
        int numero = teclado.nextInt();
        // Quando for quantidades de linha posso trocar por "matriz.length"
        // Quando for linhas uso matriz[i].lengt que me retonar o vetor daquela linha
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numero) {
                    System.out.println("Posição: " + i + "," + j + ":");

                    if (j > 0) {
                        System.out.println("Esquerda :" + matriz[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Cima :" + matriz[i - 1][j]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("Direita :" + matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Baixo :" + matriz[i + 1][j]);
                    }
                }
            }
        }

        teclado.close();
    }

}
