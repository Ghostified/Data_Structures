public class RuntimeCalculation {
    public static void main (String[] Args) {

        long start = System.nanoTime();

        /*
         * Program Goes Here
         */

         //Thread.sleep(3000000000000000000);


         long duration = (System.nanoTime() - start)/1000000;
         System.out.println(duration + "ns");
    }
}
