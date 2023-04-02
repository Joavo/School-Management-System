///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//
///**
// *
// * @author AKHILA KARAGATLA
// */
//import java.util.Scanner;
//public class trail1 {
//    public static void main(String args[])
//    {
//        stack mystack = new stack(5);
//        Scanner sc = new Scanner(System.in);
//        boolean check = true;
//        while(check){
//            System.out.println("Insert 1 for push, 2 for pop and 3 display and 4 for exit:");
//            switch(sc.nextInt())
//            {
//            case 1:
//                System.out.println("Enter value:");
//                mystack.push(sc.nextInt());
//                break;
//            case 2:
//                mystack.pop();
//                break;
//            case 3:
//                mystack.display();
//                break;
//            case 4:
//                check = false;
//                break;
//            default:
//                System.out.println("Number incorrect...");              
//            }
//        }
//        
////        mystack.display();
////        mystack.push(2);
////        mystack.push(3);
////        mystack.push(4);
////        mystack.display();
////        mystack.pop();
////        mystack.pop();
////        mystack.pop();
////        mystack.pop();
////        mystack.pop();
////        mystack.display();
//        
//        
//    }
//}
//class stack
//{
//    int array[],top=-1;
//    public stack(int n)
//    {
//        array = new int[n];
//    }
//    public void push(int value)
//    {
//        if(top>=array.length)
//        {
//            System.out.println("Stack is Full!!!");                    
//        }
//        else
//        {
//            top=top+1;
//            array[top]=value;
//        }
//    }
//    public void pop()
//    {
//        if(top<0)
//        {
//            System.out.println("Stack is empty!!!");
//        }
//        else{
//            System.out.println(array[top]+" is popped from stack.");
//            top--;
//        }   
//    }
//    public void display()
//    {
//        if(top<0)
//        {
//            System.out.println("Stack is empty!!!");
//        }
//        else{
//            for(int i=0;i<=top;i++)
//            {
//                System.out.print(array[i]+" ");
//            }
//            System.out.println();
//        }
//    }
//    
//}
import java.util.Scanner;
public class trail1 {
    
    public static void main(String args[])
    {
        node root = new node(1);
        root.insert(root,5);
        root.insert(root,0);
        root.insert(root,10);
        //root.preorder(root);
        System.out.println();
                
        root.inorder(root);
        System.out.println();
        //root.postorder(root);
        root.search(root,15);
    }
}
class node
{
    int value;
    node left;
    node right;
    public node(int value)
    {
    this.value=value;
    }
    
    public node insert(node root,int value)
    {
        if(root==null)
                {
                    root = new node(value);
                    return root;
                }
        if(root.value>value)
        {
            root.left=insert(root.left,value);
        }
        else
        {
            root.right = insert(root.right,value);
        }
        return root;
    }
    public void preorder(node root)
    {
        if(root==null)return;
        System.out.print(root.value+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public void inorder(node root)
    {
        if(root==null)return;
        inorder(root.left);
        System.out.print(root.value+" ");
        inorder(root.right);
    }
    public void postorder(node root)
    {
        if(root==null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value+ " ");
                
    }
    public void search(node root,int value)
    {
        if(root==null)
        {
            System.out.println("Not found");
            return;
        }
        if(root.value<value){
            search(root.right,value);
        }
        else if(root.value<value)
        {
            search(root.left,value);
        }
        else
        {
            System.out.println("found");
            return;          
        }
    }
    
}