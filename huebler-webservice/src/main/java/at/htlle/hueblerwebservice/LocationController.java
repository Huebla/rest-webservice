package at.htlle.hueblerwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

public class LocationController {

	@PostConstruct
	public void init() {
		
	}
	
	@GetMapping("/location")
	public Location location(@RequestParam(value = "name", defaultValue = "Leoben") String name) {
		return null;
	}
}
