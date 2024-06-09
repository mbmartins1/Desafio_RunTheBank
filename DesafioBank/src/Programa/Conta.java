package Programa;

public class Conta {

    private static int contadorDeContas = 1;

    private int IdConta;
    private int agencia;
    private double saldo;
    private boolean ativa;
    private Cliente cliente;


    public Conta(Cliente cliente) {
        this.IdConta = contadorDeContas++;
        this.agencia = 1020;
        this.saldo = 0.0;
        this.ativa = true;
        this.cliente = cliente;
        
    }
    public int getIdConta() {
		return IdConta;
	}
	public void setIdConta(int idConta) {
		IdConta = idConta;	
	}
	
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	
	
	public boolean isAtiva() {
    return ativa;
	}

	public void setAtiva(boolean ativa) {
    this.ativa = ativa;
	}

	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
   
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    private void updateSaldo() {
        this.saldo = this.getSaldo();
    }
     
   
    
    public String toString() {

        return "\nNumero da Conta: " + this.getIdConta() +
        		"\nAgência: " + this.getAgencia() +
                "\nCliente: " + this.cliente.getName() +
                "\nCPF ou CNPJ: " + this.cliente.getDocumento() +
                "\nEndereço: " + this.cliente.getEndereco() +
                "\nSaldo: " + Double.toString(this.getSaldo());
    }
    
        
    // VERIFICAR STATUS DA CONTA
    public boolean verificarContaAtiva() {
        if (!ativa) {
            System.out.println("Conta está inativa.");
            return false;
        }
        
        return true;   
    }

    
  		//DEPOSITAR SALDO
    public void depositar(Double valor) {
        if(valor > 0) {
            setSaldo(getSaldo() + valor);
         
            System.out.println("Seu depósito foi realizado com sucesso!");
        } else {
            System.out.println("Não foi possível realizar o depósito!");
        }
  
    }
    
    	//TRANSFERIR
    public void transferencia(Conta contaParaDeposito, Double valor) {
        if(valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
          
            contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
            System.out.println("Transferência realizada com sucesso!");
        }else {
            System.out.println("Saldo insuficiente para realizar sua transferência.");
        }

    }
}
