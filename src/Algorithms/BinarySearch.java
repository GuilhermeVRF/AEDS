/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithms;

/**
 *
 * @author Guilherme
 */
public class BinarySearch {
    public static int search(int[] array, int target){
        int start = 0;
        int end = array.length - 1;
        int middle;
        
        while(start <= end){
            middle = (start + end)/2;
            if(target == array[middle])
                return middle;
            else if(target > array[middle])
                start = middle + 1;
            else
                end = middle - 1;
        }
        
        return -1;
    }
        
    
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        System.out.println(search(array, 19));
    }
}
