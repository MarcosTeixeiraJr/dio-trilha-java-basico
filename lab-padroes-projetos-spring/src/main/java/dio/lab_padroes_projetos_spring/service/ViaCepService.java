package dio.lab_padroes_projetos_spring.service;



import dio.lab_padroes_projetos_spring.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
;


@FeignClient(name = "viacep", url = "http://viacep.com.br/ws")
public interface ViaCepService {

    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
