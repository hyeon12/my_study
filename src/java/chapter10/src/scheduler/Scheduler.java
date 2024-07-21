package scheduler;

public interface Scheduler {
    public abstract void getNextCall();
    public void sendCallToAgent();

    default void showScheduler(){
        System.out.println("default 스케쥴러 메서드");
    }
}
