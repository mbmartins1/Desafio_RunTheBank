package Programa;

public class Cliente {

    private static int counter = 1;

    private int numeroCliente;
    private String name;
    private String documento;
    private String endereco;
    private String senha;

    public Cliente() { }

    public Cliente(String name, String documento, String endereco, String senha) {
        this.numeroCliente = Cliente.counter;
        this.name = name;
        this.documento = documento;
        this.endereco = endereco;
        this.senha = senha;
        Cliente.counter += 1;
    }

    public int getNumeroCliente() {
        return this.numeroCliente;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
   
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getSenha() {
			return senha;
	}

	public void setSenha(String senha) {
			this.senha = senha;
	}
	

    public String toString() {
        return  "\nName: " + this.getName() +
        		
                "\nCPF: " + this.getDocumento() +
                
                "\nEndereco: " + this.getEndereco() +
                
                "\nSenha: " + this.getSenha();
        
    }
}