import java.util.Random;
public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating array
		Random rand = new Random();
		int[] arr = new int [100];
		int n;
		//creating array of random objects
		for (int i = 0; i < 100; i++){
			 n = rand.nextInt(100)+1;
			arr[i] = n;
			System.out.println(n);
		}
		//finding the minimum
		int min=100;
		for (int i = 0; i < 99; i++){
			if(arr[i] < min)
				min = arr[i];
			
		}
		System.out.println("Minimum is: "+min);
		//find the maximum
		int max = 0;
		for (int i = 0; i < 99; i++){
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.println("Maximum is: "+max);
		//calculating the mean
		int sum = 0;
		for(int i = 0; i < 100; i++){
			sum = sum+arr[i];
		}
		double result = sum/100;
		System.out.println("Mean is: "+result);
		
		//calculating standard deviation
	
	}
	

}