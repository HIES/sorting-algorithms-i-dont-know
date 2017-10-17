public class SortingAlgorithms
{
    public static void bubbleSort(int[] nums)
    {
        int counter = 1;
        for (int i = 0; i < nums.length; i++) {
            for(int x = 0; x < nums.length-counter; x++) {
                if (nums[x] > nums[x+1]) {
                    int temp = nums[x+1];
                    nums[x+1] = nums[x];
                    nums[x] = temp;                  
                }
            }
            counter++;
        }
    }

    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            int min = nums[i];
            int minIndex = i;
            for (int y = i; y < nums.length; y++) {
                if (nums[y] < min) {
                    min = nums[y];
                    minIndex = y;
                }
            }
            int temp = nums[i];
            nums[i] = min;
            nums[minIndex] = temp;
        }
    }

    public static void insertionSort(int[] nums) {  
        for (int i = 0; i < nums.length-1; i++) {
            int j = i + 1;
            int insertNum = nums[j];
            while (j > 0 && insertNum < nums[j-1]) {
                nums[j] = nums[j-1];
                j--;
            }
            nums[j] = insertNum;
        }
    }

    // A helper method for you to check if your sorts work
    private static boolean isSorted(int[] nums){
        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] > nums[i+1])
                return false;
        return true;
    }

    // Generate an array of size N with random integers in the range [0, N]
    private static int[] generateRandomArray(int N){
        int[] nums = new int[N];
        for (int i = 0; i < N; i++)
            nums[i] = (int) (Math.random()*N);
        return nums;
    }

    // Generate a sorted array of size N whose contents are in the range [0, N]
    private static int[] generateSortedArray(int N){
        int[] nums = new int[N];
        for (int i = 0; i < N; i++)
            nums[i] = i;
        return nums;
    }

    // Generate a reversed array of size N whose contents are in the range [0, N]
    private static int[] generateReversedArray(int N){
        int[] nums = new int[N];
        for (int i = 0; i < N; i++)
            nums[i] = (N - 1 ) - i;
        return nums;
    }

    // Assumes that nums is not empty
    private static void printArray(int[] nums)
    {
        System.out.print("[" + nums[0]);
        for (int i = 1; i < nums.length; i++)
            System.out.print(", " + nums[i]);
        System.out.println("]");
    }

    // Use main for testing and timing your sorts
    public static void main(String[] args) 
    {
        int[] testArray = generateReversedArray(100);

        //printArray(testArray);

        //System.out.println("Applying the bubble sort.");

        long start = System.currentTimeMillis();
        bubbleSort(testArray);
        long end = System.currentTimeMillis();
        double sortTime = (end - start) / 1000.0; 
        //printArray(testArray);
        //System.out.println(isSorted(testArray));
        System.out.format("Time to complete took %.4f seconds.%n", sortTime);
        
        testArray = generateReversedArray(1000);
        
        start = System.currentTimeMillis();
        bubbleSort(testArray);
        end = System.currentTimeMillis();
        sortTime = (end - start) / 1000.0; 
        //printArray(testArray);
        //System.out.println(isSorted(testArray));
        System.out.format("Time to complete took %.4f seconds.%n", sortTime);
        
        testArray = generateReversedArray(10000);
        
        start = System.currentTimeMillis();
        bubbleSort(testArray);
        end = System.currentTimeMillis();
        sortTime = (end - start) / 1000.0; 
        //printArray(testArray);
        //System.out.println(isSorted(testArray));
        System.out.format("Time to complete took %.4f seconds.%n", sortTime);
        
        testArray = generateReversedArray(100000);
        
        start = System.currentTimeMillis();
        bubbleSort(testArray);
        end = System.currentTimeMillis();
        sortTime = (end - start) / 1000.0; 
        //printArray(testArray);
        //System.out.println(isSorted(testArray));
        System.out.format("Time to complete took %.4f seconds.%n", sortTime);
        
        
        // start = System.currentTimeMillis();
        // selectionSort(testArray);
        // end = System.currentTimeMillis();
        // sortTime = (end - start) / 1000.0; 
        // //printArray(testArray);
        // System.out.println(isSorted(testArray));
        // System.out.format("Time to complete took %.4f seconds.%n", sortTime);
        
        // start = System.currentTimeMillis();
        // insertionSort(testArray);
        // end = System.currentTimeMillis();
        // sortTime = (end - start) / 1000.0; 
        // //printArray(testArray);
        // System.out.println(isSorted(testArray));
        // System.out.format("Time to complete took %.4f seconds.%n", sortTime);
        
    }
}
