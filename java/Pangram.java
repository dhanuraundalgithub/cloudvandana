public class Pangram {
    
        public static void main(String[] args) {
            String input = "The quick brown fox jumps over the lazy dog";
            boolean isPangram = isPangram(input);
            
            System.out.println("The input is " + (isPangram ? "a" : "not a") + " pangram.");
        }
    
        public static boolean isPangram(String str) {
            str = str.toLowerCase();
            for (char c = 'a'; c <= 'z'; c++) {
                if (str.indexOf(c) == -1) {
                    return false;
                }
            }
            return true;
        }
    }
    

