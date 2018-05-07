package br.com.s2it.spring.boot.service.impl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.net.ssl.HttpsURLConnection;

import br.com.s2it.spring.boot.service.PagseguroFaqService;

public class PagseguroFaqServiceImpl implements PagseguroFaqService {
	
	private static final String SEARCH_PATH = "/buscar?q=%s";
	
	public String url;
	
	public PagseguroFaqServiceImpl(String url) {
		this.url = url;
	}

	@Override
	public String search(String query) {
		try {
			String searchUrl = url + String.format(SEARCH_PATH, query);
			HttpsURLConnection connection = (HttpsURLConnection) new URL(searchUrl).openConnection();
			connection.setRequestProperty("Accept", "utf-8");
			connection.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
			InputStream inputStream = connection.getInputStream();
//			byte[] readAllBytes = inputStream.readAllBytes();
			byte[] readAllBytes = null;
			openBrowser(readAllBytes);
			return new String(readAllBytes, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	private void openBrowser(byte[] readAllBytes) throws IOException {
		Path path = new File("faqSearch.html").toPath();
		Files.write(path, readAllBytes);
//		Process p = new ProcessBuilder("firefox", "faqSearch.html").start();
//		System.out.println("processId=" + p.pid());
		Files.delete(path);
	}

}
