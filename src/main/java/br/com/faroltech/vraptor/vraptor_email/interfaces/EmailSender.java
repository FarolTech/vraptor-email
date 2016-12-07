package br.com.faroltech.vraptor.vraptor_email.interfaces;

public interface EmailSender {

	public void sendMail(String fromEmailString, String toEmailString, String replyEmailString, String subjectString, String bodyString, boolean isHtml) throws Exception;
	
}
