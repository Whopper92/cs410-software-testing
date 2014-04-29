import java.util.*;

public class stackTester {
  public static void main(String[] args) {
    /*
    LLWrapper llAPIStack = new LLWrapper();
    System.out.println(llAPIStack.pop());
    System.out.println(llAPIStack.push(2));
    System.out.println(llAPIStack.peek());
    System.out.println(llAPIStack.size());
    System.out.println(llAPIStack.pop());
    System.out.println(llAPIStack.isEmpty());
    
    array arrayStack = new array(2);
    arrayStack.push("26");
    arrayStack.push("35");
    System.out.println(arrayStack.push("26"));
    System.out.println(arrayStack.push("26"));

    System.out.println(arrayStack.pop());
    System.out.println(arrayStack.peek());

    System.out.println(arrayStack.size());
    System.out.println(arrayStack.isEmpty());
    */
    /*
    linkedlist llStack = new linkedlist();
    //System.out.println(llStack.push(22));
    //System.out.println(llStack.push(35));
    llStack.push(22);
    llStack.push("asd");
    llStack.push("derp");
    llStack.push("35");
    //llStack.showList();
    System.out.println(llStack.pop());
    System.out.println(llStack.pop());
    System.out.println(llStack.pop());
    System.out.println(llStack.pop());


    System.out.println(llStack.size());
    System.out.println(llStack.isEmpty());

    //llStack.showList();
     * */
     
    queues queueStack = new queues();
    System.out.println(queueStack.push(22));
    System.out.println(queueStack.push("asd"));
    System.out.println(queueStack.push(35));
    System.out.println(queueStack.pop());
    System.out.println(queueStack.pop());
    System.out.println(queueStack.pop());

    //System.out.println(queueStack.peek());
    System.out.println(queueStack.size());
    System.out.println(queueStack.isEmpty());



  }
}
