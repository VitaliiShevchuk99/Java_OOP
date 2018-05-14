package com.company;
import javax.swing.text.html.HTMLDocument;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here





                ArrayList states = new ArrayList();
                states.add("Germany");
                states.add("France");
                states.add("Italy");
                states.add("Spain");
                int n=0;
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        states.add(str);
        n++;
        for(int i=0;i<n+4;i++){
            System.out.println(states.next());
        }
        System.out.println(states.Contains("Spain"));

        states.Clear();
        System.out.println(states.Size());
    }
}
