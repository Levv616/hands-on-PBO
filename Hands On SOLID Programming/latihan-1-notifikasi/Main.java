public class Main {
    public static void main(String[] args) {
        new NotificationService(new EmailNotifier()).notify("Halo, ini email test!");
        new NotificationService(new SMSNotifier()).notify("Ini SMS test!");
        new NotificationService(new WhatsAppNotifier()).notify("Ini pesan WhatsApp test!");
        new NotificationService(new TelegramNotifier()).notify("Ini pesan Telegram test!");
    }
}
