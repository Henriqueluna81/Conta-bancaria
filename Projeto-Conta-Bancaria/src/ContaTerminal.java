import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        InformacaoConta infoConta = new InformacaoConta();

        System.out.println(">>>> Seja bem-vindo ao Banco Estadual!! <<<<");
        System.out.println("\n Informe o Número do seu cartão: ");
        int numeroCartao = scanner.nextInt();
        infoConta.setNumero(numeroCartao);

        System.out.println("\n Informe o Número da agencia: ");
        String numAgencia = scanner.next();
        infoConta.setAgencia(numAgencia);

        System.out.println("\n Informe seu nome: ");
        String nomeUsuario = scanner.next();
        infoConta.setNomeCliente(nomeUsuario);

        System.out.println("Olá "+ infoConta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é "
                            +infoConta.getAgencia()+", conta " +infoConta.getNumero()+" e seu saldo "+infoConta.getSaldo()+
                            " já está disponível para saque.");

        scanner.close();
    }
}
