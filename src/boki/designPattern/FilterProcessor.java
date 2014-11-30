package boki.designPattern;

// Adaptor pattern：撰寫程式碼(FilterAdaptor)來接收既有介面(HighPass、LowPass)
//                                並產生所需要的介面
class FilterAdaptor implements Processor{
	// 同時運用了Composition + extends = delegation
    Filter filter;
    public FilterAdaptor(Filter filter) {
    	this.filter = filter;
    }
	public String name() {
		// Composition
		return filter.name();
	}

	public Waveform process(Object input) {
		return filter.process((Waveform) input);
	}
}

public class FilterProcessor {
	public static void main(String[] args) {
		Waveform w = new Waveform();
		//Apply.process(new LowPass(1.0), w);
		
		Apply.process(new FilterAdaptor(new LowPass(1.0)), w);
		Apply.process(new FilterAdaptor(new HighPass(2.0)), w);
		Apply.process(new FilterAdaptor(new BandPass(3.0,4.0)), w);
	}
}
