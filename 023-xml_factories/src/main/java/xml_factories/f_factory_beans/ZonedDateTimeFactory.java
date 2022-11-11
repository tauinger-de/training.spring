package xml_factories.f_factory_beans;

import org.springframework.beans.factory.FactoryBean;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeFactory implements FactoryBean<ZonedDateTime> {

    private final ZoneId zone;

    public ZonedDateTimeFactory(String zoneId) {
        this.zone = ZoneId.of(zoneId);
    }

    @Override
    public ZonedDateTime getObject() throws Exception {
        return ZonedDateTime.now(this.zone);
    }

    @Override
    public Class<?> getObjectType() {
        return ZonedDateTime.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
