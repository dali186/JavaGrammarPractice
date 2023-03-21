package corereview.soldier;

public class Corporal extends PrivateSoldier{

	public Corporal(String name) {
		serialNum++;
		this.serialNum = serialNum;
		this.name = name;
		setRank("상병");
	}
	
	public Corporal() {
		serialNum++;
	}
	
	@Override
	public void shooting() {
		System.out.println("8/10");
	}

	@Override
	public void singing() {
		System.out.println("잘 부릅니다.");
	}

	@Override
	public void showStatus() {
		System.out.println("열심히 합니다. 회의감이 듭니다.");
	}
}
