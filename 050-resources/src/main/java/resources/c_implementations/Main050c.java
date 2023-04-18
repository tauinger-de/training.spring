package resources.c_implementations;

import core.Fmt;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class Main050c {

    public static void main(String[] args) throws IOException {
        Resource fileResource = new FileSystemResource("pom.xml");
        analyseResource(fileResource);

        Resource classpathResource = new ClassPathResource("data/stuff.csv");
        analyseResource(classpathResource);

        Resource urlResource = new UrlResource("https://github.com/tauinger-de/training.spring/blob/main/README.md");
        analyseResource(urlResource);
    }

    private static void analyseResource(Resource r) throws IOException {
        System.out.printf("\nResource '%s'", r.getFilename());
        System.out.printf("  - description = %s", r.getDescription());
        System.out.printf("  - exists = %s", r.exists());
        System.out.printf("  - uri = %s", r.getURI());
        System.out.printf("  - length = %d", r.contentLength());
        System.out.printf("  - last-mod = %s",
                Instant.ofEpochMilli(r.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());
    }

}
