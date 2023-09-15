import java.util.Scanner;

public class ProblemThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest number in the array: " + largest);
        System.out.println("Smallest number in the array: " + smallest);

    }
}
