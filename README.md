# Task4_QE

Это Домашнее задание 4.




Данынй код, используя SpringBoot, принимает на вход json-объект, в котором хранится одно поле float, и возвращает json-объект, в котором хранится:

-Оригинальное число

-Удвоенное число



Адрес для обращения: 

http://localhost:8081/api/processData




команда сборки, используя Maven:

'''mvn spring-boot:run'''



Пример запроса:

curl -X POST -H "Content-Type: application/json" -d '{"side":2.5}' http://localhost:8081/api/processData



Ответ при данном запросе:

{"originalSide":2.5,"doubleSide":5.0}
