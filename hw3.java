// Задача 3. Длина слов
// Реализуйте метод, который принимает на вход массив строк и возвращает новый массив, содержащий только строки, длина которых больше 3 символов.
// Пример:
// ["cat", "elephant", "dog", "giraffe"]
// Результат:
// ["elephant", "giraffe"]

// Подсказка No 1
// Создайте ArrayList<String>, чтобы хранить строки, которые соответствуют вашему условию (длине больше 3 символов). Это поможет вам динамически добавлять строки без необходимости предварительно определять размер массива.
// Подсказка No 2
// Итерируйте через массив строк с помощью цикла for. Для каждой строки проверьте ее длину с помощью метода length(). Если длина строки больше 3 символов, добавьте ее в ArrayList.
// Подсказка No 3
// После того как вы добавили все строки, длина которых больше 3 символов, в ArrayList, преобразуйте его в массив. Для этого создайте новый массив строк и скопируйте элементы из ArrayList в этот массив.
// Подсказка No 4
// После преобразования ArrayList в массив, верните полученный массив как результат работы метода.

import java.util.ArrayList;
import java.util.Arrays;
class FilterStrings {
   public static String[] filterShortStrings(String[] arr) {
       ArrayList<String> result = new ArrayList<>();
for (String s : arr) {
    if (s.length() > 3) {
        result.add(s);
} }
       // Преобразуем ArrayList в массив
       String[] resultArray = new String[result.size()];
       for (int i = 0; i < result.size(); i++) {
           resultArray[i] = result.get(i);
       }
       return resultArray;
   }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class hw3 {
   public static void main(String[] args) {
       String[] arr;
       if (args.length == 0) {
           // При отправке кода на Выполнение, вы можете варьировать эти параметры
           arr = new String[]{"cat", "elephant", "dog", "giraffe"};
       } else {
           arr = args[0].split(", ");
       }
       FilterStrings answer = new FilterStrings();
       String itresume_res =
Arrays.toString(answer.filterShortStrings(arr)); System.out.println(itresume_res);
} }