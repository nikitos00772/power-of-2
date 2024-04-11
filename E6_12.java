public class ex4_1 {
    public static void main(String[] args) {
        int total = 1;
        while(total < 220) {
            total = total * 2;
            if(total > 20 && total < 220)
                System.out.println(total);
        }
    }
}
