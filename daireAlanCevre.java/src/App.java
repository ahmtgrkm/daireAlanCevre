import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        System.out.print("Lutfen dairenin yarı capını giriniz:");
        int r=input.nextInt();
        System.out.print("Lutfen merkez acının olcusunu giriniz:");
        int a=input.nextInt();
        double pi=3.14;

        double alan= (pi*(Math.sqrt(r))*a)/360;

        System.out.println(alan);


    }
}
