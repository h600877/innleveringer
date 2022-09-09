package ob1;

import static javax.swing.JOptionPane.showInputDialog;

public class OppgO3 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(showInputDialog("Skriv inn tallet du vil beregne fakultet av:"));

		int svar = 1;

		System.out.print(n + "! = ");
		while (n > 0) {
			svar = svar * n;
			n--;
		}
		System.out.println(svar);

	}

}