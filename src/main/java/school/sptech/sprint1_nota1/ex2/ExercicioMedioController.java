package school.sptech.sprint1_nota1.ex2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioMedioController {

    @GetMapping("/ex-02/{numero}")
    public Boolean exercicioMedio(@PathVariable int numero) {

        if (numero == 1 || (numero % 2 == 0 && numero != 2) || (numero % 3 == 0 && numero != 3) || (numero % 5 == 0 && numero != 5)|| (numero % 7 == 0&& numero != 7)) {
            return false;
        }
        return true;
    }
}
