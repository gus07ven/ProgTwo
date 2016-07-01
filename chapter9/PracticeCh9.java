package chapter9;

import java.util.ArrayList;
import java.util.List;

public class PracticeCh9 {
	
	int age = 2;
	
	public PracticeCh9() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor of super");
	}
	
	public PracticeCh9(int a){
		this.age = a;
	}

	public static long primeNum() {
		
				long n=600851475143L;
				List <Long> numbers = new ArrayList<Long>();
				
				for (long i = 2; i <= n; i++)
				{
					if (n % i==0)
					{
						numbers.add(i);
						n = n / i;
						i = 2;
					}
				}
				long answer = numbers.get(numbers.size()-1);
				System.out.println(answer);
				return answer;
			}		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeNum();

	}
}
