/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AKHILA KARAGATLA
 */
import java.util.*;
import java.util.List;
import java.util.ArrayList;

class NewClass{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int result=1;
        int temp;
        int arr[] = new int[n];
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            
            if(arr[j]>0){
                result=result*arr[j];
            }
            else{
                list.add(arr[j]);
                
            }
        }
      
        Collections.sort(list);
        int l=list.size();
        
        if(l%2!=0){
            list.remove(l-1);
        }
        System.out.println(list);
        for(int m=0;m<list.size();m++){
            result=result*list.get(m);
        }
        
        
        System.out.println("result is "+result);
        
    
    }
}
