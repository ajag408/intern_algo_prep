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


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AlgoDataPost {

    // Complete the biggerIsGreater function below.
    static String biggerIsGreater(String w) {
    	String answer = "";
    	int jT = 0;
        ArrayList<Character> copy = new ArrayList<Character>();
        for(int x = 0; x<w.length(); x++){
            copy.add(w.charAt(x));
        }
        char temp = 'x';
        boolean changed = false;
        for(int i = copy.size()-1; i>=0; i--){
            for(int j = i-1; j>=0; j--){
                if(copy.get(i)>copy.get(j)) {
                	System.out.println(i);
                	System.out.println(copy.get(i));
                 	System.out.println(j);
                	System.out.println(copy.get(j));
                	Collections.swap(copy, i, j);
                    changed = true;
                    jT = j;
                    break;
                }
            }
            if(changed == true){
                break;
            }
        }
        if(changed == true){
        	for(int i = jT+1; i<copy.size(); i++) {
        		int min = i;
        		for(int j = i+1; j<copy.size(); j++) {
        			if(copy.get(j)<copy.get(min)) {
        				min = j;
        			}
        		}
        		Collections.swap(copy, i, min);
        	}
            for(int i = 0; i<copy.size(); i++){
            	answer += copy.get(i);
            }
            return answer;
        }else{
            return "no answer";
        }
    }

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
    	System.out.println(biggerIsGreater("a"));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int T = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int TItr = 0; TItr < T; TItr++) {
//            String w = scanner.nextLine();
//
//            String result = biggerIsGreater(w);
//
//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
//        }
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}
