package BasicsOfProgramming.N12Arrays;

public class Arrays {
    public static void main(String[] args) {
        // Массив представляет набор однотипных значений. Объявление массива похоже на
        // объявление обычной переменной, которая хранит одиночное значение, причем есть
        // два способа объявления массива:

        // тип_данных название_массива[];
        // либо
        // тип_данных[] название_массива;

        // Например, определим массив чисел:
        int nums[];
        int[] nums2;
        // После объявления массива мы можем инициализовать его:

        int nums[];
        nums = new int[4]; // массив из 4 чисел

        // Создание массива производится с помощью следующей конструкции: new
        // тип_данных[количество_элементов], где new - ключевое слово, выделяющее память
        // для указанного в скобках количества элементов. Например, nums = new int[4]; -
        // в этом выражении создается массив из четырех элементов int, и каждый элемент
        // будет иметь значение по умолчанию - число 0.

        // Также можно сразу при объявлении массива инициализировать его:

        int nums[] = new int[4]; // массив из 4 чисел
        int[] nums2 = new int[5]; // массив из 5 чисел

        // При подобной инициализации все элементы массива имеют значение по умолчанию.
        // Для числовых типов (в том числе для типа char) это число 0, для типа boolean
        // это значение false, а для остальных объектов это значение null. Например, для
        // типа int значением по умолчанию является число 0, поэтому выше определенный
        // массив nums будет состоять из четырех нулей.

        // Однако также можно задать конкретные значения для элементов массива при его
        // создании:

        // эти два способа равноценны
        int[] nums = new int[] { 1, 2, 3, 5 };

        int[] nums2 = { 1, 2, 3, 5 };

        // Стоит отметить, что в этом случае в квадратных скобках не указывается размер
        // массива, так как он вычисляется по количеству элементов в фигурных скобках.

        // После создания массива мы можем обратиться к любому его элементу по индексу,
        // который передается в квадратных скобках после названия переменной массива:

        int[] nums = new int[4];
        // устанавливаем значения элементов массива
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 4;
        nums[3] = 100;

        // получаем значение третьего элемента массива
        System.out.println(nums[2]); // 4

        // Индексация элементов массива начинается с 0, поэтому в данном случае, чтобы
        // обратиться к четвертому элементу в массиве, нам надо использовать выражение
        // nums[3].

        // И так как у нас массив определен только для 4 элементов, то мы не можем
        // обратиться, например, к шестому элементу: nums[5] = 5;. Если мы так
        // попытаемся сделать, то мы получим ошибку.

        // Длина массива
        // Важнейшее свойство, которым обладают массивы, является свойство length,
        // возвращающее длину массива, то есть количество его элементов:

        int[] nums = { 1, 2, 3, 4, 5 };
        int length = nums.length; // 5

        // Нередко бывает неизвестным последний индекс, и чтобы получить последний
        // элемент массива, мы можем использовать это свойство:

        int last = nums[nums.length - 1];

        // Многомерные массивы
        // Ранее мы рассматривали одномерные массивы, которые можно представить как
        // цепочку или строку однотипных значений. Но кроме одномерных массивов также
        // бывают и многомерными. Наиболее известный многомерный массив - таблица,
        // представляющая двухмерный массив:

        int[] nums1 = new int[] { 0, 1, 2, 3, 4, 5 };

        int[][] nums2 = { { 0, 1, 2 }, { 3, 4, 5 } };

        // Визуально оба массива можно представить следующим образом:

        // Поскольку массив nums2 двухмерный, он представляет собой простую таблицу. Его
        // также можно было создать следующим образом: int[][] nums2 = new int[2][3];.
        // Количество квадратных скобок указывает на размерность массива. А числа в
        // скобках - на количество строк и столбцов. И также, используя индексы, мы
        // можем использовать элементы массива в программе:

        // установим элемент первого столбца второй строки
        nums2[1][0] = 44;
        System.out.println(nums2[1][0]);

        // Объявление трехмерного массива могло бы выглядеть так:
        int[][][] nums3 = new int[2][3][4];

        // Зубчатый массив
        // Многомерные массивы могут быть также представлены как "зубчатые массивы". В
        // вышеприведенном примере двухмерный массив имел 2 строчки и три столбца,
        // поэтому у нас получалась ровная таблица. Но мы можем каждому элементу в
        // двухмерном массиве присвоить отдельный массив с различным количеством
        // элементов:
        int[][] nums = new int[3][];
        nums[0] = new int[2];
        nums[1] = new int[3];
        nums[2] = new int[5];

        // foreach
        // Специальная версия цикла for предназначена для перебора элементов в наборах
        // элементов, например, в массивах и коллекциях. Она аналогична действию цикла
        // foreach , который имеется в других языках программирования. Формальное ее
        // объявление:

        for (тип_данных название_переменной : контейнер) {
            // действия
        }

        // Например:
        int[] array = new int[] { 1, 2, 3, 4, 5 };
        for (int i : array) {

            System.out.println(i);
        }

        // В качестве контейнера в данном случае выступает массив данных типа int. Затем
        // объявляется переменная с типом int

        // То же самое можно было бы сделать и с помощью обычной версии for:

        int[] array = new int[] { 1, 2, 3, 4, 5 };
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // В то же время эта версия цикла for более гибкая по сравнению for (int i :
        // array). В частности, в этой версии мы можем изменять элементы:

        int[] array = new int[] { 1, 2, 3, 4, 5 };
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
            System.out.println(array[i]);
        }

        // Перебор многомерных массивов в цикле

        int[][] nums = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {

                System.out.printf("%d ", nums[i][j]);
            }
            System.out.println();
        }

        // Сначала создается цикл для перебора по строкам, а затем внутри первого цикла
        // создается внутренний цикл для перебора по столбцам конкретной строки.
        // Подобным образом можно перебрать и трехмерные массивы и наборы с большим
        // количеством размерностей.
    }

}