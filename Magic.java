/*
A small program that performs a mathematical magic trick! It will involve performing arithmetic operations on an integer that you choose.

@Bodavijay
*/
public class Magic {
	public static void main(String[] args) {
    
    int myNumber=4;
    int stepOne=myNumber;
    int stepTwo=stepOne+myNumber;
    int stepThree=stepTwo/myNumber;
    int stepFour=stepThree+17;
    int stepFive=stepFour-myNumber;
    int stepSix=stepFive/6;
    System.out.println(stepSix);
    
	
	}
}

/*Now, go back to your code and change myNumber to any other integer. Run your program again.

Is the output the same?

It's math magic!*/
