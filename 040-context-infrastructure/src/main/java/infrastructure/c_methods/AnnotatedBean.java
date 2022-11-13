package infrastructure.c_methods;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("my-name")
@Primary
@Deprecated // just for having one more annotation on this class :) you can use it anyway
public class AnnotatedBean {
}
