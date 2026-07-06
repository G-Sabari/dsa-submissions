class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);

        for(int num : stones){
            pq.offer(num);
        }

        while(pq.size()>1){
            int first = pq.poll();//return the largest (max Heap)
            int second = pq.poll();//return the secLargest

            if(first!=second){
                pq.offer(first-second);//gives balance stone
            }
        }

        return pq.isEmpty()?0 : pq.peek();
    }
}
