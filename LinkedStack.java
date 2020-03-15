public class LinkedStack<E> implements Stack<E>{

  private static class Elem<E>{
    private E info;
    private Elem<E> next;

    private Elem(E info, Elem<E> next){
      this.info = info;
      this.next = next;
    }
  }
  private Elem<E> top;

  public LinkedStack(){
    top = null;
  }

  public boolean isEmpty(){
    return top == null;
  }

  public E peek(){
    if(!isEmpty()){
      return top.info;
 }
   else{
     return null;
   }
  }
  public E pop(){
    if(!isEmpty()){
      E saved = top.info;
      top = top.next;
      return saved;
    }
    return null;
  }
  public void push(E element){
    top = new Elem<E>(element, top);
  }

  public void clear(){
    while(top != null){
      Elem<E> tmp = top.next;
      top.info = null;
      top.next = null;
      top = tmp;
    }
  }
}
