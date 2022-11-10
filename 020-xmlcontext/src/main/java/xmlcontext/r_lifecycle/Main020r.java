package xmlcontext.r_lifecycle;

import core.Fmt;
import org.springframework.context.support.GenericXmlApplicationContext;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.SQLException;

public class Main020r {

    public static void main(String[] args) throws IOException, SQLException {
        var context = new GenericXmlApplicationContext(Main020r.class, "context.xml");

        var dataSource = context.getBean(DataSource.class);
        var connection = dataSource.getConnection();
        Fmt.printf(
                "Got database connection to: \"%s\"",
                connection.getMetaData()
        );
        connection.close();

        context.close();
    }

}
