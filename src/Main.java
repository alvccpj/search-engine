import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner in = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();
        System.out.print("Informe o CEP para consulta: ");
        String cep = in.nextLine();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.printf(String.valueOf(novoEndereco));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicacação...");
        }

    }
}