package Arrays;

public class Frequency {
         public static void main(String[] args) {
                    int[] arr = {-1,-1,0,-1,1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 6, 6, 7, 8, 9, 5, 8, 7, 6, 4};

                    boolean[] counted = new boolean[arr.length]; // Initialize all elements to false

                    for (int i = 0; i < arr.length; i++) {
                        if (counted[i]) {
                            continue; // Skip elements that have been counted
                        }

                        int num = arr[i];
                        int frequency = 1;

                        for (int j = i + 1; j < arr.length; j++) {
                            if (arr[j] == num) {
                                frequency++;
                                counted[j] = true; // Mark the duplicate element as counted
                            }
                        }

                        System.out.println(num + " appears " + frequency + " times");
                    }
                }
            }
