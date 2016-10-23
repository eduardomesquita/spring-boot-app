package br.com.test.service;

import br.com.test.entidades.Cliente;
import br.com.test.repositorio.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> pesquisa(){
        return clienteRepository.findAll();
    }

    public Cliente inserir(){
        List<Cliente> clientes = pesquisa();

        Cliente cliente = new Cliente();
        cliente.setId(Long.valueOf(clientes.size() + 1));
        cliente.setNome("Teste " + (clientes.size() + 1));
        cliente.setCpf("1234567890");

        return clienteRepository.save(cliente);
    }

}
