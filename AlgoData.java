
//queries
// class Solution {
//     public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
//         int val = 0;
//         int idx = 0;
//         int[] answer = new int[queries.length];
//         for(int i = 0; i<queries.length; i++){
//             val = queries[i][0];
//             idx = queries[i][1];
//             A[idx] += val;
//             int temp_sum = 0;
//             for(int j = 0; j<A.length; j++){
//                 if(A[j] % 2 == 0){
//                     temp_sum += A[j];
//                 }
//             }
//             answer[i] = temp_sum;
//         }
//         return answer;
//     }
// }

//Robot return to Origin
// class Solution {
//     public boolean judgeCircle(String moves) {
//         int x = 0;
//         int y = 0;
//         for(int i = 0; i<moves.length(); i++){
//             if(moves.charAt(i) == 'U'){
//                 y += 1;
//             }
//             else if(moves.charAt(i) == 'D'){
//                 y -= 1;
//             }
//             else if(moves.charAt(i) == 'L'){
//                 x -= 1;
//             }
//             else if(moves.charAt(i) == 'R'){
//                 x += 1;
//             }
//         }
//         if(x==0 && y ==0){
//             return true;
//         } else {
//             return false;
//         }
//     }
// }


// class Solution {
//     public int repeatedNTimes(int[] A) {
//         int current;
//         for(int j = 0; j<A.length; j++){
//             current = A[j];
//             for(int i = j+1; i<A.length; i++){
//                 if(A[i] == current){
//                     return A[i];
//                 }
//             }
//         }
//         return -1;
//     }
// }


//height balance binary tree
// class Solution {
//     public boolean isBalanced(TreeNode root) {
//         if(root == null){
//             return true;
//         }
//         return checkNodeRec(root);
//     }
//
//
//     public boolean checkNodeRec(TreeNode root){
//         if(checkNode(root) == false){
//             return false;
//         }
//         if(root.left == null || root.right == null){
//             if(root.left == null && root.right == null){
//                 return true;
//             } else if(root.left == null){
//                 return checkNodeRec(root.right);
//             } else {
//                 return checkNodeRec(root.left);
//             }
//         }else{
//             return checkNodeRec(root.left) && checkNodeRec(root.right);
//         }
//
//     }
//
//     public boolean checkNode(TreeNode root){
//         System.out.println("current check node: " + root.val);
//         if(root == null){
//             return true;
//         }
//         int left = height(root.left, 1);
//         int right = height(root.right, 1);
//         System.out.println("left:" + left);
//         System.out.println("right:" + right);
//         if(Math.max(left, right) - Math.min(left, right) <= 1){
//             return true;
//         } else {
//             return false;
//         }
//     }
//
//     public int height(TreeNode root, int level){
//         if(root == null){
//            // System.out.println("maxRec: " + (level-1));
//            return level-1;
//         }
//         return Math.max(height(root.left, level+1), height(root.right, level+1));
//
//     }
// }
