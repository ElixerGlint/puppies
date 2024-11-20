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



}
