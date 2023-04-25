package ForSubmission.me.day07.practice;


public class UnivStudent extends Student implements DriveLicenseAble {
    @Override
    public void renew() {
        System.out.println("UnivStudent - Renew Driver License");
    }
}