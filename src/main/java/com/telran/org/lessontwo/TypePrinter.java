package com.telran.org.lessontwo;

public class TypePrinter {

    public static void main(String[] args) {
        //boolean - true , false
        boolean isLessonFinished = false;
        boolean isBoringLesson = true;
        System.out.println("Our lesson is finished ? " + isLessonFinished);
        System.out.println("Our lesson is boring ? " + isBoringLesson);

        //(1,0) - bit - byte(8bit) - Kb (1024 byte) - Mb(1024Kb) -> Gb(1024Mb) - Tb(1024Gb)

        // byte (-128 to 127) (size 1 byte(8bit))
        byte byteExample = 100;
        System.out.println("Byte is " + byteExample);

        // short (-32768 to 32767) (size 2 byte(16 bit))
        short shortExample = 32000;
        System.out.println("Short is " + shortExample);

        //int (-2147483648 to 2147483627) (size 4 byte(32 bit))
        int intExample = 33333333;
        System.out.println("Int example" + intExample);

        //long(-9223372036854775808 to 9223372036854775807)
        long longExample = 3333333355555555l;

//float (to 7)
        double doubleExample = 123.5;
    }
}
