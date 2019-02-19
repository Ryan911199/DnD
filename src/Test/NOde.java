package Test;

public class NOde<T>
{
    private T data;
    private NOde<T> next;

    public NOde(T d){
        data = d;
        next = null;
    }

    public T getData(){
        return data;
    }

    public void setData(T d){
        data = d;
    }

    public void setNext(NOde<T> n){
        next = n;
    }

    public NOde<T> getNext(){
        return next;
    }
}
