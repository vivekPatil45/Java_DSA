import java.util.Stack;

public class StockSpanProblem {

    public static void stockSpan(int stocks[],int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];
            while (!s.isEmpty() && currPrice>stocks[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty())
                span[i] = i + 1;
            else{
                int prevhigh = s.peek();
                span[i] = i - prevhigh;
            }
            s.push(i);
        }
    }

    // stock span problem
    // span = max n0. of cosecutive days for which price<=todays price
    // span = i - prevhigh
    public static void main(String[] args) {
        int stocks[] = {100,80,60,70,60,85,100};
        int span[] = new int[stocks.length];
        stockSpan(stocks,span);
    }
}
