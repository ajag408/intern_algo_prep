public class Warmup{

  static void FizzBuzz(){
    for(int i = 1; i<=100; i++){
      if(i%3 == 0 && i % 5 == 0){
        System.out.println("FizzBuzz");
      } else if(i % 3 == 0){
        System.out.println("Fizz");
      } else if (i % 5 == 0 ){
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }
  }

// subarray problem
//   class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int count = 0;
//         for(int i = 0; i<nums.length(); i++){
//             if(nums[i] == k){
//                 count++;
//             }
//             int this_sum = nums[i];
//             for(int j = i+1; j<nums.length(); j++){
//                 this_sum = this_sum + nums[j];
//                 if(this_sum == k){
//                     count++;
//                 }
//             }
//         }
//     }
// }

//nth fib
// class Program {
//   public static int getNthFib(int n) {
// 		int[] fibArr = new int[n];
// 		for(int i = 0; i<n; i++){
// 			if(i == 0){
// 				fibArr[i] == 0;
// 			} else if (i == 1){
// 				fibArr[i] == 1;
// 			} else {
// 				fibArr[i] == fibArr[i-1] + fibArr[i-2];
// 			}
// 		}
//     return fibArr[i];
//   }
// }

  public static void main(String[] args) {
    FizzBuzz();
  }
}
