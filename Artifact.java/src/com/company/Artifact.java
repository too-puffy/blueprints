package com.company;

public class Artifact {
    String cult;
    int cent;

    public Artifact () {
    }

    public Artifact (String cult) {
        this.cult = cult;
    }

    public Artifact (String cult, int cent) {
        this.cult = cult;
        this.cent = cent;
    }

    static int count = 0;

    public static void main(String[] args) {

        Artifact A = new Artifact();
        count++;
        System.out.println("Artifact number " + count + " is unidentified.");

        Artifact B = new Artifact("Aztec");
        count++;
        System.out.println("Artifact number " + count + " is " + B.cult + ".");

        Artifact C = new Artifact("Russian", 13);
        count++;
        System.out.println("Artifact number " + count + " is " + C.cult + " from the " + C.cent + "th century.");

    }
}
