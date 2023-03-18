package designpatterns.observerdesignpattern.observers;

import designpatterns.observerdesignpattern.observables.IObservable;

public class WeatherStationMobileObserver implements IObserver {
    IObservable wsObservable;
    public WeatherStationMobileObserver(IObservable observable){
        wsObservable = observable;
    }
    @Override
    public void update() {
        System.out.println("Received notification in mobile, Temp changed to "+wsObservable.getData());
    }
}
