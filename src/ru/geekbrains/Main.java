package ru.geekbrains;

public class Main {

    public static void main(String[] args) {

        System.out.println("Part 1.");
        String inputString = "Это простая тестовая строка над которой мы будем издеваться";
        System.out.println(inputString);
        StackHelper stack = new StackHelper(inputString.length());
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }
        System.out.println(">> Извлекаем строку из стека");
        String outputString = "";
        while (!stack.isEmpty()) {
            outputString += stack.pop();
        }
        System.out.println(outputString);
        //stack;
        System.out.println("\nPart 2.");
        int[] a0 = {-1, 4, 0, 2, 9, 3};
        Deque deque = new Deque(a0.length);


    }
}
