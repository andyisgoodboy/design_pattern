package observerpattern;

/**
 * Created by andy on 18/5/17.
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();

}
