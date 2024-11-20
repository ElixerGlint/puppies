import java.util.Arrays;

public class PetShop {
    private Puppy[] puppies;

    public PetShop() {
        puppies = new Puppy[10]; //10 crates
        for(int i = 0; i<puppies.length; i++) {
            if(Math.random()*2 < 0.5) {
                puppies[i] = new Puppy("Puppy" + (int)(Math.random()*20));
            }
        }
    }

    @Override
    public String toString() {
        String output = "";
        for(Puppy p:puppies) {
            if(p!=null) {
                output+=p + "\n";
            }
        }
        return output;
    }

    


}
