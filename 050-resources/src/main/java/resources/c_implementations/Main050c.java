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
        Fmt.printf("\nResource '%s'", r.getFilename());
        Fmt.printf("  - description = %s", r.getDescription());
        Fmt.printf("  - exists = %s", r.exists());
        Fmt.printf("  - uri = %s", r.getURI());
        Fmt.printf("  - length = %d", r.contentLength());
        Fmt.printf("  - last-mod = %s",
                Instant.ofEpochMilli(r.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());
    }

}
