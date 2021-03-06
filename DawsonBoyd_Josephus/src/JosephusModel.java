public class JosephusModel {

    public void Josephus(int start, int skip, int people) {

        boolean[] circle=new boolean[people];
        int kill=skip;

        for(int i=0; i<circle.length; i++){
            circle[i]=true;
        }

        int current=start;

        for(int i=0; i<circle.length;){
            //skipping over dead people
            while(kill>0){
                if (circle[current]==false){
                    current++;
                }else if(circle[current]==true){
                    kill++;
                    current++;
                }
            }
            circle[i]=false;
            kill=skip;
        }

    }

}