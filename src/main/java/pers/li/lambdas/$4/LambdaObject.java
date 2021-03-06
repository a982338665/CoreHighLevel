package pers.li.lambdas.$4;

public class LambdaObject {

	public static void main(String[] args) {

		IntOperation iop = x -> x * 2;
		DoubleOperation dop = x -> x * 2;
		
		Object obj1 = iop;
		Object obj2 = dop;

	}

}

interface IntOperation {
	int operate(int i);
}

interface DoubleOperation {
	double operate(double i);
}
