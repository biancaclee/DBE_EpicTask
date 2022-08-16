package br.com.fiap.epictaskapi.service;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.fiap.epictaskapi.model.Task;

//A Service tem a mesma ideia da BO no Java -> É uma camada onde vamos colocar as regras de negócios.
@Service
public class TaskService {

    public List<Task> listAll(){
        //Mock (vamos usar os dados fixos/ mockados no código fonte, não vamos acessar o banco de dados por enquanto)
        return List.of( //Retornando uma lista de tarefas
            new Task("Modelar o banco BD", "Modelar o banco SQL"), //Cada task é um model, que foi modelado
            new Task("Prototipo", "Prototipo das telas")
        );
    }
    
}
