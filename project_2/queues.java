import java.util.*;

public class queues implements aStack {

  private Queue queue1;
  private Queue queue2;
  
  public queues() {
    queue1 = new LinkedList();
    queue2 = new LinkedList();
  }
  
  @Override
  public Object push(Object anObj) {
    queue1.add(anObj);
    return anObj;
  }

  @Override
  public Object pop() {
    Object queueHead;
    Object popped;
    Queue placeholder;
    while(queue1.size() > 1) {
      queueHead = queue1.remove();
      queue2.add(queueHead);
    }
    
    popped = queue1.remove();
    placeholder = queue1;
    queue1 = queue2;
    queue2 = placeholder;
    
    return popped;
  }

  @Override
  public Object peek() {
    Object placeholder[] = queue1.toArray();
    Object stackHead = placeholder[queue1.size()-1];
    return stackHead;
  }

  @Override
  public int size() {
    return queue1.size();
  }

  @Override
  public boolean isEmpty() {
    return queue1.isEmpty();
  }
}
