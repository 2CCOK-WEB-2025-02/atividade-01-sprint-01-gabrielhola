package school.sptech.sprint1_nota1.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioFacilController {

    @GetMapping("/ex-01/{palavra}")
    public Boolean exercicioFacil(@PathVariable String palavra) {

        String palavraForm = palavra.toLowerCase();
        Integer posUltimaLetra = palavraForm.length() - 1;
        Integer posPrimeiraLetra = 0;

        while (posUltimaLetra > posPrimeiraLetra) {
            if (palavraForm.charAt(posUltimaLetra) != palavraForm.charAt(posPrimeiraLetra)) {
                return false;
            }
            posUltimaLetra--;
            posPrimeiraLetra++;
        }
        return true;
    }
}
