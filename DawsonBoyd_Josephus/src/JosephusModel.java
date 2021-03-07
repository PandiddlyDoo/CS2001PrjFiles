import java.util.Arrays;

public class JosephusModel {

    JosephusView frame = new JosephusView();
    JosephusController c = new JosephusController(frame, this);

    public void Josephus(int start, int skip, int people) {

        //creating our array
        boolean[] circle = new boolean[people];
        //filling our array with all true
        Arrays.fill(circle, true);
//debug
//        System.out.println(start);
//        System.out.println(skip);
//        System.out.println(people);
        int current = start;
        int kill = skip;
        int remaining = people;

        //copy paste loop through once so it actually starts at start and I can loop multiple times starting at 0
        for(int i=0; i<circle.length-start; i++) {
            if (kill > 1) {
                //skipping over dead people
                if (!circle[current]) {
                    current++;
                    //counting alive person
                } else if (circle[current]) {
                    kill--;
                    current++;
                }
                //Killing when kill counter reaches 0
            } else if (kill == 1 && circle[current]) {
                circle[current] = false;
                kill = skip;
                remaining--;
                c.deathMessage(current);
                current++;
            } else{
                current++;
            }
        }

        //While more than 1 survivor
        while (remaining > 1) {
            //setting index to 0 to loop through again I believe this is where my problem is since it appears to only loop through once.

            //Iterates through entire array once
            for(int i=0; i<=circle.length; i++){

                if (current==circle.length){
                    current=0;
                }

                if (kill > 1) {
                        //skipping over dead people
                    if (!circle[current]) {
                        current++;
                        System.out.println("skip:"+current+" "+remaining+"remaining");
                        //counting alive person and counting down until kill
                    } else if (circle[current]) {
                        kill--;
                        current++;
                        System.out.println("count:"+current+" "+remaining+"remaining");
                    }
                    //Killing when kill counter finishes
                } else if (kill == 1 && circle[current]) {
                    circle[current] = false;
                    kill = skip;
                    c.deathMessage(current);
                    current++;
                    remaining--;
                    System.out.println("kill:"+current+" "+remaining+"remaining");

                    //This is here in case you  end up with kill == 1 and cant find an alive person
                } else if(kill==1 && !circle[current]){
                    current++;
                }
            }
        }
    }

}