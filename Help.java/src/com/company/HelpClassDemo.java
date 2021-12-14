package com.company;

class  Help {
    void helpon(int what) {
        switch (what) {
            case '1':
                System.out.println("Инcтpyкция if: \n if ( ycлoвиe ) инструкция; \n else инструкция;\n");
                break;
            case '2':
                System.out.println("Инcтpyкция switch: \n switch (выpaжeниe) \n { case константа:");
                System.out.println("последователь ность инструкций \n break; \n // ... )\n");
                break;
            case '3':
                System.out.println("Цикл for : \n ");
                System.out.println("for (инициaлизaция; условие; итерация)\n");
                System.out.println("инструкция;");
                break;
            case '4':
                System.out.println("Цикл while : \n ");
                System.out.println("while (ycлoвиe) инструкция;\n");
                break;
            case '5':
                System.out.println(" Цикл do-while:\n ");
                System.out.println(" do {");
                System.out.println(" инструкция;");
                System.out.println("} while(условие); \n");
                break;
            case '6':
                System.out.println("Инструкция break: \n");
                System.out.println("break; или break метка;\n");
                break;
            case '7':
                System.out.println("Инcтpyкция continue : \n ");
                System.out.println("continue; или continue метка;\n");
                break;
        }
        System.out.println();
    }

    void showmenu() {
        System.out.print("Info:\n1. if\n2. switch\n3. for\n4. while\n");
        System.out.print("5. do-while\n6. break\n7. continue\nq. EXIT\nChoose one:");
    }

    boolean isvalid(int ch) {
        if (ch < '1' | ch > '7' & ch != 'q') return false;
        else return true;
    }
}


    class HelpClassDemo {
        public static void main(String args[])
                throws java.io.IOException {
            char choice, ignore;
            Help hlpobj = new Help();

            for (; ; ) {
                do {
                    hlpobj.showmenu();

                    choice = (char) System.in.read();

                    do {
                        ignore = (char) System.in.read();
                    } while (ignore != '\n');
                    }while (!hlpobj.isvalid(choice)) ;
                    if (choice == 'q') break;

                    System.out.println("\n");

                    hlpobj.helpon(choice);

                }
            }
        }
