import view.MainFrame;
import net.webservicex.FrequencyUnit;
import net.webservicex.FrequencyUnitSoap;
import net.webservicex.Frequencys;



public class Main {

	public static void main(String[] args) {
		FrequencyUnit factory = new FrequencyUnit();
		
		FrequencyUnitSoap proxy = factory.getFrequencyUnitSoap();
		
		Frequencys from = Frequencys.HERTZ;
		Frequencys to = Frequencys.KILOHERTZ;
		
//		double rate = proxy.changeFrequencyUnit(300, from, to);
//		
//		System.out.printf("1 %s = %f %s", from, rate, to);
		
		MainFrame mainFrame = new MainFrame();
	}
}
