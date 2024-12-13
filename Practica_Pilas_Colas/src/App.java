import Ejercicio_01_sign.ValidacionSignos;
import Ejercicio_02_sorting.OrdenarStack;
import java.util.Stack;

public class App {

    public static void main(String[] args) throws Exception {
        runSignValidator();
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Stack original: " + stack);
        OrdenarStack.ordenar(stack);
        System.out.println("Stack ordenado: " + stack);
    }

    public static void runSignValidator() {
        String input1 = "([]){}";
        String input2 = "({})";
        String input3 = "[{()}]";

        System.out.println("Input: " + input1 + " -> " + ValidacionSignos.esValido(input1));
        System.out.println("Input: " + input2 + " -> " + ValidacionSignos.esValido(input2));
        System.out.println("Input: " + input3 + " -> " + ValidacionSignos.esValido(input3));
    }
}
