package com.study.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 제로 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st  = new StringTokenizer(br.readLine());
	    
	    int n = Integer.parseInt(st.nextToken());
	    Stack<Integer> stackList = new Stack<>();
	    int temp = 0;
	    for(int i = 0; i < n; i++) {
	    	st = new StringTokenizer(br.readLine());
	    	temp = Integer.parseInt(st.nextToken());
	    	if(temp == 0) {
	    		stackList.pop();
	    		continue;
	    	}
	    	stackList.add(temp);
	    }
	    int sum = 0;
	    while(!stackList.empty()) {
	    	sum += stackList.pop();
	    }
	    System.out.println(sum);
	    
	}
}
