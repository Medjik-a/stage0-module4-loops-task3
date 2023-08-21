package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int cur = 0;
        int total = 0;
        if (lengthOfLastNumber <= 0) {
            System.out.println("0");
            return;
        }
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            cur += 9 * Math.pow(10, i - 1);
            total += cur;
        }
        System.out.println(total);
    }
}
