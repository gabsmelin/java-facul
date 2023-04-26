package br.com.fiap.exercicio;
import javax.swing.JOptionPane;

public class TesteTamanho {
	public static void main(String[] args) {
		
		int qtd = 0;
		
		//Laço de repetição
		for (int i = 0; i < 3; i++) {
			String pNome = JOptionPane.showInputDialog("Digite seu nome: ");
			int pIdade = Integer.parseInt(JOptionPane.showInputDialog(pNome + ", digite sua idade"));
			
			
			if(pIdade < 16) {
				JOptionPane.showMessageDialog(null, "Não eleitor!");
			} else if(pIdade >= 18 && pIdade <= 65) {
				qtd++;
				JOptionPane.showMessageDialog(null, "Eleitor obrigatório!");
			} else if((pIdade >= 16 && pIdade < 18) || pIdade > 65) {
				JOptionPane.showMessageDialog(null, "Eleitor facultativo!");
			} else {
				System.err.println("Erro");
			}
		}	
		
		JOptionPane.showMessageDialog(null, "Total de eleitores obrigatórios: " + qtd);
	}
}