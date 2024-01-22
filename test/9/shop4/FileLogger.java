package shop4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger implements Logger{
    private File logFile;
    public FileLogger(File file){
        this.logFile = file;
    }
    
    @Override
    public void purchase(Customer customer, Item item) {
        String logMessage = String.format("Purchase: Customer %s bought %s at %s", customer.getName(), item.getName(), getCurrentDateTime());
        writeLog(logMessage);
    }

    @Override
    public void balance(User user) {
        String logMessage = String.format("Balance check: User %s checked balance at %s", user.getName(), getCurrentDateTime());
        writeLog(logMessage);
    }

    @Override
    public void error(User user, String error) {
        String logMessage = String.format("Error: User %s encountered an error - %s at %s", user.getName(), error, getCurrentDateTime());
        writeLog(logMessage);
    }

    private String getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }

    private void writeLog(String logMessage) {
        try (FileWriter writer = new FileWriter(logFile, true)) {
            writer.write(logMessage + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
