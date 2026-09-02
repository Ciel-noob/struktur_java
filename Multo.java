/**
 * Multo
 */
public class Multo {
    public static final String RESET = "\u001B[0m";
    public static final String CYAN = "\u001B[36m";
    public static final String BLUE = "\u001B[34m";
    public static final String GREEN = "\u001B[32m";
    public static final String WHITE = "\u001B[37m";
    public static void main(String[] args) {

        System.out.println(BLUE + "===================================" + RESET);
System.out.println(
    BLUE + "        " +
    WHITE + "Multo" +
    BLUE + " - Cup of Joe" +
    RESET
);
System.out.println(BLUE + "===================================" + RESET);
        String[] lyrics = {
         GREEN + "Hindi na makalaya",
         GREEN + "dinaladaw mo 'ko bawat gabi",
         GREEN + "Wala mang nakikita",
         GREEN + "haplos mo'y ramdam pa rin sa dilim",
         GREEN + "Hindi na na-nanaginip",
         GREEN + "Hindi na ma-makagising",
         GREEN + "Pasindi na ng ilaw",
         GREEN + "Minumulto na 'ko ng damdamin ko......",
         GREEN + "ng damdamin ko......" + RESET
        };

        int[] delays = { 2100, 2200, 2200, 2200, 2200, 2200, 2200, 2000, 2000 };

        for (int i = 0; i < lyrics.length; i++) {
            printWithAnimation(lyrics[i]);
            try {
                Thread.sleep(delays[i]);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                
         }
        }
        System.out.println("\n----------------------------");
        System.out.println(CYAN + "\"This Story is For That One Reader\"");
        System.out.println(CYAN + "Programmed by: Cìel   ");
        System.out.println(CYAN + "Whenn yahh:((");
    }

    private static void printWithAnimation(String line) {
        for (char ch : line.toCharArray()) {
            System.out.print(ch);
            try {
                Thread.sleep(80); // Adjust the delay for animation speed
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }
}
