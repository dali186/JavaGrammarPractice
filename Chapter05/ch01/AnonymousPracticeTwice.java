package ch01;

public class AnonymousPracticeTwice {
	public static void main(String[] args) {
	Army army = new Trainee() {

		@Override
		public void shoot() {
			// TODO Auto-generated method stub
			super.shoot();
		}

		@Override
		public void zzam() {
			// TODO Auto-generated method stub
			super.zzam();
		}
		
	};
	}
}

class Army {
	private int serialNum;
	
	public void shoot() {
		System.out.println("군인이 총을 쏩니다.");
	}
}

class Trainee extends Army {

	@Override
	public void shoot() {
		System.out.println("이등병이라 세발 맞춥니다.");
	}
	
	public void zzam() {
		System.out.println("훈련병이 짬을 후다닥 먹습니다.");
	}
	
}
