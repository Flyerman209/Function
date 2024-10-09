package org.example;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Функция для нахождения максимума
        System.out.println("Задача 1. Введите два числа для нахождения максимума:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        try {
            System.out.println("Максимум: " + findMax(num1, num2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 2. Калькулятор деления
        System.out.println("Задача 2. Введите два числа для деления:");
        int dividend = input.nextInt();
        int divisor = input.nextInt();
        try {
            System.out.println("Результат деления: " + divide(dividend, divisor));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // 3. Конвертер строк в числа
        System.out.println("Задача 3. Введите строку для конвертации в число:");
        input.nextLine();  // consume newline
        String strNum = input.nextLine();
        try {
            System.out.println("Число: " + stringToInt(strNum));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        // 4. Проверка возраста
        System.out.println("Задача 4. Введите возраст:");
        int age = input.nextInt();
        try {
            checkAge(age);
            System.out.println("Возраст корректен.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // 5. Нахождение корня
        System.out.println("Задача 5. Введите число для нахождения корня:");
        double number = input.nextDouble();
        try {
            System.out.println("Корень: " + findRoot(number));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // 6. Факториал
        System.out.println("Задача 6. Введите число для вычисления факториала:");
        int factNum = input.nextInt();
        try {
            System.out.println("Факториал: " + factorial(factNum));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // 7. Проверка массива на нули
        System.out.println("Задача 7. Проверьте массив на наличие нулей:");
        int[] array = {1, 2, 0, 4, 5};
        try {
            checkArrayForZeros(array);
            System.out.println("Массив не содержит нулей.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 8. Калькулятор возведения в степень
        System.out.println("Задача 8. Введите число и степень для возведения в степень:");
        double base = input.nextDouble();
        int exponent = input.nextInt();
        try {
            System.out.println("Результат: " + power(base, exponent));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // 9. Обрезка строки
        System.out.println("Задача 9. Введите строку и длину для обрезки:");
        input.nextLine();  // consume newline
        String str = input.nextLine();
        int length = input.nextInt();
        try {
            System.out.println("Обрезанная строка: " + trimString(str, length));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 10. Поиск элемента в массиве
        System.out.println("Задача 10. Введите элемент для поиска в массиве:");
        int element = input.nextInt();
        try {
            System.out.println("Элемент найден на позиции: " + findElementInArray(array, element));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 11. Конвертация в двоичную систему
        System.out.println("Задача 11. Введите число для конвертации в двоичную систему:");
        int intNum = input.nextInt();
        try {
            System.out.println("Двоичное представление: " + toBinary(intNum));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // 12. Проверка делимости
        System.out.println("Задача 12. Введите два числа для проверки делимости:");
        int a = input.nextInt();
        int b = input.nextInt();
        try {
            checkDivisibility(a, b);
            System.out.println("Число " + a + " делится на " + b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // 13. Чтение элемента списка
        System.out.println("Задача 13. Введите индекс для чтения элемента списка:");
        List<Integer> list = new ArrayList<>();
        list.add(10); list.add(20); list.add(30);
        int index = input.nextInt();
        try {
            System.out.println("Элемент списка: " + readElementFromList(list, index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        // 14. Парольная проверка
        System.out.println("Задача 14. Введите пароль для проверки:");
        String password = input.next();
        try {
            checkPasswordStrength(password);
            System.out.println("Пароль достаточно сложный.");
        } catch (WeakPasswordException e) {
            System.out.println(e.getMessage());
        }

        // 15. Проверка даты
        System.out.println("Задача 15. Введите дату в формате dd.MM.yyyy:");
        String dateStr = input.next();
        try {
            checkDateFormat(dateStr);
            System.out.println("Дата корректна.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 16. Конкатенация строк
        System.out.println("Задача 16. Введите две строки для конкатенации:");
        String str1 = input.next();
        String str2 = input.next();
        try {
            System.out.println("Результат: " + concatenateStrings(str1, str2));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        // 17. Остаток от деления
        System.out.println("Задача 17. Введите два числа для вычисления остатка:");
        a = input.nextInt();
        b = input.nextInt();
        try {
            System.out.println("Остаток: " + remainder(a, b));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // 18. Квадратный корень
        System.out.println("Задача 18. Введите число для вычисления квадратного корня:");
        number = input.nextDouble();
        try {
            System.out.println("Квадратный корень: " + squareRoot(number));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // 19. Конвертер температуры
        System.out.println("Задача 19. Введите температуру в Цельсиях для конвертации в Фаренгейты:");
        double temp = input.nextDouble();
        try {
            System.out.println("Температура в Фаренгейтах: " + convertToFahrenheit(temp));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // 20. Проверка строки на пустоту
        System.out.println("Задача 20. Введите строку для проверки на пустоту:");
        input.nextLine();  // consume newline
        str = input.nextLine();
        try {
            checkStringForEmpty(str);
            System.out.println("Строка не пуста.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    // Функции

    public static int findMax(int a, int b) throws Exception {
        if (a == b) throw new Exception("Числа равны.");
        return Math.max(a, b);
    }

    public static double divide(int a, int b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("Деление на ноль невозможно.");
        return (double) a / b;
    }

    public static int stringToInt(String str) throws NumberFormatException {
        return Integer.parseInt(str);
    }

    public static void checkAge(int age) throws IllegalArgumentException {
        if (age < 0 || age > 150) throw new IllegalArgumentException("Некорректный возраст.");
    }

    public static double findRoot(double number) throws IllegalArgumentException {
        if (number < 0) throw new IllegalArgumentException("Число не может быть отрицательным.");
        return Math.sqrt(number);
    }

    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0) throw new IllegalArgumentException("Число должно быть неотрицательным.");
        int result = 1;
        for (int i = 1; i <= n; i++) result *= i;
        return result;
    }

    public static void checkArrayForZeros(int[] array) throws Exception {
        for (int num : array) {
            if (num == 0) throw new Exception("Массив содержит нули.");
        }
    }

    public static double power(double base, int exponent) throws IllegalArgumentException {
        if (exponent < 0) throw new IllegalArgumentException("Показатель степени должен быть неотрицательным.");
        return Math.pow(base, exponent);
    }

    public static String trimString(String str, int length) throws Exception {
        if (length > str.length()) throw new Exception("Длина обрезки превышает длину строки.");
        return str.substring(0, length);
    }

    public static int findElementInArray(int[] array, int element) throws Exception {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) return i;
        }
        throw new Exception("Элемент не найден.");
    }

    public static String toBinary(int num) throws IllegalArgumentException {
        return Integer.toBinaryString(num);
    }

    public static void checkDivisibility(int a, int b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("Деление на ноль.");
        if (a % b != 0) throw new ArithmeticException(a + " не делится на " + b + ".");
    }

    public static int readElementFromList(List<Integer> list, int index) throws IndexOutOfBoundsException {
        return list.get(index);
    }

    public static void checkPasswordStrength(String password) throws WeakPasswordException {
        if (password.length() < 8) throw new WeakPasswordException("Пароль слишком короткий.");
        if (!password.matches(".*\\d.*")) throw new WeakPasswordException("Пароль должен содержать хотя бы одну цифру.");
        if (!password.matches(".*[a-zA-Z].*")) throw new WeakPasswordException("Пароль должен содержать хотя бы одну букву.");
    }

    public static void checkDateFormat(String dateStr) throws Exception {
        if (!dateStr.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) throw new Exception("Неверный формат даты.");
    }

    public static String concatenateStrings(String str1, String str2) throws NullPointerException {
        if (str1 == null || str2 == null) throw new NullPointerException("Одна из строк равна null.");
        return str1 + str2;
    }

    public static int remainder(int a, int b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("Деление на ноль.");
        return a % b;
    }

    public static double squareRoot(double number) throws IllegalArgumentException {
        if (number < 0) throw new IllegalArgumentException("Число должно быть неотрицательным.");
        return Math.sqrt(number);
    }

    public static double convertToFahrenheit(double celsius) throws IllegalArgumentException {
        return celsius * 9 / 5 + 32;
    }

    public static void checkStringForEmpty(String str) throws IllegalArgumentException {
        if (str.isEmpty()) throw new IllegalArgumentException("Строка пуста.");
    }
}

// Кастомное исключение для слабых паролей
class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}
