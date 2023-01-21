public class SMSNotificationObserver implements Observer {

    @Override
    public void update(Parcel parcel) {
        String message = String.format("Przesylka o numerze %d wydana do przesylki dnia %s zostala dostarczona na poczte dnia %s" +
                        " do adresata: %s %s " + "\n",
                parcel.getTrackingNumber(), parcel.getSentDate(), parcel.getArrivalDate(), parcel.getOwnerName(), parcel.getOwnerSurname());
        sendSMSNotification(message);
    }
    private void sendSMSNotification(String message) {
        System.out.println("Wyslano SMS z potwierdzeniem dostarczenia przesylki: " + message + "\n");
    }
}
