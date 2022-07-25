package practiceproject4;
public class longest_subsequence {
	static int a(int arr[],int n){
		int a[]=new int[n];
		int i,j,max=0;
        for (i=0;i<n;i++)
			a[i] = 1;
		for (i=1;i<n;i++) {
			for (j=0;j<i;j++) {
				if (arr[i]>arr[j]&&a[i]<a[j]+1) {
					a[i]=a[j]+1;
				}}}
		for (i=0;i<n;i++)
			if (max<a[i])
				max=a[i];
		return max;
	}
	public static void main(String args[])
	{
		int arr[]={10,20,50,30,60,40,70};
		int n=arr.length;
		System.out.println("Length of Longest Increasing Subsequence is " + a(arr, n) + "\n");
	}
}

