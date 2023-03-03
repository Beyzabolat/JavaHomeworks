public class Main {

    public static void main(String[] args) {
//	BaseLogger[] loggers= new BaseLogger[] {new EmailLogger(), new ConsoleLogger(),new DataBaseLogger(), new FileLogger()} ;
//	for (BaseLogger logger: loggers) {
//	    logger.Log("Log mesaji");
//    }


        CustomerManager customerManager= new CustomerManager(new DataBaseLogger());
        customerManager.Add();
    }
}
