public class array_2d {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "cherry"};
        String[] vegetables = {"carrot", "spinach", "broccoli"};
        String[] drinks = {"water", "soda", "juice"};

        String[][] groceryList = {fruits, vegetables, drinks};
        
        for(String[] row : groceryList) {
            for(String item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }

        // for(int i = 0; i < groceryList.length; i++) {
        //     for(int j = 0; j < groceryList[i].length; j++) {
        //         System.out.print(groceryList[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        
    }
}