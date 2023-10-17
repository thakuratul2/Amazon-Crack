import java.util.Scanner;

public class maximum_subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter the number: ");
        for(int i = 0;i<size;i++){
            nums[i] = sc.nextInt();
        }

        int sum = 0;
        int max_sum = nums[0];

        for(int j = 0;j<size;j++){

            sum = sum + nums[j];

            if(sum > max_sum){
                max_sum = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }

        System.out.println("Maximum sum: "+max_sum);
        
        sc.close();
    }
}
