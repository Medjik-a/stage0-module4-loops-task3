package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first=0;
        int second=1;
        int prev=0;
        int current=1;
        for(int i=1;i<=lastFibonacci;i++){
            if(i==1){
                System.out.println(first);
                continue;
            }
            if(i==2){
                System.out.println(second);
                continue;
            }
            current=current+prev;
            prev=current-prev;
            System.out.println(current);
        }
    }
}
