package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

class Patient {
    int index; // 환자의 인덱스
    int risk; // 환자의 위험도

    public Patient(int index, int risk) {
        this.index = index;
        this.risk = risk;
    }
}

public class Solution7 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 환자 수
        int M = Integer.parseInt(st.nextToken()); // M번째 환자 (0부터 세기)

        Queue<Patient> queue = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            int risk = Integer.parseInt(st.nextToken());
            queue.offer(new Patient(i, risk));
        }

        int count = 0; // 몇 번째로 진료받는지 카운트
        while (!queue.isEmpty()) {
            Patient current = queue.poll();
            boolean flag = false;

            // 현재 환자보다 위험도가 높은 환자가 있는 지 확인
            for (Patient p : queue) {
                if (p.risk > current.risk) {
                    flag = true;
                    break;
                }
            }
            if (flag) { // 위험도가 더 높은 환자가 대기열에 존재한다면
                queue.offer(current); // 현재 환자를 맨 뒤로 보내자
            } else {
                // 진료받고 나가라
                count++;
                if (current.index == M) { // 현재 환자가 M번째니?
                    System.out.println(count);
                    break;
                }
            }

        }

        br.close();

    }

}
