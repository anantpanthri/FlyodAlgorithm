/*
 * Trying to determine whether a single linked list contains any loop or not!.
 * -----<__>
 */
public class FlyodAlgo {
	/*consider a hare and a tortoise in a race. they are running in a loop
	 * after a period of time hare will catch the tortoise 
	 */
	
	public static void main(String args[]){
		//forming a link list of looping nature
		
		Node nodeHead=setCircularLoopDataInNode();
		printNodeData(nodeHead);
		int loopedData= isLoopeddOrNot(nodeHead);
		if(loopedData==-1){
			System.out.println("no circulation");
		}
		else{
			System.out.println("circulated at data"+loopedData);
		}
		
	}
	/*
	 * using Floyd Method	
	 */
	
private static int isLoopeddOrNot(Node nodeHead) {
		Node slwptr=nodeHead;// this is the tortoise
		Node fastptr=nodeHead;// this is the hare
		while(slwptr!=null||fastptr!=null){
			fastptr=fastptr.getNextNode();
			if(slwptr==fastptr)return slwptr.getData();
			fastptr=fastptr.getNextNode();
			if(slwptr==fastptr)return slwptr.getData();
			slwptr=slwptr.getNextNode();
			
		}
	return -1;
	}
/*
 * this method proves that a looped linked list is formed.
 */
	private static void printNodeData(Node list) {
		int i=0;
		while(i!=12)
		{
			System.out.println(list.getData());
			list=list.getNextNode();
			++i;
		}
		
	}

	private static Node setCircularLoopDataInNode() {

		Node a= new Node();
		Node b = new Node();
		Node c = new Node();
		Node d = new Node();
		Node e = new Node();
		Node f = new Node();
		Node g = new Node();
		Node h = new Node();
		Node i = new Node();
		Node j = new Node();
		Node k = new Node();		
		/*a-b-c-d<e f g h i j k>d
		 */
		 
		a.setNextNode(b);
		b.setNextNode(c);
		c.setNextNode(d);
		d.setNextNode(e);
		e.setNextNode(f);
		f.setNextNode(g);
		g.setNextNode(h);
		h.setNextNode(i);
		i.setNextNode(j);
		j.setNextNode(k);
		k.setNextNode(d);
		
		//data
		a.setData(1);
		b.setData(2);
		c.setData(3);
		d.setData(4);
		e.setData(5);
		f.setData(6);
		g.setData(7);
		h.setData(8);
		i.setData(9);
		j.setData(10);
		k.setData(11);
		
		
		
		return a;
	}

}
