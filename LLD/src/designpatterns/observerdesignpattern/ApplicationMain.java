package designpatterns.observerdesignpattern;

import designpatterns.observerdesignpattern.observables.IObservable;
import designpatterns.observerdesignpattern.observables.WeatherStationObservable;
import designpatterns.observerdesignpattern.observers.IObserver;
import designpatterns.observerdesignpattern.observers.WeatherStationMobileObserver;
import designpatterns.observerdesignpattern.observers.WeatherStationTvObserver;

public class ApplicationMain {
    public static void main(String args[]) {
        IObservable wsObservable = new WeatherStationObservable();
        IObserver wsMobileObserver = new WeatherStationMobileObserver(wsObservable);
        IObserver wsTvObserver = new WeatherStationTvObserver(wsObservable);
        wsObservable.add(wsMobileObserver);
        wsObservable.add(wsTvObserver);
        wsObservable.setData(10);
    }
}
