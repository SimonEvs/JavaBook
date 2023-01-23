package BasicsOfProgramming.N13Methods;

public class Methods {
    public static void main(String[] args) {
        // Методы

        // Если переменные и константы хранят некоторые значения, то методы содержат
        // собой набор операторов, которые выполняют определенные действия.

        // Общее определение методов выглядит следующим образом:

        // [модификаторы] тип_возвращаемого_значения название_метода ([параметры]){
        // // тело метода
        // }

        // Модификаторы и параметры необязательны.

        // По умолчанию главный класс любой программы на Java содержит метод main,
        // который служит точкой входа в программу:

        // public static void main(String[] args) {
        // System.out.println("привет мир!");
        // }

        // Ключевые слова public и static являются модификаторами. Далее идет тип
        // возвращаемого значения. Ключевое слово void указывает на то, что метод ничего
        // не возвращает.

        // Затем идут название метода - main и в скобках параметры метода - String[]
        // args. И в фигурные скобки заключено тело метода - все действия, которые он
        // выполняет.

        // Создадим еще несколько методов:

        public class Program {

            public static void main(String args[]) {

            }

            void hello() {

                System.out.println("Hello");
            }

            void welcome() {

                System.out.println("Welcome to Java 10");
            }
        }

        // Здесь определены два дополнительных метода: hello и welcome, каждый из
        // которых выводит некоторую строку на консоль. Методы определяются внутри
        // класса - в данном случае внутри класса Program, в котором определен метод
        // main.

        // Но если мы скомпилируем и запустим данную программу, то мы ничего не увидим
        // на консоли. В примере выше мы определили два метода, но мы их нигде не
        // вызываем. По умолчанию в программе Java выполняется только метод main и все
        // его содержимое. Поэтому, если мы хотим, чтобы другие методы тоже выполнялись,
        // их надо вызвать в методе main.

        // Вызов метода осуществляется в форме:

        // имя_метода(аргументы);

        // После имени метода указываются скобки, в которых перечисляются аргументы -
        // значения для параметров метода.

        // Например, определим и выполним несколько методов:

        public class Program {

            public static void main(String args[]) {

                hello();
                welcome();
                welcome();
            }

            static void hello() {

                System.out.println("Hello");
            }

            static void welcome() {

                System.out.println("Welcome to Java 10");
            }
        }

        // В методе main вызывается один раз метод hello и два раза метод welcome. В
        // этом и заключается одно из преимуществ методов: мы можем вынести некоторые
        // общие действия в отдельный метод и затем вызывать многократно их в различных
        // местах программы. Поскольку оба метода не имеют никаких параметров, то после
        // их названия при вызове ставятся пустые скобки.

        // Также следует отметить, что чтобы вызвать в методе main другие методы,
        // которые определены в одном классе с методом main, они должны иметь
        // модификатор static.

        // В итоге после компиляции и выполнения программы мы увидим на консоли:
    }
}
