package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum=0;
        while(Math.abs(t)>0){
            sum+=Math.abs(t)%10;
            t/=10;
        }
        System.out.println(sum);
    }
}
