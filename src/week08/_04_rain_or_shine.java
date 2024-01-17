package week08;

public class _04_rain_or_shine {
    public static void main(String[] args) {
        char rainShine[][] = {
                {'S','R','C','S','R','C','S','R','C','C','S','R','C','S','R','C','S','R','C','C','S','R','C','S','R','C','S','R','C','C'},
                {'S','R','S','S','R','C','S','R','C','S','S','R','C','S','R','C','S','R','C','S','S','R','C','S','R','C','S','S','C','S'},
                {'S','R','R','S','R','C','R','R','C','S','S','R','C','S','R','C','R','R','C','C','S','R','R','S','R','C','S','R','C','R'}
        };
        String months[] = {"June", "July", "August"};
        int s = 0, c = 0, r = 0, ts = 0, tc = 0, tr = 0;
        for (int i = 0; i < 3; i++) {
            s = 0;
            c = 0;
            r = 0;
            for (int j = 0; j < 30; j++) {
                if (rainShine[i][j] == 'S'){
                    s++;
                } else if (rainShine[i][j] == 'C') {
                    c++;
                }else {
                    r++;
                }
            }
            ts += s;
            tc += c;
            tr += r;
            System.out.println(months[i] + " sunny days: " + s);
            System.out.println(months[i] + " cloudy days: " + c);
            System.out.println(months[i] + " rainy days: " + r);
            System.out.println();
        }

        System.out.println("Three month sunny days: " + ts);
        System.out.println("Three month cloudy days: " + tc);
        System.out.println("Three month rainy days: " + tr);

    }
}
