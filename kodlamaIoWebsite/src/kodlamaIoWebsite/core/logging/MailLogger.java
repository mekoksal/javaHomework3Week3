package kodlamaIoWebsite.core.logging;

public class MailLogger implements Logger{

	@Override
	public void log() {
		System.out.println("Mail gönderildi: ");		
	}

}
