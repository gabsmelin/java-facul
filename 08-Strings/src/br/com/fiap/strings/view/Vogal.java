package br.com.fiap.strings.view;

import javax.swing.JOptionPane;

public class Vogal {
	public static void main(String[] args) {
		String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
		String teste =palavra.replace("a", "*").replace("e", "*").replace("i", "*").replace("o", "*").replace("u", "*");
		System.out.println(teste);
		
	}
}
