import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class Solution
{

    public static Node removeDuplicates(Node head) {
      //Write your code here
        if(head==null){
         return null;
     }
         Node s=head;
         while(s.next!=null){
             if(s.data==s.next.data){
                 s.next=s.next.next;
             }
             else{
                 s=s.next;
             }
         }
         return head;

    }

    public static  Node insert(Node head,int data)