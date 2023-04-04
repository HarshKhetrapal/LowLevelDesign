package designpatterns.chainofresponsibility;

public abstract class LogProcessor {
    public static int INFO = 1;
    public static int Debug = 2;
    public static int Error = 3;

    LogProcessor nextLogProcessor;
    public LogProcessor(LogProcessor nextProcessor) {
        this.nextLogProcessor = nextProcessor;
    }
    public void log(int logLevel, String message) {
        if(nextLogProcessor != null)
            nextLogProcessor.log(logLevel, message);
    }
}
