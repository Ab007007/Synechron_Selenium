package com.synechron.selenium.basics;

public class Test
{

    public int add(int... numbers)
    {
       // System.out.println(numbers.length);
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

public void printInfo(int age, String... name)
{

}
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.add(1,2,3,4,5));
        System.out.println(test.add(1,2));
        System.out.println(test.add(1,2,3,4));
    }
}
