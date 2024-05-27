package com.javaArrays;

public class Example5 {

	public static void main(String[] args) {
		int studentMarks[] = {22,34,56,76,32,89};

		System.out.println(studentMarks[0]);
		System.out.println(studentMarks[1]);
		System.out.println(studentMarks[2]);
		System.out.println(studentMarks[3]);
		System.out.println(studentMarks[4]);
		System.out.println(studentMarks[5]);
		
		System.out.println("-------------------------");
		
		for(int i = 0; i < studentMarks.length; i++)
		{
			System.out.println(studentMarks[i]);			
		}

	}

}
