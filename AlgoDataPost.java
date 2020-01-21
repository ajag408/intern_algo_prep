//river sizes
// import java.util.*;
//
// class Program {
// 	static int count = 1;
//
//   public static List<Integer> riverSizes(int[][] matrix) {
//     List<Integer> riverSizes = new ArrayList<Integer>();
// 		int currX, currY = 0;
// 		for(int i = 0; i<matrix.length; i++){
// 			currX = i;
// 			for(int j = 0; j<matrix[i].length; j++){
// 				currY = j;
// 				if(matrix[i][j] == 1){
// 					flow(matrix, currX, currY);
// 					riverSizes.add(count-1);
// 					count = 1;
// 				}
// 			}
// 		}
//     return riverSizes;
//   }
//
// 	public static void flow(int[][] matrix, int currX, int currY){
// 		if(matrix[currX][currY] == 0){
// 			return;
// 		}
// 		count++;
// 		matrix[currX][currY] = 0;
// 		if(currX+1<matrix.length){
// 			flow(matrix, currX+1,currY);
// 		}
// 		if(currY+1<matrix[currX].length){
// 			flow(matrix, currX,currY+1);
// 		}
// 		if(currX-1>=0){
// 			flow(matrix, currX-1,currY);
// 		}
// 		if(currY-1>=0){
// 			flow(matrix, currX,currY-1);
// 		}
// 		return;
// 	}
// }

//bigger is greater
// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.regex.*;
//
// public class AlgoDataPost {
//
//     // Complete the biggerIsGreater function below.
//     static String biggerIsGreater(String w) {
//     	String answer = "";
//     	int jT = 0;
//         ArrayList<Character> copy = new ArrayList<Character>();
//         for(int x = 0; x<w.length(); x++){
//             copy.add(w.charAt(x));
//         }
//         char temp = 'x';
//         boolean changed = false;
//         for(int i = copy.size()-1; i>=0; i--){
//             for(int j = i-1; j>=0; j--){
//                 if(copy.get(i)>copy.get(j)) {
//                 	System.out.println(i);
//                 	System.out.println(copy.get(i));
//                  	System.out.println(j);
//                 	System.out.println(copy.get(j));
//                 	Collections.swap(copy, i, j);
//                     changed = true;
//                     jT = j;
//                     break;
//                 }
//             }
//             if(changed == true){
//                 break;
//             }
//         }
//         if(changed == true){
//         	for(int i = jT+1; i<copy.size(); i++) {
//         		int min = i;
//         		for(int j = i+1; j<copy.size(); j++) {
//         			if(copy.get(j)<copy.get(min)) {
//         				min = j;
//         			}
//         		}
//         		Collections.swap(copy, i, min);
//         	}
//             for(int i = 0; i<copy.size(); i++){
//             	answer += copy.get(i);
//             }
//             return answer;
//         }else{
//             return "no answer";
//         }
//     }
//
// //    private static final Scanner scanner = new Scanner(System.in);
//
//     public static void main(String[] args){
//     	System.out.println(biggerIsGreater("a"));
// //        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
// //
// //        int T = scanner.nextInt();
// //        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
// //
// //        for (int TItr = 0; TItr < T; TItr++) {
// //            String w = scanner.nextLine();
// //
// //            String result = biggerIsGreater(w);
// //
// //            bufferedWriter.write(result);
// //            bufferedWriter.newLine();
// //        }
// //
// //        bufferedWriter.close();
// //
// //        scanner.close();
//     }
// }

//zigzag

// class Solution {
//     public String convert(String s, int numRows) {
//         ArrayList<ArrayList<Character>> zig = new ArrayList<ArrayList<Character>>();
//         String output = "";
//         for(int i = 0; i<numRows; i++){
//             ArrayList<Character> zag = new ArrayList<Character>(Collections.nCopies(s.length(), ' '));
//             zig.add(zag);
//         }
//         int count = 0;
//         int column = 0;
//         while(count<s.length()){
//             for(int i = 0; i<numRows; i++){
//                 zig.get(i).add(column, s.charAt(count));
//                 count++;
//                 if(count >= s.length()){
//                      break;
//                 }
//             }
//             if(count >= s.length()){
//                 break;
//             }
//             column++;
//             for(int j = numRows-2; j>0; j--){
//                 zig.get(j).add(column,s.charAt(count));
//                 column++;
//                 count++;
//                 if(count >= s.length()){
//                  break;
//                  }
//             }
//         }
//         for(int x = 0; x<zig.size(); x++){
//                            // System.out.println(zig.get(x));
//             for(int y = 0; y<s.length(); y++){
//
//                 if(zig.get(x).get(y) != ' '){
//
//
//                     output += zig.get(x).get(y);
//                 }
//             }
//         }
//         return output;
//     }
// }

//Reverse Integer

// class Solution {
//     public int reverse(int x) {
//         String input = String.valueOf(x);
//         boolean atBack = true;
//         String output = "";
//         if(input.charAt(0) == '-'){
//             output += '-';
//             input = input.substring(1, input.length());
//         }
//         for(int a = input.length()-1; a>=0; a--){
//             if(input.charAt(a) == 0 && atBack){
//                 continue;
//             } else {
//                 atBack = false;
//             }
//             output += input.charAt(a);
//         }
//         // System.out.println(output);
//         try {
//            Integer result = Integer.valueOf(output);
//             return result;
//         } catch(Exception e) {
//             return 0;
//         }
//
//     }
// }

//combo sum 2

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> combos = new ArrayList<List<Integer>>();
        List<Integer> store = new ArrayList<Integer>();
        int runningSum = 0;

        recAdd(combos, store, 0, candidates.length, 0, candidates.length, runningSum, target, candidates);
        System.out.println(combos);
        return combos;
    }

    public void recAdd(List<List<Integer>> combos, List<Integer> store, int start, int end, int idx, int r, int sum, int target, int[] candidates){
        if(idx == r){
            return;
        }

        if(sum==target){
            bubbleSort(store);
            if(!inCombos(combos, store)){
                combos.add(store);
                System.out.println("in");
                System.out.println(combos);
            }
            return;
         }

//          if(idx+1<candidates.length){
//             idx = idx+1;
//             store.add(candidates[idx]);
//             sum = sum + candidates(idx);

//          }

        for(int i = start; i < end && end-i+1 >= r-idx; i++){
            store.add(idx, candidates[i]);
            sum += candidates[i];
            System.out.println(store);
            System.out.println(sum);
            recAdd(combos, store, i+1, end, idx+1, r, sum, target, candidates);
            // store.clear();
            // sum = 0;
        }
    }


      public void bubbleSort(List<Integer> combo){
          int min =0;
          for(int i = 0; i<combo.size(); i++){
              min = i;
              for(int j = i+1; j<combo.size(); j++){
                  if(combo.get(i)>combo.get(j)){
                    min = j;
                  }
                  int temp = combo.get(min);
                  combo.set(min, combo.get(i));
                  combo.set(i, temp);
              }
          }
      }

      public boolean inCombos(List<List<Integer>> combos, List<Integer> store){
          boolean in = false;
          for(List<Integer> combo : combos){
              if(combo.equals(store)){
                  in = true;
              }
          }
          return in;
      }
}
