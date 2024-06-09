package Programa;


// Não consegui desenvolver o Banco de Dados, iniciei mas não consegui integrar ao projeto :(


//public class DataBase {
//
//	CREATE TABLE Cliente (
//		    id AUTO_INCREMENT PRIMARY KEY,
//		    nome VARCHAR(100) NOT NULL,
//		    cpf_cnpj VARCHAR(20) NOT NULL,
//		    endereco VARCHAR(200) NOT NULL,
//		    senha VARCHAR(50) NOT NULL
//		);
//
//		CREATE TABLE Conta (
//		    id AUTO_INCREMENT PRIMARY KEY,
//		    agencia INT UNIQUE NOT NULL,
//		    saldo DECIMAL(15, 2) NOT NULL,
//		    status VARCHAR(10) NOT NULL CHECK (status IN ('Ativa', 'Inativa')),
//		    id_cliente NOT NULL,
//		    FOREIGN KEY (cliente_id) REFERENCES Cliente(id)
//		);
//
//		CREATE TABLE Transferencia (
//		    id AUTO_INCREMENT PRIMARY KEY,
//		    valor DECIMAL(15, 2) NOT NULL,
//		    data_hora CURRENT_TIMESTAMP,
//		    conta_remetente_id  NOT NULL,
//		    conta_destinatario_id NOT NULL,
//		    FOREIGN KEY (conta_remetente_id) REFERENCES Conta(id),
//		    FOREIGN KEY (conta_destinatario_id) REFERENCES Conta(id)
//		);
//
//}
