class Constructor_1{

	private class Node{
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}


	public static void main(String args[]){

		int[]  arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
		Node root;
		Stack<Node> st = new Stack<>();
		for(int i=0;i<arr.length;i++){

		// if we came across the -1 then we have to pop the top element from the stack. 
			if(arr[i] == -1){
				st.pop();
			}
		// for other elements, Make the node of that element, 
			else{
				Node t = new Node();
				t.data = arr[i];
				if(st.size()>0){
			//Make the peek() element as a children of the current elenment. 
					st.peek().children.add(t);
				}
				else{

			// the first node in the stack, is treated as a root. 
			// to check that, if the at first the stack is empty then the first element which is pushed is a root element.
					root = t;
				}
				st.push(t);	
			}

		}	
	}
}

/*


	      10   
     /    \     \
    20     30    40
   / \    /  \ \   \
  50 60  70 80  90  100
            / \
		   110 120	 	



*/
