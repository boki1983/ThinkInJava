package upCasting;

class Instrument {
	public void play() {};
	static void  tune(Instrument i) {
		i.play();
	}
}

public class Wind extends Instrument{
    public static void main(String[] args) {
    	Wind w = new Wind();
    	// upCasting
    	Instrument.tune(w);
    }
}
