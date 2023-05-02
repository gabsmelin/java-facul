package br.com.fiap.strings.view;

import javax.swing.JOptionPane;

public class Maiuscula {
	public static void main(String[] args) {
		//exercicio1-aula8
		String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
		System.out.println(palavra.toUpperCase());

	}
}
