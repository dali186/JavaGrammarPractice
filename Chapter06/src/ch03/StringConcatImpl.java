package ch03;

public class StringConcatImpl implements StringConcat{

	@Override
	public void makeString(String a, String b) {
		System.out.println(a + "," + b);
	}

}
