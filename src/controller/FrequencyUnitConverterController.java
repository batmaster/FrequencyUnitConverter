package controller;

import java.util.concurrent.ExecutionException;

import javax.swing.SwingWorker;

import net.webservicex.FrequencyUnitSoap;
import net.webservicex.Frequencys;
import view.MainFrame;

public class FrequencyUnitConverterController extends SwingWorker<Double, Double> {
	
	private FrequencyUnitSoap proxy;
	private MainFrame gui;
	
	private double value;
	private Frequencys from;
	private Frequencys to;
	
	public FrequencyUnitConverterController(FrequencyUnitSoap proxy, MainFrame gui) {
		this.proxy = proxy;
		this.gui = gui;
	}
	
	public void setParameters(double value, Frequencys from, Frequencys to) {
		System.out.println(from + " " + to);
		this.value = value;
		this.from = from;
		this.to = to;
	}

	@Override
	protected Double doInBackground() throws Exception {
		gui.showStatus("Do in background...");
		return proxy.changeFrequencyUnit(300, from, to);
	}

	@Override
	protected void done() {
		super.done();
		gui.showStatus(this.getState().toString());
		try {
			gui.showResult(get().toString());
		} catch (InterruptedException e) {
			gui.showStatus(e.getMessage());
			e.printStackTrace();
		} catch (ExecutionException e) {
			gui.showStatus(e.getMessage());
			e.printStackTrace();
		}
	}

}
