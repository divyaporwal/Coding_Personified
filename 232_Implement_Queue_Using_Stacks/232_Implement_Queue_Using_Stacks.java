class MyQueue {
   

        Stack<Integer> s1 = new Stack();
        Stack<Integer> s2 = new Stack();
        private int front;

        /** Push element x to the back of queue. */
        public void push(int x) {
            if( (s1).isEmpty()) {
                front = x;
            }

            // keep putting elements from s1 to s2 so that the order is reversed.
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            //insert the new element
            s2.push(x);

            //again reverse the elements by putting from s2 to s1
            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }


        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            int pop = s1.pop();
            if(!s1.isEmpty()) {
                front = s1.peek();
            }
            return pop;

        }

        /** Get the front element. */
        public int peek() {
            return front;

        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return s1.isEmpty();
        }
    
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
