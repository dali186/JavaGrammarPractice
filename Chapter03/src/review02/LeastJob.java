package review02;

public class LeastJob implements Scheduler{

	@Override
	public void sendCallToAgent() {
		System.out.println("대기가 적은 상담원 우선의 상담원에게 배분합니다.");
	}

}
