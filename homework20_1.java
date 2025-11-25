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

      //Create an empty list//
      LinkedList list = new LinkedList();

      //Read 5 numbers and put them into the linked list//
      //First number becomes the head//
      list.head = new ListNode(in.nextInt());
      ListNode tail = list.head;

      //Add in the next 4 numbers//
      for (int i = 1; i < 5; i++)
      {
         int v = in.nextInt(); 
         tail.next = new ListNode(v); 
         tail = tail.next;   //Move the tail forward//
      }

      //Deletes the duplicates//
      deleteDuplicates(list);

      //Prints the result//
      System.out.println(list.toString());

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
