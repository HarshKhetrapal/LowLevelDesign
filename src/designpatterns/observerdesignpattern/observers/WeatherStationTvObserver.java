package designpatterns.observerdesignpattern.observers;

import designpatterns.observerdesignpattern.observables.IObservable;

public class WeatherStationTvObserver implements IObserver {
    IObservable wsObservable;
    public WeatherStationTvObserver(IObservable observable){
        wsObservable = observable;
    }
    @Override
    public void update() {
        System.out.println("Received notification in TV, Temp changed to "+wsObservable.getData());
    }
}
