package com.sapientia.spring_app.Model;
//Nosso model é aquele objeto que vamos trabalhar

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/*As ditas annotations ARROBA em Java, aqui ela define que essa classe Food será uma entidade
 no meu Banco de Dados */

@Entity //tudo que eu colocar aqui vai virar uma coluna/tabela no meu DB
@Table(name = "food_table") //Aqui define o nome dessa tabela que irei preencher
@Getter //Faz automaticamente o Getter
@Setter // Faz automaticamente o Setter
@NoArgsConstructor //Cria um Construtor vazio, é obrigatório para JPA Data

public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Valor gerado a esse ID - Identity
    //A estratégia é gerá-lo automaticamente, partindo do número 1
    private Long id;

    private String name;
    private LocalDateTime expirationDate;
    private Integer quantity;

}
