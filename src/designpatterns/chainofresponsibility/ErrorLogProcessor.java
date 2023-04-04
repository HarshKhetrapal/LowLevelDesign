package designpatterns.chainofresponsibility;

public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }
    @Override
    public void log(int logLevel, String message) {
        if(logLevel == Error)
            System.out.println("Error: " + message);
        else super.log(logLevel, message);
    }
}
