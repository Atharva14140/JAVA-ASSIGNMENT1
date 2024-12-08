public class DuplicateElements {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 4, 6, 5, 5, 8, 9, 7};
        findDuplicates(array);
    }

    public static void findDuplicates(int[] array) {
        boolean[] visited = new boolean[array.length];

        System.out.println("Duplicate elements and their frequencies:");

        for (int i = 0; i < array.length; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1; 
		for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    visited[j] = true;                 }
            }

            if (count > 1) {
                System.out.println("Element: " + array[i] + ", Frequency: " + count);
            }
        }
    }
}
