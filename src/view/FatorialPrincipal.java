package view;
import javax.swing.JOptionPane;
import controller.FatorialController;

public class FatorialPrincipal {
	public static void main(String[] args) {
		FatorialController fat = new FatorialController();
		int n = 13;
		while (n < 0 || n > 12) {
			//Número precisa ser positivo e menor ou igual a 12.
			n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número positivo e menor ou igual a 12: "));
			if (n < 0 || n > 12) {JOptionPane.showMessageDialog(null, "Número invalido, tente novamente.");}
		}
		System.out.println(fat.funcaoFatorial(n));
	}
}
