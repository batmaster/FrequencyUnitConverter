package controller;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.swing.SwingWorker;

import net.webservicex.FrequencyUnitSoap;
import net.webservicex.Frequencys;
import view.MainFrame;

/**
 * Controller for handle calling service.
 * Auto call {@link MainFrame#showResult(String)} when service success
 * or {@link MainFrame#showStatus(String)} if error occurs.
 * 
 * Need to be {@link FrequencyUnitConverterController#setParameters(double, Frequencys, Frequencys)}
 * before calling {@link FrequencyUnitConverterController#execute()}.
 * 
 * @author Poramate Homprakob 5510546077
 *
 */
public class FrequencyUnitConverterController extends SwingWorker<Double, Double> {
	
	/** For calling service */
	private FrequencyUnitSoap proxy;
	
	/** For return the result or status or error */
	private MainFrame gui;
	
	/** Parameters for service calling */
	private double value;
	private Frequencys from;
	private Frequencys to;
	
	/**
	 * Constructor, require Soap and user interface.
	 * @param proxy the Soap for calling service
	 * @param gui  the user interface for showing
	 */
	public FrequencyUnitConverterController(FrequencyUnitSoap proxy, MainFrame gui) {
		this.proxy = proxy;
		this.gui = gui;
		// PENDING
		gui.showStatus(this.getState().toString());
	}
	
	/**
	 * Set service parameters be used whan calling {@link FrequencyUnitConverterController#execute()}.
	 * @param value the value to be convert
	 * @param from source unit
	 * @param to destination unit
	 */
	public void setParameters(double value, Frequencys from, Frequencys to) {
		System.out.println(value + " " + from + " " + to);
		this.value = value;
		this.from = from;
		this.to = to;
	}

	/**
	 * Call service in another thread.
	 * Auto call done() when finish.
	 * And call get() when want to get the service result.
	 */
	@Override
	protected Double doInBackground() throws Exception {
		// STARTED
		gui.showStatus(this.getState().toString());
//		Thread.currentThread().sleep(5000);
		return proxy.changeFrequencyUnit(value, from, to);
	}

	/**
	 * When service result retrieved.
	 * Show result in result box if success or show error in status box if fail.
	 */
	@Override
	protected void done() {
		super.done();
		// DONE
		gui.showStatus(this.getState().toString());
		try {
			try {
				gui.showResult(get(15, TimeUnit.SECONDS).toString());
			} catch (TimeoutException e) {
				gui.showStatus("Timeout, please try again");
				e.printStackTrace();
			}
		} catch (InterruptedException e) {
			gui.showStatus("Interrupted, please try again");
			e.printStackTrace();
		} catch (ExecutionException e) {
			gui.showStatus("Connection error, please try again");
			e.printStackTrace();
		}
	}
}
