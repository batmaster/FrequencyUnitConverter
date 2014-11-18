import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.xml.ws.WebServiceException;

import net.webservicex.FrequencyUnit;
import net.webservicex.FrequencyUnitSoap;
import view.MainFrame;

/**
 * Main class, initialize MainFrame and Soap,
 * then set Soap to MainFrame to be forward to Controller when initializing.
 * 
 * Note that if connection error, a prompt will ask for re-conect
 * or close the app.
 * 
 * @author Poramate Homprakob 5510546077
 *
 */

public class Main {

	public static void main(String[] args) {
		
		MainFrame mainFrame = new MainFrame();
		mainFrame.run();
		
		while (true) {
			try {
				mainFrame.showStatus("Connecting...");
				FrequencyUnit factory = new FrequencyUnit();
				FrequencyUnitSoap proxy = factory.getFrequencyUnitSoap();
				
				mainFrame.setSoap(proxy);
				break;
			} catch (WebServiceException e) {
				mainFrame.showStatus("Connection error");
				e.printStackTrace();
				
				JDialog.setDefaultLookAndFeelDecorated(true);
			    int response = JOptionPane.showConfirmDialog(null, "YES to check again or NO to close.", "Connection error!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
			    
			    if (response == JOptionPane.NO_OPTION || response == JOptionPane.CLOSED_OPTION) {
			    	System.exit(0);
			    	break;
			    }
			}
		}
	}
}
