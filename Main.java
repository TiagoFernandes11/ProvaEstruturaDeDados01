import java.util.Scanner;

public class Main{
    //adicionar, assinar, exibir
 
    private static String menu = "1. Adicionar documento\n2. Assinar documento\n3. Exibir documentos\n0. Sair";
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        PilhaDocumentos pilhaDocumentos = new PilhaDocumentos();
        int resposta = -1;
        while(resposta != 0){
            System.out.println("O que você deseja fazer?");
            System.out.println();
            System.out.println(menu);
            resposta = sc.nextInt();
            switch(resposta){
                case 1:
                sc.nextLine();
                System.out.println();
                System.out.println("Informe o título do documento:");
                Documento doc = new Documento(sc.nextLine());
                pilhaDocumentos.adicionar(doc);
                System.out.println("");
                break;
                case 2:
                System.out.println("Documento " + pilhaDocumentos.assinar() + " assinado digitalmente!");
                System.out.println();
                break;
                case 3:
                System.out.println();
                pilhaDocumentos.exibir();
                break;
            }
        }

        
    }
}