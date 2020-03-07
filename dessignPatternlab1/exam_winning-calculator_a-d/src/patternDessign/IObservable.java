package patternDessign;

public interface IObservable {
   public abstract void register(IObserver observer);
   public abstract void notifyObserver();
}
