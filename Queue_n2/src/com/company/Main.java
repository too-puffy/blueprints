package com.company;

class Stack {
    private char stck[];
    private int tos;

    Stack(int size) {
        stck = new char[size + 1];
        tos = 0;
    }

    Stack(Stack ob) {
        tos = ob.tos;
        stck = new char[ob.stck.length];

        for(int i = 0; i < tos; i++)
            stck[i] = ob.stck[i];
    }

    Stack(char a[]) {
        tos = 0;
        stck = new char[a.length + 1];

        for(int i = 0; i < a.length; i++)
            push(a[i]);
    }

    void push(char ch) {
        if (tos == stck.length - 1) {
            System.out.println("The Stack if full.");
            return;
        }

        stck[tos] = ch;
        tos++;
    }

    char pop() {
        if (tos == 0) {
            System.out.println("The Stack is empty.");
            return (char) 0;
        }

        tos--;
        return stck[tos];
    }
}

class Main {
    public static void main(String[] args) {
        Stack q1 = new Stack(10);

        char name[] = {'B', 'a', 'L', 'd', 'A'};

        Stack q2 = new Stack(name);

        char ch;
        int i;

        for (i = 0; i < 10; i++)
            q1.push((char) ('A' + i));

        Stack q3 = new Stack(q1);

        System.out.print("q1 contents: ");
        for (i = 0; i < 10; i++) {
            ch = q1.pop();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.println("q2 contents: ");
        for (i = 0; i < 5; i++) {
            ch = q2.pop();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("q3 contents: ");
        for (i = 0; i < 10; i++) {
            ch = q3.pop();
            System.out.print(ch);
        }
    }
}