package com.hrishi.customerTrackingApplication;

public class Counter {
        int count;
        public Counter(int count){
            this.setCount(count);
        }
        public void increment(){
            this.count++;
        }

        public int getCount() {
            return this.count;
        }

        public void setCount(int count) {
           this.count = count;
       }
}
