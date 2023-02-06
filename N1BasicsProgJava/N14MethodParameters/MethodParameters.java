package N1BasicsProgJava.N14MethodParameters;

public class MethodParameters {
    public static void main(String[] args) {
        // Параметры методов

        // С помощью параметров мы можем передать в методы различные данные, которые
        // будут использоваться для вычислений. Например:

        // static void sum(int x, int y){

        // int z = x + y;
        // System.out.println(z);
        // }

        // Данная функция принимает два параметра - два числа, складывает их и выводит
        // их сумму на консоль.

        // А при вызове этого метода в программе нам необходимо передать на место
        // параметров значения, которые соответствуют типу параметра:

        public class Program {

            public static void main(String args[]) {

                int a = 6;
                int b = 8;
                sum(a, b); // 14
                sum(3, a); // 9
                sum(5, 23); // 28
            }

            static void sum(int x, int y) {

                int z = x + y;
                System.out.println(z);
            }
        }
        // Поскольку метод sum принимает два значения типа int, то на место параметров
        // надо передать два значения типа int. Это могут быть и числовые литералы, и
        // переменные типов данных, которые представляют тип int или могут быть
        // автоматически преобразованы в тип int. Значения, которые передаются на место
        // параметров, еще называются аргументами. Значения передаются параметрам по
        // позиции, то есть первый аргумент первому параметру, второй аргумент - второму
        // параметру и так далее.

        // Рассмотрим другой пример:

        public class Program {

            public static void main(String args[]) {

                display("Tom", 34);
                display("Bob", 28);
                display("Sam", 23);
            }

            static void display(String name, int age) {

                System.out.println(name);
                System.out.println(age);
            }
        }

        // Метод display принимает два параметра. Первый параметр представляет тип
        // String, а второй - тип int. Поэтому при вызове метода вначале в него надо
        // передать строку, а затем число.

        // Параметры переменной длины
        // Метод может принимать параметры переменной длины одного типа. Например, нам
        // надо передать в метод набор числел и вычислить их сумму, но мы точно не
        // знаем, сколько именно чисел будет передано - 3, 4, 5 или больше. Параметры
        // переменной длины позволяют решить эту задачу:

        public class Program {

            public static void main(String args[]) {

                sum(1, 2, 3); // 6
                sum(1, 2, 3, 4, 5); // 15
                sum(); // 0
            }

            static void sum(int... nums) {

                int result = 0;
                for (int n : nums)
                    result += n;
                System.out.println(result);
            }
        }

        // Троеточие перед названием параметра int ...nums указывает на то, что он будет
        // необязательным и будет представлять массив. Мы можем передать в метод sum
        // одно число, несколько чисел, а можем вообще не передавать никаких параметров.
        // Причем, если мы хотим передать несколько параметров, то необязательный
        // параметр должен указываться в конце:
        public static void main(String[] args) {
         
            sum("Welcome!", 20,10);
            sum("Hello World!");
        }
        static void sum(String message, int ...nums){
                 
            System.out.println(message);   
            int result =0;
            for(int x:nums)
                result+=x;
            System.out.println(result);
        }
    }
}