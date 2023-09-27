package HW;

import java.util.ArrayList;

public class Controller {
    static int sizeNumLists = 6;
    static int bound = 1000;

    public static void main(String[] args) {
        ArrayList<Integer> list1 = AverageListGen.AverageListGen(sizeNumLists, bound);
        ArrayList<Integer> list2 = AverageListGen.AverageListGen(sizeNumLists, bound);
        System.out.println("Сгенерированы два списка случайных чисел от 0 до " + bound +" по " +sizeNumLists+ " чисел в каждом:");
        System.out.println(list1);
        System.out.println(list2);
        System.out.println("Среднее значение первого списка: " + MathAverage.MathAverage(list1));
        System.out.println("Среднее значение второго списка: " + MathAverage.MathAverage(list2));
        switch (AverageComparator.AverageComparator(list1, list2)) {
            case(1):{ System.out.println("Среднее значение первого списка больше второго."); break; }
            case(2):{ System.out.println("Среднее значение второго списка больше первого."); break; }
            case(3):{ System.out.println("Средние значения списков равны."); break; }
            default:{ System.out.println("Произошла непредвиденная ошибка."); break; }
        }
    }
}
