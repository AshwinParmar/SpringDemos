package hello;

import java.util.concurrent.atomic.AtomicLong;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World", required=true) String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
	
	@RequestMapping("/mysystem")
    public Object mySystem() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ashwin");
		list.add("Umang");
		list.add("Kishan");
        return list;
    }
}