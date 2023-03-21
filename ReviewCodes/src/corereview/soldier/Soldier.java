package corereview.soldier;

import corereview.ServiceMan;

public abstract class Soldier implements ServiceMan {

	protected static int serialNum = 10000;
	protected String name;
	protected String rank;

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
		return serialNum;
	}

	public abstract void showStatus();
	
	@Override
	public void showPosition() {
		System.out.println(name + " " + rank + "은 대한민국 " + position + "병사입니다.");
	}
}
