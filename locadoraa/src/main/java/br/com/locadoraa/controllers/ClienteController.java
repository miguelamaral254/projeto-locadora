package br.com.locadoraa.controllers;

import br.com.locadoraa.model.Cliente;
import br.com.locadoraa.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public ResponseEntity<String> create(@RequestBody Cliente cliente) {
        try {
            Cliente savedCliente = clienteService.save(cliente);
            return ResponseEntity.status(HttpStatus.CREATED).body("Cliente criado com sucesso: " + savedCliente.getCpf());
        } catch (DataIntegrityViolationException e) {
            // Retorna um erro 409 (Conflict) quando já existe um cliente com o CPF
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        } catch (Exception e) {
            // Log the error and return a 500 status code
            e.printStackTrace(); // For debugging purposes
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao criar cliente.");
        }
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> findAll() {
        try {
            List<Cliente> clientes = clienteService.findAll();
            return ResponseEntity.ok(clientes);
        } catch (Exception e) {
            // Log the error and return a 500 status code
            e.printStackTrace(); // For debugging purposes
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<Cliente> findById(@PathVariable String cpf) {
        try {
            Optional<Cliente> cliente = clienteService.findById(cpf);
            return cliente.map(ResponseEntity::ok)
                    .orElseGet(() -> ResponseEntity.notFound().build());
        } catch (Exception e) {
            // Log the error and return a 500 status code
            e.printStackTrace(); // For debugging purposes
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping("/{cpf}")
    public ResponseEntity<Void> deleteById(@PathVariable String cpf) {
        try {
            clienteService.deleteById(cpf);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            // Log the error and return a 500 status code
            e.printStackTrace(); // For debugging purposes
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
