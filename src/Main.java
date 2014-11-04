import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.xml.ws.WebServiceException;

import org.omg.CORBA.FREE_MEM;

import controller.FrequencyUnitConverterController;
import view.MainFrame;
import net.webservicex.FrequencyUnit;
import net.webservicex.FrequencyUnitSoap;
import net.webservicex.Frequencys;



public class Main {

	public static void main(String[] args) {
		
		MainFrame mainFrame = new MainFrame();
		mainFrame.run();
		
		while (true) {
			try {
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
