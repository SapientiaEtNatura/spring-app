package com.sapientia.spring_app.Service;

import com.sapientia.spring_app.Model.Food;
import com.sapientia.spring_app.Repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/*O Service é aquele que dita quais funções serão executadas, faz as regras de negócios
* O Controller puxa as regras do Service */

@Service //Devemos sempre usar as Annotations para definir o que cada coisa faz

public class FoodService {


//Mesma logica do controller, injeção de Dependência
    private final FoodRepository foodRepository;
//Ou construtor ou Autowire, obrigatório
    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }
//LISTAR
    public List<Food> getAll(){
    return foodRepository.findAll();
    } //Aqui usamos a função findAll do JPA para listar do nosso Repository

//CRIAR
    public Food save(Food food){return foodRepository.save(food);}  //É onde vai salvar nosso elemento no DB
    //Dentro dos argumentos de Save, ele requer uma Entidade, sendo essa food.

//DELETAR
    public void delete(Long id){
        foodRepository.deleteById(id);
    } //Ele faz a função para que é feito Deletar por ID onde repassas o ID na sua sobrecarga




}

