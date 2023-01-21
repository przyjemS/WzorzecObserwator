public class EmailNotificationObserver implements Observer {
    @Override
    public void update(Parcel parcel) {
        String message = String.format("Przesylka o numerze %d wydana do przesylki dnia %s zostala dostarczona na poczte dnia %s" +
                        " do adresata: %s %s " + "\n",
                parcel.getTrackingNumber(), parcel.getSentDate(), parcel.getArrivalDate(), parcel.getOwnerName(), parcel.getOwnerSurname());
        sendEmailNotification(message);
    }

    private void sendEmailNotification(String message) {
        System.out.println("Wyslano email z potwierdzeniem dostarczenia przesylki: " + message);
    }
}
