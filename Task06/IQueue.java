public interface IQueue {
    public void put(DefaultMultiThreadCommand command);
    DefaultMultiThreadCommand take();
}

