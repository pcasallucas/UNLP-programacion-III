package Ejercicio9;

import java.util.Stack;

public class Ejercicio9 {
    public static boolean balanceada(String s){
        Stack<Character> pila= new Stack<>();
        for (int i=0; i<s.length();i++){
            char c = s.charAt(i);

            // 1. Si es apertura, lo guardamos ("anotamos la deuda")
            if ((c=='[') || (c=='{') || (c=='(')){
                pila.push(c);

            // 2. Si es cierre, validamos
            }else if (c == ']' || c == '}' || c == ')') {
                // Si encontramos un cierre y la pila está vacía, no hay apertura previa
                if (pila.isEmpty()) {
                    return false;
                }
                // 3. SACAMOS el último de apertura y comparamos (Paso crítico)
                char tope = pila.pop(); // [2, 3]
                
                if ((c == ']' && tope != '[') || 
                    (c == '}' && tope != '{') || 
                    (c == ')' && tope != '(')) {
                    return false; // Los tipos no coinciden (ej: "( ]")
                }
            

            }
        }
        return pila.isEmpty();
    }
}