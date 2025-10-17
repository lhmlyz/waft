public class LeetCode26 {

    void main () {
        int[] arr = {1,2,3,3,4,4,5};
        int uniqueIndex = 0;

        for (int i = 0;  i < arr.length; i++) {
            //0
            //1
            //2
            //3

            if (uniqueIndex == 0 || arr[i] != arr[uniqueIndex - 1]) { //
                arr[uniqueIndex] = arr[i]; // 0 != 1, 2 != 1,  2 != 1, 3 ! =2
                uniqueIndex++; //3
            }
        }

        IO.println(uniqueIndex);
    }

}