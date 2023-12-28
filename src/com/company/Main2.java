package com.company;

public class Main2 {
    public static void main(String[] args) {
        // mocha -10000 *.js.test
        // write your code here
        System.out.println("Hello from Main2!");
        // const args = ['hello', 'danny']
        // args.forEach(st => { console.log( st ) } )
        for (String st: args) {
            System.out.println(st);
        }
        if (args[0].equals("timeout")) {
            if (args.length > 1) {
                if (args[1].charAt(0) == '-') {

                }
            }
        }
    }
}
