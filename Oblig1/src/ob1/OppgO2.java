package ob1;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgO2 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {

			String tallTxt = showInputDialog("Poengsum: ");
			int tall = parseInt(tallTxt);

			String karakter = " ";

			if (tall < 0 || tall > 100) {
				showMessageDialog(null, "Feilmelding! Ugyldig poengsum");
				i--;

			} else {
				if (tall < 39) {
					karakter = "F";
				} else if (tall >= 40 && tall <= 49) {
					karakter = "E";
				} else if (tall >= 50 && tall <= 59) {
					karakter = "D";
				} else if (tall >= 60 && tall <= 79) {
					karakter = "C";
				} else if (tall >= 80 && tall <= 89) {
					karakter = "B";
				} else if (tall >= 90 && tall <= 100) {
					karakter = "A";
				}

				System.out.println("Karakter: " + karakter);
			}

		}

	}

}
