public class Ecommerce {
    public static void main(String[] args) {
        ClothFactory casualFactory = new CasualClothFactory();
        Top casualTop = casualFactory.createTop();
        Bottom casualBottom = casualFactory.createBottom();
        casualTop.displayInfo();
        casualBottom.displayInfo();

        ClothFactory formalFactory = new FormalClothFactory();
        Top formalTop = formalFactory.createTop();
        Bottom formalBottom = formalFactory.createBottom();
        formalTop.displayInfo();
        formalBottom.displayInfo();
    }
}