package N1BasicsProgJava.N10ConditionalConstructs;

public class ConditionalConstructs {
    public static void main(String[] args) {
        // Условные конструкции
        // Одним из фундаментальных элементов многих языков программирования являются
        // условные конструкции. Данные конструкции позволяют направить работу программы
        // по одному из путей в зависимости от определенных условий.

        // В языке Java используются следующие условные конструкции: if..else и
        // switch..case

        // Конструкция if/else
        // Выражение if/else проверяет истинность некоторого условия и в зависимости от
        // результатов проверки выполняет определенный код:
        int num1 = 6;
        int num2 = 4;
        if (num1 > num2) {
            System.out.println("Первое число больше второго");
        }

        // После ключевого слова if ставится условие. И если это условие выполняется, то
        // срабатывает код, который помещен в далее в блоке if после фигурных скобок. В
        // качестве условий выступает операция сравнения двух чисел.

        // Так как, в данном случае первое число больше второго, то выражение num1 >
        // num2 истинно и возвращает значение true. Следовательно, управление переходит
        // в блок кода после фигурных скобок и начинает выполнять содержащиеся там
        // инструкции, а конкретно метод System.out.println("Первое число больше
        // второго");. Если бы первое число оказалось бы меньше второго или равно ему,
        // то инструкции в блоке if не выполнялись бы.

        // Но что, если мы захотим, чтобы при несоблюдении условия также выполнялись
        // какие-либо действия? В этом случае мы можем добавить блок else:
        int num1 = 6;
        int num2 = 4;
        if (num1 > num2) {
            System.out.println("Первое число больше второго");
        } else {
            System.out.println("Первое число меньше второго");
        }

        // Но при сравнении чисел мы можем насчитать три состояния: первое число больше
        // второго, первое число меньше второго и числа равны. С помощью выражения else
        // if, мы можем обрабатывать дополнительные условия:
        int num1 = 6;
        int num2 = 8;
        if (num1 > num2) {
            System.out.println("Первое число больше второго");
        } else if (num1 < num2) {
            System.out.println("Первое число меньше второго");
        } else {
            System.out.println("Числа равны");
        }

        // Также мы можем соединить сразу несколько условий, используя логические
        // операторы:

        int num1 = 8;
        int num2 = 6;
        if (num1 > num2 && num1 > 7) {
            System.out.println("Первое число больше второго и больше 7");
        }
        // Здесь блок if будет выполняться, если num1 > num2 равно true и одновременно
        // num1>7 равно true.

        // Конструкция switch
        // Конструкция switch/case аналогична конструкции if/else, так как позволяет
        // обработать сразу несколько условий:
        int num = 8;
        switch (num) {

            case 1:
                System.out.println("число равно 1");
                break;
            case 8:
                System.out.println("число равно 8");
                num++;
                break;
            case 9:
                System.out.println("число равно 9");
                break;
            default:
                System.out.println("число не равно 1, 8, 9");
        }
        // После ключевого слова switch в скобках идет сравниваемое выражение. Значение
        // этого выражения последовательно сравнивается со значениями, помещенными после
        // операторов сase. И если совпадение найдено, то будет выполняет
        // соответствующий блок сase.

        // В конце блока сase ставится оператор break, чтобы избежать выполнения других
        // блоков. Например, если бы убрали оператор break в следующем случае:

        // case 8:
        // System.out.println("число равно 8");
        // num++;
        // case 9:
        // System.out.println("число равно 9");
        // break;

        // то выполнился бы блок case 8, (поскольку переменная num равна 8). Но так как
        // в этом блоке оператор break отсутствует, то начал бы выполняться блок case 9.

        // Если мы хотим также обработать ситуацию, когда совпадения не будет найдено,
        // то можно добавить блок default, как в примере выше. Хотя блок default
        // необязателен.

        // Также мы можем определить одно действие сразу для нескольких блоков case
        // подряд:

        int num = 3;
        int output = 0;
        switch (num) {

            case 1:
                output = 3;
                break;
            case 2:
            case 3:
            case 4:
                output = 6;
                break;
            case 5:
                output = 12;
                break;
            default:
                output = 24;
        }
        System.out.println(output);

        // Тернарная операция
        // Тернарную операция имеет следующий синтаксис: [первый операнд - условие] ?
        // [второй операнд] : [третий операнд]. Таким образом, в этой операции участвуют
        // сразу три операнда. В зависимости от условия тернарная операция возвращает
        // второй или третий операнд: если условие равно true, то возвращается второй
        // операнд; если условие равно false, то третий. Например:

        int x = 3;
        int y = 2;
        int z = x < y ? (x + y) : (x - y);
        System.out.println(z);
        // Здесь результатом тернарной операции является переменная z. Сначала
        // проверяется условие x<y. И если оно соблюдается, то z будет равно второму
        // операнду - (x+y), иначе z будет равно третьему операнду.
    }
}
