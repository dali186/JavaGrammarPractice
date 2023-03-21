package corereview;

import corereview.soldier.PrivateSoldier;

public class ServiceManTest {

	public static void main(String[] args) {
		PrivateSoldier moi = new PrivateSoldier("모아이");
		PrivateSoldier minsuk = new PrivateSoldier("민석");
		moi.showInfo();
		moi.showStatus();
		moi.showPosition();
		minsuk.showInfo();
	}

}
