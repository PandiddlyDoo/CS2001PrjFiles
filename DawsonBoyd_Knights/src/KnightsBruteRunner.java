/**Knights Brute Force Project
 * @author Dawson Boyd
 * @version Spring 2021
 * CSci2001
 */

public class KnightsBruteRunner {
    public static void main(String[] args) {
        /*I had a lot of fun making this version. It's very similar to the basic class but it runs entirely on the Math.random
        on l56 l57 and l69. The variance on this thing is insane.. I've had 4k attempt successes and 3m attempt successes.
        I don't know a ton about efficiency but it takes around 25% CPU and 50% memory on my fairly beefy PC completing in around
        1-5 seconds so try this one at your own risk.
        */
        KnightsBrute  kt = new KnightsBrute((int) (Math.random() * 8) +1, (int) (Math.random() * 8) +1);
    }
}