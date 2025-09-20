public class FormalClothFactory implements ClothFactory{
    @Override
    public Top createTop() {
        return new Shirt();
    }

    @Override
    public Bottom createBottom() {
        return new Trousers();
    }
}
