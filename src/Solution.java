public class Solution {

    public int[] twoSum(int[] numbers, int target) {
        /*use 2 pointers one at start and end and loop through and increment p1 if result is less than target and decrement p2 if less than target*/
        Arrays.sort(numbers);
        int p1 = 0;
        int p2 = numbers.length-1;
        int[] answer = new int[2]; // store indexes here

        while(p1 < p2){
            if(numbers[p1] + numbers[p2]== target){
                answer[0] = p1+1; // have to adjust for 0 indexing of array in java
                answer[1] = p2 +1;
                return answer;
            }
            else if (numbers[p1] + numbers[p2]> target){
                p2--;
            }

            else if (numbers[p1] + numbers[p2]< target){
                p1++;
            }

        }

        return answer;
    }
}
