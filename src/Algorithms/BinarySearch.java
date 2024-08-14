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
        return search(array, target, 0);
    }
 
    private static int search(int[] array, int target, int count){
        int start = 0;
        int end = array.length - 1;
        int middle;
        
        while(start <= end){
            middle = (start + end)/2;
            if(target == array[middle]){
                break;
            }
            else if(target > array[middle])
                start = middle + 1;
            else
                end = middle - 1;
        }
        
        for(int i = start;i <= end;i++)
            if(array[i] == target) count++;
        
        return count;
    }
}
