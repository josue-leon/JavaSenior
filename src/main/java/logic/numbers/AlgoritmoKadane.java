
package logic.numbers;

public class AlgoritmoKadane {
    
    public static int maxSubarraySum(int[] arr) {
        int maxActual = arr[0];
        int maxGlobal = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            maxActual = Math.max(arr[i], maxActual + arr[i]);
            maxGlobal = Math.max(maxGlobal, maxActual);
        }
        
        return maxGlobal;
    }
    
    public static void ejecutar() {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Suma máxima: " + maxSubarraySum(arr));
    }
}
