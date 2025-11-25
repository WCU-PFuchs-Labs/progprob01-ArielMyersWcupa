/*
Given a sorted linked list, delete all nodes that have duplicate
numbers, leaving only distinct numbers from the original list.In this 
program, you need to 
(1) read 5 numbers and set them in a linkedlist in order
(2) delete duplicate

Example 1:
input: 1,2,3,3,5
output: head-->1-->2-->3-->5-->null

Example 2:
input: 1,1,1,2,3
output: head-->1-->2-->3-->null

Please complete the following program to fullfil the function.
*/
/*
* Name: Ariel Myers
*/
import java.util.Scanner;

public class homework20_1
{
   public static void main(String[] args)
   {
     Scanner in = new Scanner(System.in);
      //Read the five numbers and build the linked list//
      LinkedList List = new LinkedList();
      if (in.hasNextInt()) {
         list.head = new ListNode(in.NextInt()); //First node turns into the head//
         ListNode tail = list.head;

         //Add the next four numbers eo the end of the list//
         for (int i = 1; i < 5; i++) {
            if (in.hasNextInt()) {
               int v = in.nextInt();
               tail.next = new ListNode(v);
               tail = tail.next;
               
            }
         }
      }
      
      deleteDuplicates(list); //Delete duplicates from the list//
      
      System.out.println(list.toString()); //Prints out the result//

      in.close();
   }
   
   public static void deleteDuplicates(LinkedList llist)
   {
      ListNode current = llist.head;

      //Remove repeated values//
      while (current != null && current.next != null) {
         if (current.value == current.next.value) {
            //Skip the next node since it is a duplicate//
            current.next = current.next.next;
         } else {
            //Move onto the next node//
            current = current.next;
         }
      }
   } 

}

class ListNode
{
   int value;
   ListNode next;
   ListNode(int v){value = v;}
}

class LinkedList
{
   ListNode head;
   public String toString()
   {
      String nodeData = "";
      ListNode ref = head;
      while(ref != null)
      {
         nodeData += ref.value + "-->";
         ref = ref.next;
      }
      return "head-->"+nodeData+"null";
   }
}
