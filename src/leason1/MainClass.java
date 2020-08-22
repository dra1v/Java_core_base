package leason1;

public class MainClass {
    public static void main (String[] args) {
        // 2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
//        byte a = 127;
//        short b = 12442;
//        int c = 1000;
//        long d = 200000L;
//        float e = 12.23f;
//        double f = -123.123;
//        char g = '\u2242';
//        boolean h = false;
//        String s = "java";
    }
    // 3. Написать метод вычисляющий выражение a * (b + (c / d))
    // и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    public static int calculate(int a,int b,int c, int d); {
            int f = a * b + (c / d);
            return f;
    }
// 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах
// от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    public static boolean task10and20(int x1, int x2) {
        boolean x3 = x1 + x2;
        if (x3 <= 10 || x3 >= 20) {
            return x3;
            System.out.println("ok");
        }else{
    }
}
//5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
// положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
public static void isPositiveOrNegative(int x) {
    if(x >= 0) {
        System.out.println("Число положительное");
    } else System.out.println("Число отрицательное");
}
//6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true,
// если число отрицательное;
public static boolean isNegative(int x) {
    if(x < 0) {
        return true;
    }
    return false;
}

//7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести
// в консоль сообщение «Привет, указанное_имя!»;
public static void greetings(String name) {
    System.out.println("Привет, " + name + "!");
}
//*Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год
// является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

}
public static void leapYear (int year)
 if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не високосный");
 else System.out.println(year + " г. високосный");
}