import java.time.LocalDate;

public class Parcel {
    private int trackingNumber;
    private String ownerName;
    private String ownerSurname;
    private LocalDate sentDate;
    private LocalDate arrivalDate;

    public Parcel(int trackingNumber, String ownerName, String ownerSurname, int sentDateYear, int sentDateMonth,
                  int sentDateDay, int arrivalDateYear, int arrivalDateMonth, int arrivalDateDay) {
        this.trackingNumber = trackingNumber;
        this.ownerName = ownerName;
        this.ownerSurname = ownerSurname;
        this.sentDate = LocalDate.of(sentDateYear, sentDateMonth, sentDateDay);
        this.arrivalDate = LocalDate.of(arrivalDateYear, arrivalDateMonth, arrivalDateDay);
    }

    public int getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(int trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerSurname() {
        return ownerSurname;
    }

    public void setOwnerSurname(String ownerSurname) {
        this.ownerSurname = ownerSurname;
    }

    public LocalDate getSentDate() {
        return sentDate;
    }

    public void setSentDate(LocalDate sentDate) {
        this.sentDate = sentDate;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "trackingNumber=" + trackingNumber +
                ", ownerName='" + ownerName + '\'' +
                ", ownerSurename='" + ownerSurname + '\'' +
                ", sentDate=" + sentDate +
                ", arrivalDate=" + arrivalDate +
                '}';
    }
}
