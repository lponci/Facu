import java.util.Scanner;

public class Produto {
    public static void menu() { // menu principal
        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        int phonenumber = sc.nextInt();
        do {
            System.out.println("\n\n### SISCOM - Sistema Comercial de Controle de Compras e Vendas ###");
            System.out.println("\n                  =========================");
            System.out.println("                  |     1 - Venda         |");
            System.out.println("                  |     2 - Vendedor      |");
            System.out.println("                  |     3 - Compra        |");
            System.out.println("                  |     4 - Produto       |");
            System.out.println("                  |     5 - Cliente       |");
            System.out.println("                  |     6 - Fornecedor    |");
            System.out.println("                  |     0 - Sair          |");
            System.out.println("                  =========================\n");
            opcao = phonenumber;
            System.out.print("\n");
            switch (opcao) {
                case 1:
                    break;
                case 2:
                    fornecedor();
                    break;
                //case3 , 4  , etc...
                case 5:
                    cliente();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != 0);
    }


    public static void fornecedor() {
        System.out.println("FUCK Fornecedor");

    }

    public static void cliente() {
        System.out.println("FUCK Cliente");

    }

    public void readInt() {

    }
}