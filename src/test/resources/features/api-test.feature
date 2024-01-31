# encoding: UTF-8
# language: ru

@test_api_1

Функционал: Пример сценария для API (petstore.swagger.io)
  Сценарий: Создание и поиск пользователя

    Когда создать пользователя с парметрами:
      | id         | 0                    |
      | username   | TestApiUser          |
      | firstName  | Иван                 |
      | lastName   | Иванов               |
      | email      | ivanovivan@gmail.com |
      | password   | qwerty123            |
      | phone      | +7(962)973-34-67     |
      | userStatus | 0                    |

    То получить данные пользователя с username ='TestApiUser'

