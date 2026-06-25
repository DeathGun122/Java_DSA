public class varargs {
    public static void main(String[] args) {
        System.out.println(add(1, 2, 3, 4, 5));
        System.out.println(add(1, 2, 3));
        System.out.println(add(1, 2));
    }
    static int add(int... nums){
        int sum = 0;
        for(int num : nums){
            sum += nums[num];
        }
        return sum;
    }
}