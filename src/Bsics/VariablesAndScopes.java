package Bsics;

import java.util.StringTokenizer;

public class VariablesAndScopes {
    String provider;
    static String theSt;


    public VariablesAndScopes(String provider) {
        this.provider = provider;
    }


    static void main() {
        String a = "Ali";
        String b = "Ali";
        String c = new String("Ali");
        StringBuffer d = new StringBuffer("Ali");
        StringBuilder e = new StringBuilder();
        e.append("Ali");
        StringTokenizer t = new StringTokenizer("Ali");
        while (t.hasMoreTokens()) {
            System.out.println("t hash code : " + t.nextToken().hashCode()); // 65918
        }

        System.out.println(c == a);

        System.out.println("A hash code : " + a.hashCode() + " " + a); // 65918
        System.out.println("B hash code : " + b.hashCode() + " " + b); // 65918
        System.out.println("C hash code : " + c.hashCode() + " " + c); // 65918
        System.out.println("D hash code : " + d.hashCode() + " " + d); // 1096979270
        System.out.println("E hash code : " + e.hashCode() + " " + e); // 1078694789

        System.out.println(System.identityHashCode(a)); // 1831932724
        System.out.println(System.identityHashCode(b)); // 1831932724
        System.out.println(System.identityHashCode(c)); // 1831932724
    }
}
