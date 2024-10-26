package ExamenProvaBucles;

public class CoolNumbers {
    public static void main(String[] args) {

        int nums = 100;

        while( nums < 1000){
            String pass = Integer.toString(nums);
            String[] arr = pass.split("");
            int[] arrNums = new int[arr.length];
            for(int i = 0; i < arr.length; i++){
                arrNums[i] = Integer.parseInt(arr[i]);
            }

            if( (Math.pow(arrNums[0],3) + Math.pow(arrNums[1],3) + Math.pow(arrNums[2],3)) == nums){
                System.out.println("Cool number: "+nums);
            }
        }
    }
}
