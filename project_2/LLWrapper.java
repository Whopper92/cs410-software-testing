import java.util.*;

public class LLWrapper implements aStack {

  private LinkedList list;
  
  public LLWrapper() {
    list = new LinkedList();
  }
  
  @Override
  public Object push(Object anObj) {
    list.addFirst(anObj);
    return anObj;
  }

  @Override
  public Object pop() {
    try {
      Object first = list.getFirst();
      list.removeFirst();
      return first;
    } catch (NoSuchElementException e) {
        return "Empty Stack";
    }
  }

  @Override
  public Object peek() {
    try {
      return list.getFirst();
    } catch (NoSuchElementException e) {
      return "Empty Stack";
    }
  }

  @Override
  public int size() {
    return list.size();
  }

  @Override
  public boolean isEmpty() {
    return list.isEmpty();
  }
}
