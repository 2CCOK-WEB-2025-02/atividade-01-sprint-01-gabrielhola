package school.sptech.sprint1_nota1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioDificilController {

    @GetMapping("/ex-03/{n}")
    public ExercicioDificilResponse exercicioDificil(@PathVariable int n) {



        int ultimoNum = 1;
        int penultimoNum = 0;
        int proximoNum = 0;
        int soma = 1;

        if(n <= 0) {
            soma = 0;
            ultimoNum = 0;
        } else {
        for (int i = 1; i < n; i++) {

            proximoNum = ultimoNum + penultimoNum;
            penultimoNum = ultimoNum;
            ultimoNum = proximoNum;

            soma += ultimoNum;
        }}

        ExercicioDificilResponse resposta = new ExercicioDificilResponse(ultimoNum, soma);
        return resposta;
    }
}
