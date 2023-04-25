package ForSubmission.me.day07.practice;

public class Worker extends Person implements DriveLicenseAble {
    @Override
    public void renew() {
        System.out.println("Worker - Renew Driver License");
    }
}