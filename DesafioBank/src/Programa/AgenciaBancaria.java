package Programa;

import java.util.ArrayList;
import java.util.Scanner;

public class AgenciaBancaria {

	static Scanner input = new Scanner(System.in);
    static ArrayList<Conta> contasBancarias;
   

    public static void main(String[] args) {
        contasBancarias = new ArrayList<>();
      
        operacoes();
    }

    public static void operacoes() {

        System.out.println("------------------------------------------------------");
        System.out.println("-------------Bem vindo ao Banco Santander ---------------");
        System.out.println("------------------------------------------------------");
        System.out.println("***** Selecione uma operação que deseja realizar *****");
        System.out.println("------------------------------------------------------");
        System.out.println("|   Opção 1 - Criar conta            |");
        System.out.println("|   Opção 2 - Depositar    	     |"); 
        System.out.println("|   Opção 3 - Transferir             |");
        System.out.println("|   Opção 4 - Reverter Transferência |");
        System.out.println("|   Opção 5 - Listar Clientes        |");
        System.out.println("|   Opção 6 - Sair                   |");

        int operacao = input.nextInt();;

        switch (operacao) {
            case 1:
                criarConta();
                break;

            case 2:
                depositar();
                break;

            case 3:
                transferir();
                break;

            case 4:
                reverterTransferencia();
                break;
                
            case 5:
                listarContas();
                break;

            case 6:
                System.out.println("Sistema finalizado!");
                System.exit(0);

            default:
                System.out.println("Opção inválida!");
                operacoes();
                break;
        }
    }
    
    
    // CRIAR CONTA
	public static void criarConta() {
        //System.out.println("Você está criando uma conta\n");

        System.out.println("\nNome: ");
        String nome = input.next();

        System.out.println("\nCPF OU CNPJ: ");
        String documento = input.next();

        System.out.println("Endereço: ");
        String endereco = input.next();
       
        System.out.println("Senha: ");
        String senha = input.next();

        Cliente cliente = new Cliente(nome, documento, endereco, senha);

        Conta conta = new Conta(cliente);

        contasBancarias.add(conta);
        System.out.println("--- Conta criada com sucesso! ---");

        operacoes();

    }
    
   
// VERIFICAR NUMERO DA CONTA
    private static Conta encontrarConta(int numeroConta) {
        Conta conta = null;
        if(contasBancarias.size() > 0) {
            for(Conta contaa : contasBancarias) {
                if(contaa.getIdConta() == numeroConta) {
                    conta = contaa;
                }
            }
        }
        return conta;
    }
    
    
//ADICIONAR SALDO NA CONTA
    public static void depositar() {
        System.out.println("Número da conta que deseja depositar: ");
        int numeroConta = input.nextInt();
        Conta conta = encontrarConta(numeroConta);

        if(conta != null) {
            System.out.println("Qual valor deseja depositar? ");
            Double valorDeposito = input.nextDouble();

            conta.depositar(valorDeposito);
        }else {
            System.out.println("--- Conta não encontrada ---");
        }
        operacoes();
        
        
    }
    
    
// REALIZAR TRANSFERÊNCIA
    public static void transferir() {
        System.out.println("Número da conta remetente: ");
        int numeroContaRemetente = input.nextInt();

        Conta contaRemetente = encontrarConta(numeroContaRemetente);

        if(contaRemetente != null) {
            System.out.println("Número da conta do destinatário: ");
            int numeroContaDestinatario = input.nextInt();

            Conta contaDestinatario = encontrarConta(numeroContaDestinatario);

            if(contaDestinatario != null) {
                System.out.println("Valor da transferência: ");
                Double valor = input.nextDouble();

                contaRemetente.transferencia(contaDestinatario, valor);
                
            }else {
                System.out.println("--- A conta para depósito não foi encontrada ---");
            }
        	}else {
            System.out.println("--- Conta para transferência não encontrada ---");
        }
        
        operacoes();
    }
    
    
    
	//REVERTER TRANSFÊRENCIA    //FALTOU O MÉTODO PARA REVERTER A TRANSFERÊNCIA.
    private static void reverterTransferencia() {
	
    	System.out.println("Tem certeza que deseja reverter essa transferência? (S/N)");
    	    String resposta = input.next();
    	    
    	    if (resposta.equalsIgnoreCase("S")) {
    	    	
    	    	System.out.println("Transferência revertida com sucesso!");
    	        operacoes();
    	    } else {
    	    	
    	        System.out.println("Operação encerrada.");
    	        
    	    }  	   
        }
   
    
    
//LISTAR CONTAR INSERIDAS
	public static void listarContas() {
        if(contasBancarias.size() > 0) {
            for(Conta conta: contasBancarias) {
                System.out.println(conta);
            }
        }else {
            System.out.println("--- Não há contas cadastradas ---");
        }

        operacoes();
    }
}