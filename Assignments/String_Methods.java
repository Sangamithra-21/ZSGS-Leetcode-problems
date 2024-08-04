package Assignments;

import java.util.Arrays;

public class String_Methods{
    public static void main(String[] args) {
        System.out.println("String Methods");
        String s="Time and tide wait for None ";
        System.out.println("Character At           : "+s.charAt(1));
        System.out.println("Length                 : "+s.length());
        System.out.println("Lower Case             : "+s.toLowerCase());
        System.out.println("Upper Case             : "+s.toUpperCase());
        System.out.println("Conacatenation         : "+s.concat(" Hello"));
        System.out.println("Trim                   : "+s.trim());
        System.out.println("Split                  : "+ Arrays.toString(s.split(" ")));
        System.out.println("Index of               : "+s.indexOf('t'));
        System.out.println("Last Index of          : "+s.lastIndexOf('t'));
        System.out.println("Check Empty            : "+s.isEmpty());
        char[] arr=s.toCharArray();
        System.out.println("String to Char Array   : "+Arrays.toString(arr));
        System.out.println("Compare                : "+s.equals("Time"));
        System.out.println("Replace                : "+s.replace('t','x'));

    }
}

/*
Output :
String Methods
Character At           : i
Length                 : 28
Lower Case             : time and tide wait for none
Upper Case             : TIME AND TIDE WAIT FOR NONE
Conacatenation         : Time and tide wait for None  Hello
Trim                   : Time and tide wait for None
Split                  : [Time, and, tide, wait, for, None]
Index of               : 9
Last Index of          : 17
Check Empty            : false
String to Char Array   : [T, i, m, e,  , a, n, d,  , t, i, d, e,  , w, a, i, t,  , f, o, r,  , N, o, n, e,  ]
Compare                : false
Replace                : Time and xide waix for None
 */