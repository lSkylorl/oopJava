package PhoneBookHW5;

import java.util.Scanner;

public class ConsoleView implements FoV{
    Scanner consoleInput;

    public ConsoleView() {
        consoleInput = new Scanner(System.in);
    }

    @Override
    public String getFirstName() {
        System.out.printf("Имя: ");
        return consoleInput.nextLine();
    }

    @Override
    public void setFirstName(String value) {
        System.out.printf("FirstName: %s\n", value);
    }

    @Override
    public String getLastName() {
        System.out.printf("Фамилия: ");
        return consoleInput.nextLine();
    }

    @Override
    public void setLastName(String value) {
        System.out.printf("LastName: %s\n", value);
    }

    @Override
    public String getPhoneNumber() {
        System.out.printf("Номер телефона: ");
        return consoleInput.nextLine();
    }

    @Override
    public void setPhoneNumber(String value) {
        System.out.printf("PhoneNumber: %s\n", value);
    }
}