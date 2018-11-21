package ftt.ec.FTTSpringBootService;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	// http://localhost:8080/
	// http://localhost:8080/person?name=Scott+Tiger
	
	private static final String template = "Hello, %s!";
	private final AtomicInteger counter = new AtomicInteger(); //Contador
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	String getRoot() {
		return new java.util.Date() + " Hello FTT!!";
	}

	@RequestMapping(value="/random", method=RequestMethod.GET)
	String getRandomInteger() {
		return String.valueOf(new Random().nextInt());
	}
	
	@RequestMapping(value="/add/{a}/{b}", method=RequestMethod.GET)
	public String getAdd(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
	    return String.valueOf( a + b );
	}
	
	@GetMapping("/person")
    @ResponseBody
    public Person getPerson(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
        return new Person(counter.incrementAndGet(), String.format(template, name));
    }
}
