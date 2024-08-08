package com.telran.org.lessontwelve;

class CalculatorTest {

    //@ - все что начинается с этого символа - это аннотации
    @Test
    public void sumTest() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.sum(1, 1));
    }

    @Test
    public void subTest() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.sub(5, 2));
    }
}