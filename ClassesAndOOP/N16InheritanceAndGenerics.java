package ClassesAndOOP;
public class N16InheritanceAndGenerics {
    public static void main(String[] args) {
        // Наследование и обобщения

        // Обобщенные классы могут участвовать в иерархии наследования: могут
        // наследоваться от других, либо выполнять роль базовых классов. Рассмотрим
        // различные ситуации.

        // Базовый обобщенный класс
        // При наследовании от обобщенного класса класс-наследник должен передавать
        // данные о типе в конструкции базового класса:

        class Account<T> {
            private T _id;

            T getId() {
                return _id;
            }

            Account(T id) {
                _id = id;
            }
        }

        class DepositAccount<T> extends Account<T> {

            DepositAccount(T id) {
                super(id);
            }
        }
        // В конструкторе DepositAccount идет обращение к конструктору базового класса,
        // в который передаются данные о типе.

        // Варианты использования классов:

        DepositAccount dAccount1 = new DepositAccount(20);
        System.out.println(dAccount1.getId());

        DepositAccount dAccount2 = new DepositAccount("12345");
        System.out.println(dAccount2.getId());

        // При этом класс-наследник может добавлять и использовать какие-то свои
        // параметры типов:

        class Account<T> {
            private T _id;

            T getId() {
                return _id;
            }

            Account(T id) {
                _id = id;
            }
        }

        class DepositAccount<T, S> extends Account<T> {

            private S _name;

            S getName() {
                return _name;
            }

            DepositAccount(T id, S name) {
                super(id);
                this._name = name;
            }
        }
        // Варианты использования:

        DepositAccount<Integer, String> dAccount1 = new DepositAccount(20, "Tom");
        System.out.println(dAccount1.getId() + " : " + dAccount1.getName());

        DepositAccount<String, Integer> dAccount2 = new DepositAccount("12345", 23456);
        System.out.println(dAccount2.getId() + " : " + dAccount2.getName());

        // И еще одна ситуация - класс-наследник вообще может не быть обобщенным:

        class Account<T> {
            private T _id;

            T getId() {
                return _id;
            }

            Account(T id) {
                _id = id;
            }
        }

        class DepositAccount extends Account<Integer> {

            DepositAccount() {
                super(5);
            }
        }
        // Здесь при наследовании явным образом указывается тип, который будет
        // использоваться конструкциями базового класса, то есть тип Integer. Затем в
        // конструктор базового класса передается значение именно этого типа - в данном
        // случае число 5.

        // Вариант использования:

        DepositAccount dAccount1 = new DepositAccount();
        System.out.println(dAccount1.getId());

        // Обобщенный класс-наследник
        // Также может быть ситуация, когда базовый класс является обычным необобщенным
        // классом. Например:

        class Account {
            private String _name;

            String getName() {
                return _name;
            }

            Account(String name) {
                _name = name;
            }
        }

        class DepositAccount<T> extends Account {

            private T _id;

            T getId() {
                return _id;
            }

            DepositAccount(String name, T id) {
                super(name);
                _id = id;
            }
        }
        // В этом случае использование конструкций базового класса в наследнике
        // происходит как обычно.

        // Преобразование обобщенных типов
        // Объект одного обобщенного типа можно привести к другому типу, если они
        // используют один и тот же тип. Рассмотрим преобразование типов на примере
        // следующих двух обобщенных классов:

        class Account<T> {
            private T _id;

            T getId() {
                return _id;
            }

            Account(T id) {
                _id = id;
            }
        }

        class DepositAccount<T> extends Account<T> {

            DepositAccount(T id) {
                super(id);
            }
        }
        // Мы можем при/вести объект DepositAccount<Integer> к Account<Integer> или
        // DepositAccount<String> к Account<String>:

        DepositAccount<Integer> depAccount = new DepositAccount(10);
        Account<Integer> account = (Account<Integer>) depAccount;
        System.out.println(account.getId());

        // Но сделать то же самое с разнотипными объектами мы не можем. Например,
        // следующий код не будет работать:

        DepositAccount<Integer> depAccount = new DepositAccount(10);
        Account<String> account = (Account<String>) depAccount;
    }
}