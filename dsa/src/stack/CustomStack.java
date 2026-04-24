package stack;

public class CustomStack {
	int[] stack;
	int size;
	int top;
	public CustomStack(int size) {
		stack=new int[size];
		top=-1;
		this.size=size;
	}

}
