public class CasualClothFactory implements ClothFactory{
    @Override
    public Top createTop() {
        return new Tshirt();
    }

    @Override
    public Bottom createBottom() {
        return new Jeans();
    }
}
