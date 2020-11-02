package ru.Example;

import sun.font.TrueTypeFont;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println(sumByteShort((byte)3,(short)5));
        System.out.println(mulIntLong(3,5));
        System.out.println(getMaxNumber(55,99));
        System.out.println(isChar('А'));
        System.out.println(isCharNumber('А'));
        BinaryFromIntegers();
        BinariFromMaxValue();
        System.out.println("Числовое значение символа:" + CharToInt('A'));
        System.out.println("Символ из числа:" + IntToChar (65));
    }


    // 4. Написать публичный метод принимающий 2 параметра: первый типа byte и второй типа short. Метод должен возвращать сумму значений параметров. Тип возвращаемого значения должен быть byte.
    public static byte sumByteShort(byte inputShort, short inputByte) {
        int outp = inputByte + inputShort;
        return (byte) outp;
    }

    // 5. Написать публичный метод принимающий 2 параметра: первый типа int и второй типа long. Метод должен возвращать произведение значений параметров. Тип возвращаемого значения int.
    public static int mulIntLong(int inputInt, long inputLong) {
        long outp = inputInt * inputLong;
        return (int) outp;
    }

    // 6. Написать метод getMaxNumber принимающий 2 параметра: int и int. Метод должен сравнить переданные параметры между собой и вернуть максимальный. Для решения необходимо использовать IF или тернарный оператор ?:
    public static int getMaxNumber(int val1, int val2){
        return val1 > val2 ? val1 : val2;
           }


    // 7. Написать метод isCharA принимающий 1 параметр типа char. Если передана буква 'А', то возвращать true, а в остальных случаях false
    public static boolean isChar(char input){
        if (input == 'А') return true;
        else return false;
    }

    // 8. Написать метод isCharNumber принимающий 1 параметр типа char. Если передано число, то вернуть true, а в остальных случаях false
    public static boolean isCharNumber (char input){
        return Character.isDigit(input);
    }

    // 9. Написать метод выводящий на экран в цикле бинарное представление чисел от 0 до 30. Для вывода бинарного представления использовать Integer.toBinaryString(). Без входных параметров и не возвращающая ничего.
    public static void BinaryFromIntegers(){
        for (int i = 0; i < 30; i++) {
            System.out.println("Binary is " + Integer.toBinaryString(i));
        }
    }

    // 10. Написать метод выводящий бинарное представление Integer.MAX_VALUE и Integer.MAX_VALUE + 1. Для вывода бинарного представления использовать Integer.toBinaryString().
    // Без входных параметров и не возвращающая ничего. Покажет, что переполнение не вызывает ошибку и как это выглядет в памяти
    public static void BinariFromMaxValue(){
        System.out.println("MAX_VALUE   => " + Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println("MAX_VALUE+1 => " + Integer.toBinaryString(Integer.MAX_VALUE + 1));
    }

    // 11. Написать метод принимающий 1 параметр типа char и возвращающий его числовое представление.
    public static int CharToInt (char inputChar){
        return inputChar;
    }

    // 12. Написать метод принимающий 1 параметр типа int и возвращающий его представление в виде печатного символа
    public static char IntToChar (int inputInt){
        return (char)inputInt;
    }

}
