package BookOfProgrammingJava.ClassesAndOOP;

public class N2Packages {
    public static void main(String[] args) {
        // Как правило, в Java классы объединяются в пакеты. Пакеты позволяют
        // организовать классы логически в наборы. По умолчанию java уже имеет ряд
        // встроенных пакетов, например, java.lang, java.util, java.io и т.д. Кроме
        // того, пакеты могут иметь вложенные пакеты.

        // Организация классов в виде пакетов позволяет избежать конфликта имен между
        // классами. Ведь нередки ситуации, когда разработчики называют свои классы
        // одинаковыми именами. Принадлежность к пакету позволяет гарантировать
        // однозначность имен.

        // Чтобы указать, что класс принадлежит определенному пакету, надо использовать
        // директиву package, после которой указывается имя пакета:

        // package название_пакета;

        // Как правило, названия пакетов соответствуют физической структуре проекта, то
        // есть организации каталогов, в которых находятся файлы с исходным кодом. А
        // путь к файлам внутри проекта соответствует названию пакета этих файлов.
        // Например, если классы принадлежат пакету mypack, то эти классы помещаются в
        // проекте в папку mypack.

        // Классы необязательно определять в пакеты. Если для класса пакет не определен,
        // то считается, что данный класс находится в пакете по умолчанию, который не
        // имеет имени.

        // Например, создадим в папке для исходных файлов каталог study. В нем создадим
        // файл Program.java со следующим кодом:

        package ClassesAndOOP;
 
        public class Program{
            
            public static void main(String[] args) {
                    
                Person kate = new Person("Kate", 32);
                kate.displayInfo();
            }
        }
        class Person{
            
            String name;
            int age;
        
            Person(String name, int age){
                this.name = name;
                this.age = age;
            }
            void displayInfo(){
                System.out.printf("Name: %s \t Age: %d \n", name, age);
            }
        }

        // Директива package study в начале файла указывает, что классы Program и
        // Person, которые здесь определены, принадлежат пакету study.

        // Когда мы работаем в среде разработки, например, в Netbeans, то IDE берет на
        // себя все вопросы компиляции пакетов и входящих в них файлов. Соответственно
        // нам достаточно нажать на кнопку, и все будет готово. Однако если мы
        // компилируем программу в командной строке, то мы можем столкнуться с
        // некоторыми трудностями. Поэтому рассмотрим этот аспект.

        // Для компиляции программы вначале в командной строке/терминале с помощью
        // команды cd перейдем к папке, где находится каталог study.

        // cd C:\java
        // Например, в моем случае это каталог C:\java (то есть файл с исходным кодом
        // расположен по пути C:\java\study\Program.java).

        // Для компиляции выполним команду

        // javac study\Program.java
        // После этого в папке study появятся скомпилированные файлы Program.class и
        // Person.class. Для запуска программы выполним команду:

        // java study.Program

        // Импорт пакетов и классов
        // Если нам надо использовать классы из других пакетов, то нам надо подключить
        // эти пакеты и классы. Исключение составляют классы из пакета java.lang
        // (например, String), которые подключаются в программу автоматически.

        // Например, знакомый по прошлым темам класс Scanner находится в пакете
        // java.util, поэтому мы можем получить к нему доступ следующим способом:

        // java.util.Scanner in = new java.util.Scanner(System.in);


        // То есть мы указываем полный путь к файлу в пакете при создании его объекта.
        // Однако такое нагромождение имен пакетов не всегда удобно, и в качестве
        // альтернативы мы можем импортировать пакеты и классы в проект с помощью
        // директивы import, которая указывается после директивы package:

        // package study;

        // import java.util.Scanner; // импорт класса Scanner

        // public class Program {

        // public static void main(String[] args) {

        // Scanner in = new Scanner(System.in);
        // }
        // }

        // Директива import указывается в самом начале кода, после чего идет имя
        // подключаемого класса (в данном случае класса Scanner).

        // В примере выше мы подключили только один класс, однако пакет java.util
        // содержит еще множество классов. И чтобы не подключать по отдельности каждый
        // класс, мы можем сразу подключить весь пакет:

        // import java.util.*; // импорт всех классов из пакета java.util

        // Теперь мы можем использовать любой класс из пакета java.util.

        // Возможна ситуация, когда мы используем два класса с одним и тем же названием
        // из двух разных пакетов, например, класс Date имеется и в пакете java.util, и
        // в пакете java.sql. И если нам надо одновременно использовать два этих класса,
        // то необходимо указывать полный путь к этим классам в пакете:

        // java.util.Date utilDate = new java.util.Date();
        // java.sql.Date sqlDate = new java.sql.Date();

        // Статический импорт
        // В java есть также особая форма импорта - статический импорт. Для этого вместе
        // с директивой import используется модификатор static:

        // package study;

        // import static java.lang.System.*;
        // import static java.lang.Math.*;

        // public class Program {

        // public static void main(String[] args) {

        // double result = sqrt(20);
        // out.println(result);
        // }
        // }

        // Здесь происходит статический импорт классов System и Math. Эти классы имеют
        // статические методы. Благодаря операции статического импорта мы можем
        // использовать эти методы без названия класса. Например, писать не
        // Math.sqrt(20), а sqrt(20), так как функция sqrt(), которая возвращает
        // квадратный корень числа, является статической. (Позже мы рассмотрим
        // статические члены класса).

        // То же самое в отношении класса System: в нем определен статический объект
        // out, поэтому мы можем его использовать без указания класса.
    }

}
