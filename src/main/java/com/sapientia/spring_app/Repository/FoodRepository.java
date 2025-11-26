package com.sapientia.spring_app.Repository;
//Repository é a camada de Persistência dos dados, ele quem vai se conectar ao banco de dados

import com.sapientia.spring_app.Model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
//A conexão ao DB é feito por meio da interface que herda de JPA repository
//Onde JPA possui nossas operações básicas do CRUD

//O JpaRepository leva 2 argumentos, o nosso modelo e o nosso identificador(id), que no caso é o seu tipo, INTEGER
public interface FoodRepository extends JpaRepository<Food, Long> {


}
