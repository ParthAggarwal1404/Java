class Box{
    double width;
    double height;
    double depth;
    Box(){
        width = 2;
        height = 4;
        depth = 7;
    }
    double volume(){
        return height*width*depth;
    }
}
public class Box1{
    public static void main(String[] args){
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        System.out.println("Vol is : " + myBox1.volume());
        System.out.println("Vol is : " + myBox2.volume());

    }
}