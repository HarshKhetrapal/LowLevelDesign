package designpatterns.chainofresponsibility;

public class Application {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.Error, "OMG it's an Error");
        logProcessor.log(LogProcessor.Debug, "Ohh it's a Debug");
        logProcessor.log(LogProcessor.INFO, "It's an Info");
    }
}
