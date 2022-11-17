package com.ques3;

public class game {

	void status(int score)
	{
		if(score <=50)
			throw new ArithmeticException("Fail");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		game i=new game();
		i.status(20);

	}

}
