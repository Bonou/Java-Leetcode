package leetcodest;

import java.util.LinkedList;

import java.util.Deque;

	class MyQueue {
	    Deque<Integer> deque = new LinkedList<>();
	    //����Ԫ��ʱ���Ƚϵ�ǰҪ��������ֵ�Ƿ���ڶ��г��ڵ���ֵ���������򵯳�
	    //ͬʱ�ж϶��е�ǰ�Ƿ�Ϊ��
	    void poll(int val) {
	        if (!deque.isEmpty() && val == deque.peek()) {
	            deque.poll();
	        }
	    }
	    //���Ԫ��ʱ�����Ҫ��ӵ�Ԫ�ش�����ڴ���Ԫ�أ��ͽ����Ԫ�ص���
	    //��֤����Ԫ�ص����ݼ�
	    //�����ʱ����Ԫ��3,1��2��Ҫ��ӣ���1������1��������ʱ���У�3,2
	    void add(int val) {
	        while (!deque.isEmpty() && val > deque.getLast()) {
	            deque.removeLast();
	        }
	        deque.add(val);
	    }
	    //���жӶ�Ԫ��ʼ��Ϊ���ֵ
	    int peek() {
	        return deque.peek();
	    }
	}


class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 1){
            return nums;
        }
        int len = nums.length - k + 1;
        int[] res = new int[len];   //��Ž������
        int num = 0;
        //�Զ������
        MyQueue myQueue = new MyQueue();
        //�Ƚ�ǰk��Ԫ�ش�Ž�����
        for(int i = 0; i < k; i++){
            myQueue.add(nums[i]);       //MyQueue�̳���LinkedList������LinkedList�ķ���������
        }
        res[num++] = myQueue.peek();
        for(int i = k; i < nums.length; i++){
            //���������Ƴ���ǰ���Ԫ�أ��Ƴ����жϸ�Ԫ���Ƿ�������
            myQueue.poll(nums[i - k]);
            //�������ڼ���������Ԫ��
            myQueue.add(nums[i]);
            //��¼��Ӧ�����ֵ
            res[num++] = myQueue.peek();
        }
        return res;

    }
}