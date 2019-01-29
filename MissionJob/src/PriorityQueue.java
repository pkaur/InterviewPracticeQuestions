import java.util.*;

public class PriorityQueue {

   public static void main(String[] args){

       Comparator<String> stringLengthComparator = new Comparator<String>() {
           @Override
           public int compare(String s1, String s2) {
               return s1.length() - s2.length();
           }
       };
       Queue<String> queue=new java.util.PriorityQueue<>();
       queue.add("worldhdj");
       queue.add("clde");
       queue.add("fshdj");
       queue.add("love");
       queue.add("yell");

       /*System.out.println("Element : " + queue.element());
       System.out.println("Peek : " + queue.peek());

       Iterator ite = queue.iterator();

       while(ite.hasNext()){

           System.out.println(ite.next());
       }

       System.out.println("Remove : " + queue.remove());
       System.out.println("Poll : " + queue.poll());

       System.out.println("after removing two elements:");
       Iterator itr2=queue.iterator();
       while(itr2.hasNext()){
           System.out.println(itr2.next());
       }

       System.out.println(queue.poll());
       System.out.println(queue.poll());
       System.out.println(queue.poll());
       System.out.println(queue.peek());

       Iterator itr3=queue.iterator();
       while(itr3.hasNext()){
           System.out.println(itr3.next());
       }*/

       while (!queue.isEmpty()) {
           System.out.println(queue.remove());
       }
   }
}
