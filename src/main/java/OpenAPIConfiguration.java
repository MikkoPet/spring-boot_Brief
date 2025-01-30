import com.scoretable.restapi.models.Match;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenAPIConfiguration {
    public OpenAPI defineOpenApi() {
        Server server = new Server();
        server.setUrl("http://localhost:8080");
        server.setDescription("Development");

        Contact myContact = new Contact();
        myContact.setName("ex");
        myContact.setEmail("mymail@mail.mail");

        Info information = new Info()
                .title("Match scores API")
                .version("0.1")
                .description("This API manages matches in sports events and tracks their scores")
                .contact(myContact);

        return new OpenAPI().info(information).servers(List.of(server));
    }
}
