package br.com.fiap.exercicio;
import javax.swing.JOptionPane;
import br.com.fiap.exercicio.TesteTamanho;

public class TesteEleitores {
	public static void main(String[] args) {
		//Ler dois numeros
		String p1Nome = JOptionPane.showInputDialog("Digite seu nome");
		double p1Peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
		double p1Altura =  Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
		String p2Nome = JOptionPane.showInputDialog("Digite seu nome");
		double p2Peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
		double p2Altura =  Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
			
		if(p1Peso > p2Peso) {
			JOptionPane.showMessageDialog(null, "O mais pesado é o " + p1Nome);
		} else if(p2Peso > p1Peso) {
			JOptionPane.showMessageDialog(null, "O mais pesado é o " + p2Nome);
		} else if(p1Peso == p2Peso) {
			JOptionPane.showMessageDialog(null, "Os dois têm o mesmo peso");
		} else {
			System.out.println("Erro");
		}
		
		
		if(p1Altura > p2Altura) {
			JOptionPane.showMessageDialog(null, "O mais alto é o " + p1Nome);
		} else if(p2Altura > p1Altura) {
			JOptionPane.showMessageDialog(null, "O mais alto é o " + p2Nome);
		} else if(p1Altura == p2Altura) {
			JOptionPane.showMessageDialog(null, "Os dois têm a mesma altura");
		} else {
			System.out.println("Erro");
		}
	}
}
