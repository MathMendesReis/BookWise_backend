# lee
```mermaid
classDiagram
    class User {
        +String id
        String name
        String avatar_url
        DateTime created_at
        String email
        DateTime emailVerified
        Account[] accounts
        Session[] sessions
        Rating[] ratings
    }
    class Account {
        +String id
        String user_id
        String type
        String provider
        String provider_account_id
        String refresh_token
        String access_token
        Int expires_at
        String token_type
        String scope
        String id_token
        String session_state
        User user
    }
    class Session {
        +String id
        String session_token
        String user_id
        DateTime expires
        User user
    }
    class Rating {
        +String id
        Int rate
        String description
        DateTime created_at
        String book_id
        String user_id
        Book book
        User user
    }
    class Book {
        +String id
        String name
        String author
        String summary
        String cover_url
        Int total_pages
        DateTime created_at
        CategoriesOnBooks[] categories
        Rating[] ratings
    }
    class Category {
        +String id
        String name
        CategoriesOnBooks[] books
    }
    class CategoriesOnBooks {
        String book_id
        String categoryId
        Book book
        Category category
    }
    User "1" -- "*" Account : has
    User "1" -- "*" Session : has
    User "1" -- "*" Rating : gives
    Book "1" -- "*" Rating : receives
    Book "1" -- "*" CategoriesOnBooks : categorized_by
    Category "1" -- "*" CategoriesOnBooks : categorizes
    Account -- User : belongs_to
    Session -- User : belongs_to
    Rating -- User : given_by
    Rating -- Book : received_by
    CategoriesOnBooks -- Book : categorized
    CategoriesOnBooks -- Category : categorizer+
```

### Legendas

- has - "tem": Indica que uma instância de uma classe possui uma ou mais instâncias de outra classe. Por exemplo, um User tem várias Account.
- belongs to - "pertence a": Indica que uma instância de uma classe pertence a uma instância de outra classe. Por exemplo, uma Account pertence a um User.
- gives - "dá": Usado para indicar que uma instância de uma classe fornece algo para outra classe. Por exemplo, um User dá Rating.
- receives - "recebe": Usado para indicar que uma instância de uma classe recebe algo de outra classe. Por exemplo, um Book recebe Rating.
- categorized_by - "categorizado por": Indica que uma instância de uma classe é categorizada por outra classe. Por exemplo, um Book é categorizado por CategoriesOnBooks.
- categorizes - "categoriza": Indica que uma instância de uma classe categoriza outra classe. Por exemplo, uma Category categoriza CategoriesOnBooks.
categorized 

    