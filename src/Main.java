public class Main {
    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice();
        EmailNotificationObserver emailNotificationObserver = new EmailNotificationObserver();
        SMSNotificationObserver smsNotificationObserver = new SMSNotificationObserver();

        postOffice.attach(emailNotificationObserver);
        postOffice.attach(smsNotificationObserver);

        Parcel parcel1 = new Parcel(123456, "Jakub", "Przyjemski", 2023, 1, 12, 2023, 1, 16);

        Parcel parcel2 = new Parcel(987654, "Brajan", "Szymanski", 2025, 8, 19, 2025, 9, 3 );

        postOffice.parcelDelivered(parcel1);
        postOffice.parcelDelivered(parcel2);
    }
}
