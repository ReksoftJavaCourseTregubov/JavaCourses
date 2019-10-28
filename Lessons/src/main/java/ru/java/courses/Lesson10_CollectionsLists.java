package ru.java.courses;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson10_CollectionsLists {

    /**
     * В этом методе необходимо реализовать:
     * 1. На вход получаем список чисел
     * 2. Удаляем все дубли
     * 3. Сортируем список по возрастанию
     * 4. Преобразуем числа в строки
     * <p>
     * Подсказки:
     * Collections.sort() - сортировка
     * Удалять элементы из итерируемого списка нельзя - выпадет исключение
     */
    public static List<String> task1(List<Integer> source) {
        return source.stream()
                .distinct()
                .sorted()
                .map(Object::toString)
                .collect(Collectors.toList());
    }

    /**
     * В этом методе необходимо реализовать следующий алгоритм:
     * 1. Получаем на входе массив чисел
     * 2. Преобразовываем его к списку
     * 4. Все четные числа увеличиваем на единицу
     * 5. Возвращаем кусок списка с 3-го по 7-й элемент
     * <p>
     * Подсказка: на входе может быть любое количество чисел
     */
    public static List<Integer> task2(Integer... array) {
        return Arrays.stream(array)
                .map(s -> s % 2 == 0 ? ++s : s)
                .collect(Collectors.toList())
                .subList(3, Math.min(8, array.length));
    }
}
