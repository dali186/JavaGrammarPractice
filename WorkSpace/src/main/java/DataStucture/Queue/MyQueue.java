package DataStucture.Queue;

public interface MyQueue<T>{
    void offer(T data);
    T poll();
    T peak();
    int size();
    void clear();
    boolean isEmpty();
}
