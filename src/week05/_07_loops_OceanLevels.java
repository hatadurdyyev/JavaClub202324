package week05;

public class _07_loops_OceanLevels {
    public static void main(String[] args) {
        int year = 25;
        float oceanLevel = 1.5F;
        float sum = 0;
        for (int i = 0; i < year; i++) {
            sum += oceanLevel;
            System.out.println("Year #" + (i+1) + " ocean level has risen by " + sum);
        }

    }
}
