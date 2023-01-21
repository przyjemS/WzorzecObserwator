import java.util.ArrayList;
import java.util.List;

public class PostOffice implements Subject {
    private List<Observer> observers;
    private Parcel parcel;

    public PostOffice() {
        observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(parcel));
    }

    public void parcelDelivered(Parcel parcel) {
        this.parcel = parcel;
        notifyObservers();
    }
}
