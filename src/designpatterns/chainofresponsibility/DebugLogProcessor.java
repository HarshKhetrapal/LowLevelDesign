package designpatterns.chainofresponsibility;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }
    @Override
    public void log(int logLevel, String message) {
        if(logLevel == Debug)
            System.out.println("Debug: " + message);
        else super.log(logLevel, message);
    }
}
