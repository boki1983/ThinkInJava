package boki.Interface;

import java.util.Random;

public interface RandVals {
	// notice interface資料成員不能為blank，但可被非常數運算子初始化
    Random RAND= new Random(47);
    int RANDOM_INT = RAND.nextInt(10);
    long RANDOM_LONG = RAND.nextLong() * 10;
    float RANDOM_FLOAT = RAND.nextFloat() * 10;
    double RANDOM_DOUBLE = RAND.nextDouble() * 10;
}
