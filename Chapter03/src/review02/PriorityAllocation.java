package review02;

public class PriorityAllocation implements Scheduler{

	@Override
	public void sendCallToAgent() {
		System.out.println("우선순위가 높은 고객우선 숙련도 높은 상담원에게 배분합니다.");
	}

}
