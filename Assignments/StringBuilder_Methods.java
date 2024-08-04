package Assignments;

public class StringBuilder_Methods {
    public static void main(String[] args) {

        StringBuilder s=new StringBuilder("Time and Tide wait for None and for everyone");
        System.out.println("Index of              : "+s.indexOf("wait"));
        System.out.println("Last Index            : "+s.lastIndexOf("for"));
        System.out.println("Empty                 : "+s.isEmpty());
        System.out.println("Append                : "+s.append(" is a proverb"));
        System.out.println("Equals                : "+s.equals("Time and Tide"));
        System.out.println("Delete                : "+s.delete(40,45));
        System.out.println("Reversed String       : "+s.reverse());
        System.out.println("Subsequence           : "+s.subSequence(4,15));
        System.out.println("Substring             : "+s.substring(4,15));
        System.out.println("Length                : "+s.length());
        System.out.println("To String             : "+s.toString());



    }
}

/*
Output :
Index of              : 14
Last Index            : 32
Empty                 : false
Append                : Time and Tide wait for None and for everyone is a proverb
Equals                : false
Delete                : Time and Tide wait for None and for everis a proverb
Reversed String       : brevorp a sireve rof dna enoN rof tiaw ediT dna emiT
Subsequence           : orp a sirev
Substring             : orp a sirev
Length                : 52
To String             : brevorp a sireve rof dna enoN rof tiaw ediT dna emiT
*/
