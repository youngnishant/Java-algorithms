import java.util.Collections;
import java.util.LinkedList;

public class K_reverse {
	public static void main(String[] args) {
		Integer[] arr= {1,2,3,4,5,6,7,8,9};
		LinkedList<Integer> ques = new LinkedList<>();
		Collections.addAll(ques,arr);
		LinkedList<Integer> res = new LinkedList<>();
		LinkedList<Integer> stack = new LinkedList<>();
		
		int k = 2;
		while(!ques.isEmpty()) {
			if(ques.size()==1) 
				res.add(ques.remove(0));
			
			else
			{
				for(int i=0;i<k;i++) {
					stack.add(0,ques.remove(0));
				}
				res.addAll(stack);
				stack.clear();
			}
		}
		System.out.println(res);
		
		}
}
