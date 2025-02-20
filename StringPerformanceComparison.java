public class StringPerformanceComparison {
    public static void main(String[] args) {
        int count = 1_000_000;
        long startTime, endTime;

        // StringBuilder Performance
        StringBuilder sb = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < count; i++) {
            sb.append("hello");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) / 1e6 + " ms");

        // StringBuffer Performance
        StringBuffer sbf = new StringBuffer();
        startTime = System.nanoTime();
        for (int i = 0; i < count; i++) {
            sbf.append("hello");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) / 1e6 + " ms");
    }
}
