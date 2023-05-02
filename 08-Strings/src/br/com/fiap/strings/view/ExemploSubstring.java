package br.com.fiap.strings.view;

import javax.swing.JOptionPane;

public class ExemploSubstring {
	
	public static void main(String[] args) {
		//Ler um nome completo (nome e sobrenome), com JOPtionPane
		String nome = JOptionPane.showInputDialog("Digite o nome e sobrenome");
		
		//Exibir o nome "Pedro Archilha"
		String primeiroNome = nome.substring(0, nome.indexOf(" "));
		System.out.println(primeiroNome);		
		
		//Exibir o sobrenome
		String sobrenome = nome.substring(nome.indexOf(" ")+1);
		System.out.println(sobrenome);	
		
		
		//Ler uma data (dd/mm/aaaa)
		String data = JOptionPane.showInputDialog("Digite a data do seu aniversário: ");
		
		//Exibir o dia
		String diaAniversario = data.substring(0, data.indexOf("/"));
		System.out.println(diaAniversario);
		
		//Exibir o mês 
		String mesAniversario = data.substring(data.indexOf("/")+1, data.lastIndexOf("/"));;
		System.out.println(mesAniversario);
		
		//Exibir o ano
		String anoAniversario = data.substring(data.lastIndexOf("/")+1);;
		System.out.println(anoAniversario);
		
		//Ler um e-mail
		String email = JOptionPane.showInputDialog("Digite o seu email: ");
		
		//Exibir o dominio do email
		String dominioGeral = email.substring(email.indexOf("@"));
		String dominio = dominioGeral.substring(0, dominioGeral.indexOf("."));
		System.out.println(dominio);
		
		
	}//main
}//class