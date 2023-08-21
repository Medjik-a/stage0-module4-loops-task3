package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd=1;
        int start = first>second?second:first;
        int end = first>second?first:second;
        if(start==0){
            System.out.println(end);
            return;
        }
        for(int i=1;i<=start;i++){
            if(second%i==0 && first%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
    }
}
