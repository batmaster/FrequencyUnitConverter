import org.omg.CORBA.FREE_MEM;

import controller.FrequencyUnitConverterController;
import view.MainFrame;
import net.webservicex.FrequencyUnit;
import net.webservicex.FrequencyUnitSoap;
import net.webservicex.Frequencys;



public class Main {

	public static void main(String[] args) {
		FrequencyUnit factory = new FrequencyUnit();
		FrequencyUnitSoap proxy = factory.getFrequencyUnitSoap();
		
		MainFrame mainFrame = new MainFrame();
		
		FrequencyUnitConverterController controller = new FrequencyUnitConverterController(proxy, mainFrame);
		
		mainFrame.setController(controller);
		mainFrame.run();
		
		Frequencys from = Frequencys.HERTZ;
		Frequencys to = Frequencys.KILOHERTZ;
		
//		double rate = proxy.changeFrequencyUnit(300, from, to);
//		
//		System.out.printf("1 %s = %f %s", from, rate, to);
		
		
	}
}
