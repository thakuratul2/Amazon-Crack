public class integer_to_english {
    
    // This problem involves simplifying the process by dividing the integer into smaller parts and using recursion to convert those parts into English words. Here are the steps:
    // Define arrays or lists to hold the English words for numbers up to 19, numbers in tens (20, 30, 40, ...), and thousands (thousand, million, billion).
    // Create a recursive function that takes an integer as input and returns its English word representation.
    // In the recursive function:
    // Check if the input integer is zero. If it is, return an empty string.
    // If the integer is less than 20, return the corresponding word from the ones array.
    // If the integer is less than 100, return the corresponding word from the tens array, followed by the word representation of the ones' digit (recursively).
    // If the integer is greater than or equal to 100, return the word representation of the hundreds' digit, followed by "Hundred," and then the word representation of the remaining part (recursively).
    // In the main function, divide the input integer into groups of three digits (e.g., "123456789" becomes [123, 456, 789]).
    // Construct the English word representation for each group using the recursive function.
    // Append the appropriate "thousand," "million," or "billion" word based on the group's position (i.e., ones, thousands, millions, billions).
    // Join the group representations into a final result.    
    
    private final String[] belowTwenty = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        private final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    
        public String numberToWords(int num) {
            if (num == 0) {
                return "Zero";
            }
            return helper(num);
        }
    
        private String helper(int num) {
            StringBuilder result = new StringBuilder();
            if (num < 20) {
                result.append(belowTwenty[num]);
            } else if (num < 100) {
                result.append(tens[num / 10]).append(" ").append(belowTwenty[num % 10]);
            } else if (num < 1000) {
                result.append(helper(num / 100)).append(" Hundred ").append(helper(num % 100));
            } else if (num < 1000000) {
                result.append(helper(num / 1000)).append(" Thousand ").append(helper(num % 1000));
            } else if (num < 1000000000) {
                result.append(helper(num / 1000000)).append(" Million ").append(helper(num % 1000000));
            } else {
                result.append(helper(num / 1000000000)).append(" Billion ").append(helper(num % 1000000000));
            }
            return result.toString().trim();
        }
    }