/*  Дана прямоугольная карта размера MxN (N, M меньше 20)
На карте стоит фигура в точке(Х, Y), которая может ходить на одну клеточку вправо или вниз за один ход.
Посчитать количество маршрутов, которым фигура может попасть в нижнюю правую клетку
    На карте могут быть стены
    M и N могут быть до 1000
Задачу разбить на методы
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите координату точки X: ");
        int x = NumberEntry.numberEntry();
        System.out.println("Введите координату точки Y: ");
        int y = NumberEntry.numberEntry();
        System.out.println("Введите размер карты N: ");
        int n = NumberEntry.numberEntry();
        int result = Solution.countPaths(x, y, n);
        System.out.println("Количество маршрутов равно: ");
        System.out.println(result);
    }
}
