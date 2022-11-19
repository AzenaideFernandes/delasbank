package delasbank.controller;

import delasbank.model.Cliente;
import delasbank.model.Conta;
import delasbank.model.Transferencia;
import delasbank.service.TransferenciaService;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/transferencia")
public class TransferenciaController {

    @Autowired
    private TransferenciaService ts;


   @GetMapping("/extrato/{id}")
//    public ResponseEntity<Cliente> listarTransferencias(@PathVariable Long id) {
//
//       Optional<Cliente> op = ts.listarTransferencias(id);
//
//        if (op.isPresent()) {
//            return ResponseEntity.ok(op.get()); // ajeitar GET
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//
//    }

    @PostMapping("/transferir")
    public ResponseEntity<Transferencia> realizarTransferencia(@RequestBody Transferencia transferencia) {

       return ResponseEntity.ok(ts.realizarTransferencia(transferencia));
    }


}
