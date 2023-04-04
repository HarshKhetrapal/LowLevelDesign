package designpatterns.chainofresponsibility;

public class InfoLogProcessor extends LogProcessor{
    public InfoLogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel == INFO)
            System.out.println("Info: " + message);
        else super.log(logLevel, message);
    }
}
