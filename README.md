# Sobre o Projeto
A ideia escolhida foi um sistema que registra um histórico de adoções de animais de uma ONG, o sistema é capaz de registrar animais, adotantes e animais, contendo filtros e validações a fim de evitar dados errôneos. 

---

# Reestruturação do Projeto
Inicialmente a classe “Animal” seria uma classe abstrata e então teriam 4 classes derivadas, sendo:
* Cachorro.java
* Gato.java
* Coelho.java
* Peixe.java

Cada uma das classes com características especiais, e então o Adotante teria diversos atributos que serviriam para validar automaticamente se ele estava apto a adotar o animal pretendido ou não. Porém essa ideia foi abandonada, pois seria extremamente complexo e custaria muito tempo implementar tantas validações, além de que se tornaria um projeto muito grande, então eu senti que não faria muito sentido, e optei por transformar as 4 classes em 1 Enum que é utilizado para filtrar os animais na tela de adoção.

---

# Diagrama de Classes

<img src="Diagrama SA.jpg" alt="Diagrama de classes UML"/>
