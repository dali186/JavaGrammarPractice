package corereview.noncom;

import corereview.ServiceMan;

public abstract class Noncom implements ServiceMan {

	private int SerialNum = 20000;
	private String name;
	private String rank;

	public Noncom() {
		SerialNum++;
	}

	public int getSerialNum() {
		return SerialNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public void showInfo() {
		System.out.println("대한민국 " + position + "부사관입니다.");
	}

}
