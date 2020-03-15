public class Test{

  public static void main(String [] args){

    Stack<Integer> s = new ArrayStack<Integer>(10);
    Stack<Integer> t = new LinkedStack<Integer>();

    for(int i = 0; i<=9;i++){
			s.push(i);
      t.push(i);
		}

    while(!s.isEmpty()){
      System.out.println(s.pop());
      System.out.println(t.pop());
    }

    for(int i = 0; i<=9;i++){
			s.push(i);
      t.push(i);
		}

    s.clear();
    t.clear();
  }
}
