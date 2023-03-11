package spring.firstPrgm.springBootPrgm;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "website")
@Component
public class Website {
    private String link;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public String getName() {
        return name;
    }
}
