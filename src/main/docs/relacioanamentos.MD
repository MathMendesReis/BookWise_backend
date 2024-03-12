# Relacioanamentos

```mermaid
 erDiagram
    User ||--o{ Account : has
    User ||--o{ Session : has
    User ||--o{ Rating : gives
    Book ||--o{ Rating : receives
    Book ||--o{ CategoriesOnBooks : categorized_by
    Category ||--o{ CategoriesOnBooks : categorizes
    Account }o--|| User : belongs_to
    Session }o--|| User : belongs_to
    Rating }o--|| User : given_by
    Rating ||--o{ Book : received_by
    CategoriesOnBooks }o--|| Book : categorized
    CategoriesOnBooks }o--|| Category : categorizer
```

## Aqui estão as relações entre as entidades no seu esquema de banco de dados:

- User para Account: Um usuário pode ter várias contas. Isso é representado pela relação accounts no modelo User e pela relação user no modelo Account. Isso é uma relação de um para muitos.

- User para Session: Um usuário pode ter várias sessões. Isso é representado pela relação sessions no modelo User e pela relação user no modelo Session. Isso é uma relação de um para muitos.

- User para Rating: Um usuário pode dar várias avaliações. Isso é representado pela relação ratings no modelo User e pela relação user no modelo Rating. Isso é uma relação de um para muitos.

- Book para Rating: Um livro pode receber várias avaliações. Isso é representado pela relação ratings no modelo Book e pela relação book no modelo Rating. Isso é uma relação de um para muitos.

- Book para CategoriesOnBooks: Um livro pode ser categorizado em várias categorias. Isso é representado pela relação categories no modelo Book e pela relação book no modelo CategoriesOnBooks. Isso é uma relação de um para muitos.

- Category para CategoriesOnBooks: Uma categoria pode ser aplicada a vários livros. Isso é representado pela relação books no modelo Category e pela relação category no modelo CategoriesOnBooks. Isso é uma relação de um para muitos.

- CategoriesOnBooks é uma tabela de junção que estabelece uma relação muitos para muitos entre Book e Category. Cada registro em CategoriesOnBooks representa a associação de um livro a uma categoria.


### Legenda

- has - "tem": Indica que uma instância de uma classe possui uma ou mais instâncias de outra classe. Por exemplo, um User tem várias Account.
- belongs to - "pertence a": Indica que uma instância de uma classe pertence a uma instância de outra classe. Por exemplo, uma Account pertence a um User.
- gives - "dá": Usado para indicar que uma instância de uma classe fornece algo para outra classe. Por exemplo, um User dá Rating.
- receives - "recebe": Usado para indicar que uma instância de uma classe recebe algo de outra classe. Por exemplo, um Book recebe Rating.
- categorized_by - "categorizado por": Indica que uma instância de uma classe é categorizada por outra classe. Por exemplo, um Book é categorizado por CategoriesOnBooks.
- categorizes - "categoriza": Indica que uma instância de uma classe categoriza outra classe. Por exemplo, uma Category categoriza CategoriesOnBooks.
categorized 


