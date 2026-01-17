package array;

public class MergeArray {
	public static void mergearray(int[] a,int[] b) {
		int[] c = new int[a.length + b.length];
        int i=0,j=0,k = 0;
        
        while(i<a.length && j<b.length) {
        	c[k++]=a[i++];
        	c[k++]=b[j++];
        }
        while(i<a.length) {
        	c[k++]=a[i++];
        }
        while(j<b.length) {
        	c[k++]=b[j++];
        }
        System.out.println("ZigZag Merged Array:");
        for (int x = 0; x < c.length; x++) {
            System.out.print(c[x] + " ");
        }
    }

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6};
        int[] b = {10,20,30,40};

        mergearray(a, b);
    }
        
	

}
