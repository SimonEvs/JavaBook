package BasicsOfProgramming.N4ConsoleInputOutput;

import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        // Для получения ввода с консоли в классе System определен объект in. Однако
        // непосредственно через объект System.in не очень удобно работать, поэтому, как
        // правило, используют класс Scanner, который, в свою очередь использует
        // System.in. Например, напишем маленькую программу, которая осуществляет ввод
        // чисел:

        // Scanner in = new Scanner(System.in);
        // System.out.print("Input a number: ");
        // int num = in.nextInt();

        // System.out.printf("Your number: %d \n", num);
        // in.close();

        // Чтобы получить введенное число, используется метод in.nextInt();, который
        // возвращает введенное с клавиатуры целочисленное значение.
        // Класс Scanner имеет еще ряд методов, которые позволяют получить введенные
        // пользователем значения:

        // next(): считывает введенную строку до первого пробела

        // nextLine(): считывает всю введенную строку

        // nextInt(): считывает введенное число int

        // nextDouble(): считывает введенное число double

        // nextBoolean(): считывает значение boolean

        // nextByte(): считывает введенное число byte

        // nextFloat(): считывает введенное число float

        // nextShort(): считывает введенное число short

        // То есть для ввода значений каждого примитивного типа в классе Scanner
        // определен свой метод.

        // Например, создадим программу для ввода информации о человеке:
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name1 = in.nextLine();
        System.out.print("Input age: ");
        int age1 = in.nextInt();
        System.out.print("Input height: ");
        float height1 = in.nextFloat();
        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name1, age1, height1);
        in.close();
    }
}
