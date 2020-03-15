import java.util.Stack;

public class Balanced {


  //code doesn't know if the pair of brackets are both facing each other

  public static boolean algo1( String s ) {

    int curly = 0;
    int square = 0;
    int round = 0;
    for ( int i=0; i<s.length(); i++ ) {

      char c = s.charAt( i );

      switch ( c ) {
        case '{':
          curly++;
          break;
        case '}':
          curly--;
          break;
        case '[':
          square++;
          break;
        case ']':
          square--;
          break;
        case '(':
          round++;
          break;
        case ')':
        round--;
      }
    }
    return curly == 0 && square == 0 && round == 0;
  }
  public static void main( String[] args ) {

    System.out.println("Hey");
    for( int j=0; j<args.length; j++ ){
      System.out.println(algo2( args[ j ] ));
    }
    for( int i=0; i<args.length; i++ ) {
      System.out.println( "algo1( \"" + args[ i ] + "\" ) -> " + algo1( args[ i ] ) );
    }
  }
  public static boolean algo2(String s){

  boolean something = true;
  String fh = "({[<";         // fh = first half of braket
  String sh = ")}]>";         // sh = second half of braket
  int count = 0;
  int n2 =0;



  Stack<Character> cal = new Stack<>();
  Stack<Character> tmp = new Stack<>();

  for(int a = 0; a < s.length(); a++) {
    if(s.charAt(a) != ' ')
        count++;
  }

  for(int i = 0; i<count ;i++){
    for(int j = 0; j<4 ;j++){
      if(s.charAt(i) == fh.charAt(j) || s.charAt(i) == sh.charAt(j)){
        cal.push(s.charAt(i));
        n2++;
      }
    }
  }
  if(cal.isEmpty() == false){
    n2 = n2/2;

    for(int i = 0; i< n2; i++){
      tmp.push(cal.pop());
    }

    for (int j = 0; j< n2; j++){
      if(cal.peek() == fh.charAt(0) && tmp.peek() == sh.charAt(0)){
        cal.pop();
        tmp.pop();
      }
      else if(cal.peek() == fh.charAt(1) && tmp.peek() == sh.charAt(1)){
        cal.pop();
        tmp.pop();
      }
      else if(cal.peek() == fh.charAt(2) && tmp.peek() == sh.charAt(2)){
        cal.pop();
        tmp.pop();
      }
      else if(cal.peek() == fh.charAt(3) && tmp.peek() == sh.charAt(3)){
        cal.pop();
        tmp.pop();
      }
    }

    if(cal.size() != 0 || tmp.size() != 0){
      something = false;
    }
}
return something;

  }


}
