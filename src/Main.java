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
		
		try {
			FrequencyUnit factory = new FrequencyUnit();
			FrequencyUnitSoap proxy = factory.getFrequencyUnitSoap();
			
			FrequencyUnitConverterController controller = new FrequencyUnitConverterController(proxy, mainFrame);
			mainFrame.setController(controller);
		} catch (WebServiceException e) {
			mainFrame.showStatus("Connection error");
			e.printStackTrace();
		}
		
		
		
		
//		double rate = proxy.changeFrequencyUnit(300, from, to);
//		
//		System.out.printf("1 %s = %f %s", from, rate, to);
		
		
	}
}
