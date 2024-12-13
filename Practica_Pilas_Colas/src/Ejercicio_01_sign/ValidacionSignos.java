package Ejercicio_01_sign;

import java.util.Stack;

public class ValidacionSignos {
    public static boolean esValido(String s) {
        Stack<Character> pila = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
            } else if (c == ')' && !pila.isEmpty() && pila.peek() == '(') {
                pila.pop();
            } else if (c == '}' && !pila.isEmpty() && pila.peek() == '{') {
                pila.pop();
            } else if (c == ']' && !pila.isEmpty() && pila.peek() == '[') {
                pila.pop();
            } else {
                return false;
            }
        }

        return pila.isEmpty();
    }
}
