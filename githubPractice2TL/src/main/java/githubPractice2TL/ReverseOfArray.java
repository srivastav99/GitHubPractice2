package githubPractice2TL;

public class ReverseOfArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		int a[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			a[arr.length-1-i]=arr[i];
		}
		System.out.println("Reverse of given Array is: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
