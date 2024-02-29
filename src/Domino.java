public class Domino {
    private int top;

    private int bottom;

    public Domino(int top, int bottom){
        this.top = top;
        this.bottom = bottom;
    }
    public Domino(){
        this(0,0);

    }
    public void setTop (int top){
        this.top = top;

    }
    public void setBottom (int bottom){
        this.bottom = bottom;
    }

    public int getTop (){
        return top;
    }
    public int getBottom(){
        return bottom;
    }
   @Override
    public String toString(){
        return (top + "/" + bottom);
    }
    public void flip(){
        int temp = this.top;
        this.top = bottom;
        this.bottom = temp;
    }
    public void settle(){
        if (bottom < top){
            flip();
        }

    }
    public int compareTo(Domino other){
        settle();
        other.settle();
        if (top < other.top){
            return -1;
        }
        else if (top > other.top){
            return 1;
        }
        else if (top == other.top){
            if (bottom < other.bottom){
                return -1;
            }
            else if (bottom > other.bottom){
                return 1;
            }
            else if (bottom == other.bottom){
                return 0;
            }
        }
        return 0;
    }
    public int compareToWeight(Domino other){
        if (top + bottom < other.top + other.bottom){
            return -1;
        }
        if (top + bottom > other.top + other.bottom){
            return 1;
        }
        return 0;
    }
    public boolean canConnect(Domino other){
        if (this.top == other.top || this.top == other.bottom || this.bottom == other.top || this.bottom == other.bottom){
            return true;
        }
        return false;
    }



}
