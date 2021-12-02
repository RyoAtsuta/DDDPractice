# DDDPractice
## Purpose
I created this repository to learn how to implement a program using DDD.

Note: Since I am not a professional Java programer, I might make some mistake because I don't fully understand the naming convention and Design Philosophy yet. 
The reason why I chose Java to implement it was because I also wanted to learn Java as well as DDD! ;)

## Directory Tree
```
$ tree
.
├── Main.java
├── Makefile
├── app
│   ├── application
│   │   └── user
│   │       ├── ChangeUserDetailCommand.java
│   │       ├── CreateUserCommand.java
│   │       ├── DeleteUserCommand.java
│   │       ├── GetAllUsersCommand.java
│   │       ├── GetUserCommand.java
│   │       ├── UserApplicationService.java
│   │       ├── UserCollection.java
│   │       └── UserData.java
│   ├── console
│   │   └── Console.java
│   ├── domain
│   │   └── model
│   │       └── user
│   │           ├── IUserFactory.java
│   │           ├── IUserRepository.java
│   │           ├── User.java
│   │           ├── UserFullSpecification.java
│   │           └── UserService.java
│   ├── exception
│   │   └── user
│   │       ├── CanNotCreateUserException.java
│   │       ├── CanNotUpdateUserException.java
│   │       └── UserNotFoundException.java
│   ├── in_memory
│   │   └── user
│   │       ├── InMemoryUserFactory.java
│   │       └── InMemoryUserRepository.java
│   └── mysql
│       └── user
│           ├── MySQLUserFactory.java
│           └── MySQLUserRepository.java
└── sources.txt
```

# How to Run
```
$ make run

=================== start ==========================
--------
ID: 1
Name: Igarashi Yuki
--------
ID: 2
Name: Nakamura Ryota
--------
ID: 3
Name: Shibata Emi
=================== end ==========================
--------
ID: 1
Name: Igarashi Yuki
--------
ID: 1
Name: Kobayashi Yuki
=================== start ==========================
--------
ID: 2
Name: Nakamura Ryota
--------
ID: 3
Name: Shibata Emi
=================== end ==========================
ERROR: Name 'Kimura Saburou' can not be created
```

