import java.util.logging.*;

public class TryCatchFinallySample {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(TryCatchFinallySample.class.getName());
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.INFO);
        logger.addHandler(consoleHandler);
        try {
            /*
             * ログ出力に変更
             * System.out.println("try");
             */
            logger.warning("WARNING");
            Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            /*
             * ログ出力に変更
             * System.out.println("catch");
             */
            logger.severe("SEVERE");
        } finally {
            /*
             * ログ出力に変更
             * System.out.println("finally");
             */
            logger.info("INFO");
        }
    }
}
