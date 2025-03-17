package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        for (String s : arr) {
            new StringBuilder();
        }

        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<String> list = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String a = sc.nextLine();
            list.add(a);
        }

        for (int i = 0; i < n ; i++) {
            String b = new StringBuilder(list.get(i)).reverse().toString();
            System.out.println(b);
        }
        sc.close();

       */
    }
}