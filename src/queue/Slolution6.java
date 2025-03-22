package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Slolution6 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String need = br.readLine();
        String plan = br.readLine();


        Queue<Character> queue = new ArrayDeque<>();
        for (char c : need.toCharArray()) {
            queue.add(c);
        }

        for (char c : plan.toCharArray()) {
            if (queue.contains(c)) {
                if (queue.poll() != c) {
                    // 필수과목 순서가 잘못됨
                    System.out.println("NO");
                    return; // 프로그램 종료 ( main 종료 )
                }
            }
        }

        if (queue.isEmpty()) {
            // 큐가 비어있지 않다? -> 필수과목 누락
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
