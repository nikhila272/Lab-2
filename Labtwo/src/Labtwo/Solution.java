package Labtwo;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();

        for (int i = 0; i < num; i++) {
        	
            int m  = scn.nextInt();
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                line.add(scn.nextInt());
            }
            lines.add(line);
        }

        int q = scn.nextInt();
        for (int i = 0; i < q; i++) {
            int a = scn.nextInt();
            int b = scn.nextInt();

            if (a <= lines.size() && b <= lines.get(a - 1).size()) {
                System.out.println(lines.get(a - 1).get(b - 1));
            } else {
                System.out.println("ERROR!");
            }
        }

        scn.close();
    }
}