import services.Iphone;
import services.ReprodutorMusical;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Iphone iphone = new Iphone();
        boolean executando = true;
        int escolha;
        String resposta;

        System.out.println("========== IPHONE ==========");

        while (executando) {
            System.out.println("\nSelecione alguma das funcionalidades abaixo: \n");
            System.out.println("1 - Reprodução Músical");
            System.out.println("2 - Telefone");
            System.out.println("3 - Navegar na Internet");
            System.out.println("4 - Desligar");
            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Digite alguma música: ");
                    String musica = sc.nextLine();
                    iphone.selecionarMusica(musica);
                    System.out.print("\nDeseja tocar a música? ");
                    resposta = sc.nextLine();
                    if (resposta.equalsIgnoreCase("Sim")) {
                        iphone.tocar();
                        System.out.print("\nDeseja pausar a música? ");
                        resposta = sc.nextLine();
                        if (resposta.equalsIgnoreCase("Sim")) {
                            iphone.pausar();
                        }
                    }
                    break;
                case 2:
                    System.out.print("Digite o número que deseja ligar: ");
                    String numero = sc.nextLine();
                    iphone.ligar(numero);
                    System.out.print("Quer atender? ");
                    resposta = sc.nextLine();
                    if (resposta.equalsIgnoreCase("Sim")) {
                        iphone.atender();
                        System.out.print("Deseja iniciar o correio de voz? ");
                        resposta = sc.nextLine();
                        if (resposta.equalsIgnoreCase("Sim")) {
                            iphone.iniciarCorreioVoz();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Digite a url que deseja visitar: ");
                    String url = sc.nextLine();
                    iphone.exibirPagina(url);
                    System.out.print("Deseja adicionar uma nova aba? ");
                    resposta = sc.nextLine();
                    if (resposta.equalsIgnoreCase("Sim")) {
                        iphone.adicionarNovaAba();
                        System.out.print("Deseja atualizar a página? ");
                        resposta = sc.nextLine();
                        if (resposta.equalsIgnoreCase("Sim")) {
                            iphone.atualizarPagina();
                        }
                    }
                    break;
                case 4:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida! Digite novamente.");
            }

            System.out.println("\n============================");

        }

        System.out.println("\nDesligando o Iphone...");

        sc.close();
    }
}