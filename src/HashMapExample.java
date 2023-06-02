import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Создание экземпляра HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Добавление элементов в HashMap
        hashMap.put("яблоко", 5);
        hashMap.put("банан", 10);
        hashMap.put("апельсин", 7);
        hashMap.put("груша", 3);

        // Вывод содержимого HashMap
        System.out.println("Содержимое HashMap: " + hashMap);

        // Получение значения по ключу
        int quantity = hashMap.get("яблоко");
        System.out.println("Количество яблок: " + quantity);

        // Проверка наличия ключа в HashMap
        boolean containsKey = hashMap.containsKey("груша");
        System.out.println("Наличие груши: " + containsKey);

        // Удаление элемента из HashMap
        hashMap.remove("банан");

        // Проверка размера HashMap
        int size = hashMap.size();
        System.out.println("Размер HashMap: " + size);

        // Итерация по HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }
}