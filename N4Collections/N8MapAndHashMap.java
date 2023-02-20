package N4Collections;

public class N8MapAndHashMap {
    public static void main(String[] args) {
        // Интерфейс Map и класс HashMap

        // Интерфейс Map<K, V> представляет отображение или иначе говоря словарь, где
        // каждый элемент представляет пару "ключ-значение". При этом все ключи
        // уникальные в рамках объекта Map. Такие коллекции облегчают поиск элемента,
        // если нам известен ключ - уникальный идентификатор объекта.

        // Следует отметить, что в отличие от других интерфейсов, которые представляют
        // коллекции, интерфейс Map НЕ расширяет интерфейс Collection.

        // Среди методов интерфейса Map можно выделить следующие:

        // void clear(): очищает коллекцию

        // boolean containsKey(Object k): возвращает true, если коллекция содержит ключ
        // k

        // boolean containsValue(Object v): возвращает true, если коллекция содержит
        // значение v

        // Set<Map.Entry<K, V>> entrySet(): возвращает набор элементов коллекции. Все
        // элементы представляют объект Map.Entry

        // boolean equals(Object obj): возвращает true, если коллекция идентична
        // коллекции, передаваемой через параметр obj

        // boolean isEmpty: возвращает true, если коллекция пуста

        // V get(Object k): возвращает значение объекта, ключ которого равен k. Если
        // такого элемента не окажется, то возвращается значение null

        // V getOrDefault(Object k, V defaultValue): возвращает значение объекта, ключ
        // которого равен k. Если такого элемента не окажется, то возвращается значение
        // defaultVlue

        // V put(K k, V v): помещает в коллекцию новый объект с ключом k и значением v.
        // Если в коллекции уже есть объект с подобным ключом, то он перезаписывается.
        // После добавления возвращает предыдущее значение для ключа k, если он уже был
        // в коллекции. Если же ключа еще не было в коллекции, то возвращается значение
        // null

        // V putIfAbsent(K k, V v): помещает в коллекцию новый объект с ключом k и
        // значением v, если в коллекции еще нет элемента с подобным ключом.

        // Set<K> keySet(): возвращает набор всех ключей отображения

        // Collection<V> values(): возвращает набор всех значений отображения

        // void putAll(Map<? extends K, ? extends V> map): добавляет в коллекцию все
        // объекты из отображения map

        // V remove(Object k): удаляет объект с ключом k

        // int size(): возвращает количество элементов коллекции

        // Чтобы положить объект в коллекцию, используется метод put, а чтобы получить
        // по ключу - метод get. Реализация интерфейса Map также позволяет получить
        // наборы как ключей, так и значений. А метод entrySet() возвращает набор всех
        // элементов в виде объектов Map.Entry<K, V>.

        // Обобщенный интерфейс Map.Entry<K, V> представляет объект с ключом типа K и
        // значением типа V и определяет следующие методы:

        // boolean equals(Object obj): возвращает true, если объект obj, представляющий
        // интерфейс Map.Entry, идентичен текущему

        // K getKey(): возвращает ключ объекта отображения

        // V getValue(): возвращает значение объекта отображения

        // V setValue(V v): устанавливает для текущего объекта значение v

        // int hashCode(): возвращает хеш-код данного объекта

        // При переборе объектов отображения мы будем оперировать этими методами для
        // работы с ключами и значениями объектов.

        // Классы отображений. HashMap
        // Базовым классом для всех отображений является абстрактный класс AbstractMap,
        // который реализует большую часть методов интерфейса Map. Наиболее
        // распространенным классом отображений является HashMap, который реализует
        // интерфейс Map и наследуется от класса AbstractMap.

        // Пример использования класса:

        // import java.util.*;

        public class Program {

            public static void main(String[] args) {

                Map<Integer, String> states = new HashMap<Integer, String>();
                states.put(1, "Germany");
                states.put(2, "Spain");
                states.put(4, "France");
                states.put(3, "Italy");

                // получим объект по ключу 2
                String first = states.get(2);
                System.out.println(first);
                // получим весь набор ключей
                Set<Integer> keys = states.keySet();
                // получить набор всех значений
                Collection<String> values = states.values();
                // заменить элемент
                states.replace(1, "Poland");
                // удаление элемента по ключу 2
                states.remove(2);
                // перебор элементов
                for (Map.Entry<Integer, String> item : states.entrySet()) {

                    System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
                }

                Map<String, Person> people = new HashMap<String, Person>();
                people.put("1240i54", new Person("Tom"));
                people.put("1564i55", new Person("Bill"));
                people.put("4540i56", new Person("Nick"));

                for (Map.Entry<String, Person> item : people.entrySet()) {

                    System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
                }
            }
        }
        class Person {

            private String name;

            public Person(String value) {

                name = value;
            }

            String getName() {
                return name;
            }
        }
        // Чтобы добавить или заменить элемент, используется метод put, либо replace, а
        // чтобы получить его значение по ключу - метод get. С помощью других методов
        // интерфейса Map также производятся другие манипуляции над элементами: перебор,
        // получение ключей, значений, удаление.
    }
}
