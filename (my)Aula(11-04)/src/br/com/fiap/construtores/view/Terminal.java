package br.com.fiap.construtores.view;
import br.com.fiap.construtores.model.*;

public class Terminal {
	public static void main(String[] args) {
		Bicicleta b = new Bicicleta();
		Fabricante f = new Fabricante();
		
		b.setAro(20);
		b.setPeso(20);
		b.setModelo("Caloi");
		f.setNome("Nike");
		f.setCnpj("4540-9008");
		
		System.out.println(b.retornarDetalhes() + " | Nome do fabricante: " + f.getNome() + " | CNPJ: " + f.getCnpj());
	}
}
