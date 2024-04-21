import java.util.Scanner;

public class ContaBancaria {
    public static void ContaBancaria(String[] args) {

        Scanner leitura = new Scanner(System.in);
        String nome = "Adalberto Wale da Sylva";
        String tipoConta = "Conta Corrente";
        int saldoDaConta = 2500;
        int opcaoEscolhida = 0;


        while (opcaoEscolhida != 4){

            System.out.println("***********************");
            System.out.println("Dados iniciais do cliente:");
            System.out.println(" ");
            System.out.println("Nome: " + nome);
            System.out.println("Tipo conta: " + tipoConta);
            System.out.println("Saldo inicial: R$ " + saldoDaConta);
            System.out.println("***********************");
            System.out.println(" ");
            System.out.println("Operações");
            System.out.println(" ");
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println(" ");
            System.out.println("Digite a opção desejada:");

            opcaoEscolhida = leitura.nextInt();


            switch (opcaoEscolhida){
                case 1:
                    System.out.println("Saldo Atual: R$ " + saldoDaConta);
                case 2:
                    System.out.println("Digite o valor a ser depositado: ");
                case 4:
                    System.out.println("Obrigado por utilizar nossos serviços!");
                    break;
            }




        }
    }
}
