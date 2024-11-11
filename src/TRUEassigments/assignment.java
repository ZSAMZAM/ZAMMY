package TRUEassigments;

import java.util.Stack;
//this is a unique stack
public class assignment {
        public static void main(String[] args) {
            Stack<String> Stack1 = new Stack<>();
            Stack<String> Stack2 = new Stack<>();
            //-----stack1
            Stack1.push("leo");
            Stack1.push("george");
            Stack1.push("raul");
            Stack1.push("aziiza");
            Stack1.push("anne");
            Stack1.push("leo");
            Stack1.push("maron");
            Stack1.push("Aziz");
            //----------stack2
            Stack2.push("mesii");
            Stack2.push("kevin");
            Stack2.push("jiminez");
            Stack2.push("Apdalle");
            Stack2.push("marie");
            Stack2.push("Updi Aziz");
            Stack2.push("dalpio");
            Stack2.push("ibnu aziiz ");
            //stack3
            Stack<String> Stack3 = new Stack<>();
            while (!Stack1.isEmpty() | ! Stack2.isEmpty()){
                if (! Stack1.isEmpty()) {
                    String N1 = Stack1.pop();
                    if (!Stack3.contains(N1)) {
                        Stack3.push(N1);
                    }
                }

                //---------
                if (!Stack2.isEmpty()) {
                    String  N2 = Stack2.pop();
                    if (!Stack3.contains(N2)){
                        Stack3.push(N2);
                    }
                }
            }
            System.out.println("Names stack3:");
            while (!Stack3.isEmpty()){
                System.out.println(Stack3.pop() );
            }



        }
    }
