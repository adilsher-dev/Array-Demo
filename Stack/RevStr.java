package Stack;

import java.util.Scanner;

// class Stack {
//     char[] arr;
//     int top;
//     int SIZE = 100;

//     // Constructor
//     Stack() {
//         arr = new char[SIZE];
//         top = -1;
//     }

//     void push(char ch) {
//         if (top == SIZE - 1) {
//             System.out.println("Stack Overflow");
//             return;
//         }
//         arr[++top] = ch;
//     }

//     char pop() {
//         if (top == -1) {
//             System.out.println("Stack Underflow");
//             return '\0';
//         }
//         return arr[top--];
//     }

//     boolean isEmpty() {
//         return top == -1;
//     }
// }

public class RevStr  {
    public static void main(String[] args) {

      //  Stack s = new Stack();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Push characters into stack
        for (int i = 0; i < str.length(); i++) {
            //s.push(str.charAt(i));
        }

        // Pop characters to reverse string
        String reversed = "";
       // while (!s.isEmpty()) {
         //   reversed += s.pop();
        }

      //  System.out.println("Reversed string: " + reversed);

       // sc.close();
    }