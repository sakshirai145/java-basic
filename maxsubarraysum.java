// public class maxsubarraysum {
//     public static void getmaxsubarraysum(int num[]){
//         int currentsum = 0;
//         int maxsum = Integer.MIN_VALUE;
//         for(int i =0; i<num.length;i++){
//             int start = i;
//             for(int j=i;j<num.length;j++){
//                 int end = j;
//                 currentsum = 0;
//                 for(int k=start;k<=end;k++){
//                     currentsum+=num[k];
//                 }
//                 System.out.println(currentsum);
//                 if(maxsum<currentsum){
//                     maxsum = currentsum;
//                 };
//             }
//         }
//         System.out.println("Max subarray sum: " + maxsum);
//     }
//     public static void main(String[] args) {
//         int num[]={4,6,7,8,9};
//         getmaxsubarraysum(num);
//     }
// }
  


// public class maxsubarraysum{
//    public static void getmaxsubarraysum(int num[]){
//         int currentsum = 0;
//         int maxsum = Integer.MIN_VALUE;
//         int prefixsum[]= new int[num.length];
//         prefixsum[0]=num[0];
//         for(int i=1;i<prefixsum.length;i++){
//             prefixsum[i]=prefixsum[i-1]+num[i];
//         }
//         for(int i =0; i<num.length;i++){
//             int start =i;
//             for(int j=i;j<num.length;j++){
//                 int end = j;
//                 currentsum = i==0 ? prefixsum[end] : prefixsum[end]-prefixsum[i-1];
//                 System.out.println(currentsum);
//                 if(maxsum<currentsum){
//                     maxsum = currentsum;
//                 };
//             }
//         }
//         System.out.println("Max subarray sum: " + maxsum);
//     }
//     public static void main(String[] args) {
//         int num[]={4,6,7,8,9};
//         getmaxsubarraysum(num);
// }
// }




// public class maxsubarraysum {
//     public static void kadanessubarraysum(int num[]){
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;
//         for(int i=0; i<num.length; i++){
//             cs = cs + num[i];
//             if(cs<0){
//                 cs=0;
//             }
//             ms=Math.max(cs,ms);
//         }
//         System.out.println("Maximum Subarray Sum is: " + ms);
//     }
//     public static void main(String[] args) {
//         int num[]={-2,1,-3,4,-1,2,1,-5,4};
//         kadanessubarraysum(num);
//     }
// }