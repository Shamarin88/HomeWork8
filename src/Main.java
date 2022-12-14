public class Main {
    public static void main(String[] args) {

        // Задание 1
        // Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        System.out.println("Задание 1");
        System.out.println("Задание без вывода в консоль");

        int[] weights = new int[]{1, 2, 3};

        // Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.

        double[] newWeights = {1.57, 7.654, 9.968};

        // Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания
        // массива: с помощью ключевого слова или сразу заполненный элементами.

        int[] dates = {10, 11, 12};

        // Задание 2
        // Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов,
        // начиная с первого элемента, через запятую. Запятая между последним элементом одного массива и первым
        // элементом следующего не нужна.
        System.out.println("Задание 2");

        System.out.println("Элементы массива " + weights[0] + ", " + weights[1] + ", " + weights[2]);
        System.out.println("Элементы массива " + newWeights[0] + ", " + newWeights[1] + ", " + newWeights[2]);
        System.out.println("Элементы массива " + dates[0] + ", " + dates[1] + ", " + dates[2]);

        // Задание 3
        // Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента
        // массива, а с последнего. Элементы должны быть распечатаны через запятую, при этом элементы одного массива
        // располагаются на одной строчке, а элементы другого массива – на другой.
        // Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        System.out.println("Задание 3");

        System.out.println("Элементы массива " + weights[2] + ", " + weights[1] + ", " + weights[0]);
        System.out.println("Элементы массива " + newWeights[2] + ", " + newWeights[1] + ", " + newWeights[0]);
        System.out.println("Элементы массива " + dates[2] + ", " + dates[1] + ", " + dates[0]);

        // Задача 4
        // Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными
        // (нужно прибавить 1).
        // Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам
        // нужно использовать циклы.
        // Распечатайте результат преобразования в консоль.
        System.out.println("Задание 4");

        int[] weights1 = new int[] {1 + 1, 2, 3 + 1};
        for (int i = 0; i < 3; i++) {
            System.out.println(weights1[i]);
        }
    }
}


