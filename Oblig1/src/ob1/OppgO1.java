package ob1;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgO1 {

	public static void main(String[] args) {
		
		String brInTxt = showInputDialog("Bruttoinntekt: ");
		double brIn = parseInt(brInTxt);

		if (brIn < 164100) {
			showMessageDialog(null, "Trinnskatten er " + brIn + "kr");
		} else {
			if (brIn >= 164101 && brIn <= 230950) {
				brIn = brIn * 0.93 / 100;
			} else if (brIn >= 230951 && brIn <= 580650) {
				brIn = brIn * 2.41 / 100;
			} else if (brIn >= 580651 && brIn <= 934050) {
				brIn = brIn * 11.52 / 100;
			} else if (brIn >= 934051) {
				brIn = brIn * 14.52 / 100;
			}
			showMessageDialog(null, "Trinnskatten er " + brIn + "kr");
		}

	}

}
