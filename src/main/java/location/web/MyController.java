package location.web;

import java.util.ArrayList;

import location.domain.Voiture;







import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
		
	ArrayList<Voiture> voitures = new ArrayList<Voiture>();
	
	public MyController(){
		Voiture v1 = new Voiture("11AA22", 5);
		voitures.add(v1);
		
		Voiture v2 = new Voiture("33BB44", 3);
		voitures.add(v2);
		
	}
	
	@RequestMapping(value = "/voitures", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	ArrayList<Voiture> listeVoitures(){
		return voitures;
	}

}
