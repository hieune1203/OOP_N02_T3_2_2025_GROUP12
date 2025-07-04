public class Leaf{
    public void testLeaf{
        int i = 0;
        Leaf increment(){
            i++;
            return this;
        }
        void print(){
            System.out.println(i);
        }
    }
}