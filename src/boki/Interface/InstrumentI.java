package boki.Interface;

public interface InstrumentI {
	// compile-time constant
	// interface資料成員會自動變成static & final
	// static & final
	int VALUE = 5;
	// can't have method definitions
	// Automatically public
    void play(Note n);
    String what();
    void adjust();
}
