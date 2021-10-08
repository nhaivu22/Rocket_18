package backend;

public class Exercise1 {
	public static void main(String[] args) {
		int[] numbers = { -1, 1, 3, 5, -5, -8 };
		int maxValue =numbers[0];
		
		int minValue = numbers[0];
		for (int i = 0; i < numbers.length;i ++) {
			if(numbers[i]<minValue) {
				minValue=numbers[i];
			}
			if(numbers[i]>maxValue) {
				maxValue=numbers[i];
			}
		}
		System.out.println("giá trị nhỏ nhất : "+minValue);
		System.out.println("giá trị lớn nhất : "+maxValue);


	}	
}

