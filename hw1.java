// Задание 1. Удаление отрицательных значений из массива
// Реализуйте метод, который принимает на вход целочисленный массив и удаляет все отрицательные числа. Метод должен вернуть массив, содержащий только неотрицательные числа.
// Пример:
// [-1, 2, -3, 4, -5, 6] Результат:
// [2, 4, 6]
// Подсказка No 1
// Для удобства работы с элементами, которые нужно сохранить, используйте ArrayList<Integer>. Это позволит динамически добавлять элементы и избежать сложностей с изменением размера массива.
// Подсказка No 2
// Пройдитесь по каждому элементу массива с помощью цикла for. Если элемент неотрицательный (num >= 0), добавьте его в ArrayList.
// Подсказка No 3
// После того как вы добавили все нужные элементы в ArrayList, преобразуйте его в обычный массив int[]. Это можно сделать, создав новый массив нужного размера и скопировав в него элементы из ArrayList.
// Подсказка No 4
// После преобразования ArrayList в массив, верните полученный массив как результат работы метода.




import java.util.ArrayList;
import java.util.Arrays;
class FilterNegative {
   public static int[] filterNegative(int[] a) {
       ArrayList<Integer> result = new ArrayList<>();
       for (int num : a) {
           if (num >= 0) {
               result.add(num);
} }
       // Преобразуем ArrayList в массив
       int[] resultArray = new int[result.size()];
       for (int i = 0; i < result.size(); i++) {
           resultArray[i] = result.get(i);
       }
       return resultArray;
   }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class hw1 {
   public static void main (String[] args) {
    int[] a;
if (args.length == 0) {
           // При отправке кода на Выполнение, вы можете варьировать эти параметры
           a = new int[]{-1, 2, -3, 4, -5, 6};
       } else {
a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
}
       FilterNegative answer = new FilterNegative();
       String itresume_res =
Arrays.toString(answer.filterNegative(a)); System.out.println(itresume_res);
} }