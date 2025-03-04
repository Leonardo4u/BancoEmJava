import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int Numero;
        String Agencia;
        Double Saldo;
        String NomeCliente;

        //Pede Nome do Cliente e lê 
        System.out.print("Digite seu nome: ");
            NomeCliente = scanner.nextLine();

        //Pede Numero da Agencia e lê
        System.out.print("Digite sua Agencia: ");
            Agencia = scanner.nextLine();
        
        //Pede Numero da Conta e lê
        System.out.print("Digite o Numero da Conta: ");
            Numero = scanner.nextInt();

        //Pede o saldo e lê  
        System.out.print("Digite seu saldo atual: ");
            Saldo = scanner.nextDouble();

        //Mostra a saidá de dados, mostrando o que o usuário digitou. 
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", NomeCliente, Agencia, Numero, Saldo);

        scanner.close();
    }
}
