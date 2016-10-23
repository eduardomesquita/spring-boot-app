package br.com.test.apresentacao;

import br.com.test.entidades.Cliente;
import br.com.test.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/cliente", produces = MediaType.APPLICATION_JSON_VALUE)
public class ClienteController {

    @Value("${teste}")
    private String valor;

    @Autowired
    private ClienteService clienteService;

    @RequestMapping(value = "consulta-propriedade",
                    method = RequestMethod.GET)
    public ResponseEntity<String> consultaPropriedade() {
        return new ResponseEntity(valor, HttpStatus.OK);
    }


    @RequestMapping(value = "pesquisa",
            method = RequestMethod.GET)
    public ResponseEntity<List<Cliente>> pesquisa() {
        List<Cliente> clientes = clienteService.pesquisa();
        return new ResponseEntity(clientes, HttpStatus.OK);
    }

    @RequestMapping(value = "adicionar",
            method = RequestMethod.GET)
    public ResponseEntity<Cliente> adicionar() {
        Cliente cliente = clienteService.inserir();
        return new ResponseEntity(cliente, HttpStatus.OK);
    }


}