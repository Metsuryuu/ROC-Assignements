package array_search;

public class Search_Test {

	public static void main(String[] args) {
		
		Search_Test s = new Search_Test();
		int ar[] = {10,22,33,11,10,10,11,22,44,22,2,5,40};
		
		s.prime(ar);
		s.oddSearch(ar);
		s.palindrome(ar);
		
		int pal[] = {1,2,3,4,5,5,4,3,2,1};	//palindrome array for proof of functionality.
		s.palindrome(pal);

	}
	
		//prime number search.
		public void prime(int ar[]){
			System.out.println("\nSearching for prime numbers...");
			for(int i = 0; i < ar.length; i++){
				
				boolean isprime = true;
				
				for(int j = 2; j <= ar[i]/2; j++){	//no point in going past half of the element.
					if(ar[i]%j == 0){	//would imply a divisor.
						isprime = false;	//if a divisor exists, it is not prime.
						break;	//only need one divisor to disprove primality, no point in continuing.
					}
				}
				
				if(isprime){	//if true, then it is prime.
					System.out.print(ar[i] + " ");
				}
			}
		}
		
		//odd number search.
		public void oddSearch(int ar[]){
			System.out.println("\n\nSearching all odd numbers in array...");
			for(int i = 0; i < ar.length; i++){
				if(ar[i] %2 != 0){	//if not divisible by 2, odd number.
					System.out.print(ar[i] + " ");
				}
			}
		}
		
		//palindrome search.
		public void palindrome(int ar[]){
			System.out.println("\n\nScanning array to determine palindrome...");
			boolean notpal = false;
			
			for(int i = 0; i <= ar.length/2 && ar.length != 0; i++){
				
				if(ar[i] != ar[ar.length-i-1]){	//check the first and last elements and move inwards.
					notpal = true;
					break;
				}
			}
			
			if(notpal){	//if flag is true, array is not a palindrome.
				System.out.println("The array is not a palindrome.");
			}else{
				System.out.println("The array is a palindrome.");
			}
		}

}
