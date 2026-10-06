import java.util.Scanner;
public class Desafio {
    public static void main(String[] args) {
        double[] energias = new double[10];
        double soma = 0;
        double media;
        boolean primeiro = true;
        double maior = 0;
        double menor = 0;
        int altos = 0;
        int maiorIndice = 0;
        int menorIndice = 0;

        Scanner leia = new Scanner(System.in);

        for (int x = 0; x < energias.length; x++) {
            System.out.println("Digite o valor da energia " + (x+1) + ":");
            energias[x] = leia.nextDouble();
            while (energias[x] < 0) {
                System.out.println("Valor inválido, digite novamente:");
                energias[x] = leia.nextDouble();
            }
            soma = soma + energias[x];

            if (primeiro) {
                maior = energias[x];
                menor = energias[x];
                primeiro = false;
            }

            if(energias[x] > maior) {
                maior = energias[x];
                maiorIndice = x +1;
            }

            if(energias[x] < menor) {
                menor = energias[x];
                menorIndice = x +1;
            }

            if (energias[x] > 100) {
                altos++;
            }
        }
        media = soma / 10;

        System.out.println("RELATORIO DE DETECÇÃO DE PARTÍCULAS FANTASMAS");
        System.out.println("MÉDIA: " + media);
        System.out.println("MAIOR PICO DE ENERGIA:" + maior + "TeV" + " Registrado no sensor " + maiorIndice);
        System.out.println("MENOR PICO DE ENERGIA:" + menor + "TeV" + " Registrado no sensor " + menorIndice);
        System.out.println("TOTAL DE SENSORES ALTÍSSIMOS: " + altos);

    }


        }
