package br.com.fiap.epictaskapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.epictaskapi.model.Task;
import br.com.fiap.epictaskapi.service.TaskService;

@RestController //Esse import faz com que, quando a aplicação subir, já saiba que tem um controlador.
public class TaskController {

    @Autowired
    private TaskService service;

    @GetMapping("/api/task") //Recebendo a requisição (usa o verbo Get) para o endpoint indicado nas aspas. Essa requisição vai retornar a lista de todas as tarefas.
    public List<Task> index(){ //Quando a requisição cai, executa esse método index
        return service.listAll(); //Essa lista de todas as tarefas vem do service, que é chamado quando o método é executado.
    }
    
}
