package less7homeworkv3.MVP;

import less7homeworkv3.MVP.FoV;

public class PrintToConsole implements FoV {
   
    @Override
    public  void  print (String data, String item) {
        System.out.printf("%s %s\n", item, data);
    }

    @Override
    public void printMenu() {
        System.out.println("1. Сложить два действительных числа");
        System.out.println("2. Сложить два комплексных числа");
        System.out.println("3. Выход из программы...");
        System.out.print("Введите пункт из меню: ");
    }
}
