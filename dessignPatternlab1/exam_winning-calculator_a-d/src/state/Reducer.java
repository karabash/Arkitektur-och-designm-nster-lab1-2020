
package state;

public interface Reducer<S> {
    public S reduce(State oldState, String action, int value);
}
