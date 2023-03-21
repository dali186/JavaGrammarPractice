package corereview.soldier;

public class PrivateSoldier extends Soldier{

	public PrivateSoldier(String name) {
		serialNum++;
		this.serialNum = serialNum;
		this.name = name;
		setRank("일병");
	}
	public PrivateSoldier() {
		serialNum++;
	}
	
	@Override
	public void shooting() {
		System.out.println("3/10");
	}

	@Override
	public void singing() {
		System.out.println("외우는 중입니다.");
	}

	@Override
	public void showInfo() {
		System.out.println(name + " " + rank + "의 군번은 " + serialNum + "입니다.");
	}

	@Override
	public void showStatus() {
		System.out.println("집 갈 날이 멀어서 슬픕니다.");
	}

}
