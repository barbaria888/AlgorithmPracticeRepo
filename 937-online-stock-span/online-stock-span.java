class StockSpanner {
    int c=-1;
Stack <Integer> st=new Stack<>();
    ArrayList<Integer> prices=new ArrayList<>();  
    public StockSpanner() {
     
        
    }
    
    public int next(int price)
    {     
    while(!st.isEmpty()&&prices.get(st.peek())<=price)
    {
        st.pop();
    }
    c++;
    int ans=c+1;
    if(!st.isEmpty())
    {
        ans=c-st.peek();
    }
           prices.add(price);
            st.add(c);
            return ans;

        }
    }
    

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */