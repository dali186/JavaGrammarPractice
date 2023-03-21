package corereview.officer;

import corereview.ServiceMan;

public abstract class Officer implements ServiceMan{
	
	private int SerialNum = 30000;
	private String name;
	private String rank;
	
	public Officer() {
		SerialNum++;
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

	public int getSerialNum() {
		return SerialNum;
	}

	@Override
	public void showInfo() {
		System.out.println("대한민국" + position + "장교입니다.");
	}
	
}
