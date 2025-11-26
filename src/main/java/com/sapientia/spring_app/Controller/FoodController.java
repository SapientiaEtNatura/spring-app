package com.sapientia.spring_app.Controller;
//São os pontos de entrada das rotas, define as rotas das requisições
import com.sapientia.spring_app.Model.Food;
import com.sapientia.spring_app.Service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//A annotation RestController indica ao Spring que esse package é um controller, vai fazer as rotas
@RestController
@RequestMapping("/food") //Usado para mapear as rotas dos nossos controllers
public class FoodController {

    //Injeção de Dependência, agora o controller sabe que o Service existe
    private final FoodService foodService;
    //É necessário um construtor para inicializar o nosso Service
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }
@GetMapping
    public List<Food> getAll(){return foodService.getAll();}

@PostMapping
//Ao fazer o méttodo post, nossa função create pega do corpo do nosso modelo (os atributos) e define como parâmetro
    public Food create(@RequestBody Food food){
        return foodService.save(food);
}

} //O controller pega do Service, traz sua função getAll que criamos
