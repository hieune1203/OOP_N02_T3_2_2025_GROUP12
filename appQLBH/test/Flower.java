public class Flower{
    public void testFlower(){
        int petalCount = 0;
        String s = new String;          
        Flower(int petals) {petalCount = petals;}
        Flower(String ss) {s = ss;}
        Flower(String s, int petals){
            this(petals);
            this(s);
            this.s=s;
        }
        Flower(){ this("hi", 47)};}
}