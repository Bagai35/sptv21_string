import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---");
        System.out.println("введите строку(латиница)");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();


            System.out.println("функции программы");
            System.out.println("0 выйти из пограммы");
            System.out.println("1 посчитать колл во символов в строке");
            System.out.println("2 коллво слов в строке");
            System.out.println("3 найти подстроку в строке");
            System.out.println("4 заменить строку");
            System.out.println("введите номер функции: ");
            int numFunc = scanner.nextInt();
            int i = 0;
            if (numFunc == 0) {
                break;
            } else if (numFunc == 1) {
                System.out.println("вы выбрали пункт" + numFunc);
                int countCharInStr = 0;
                char[] chars = str.toCharArray();
                for (i = 0; i < chars.length; i++){
                if (chars[i] != ' ') {
                    countCharInStr++;
                }
                }System.out.println("колл-во символов в строке" + countCharInStr);
            } else if (numFunc == 2) {
                System.out.println("вы выбрали пункт" + numFunc);

            } else if (numFunc == 3) {
                System.out.println("вы выбрали пункт" + numFunc);
            } else if (numFunc == 4) {
                System.out.println("вы выбрали пункт" + numFunc);
                String removeString = scanner.nextLine();
                String newStr;
                int index = str.indexOf(removeString);
                if (index ==-1){
                    System.out.println("такой строки нет"+removeString);
                }else{
                    System.out.println("на какую строку поменять? ");
                    newStr = scanner.nextLine();
                    System.out.println("изменённая строка теперь такая");
                    System.out.println(str.replace(removeString, newStr));
                }

            }
        }
  }
}
