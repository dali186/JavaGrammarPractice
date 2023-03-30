package corereview.soldier;

public class Sergeant extends Corporal{
	
	public Sergeant() {
		serialNum++;
		this.serialNum = serialNum;
		this.name = name;
		setRank("상병");
	}
	
	@Override
	public void shooting() {
		System.out.println("0/10");
	}

	@Override
	public void singing() {
		System.out.println("안 부릅니다.");
	}

	@Override
	public void showStatus() {
		System.out.println("뭐든 하기가 싫습니다. 아무생각 없습니다.");
	}
	
	public void hide() {
		System.out.println(name + " " + rank + "가 어딘가에 짱박혀있습니다.");
	}
}
