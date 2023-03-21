package review01;

public class Player {
	private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
//	public void getLevel() {
//		System.out.println(level.getClass());
//	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel playerLevel) {
		this.level = playerLevel;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
