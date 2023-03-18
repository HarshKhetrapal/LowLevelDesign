package designpatterns.observerdesignpattern.observables;

import designpatterns.observerdesignpattern.observers.IObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationObservable implements IObservable{
    List<IObserver> observerList;
    int data = 0;
    public WeatherStationObservable() {
        observerList = new ArrayList<>();
    }
    @Override
    public void add(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyMe() {
        for (IObserver observer: observerList) {
            observer.update();
        }
    }

    @Override
    public void setData(int data) {
        if(this.data != data) {
            this.data = data;
            notifyMe();
        }
    }

    @Override
    public int getData() {
        return this.data;
    }
}
