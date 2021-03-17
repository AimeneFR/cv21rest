package model;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

public class TestCV {
	public String loadFileXML() throws IOException {
		Resource resource = new DefaultResourceLoader().getResource("classpath:xml/smallCV.xml");
        String content = new String(Files.readAllBytes(resource.getFile().toPath()));
        return content;
	}
}
