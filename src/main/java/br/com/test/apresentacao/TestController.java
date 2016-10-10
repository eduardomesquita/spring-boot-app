package br.com.test.apresentacao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by basis on 10/10/16.
 */
@RestController
@RequestMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
public class TestController {

    @Value("${teste}")
    private String valor;


    @RequestMapping(value = "teste-propriedade",
                    method = RequestMethod.GET)
    public ResponseEntity<String> retornaPropriedade() {
        return new ResponseEntity(valor, HttpStatus.OK);
    }

}
