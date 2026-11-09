import java.util.*;
public class Main{
  public static void pushatbottom(Stack<Integer> s,int data){
    if(s.isEmpty()){
      s.push(data);
      return;
    }
    int top=s.pop();
    pushatbottom(s,data);
    s.push(top);
  }
  public static void main(String[] args){
    Stack<Integer> s = new Stack<>();
    s.push(10);
    s.push(20);
    s.push(30);
    pushatbottom(s,40);
    System.out.println(s);
  }
}