import java.util.ArrayList;
public class DominoPile {
    private ArrayList<Domino> pile;

    public DominoPile(){
        pile = new ArrayList <Domino>();
    }

    public ArrayList<Domino> getPile() {
        return pile;
    }

    public void setPile(ArrayList<Domino> pile) {
        this.pile = pile;
    }

    public void newStack6(){
        for (int n = 0; n <= 6; n++){
            for (int j = 0; j <= 6-n; j++){
                pile.add(new Domino (n,n+j));

            }

        }


    }
public void shuffle(){
        for (int i = 0; i < 100; i++){
            int rand1 = (int) (Math.random() * pile.size());
            int rand2 = (int) (Math.random() * pile.size());

            Domino domino = pile.get(rand1);
            Domino domino2 = pile.get(rand2);
            pile.set(rand1,domino2);
            pile.set(rand2,domino);
        }

    }
}

