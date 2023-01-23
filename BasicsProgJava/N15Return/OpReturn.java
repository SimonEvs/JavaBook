package BasicsOfProgramming.N15Return;

public class OpReturn {
    public static void main(String[] args) {
        // Оператор return. Результат метода
        // Методы могут возвращать некоторое значение. Для этого применяется оператор
        // return.
        // return возвращаемое_значение;
        // После оператора return указывается возвращаемое значение, которое является
        // результатом метода. Это может быть литеральное значение, значение переменной
        // или какого-то сложного выражения.

        // Например:
        public class Program {

            public static void main(String args[]) {

                int x = sum(1, 2, 3);
                int y = sum(1, 4, 9);
                System.out.println(x); // 6
                System.out.println(y); // 14
            }

            static int sum(int a, int b, int c) {

                return a + b + c;
            }
        }
        // В методе в качестве типа возвращаемого значения вместо void используется
        // любой другой тип. В данном случае метод sum возвращает значение типа int,
        // поэтому этот тип указывается перед названием метода. Причем если в качестве
        // возвращаемого типа для метода определен любой другой, отличный от void, то
        // метод обязательно должен использовать оператор return для возвращения
        // значения.

        // При этом возвращаемое значение всегда должно иметь тот же тип, что значится в
        // определении функции. И если функция возвращает значение типа int, то после
        // оператора return стоит целочисленное значение, которое является объектом типа
        // int. Как в данном случае это сумма значений параметров метода.

        // Метод может использовать несколько вызовов оператора return для возваращения
        // разных значений в зависимости от некоторых условий:
        public class Program {

            public static void main(String args[]) {

                System.out.println(daytime(7)); // Good morning
                System.out.println(daytime(13)); // Good after noon
                System.out.println(daytime(18)); // Good evening
                System.out.println(daytime(2)); // Good night
            }

            static String daytime(int hour) {

                if (hour > 24 || hour < 0)
                    return "Invalid data";
                else if (hour > 21 || hour < 6)
                    return "Good night";
                else if (hour >= 15)
                    return "Good evening";
                else if (hour >= 11)
                    return "Good after noon";
                else
                    return "Good morning";
            }
        }

        // Здесь метод daytime возвращает значение типа String, то есть строку, и в
        // зависимости от значения параметра hour возвращаемая строка будет различаться.

        // Выход из метода
        // Оператор return применяется для возвращаения значения из метода, но и для
        // выхода из метода. В подобном качестве оператор return применяется в методах,
        // которые ничего не возвращают, то есть имеют тип void:

        public class Program {

            public static void main(String args[]) {

                daytime(7); // Good morning
                daytime(13); // Good after noon
                daytime(32); //
                daytime(56); //
                daytime(2); // Good night
            }

            static void daytime(int hour) {

                if (hour > 24 || hour < 0)
                    return;
                if (hour > 21 || hour < 6)
                    System.out.println("Good night");
                else if (hour >= 15)
                    System.out.println("Good evening");
                else if (hour >= 11)
                    System.out.println("Good after noon");
                else
                    System.out.println("Good morning");
            }
        }
        // Если переданное в метод datetime значение больше 24 или меньше 0, то просто
        // выходим из метода. Возвращаемое значение после return указывать в этом случае
        // не нужно.
    }

}
