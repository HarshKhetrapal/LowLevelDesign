package designpatterns.observerdesignpattern.observables;

import designpatterns.observerdesignpattern.observers.IObserver;

public interface IObservable {
    public void add(IObserver observer);
    public void remove(IObserver observer);
    public void notifyMe();
    public void setData(int data);
    public int getData();

}
