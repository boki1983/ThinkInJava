package boki.designPattern;

public class Filter {
	public String name() {
		// getClass() Returns the runtime class of this Object
		return getClass().getSimpleName();
	}
	public Waveform process(Waveform input) { return input; }
}
