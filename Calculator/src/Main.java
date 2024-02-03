import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         int count=0;
        char operation=0;
        char[] uchar = new char[26];
        Scanner in = new Scanner(System.in);
        System.out.println("Привет! Введи пример :)");
        String example =in.nextLine(); //Берем строку

        //Забираем оператор
        ArrayList<String> strBlock00 = new ArrayList<>(10);
        for (int i = 0; i < example.length(); i++) {
            uchar[i] = example.charAt(i);
            if (uchar[i] == '+') {
                operation = '+';
                count++;
            }
            if (uchar[i] == '-') {
                operation = '-';
                count++;
            }
            if (uchar[i] == '*') {
                operation = '*';
                count++;
            }
            if (uchar[i] == '/') {
                operation = '/';
                count++;
            }
        }

        String[] words = example.split("\\+|-|/|\\*"); //Разделители

        //условие, если чисел больше/меньше двух
        if(words.length!=2 || count!=1)
        {
            throw new ArithmeticException("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        //Забираем числа
        Integer a =Integer.valueOf(words[0]);
        Integer b= Integer.valueOf(words[1]);
        if(1<=a&& a<=10 && 1<=b && b<=10 ){
            //switch case
            switch (operation)
            {
                case ('+'):
                    System.out.println(a+b);
                    break;
                case ('*'):
                    System.out.println(a*b);
                    break;
                case ('-'):
                    System.out.println(a-b);
                    break;
                case ('/'):
                    System.out.println(a/b);
                    break;
            }
        }
        else {throw new ArithmeticException("т.к. число должно быть больше 1 и меньше 10 включительно");}


        in.close();
    }
}