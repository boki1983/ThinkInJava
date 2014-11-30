package boki.Interface;

import java.util.Arrays;

public abstract class StringProcessor implements Processor{
	public String name() {
		// getClass() Returns the runtime class of this Object
		return getClass().getSimpleName();
	}
	public abstract String process(Object input);
    public static String s = "If she weighs the same as adeck, she's made of wood";
    public static void main(String[] args) {
    	Apply.process(new Upcase(), s);
    	Apply.process(new Downcase(), s);
    	Apply.process(new Splitter(), s);
    }
}


class Upcase extends StringProcessor {
	// Covariant return
	public String process(Object input) {
		return ((String)input).toUpperCase();
	}
}

class Downcase extends StringProcessor {
	public String process(Object input) {
		return ((String)input).toLowerCase();
	}
}

class Splitter extends StringProcessor {
	public String process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
}
