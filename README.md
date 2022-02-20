# ITA_Java_Spring_Tasques1_Herencia_y_Polimorfismo-

@utor: Isabel Calzadilla.

Tasca S1.01. Herència i Polimorfisme

ITAcademy - Java - SpringBoot


Ejercicios:

                                    Nivell 1


Exercici 1. 

- Crea una classe Vehicle amb un constructor i un mètode anomenat iniciar(), que es invocat pel main() (aquest mètode pot estar en la mateixa classe o en una classe apart) . Demostra la seqüència d'execució dels mètodes de la classe (per exemple, enviant un missatge a la consola).

Exercici 2. 

- A la classe Vehicle afegeix dos mètodes: un static anomenat parar() i un altre no-static anomenat accelerar(). Demostra com invocar el mètode static i el no-static des del main() (per exemple, enviant un missatge a la consola).

Exercici 3. 

- Demostra que el procés de càrrega d'una classe només té lloc una vegada. Demostra que la càrrega pot ser provocada per la creació de la primera instància d'aquesta classe o per l'accés a un membre estàtic d'aquesta. Idea: Cerca informació sobre els blocs d'inicialització a Java.

Exercici 4. 

- A la classe Vehicle afegeix un camp static final, un camp final i un camp static. Demostra la diferència entre els tres. Quins es poden inicialitzar al constructor de la classe?

Exercici 5. 

- Crea una classe Animal amb el mètode correr() sobrecarregat tres vegades. Defineix una nova classe (per exemple Gat) que hereti de l'anterior i afegeix una nova versió sobrecarregada del mateix mètode. Mostra que els quatre mètodes estan disponibles a la classe derivada (per exemple enviant un missatge a la consola).


Exercici 6. 

- Crea una classe denominada Amphibian i inclou una sèrie de mètodes: moure(), respirar() i menjar(). Defineix una nova classe denominada Frog que hereti de l'anterior. Al main() crea un objecte Frog i realitza una generalització a Amphibian, demostrant que tots els mètodes continuen funcionant.


Exercici 7. 

- A l'exercici anterior crea un nou mètode saltar() a la classe Frog i crida’l des del main(), desprès de fer la generalització a Amphibian. Demostra que la crida a aquest mètode saltar dona error.


Exercici 8. 

- Modifica l'exercici anterior perquè l'objecte Frog substitueixi les definicions de mètodes de la classe base (proporcioni noves definicions utilitzant les mateixes signatures de mètodes). Demostri que ocorre al mètode main(), si manté la generalització anterior o no.



                                        Nivell 2




Exercici 1. 


- Crea una classe Cycle, amb les seves subclasses: Unicycle, Bicycle i Tricycle. Demostra que es pot generalitzar una instància de cada tipus a Cycle mitjançant el mètode del main(): public static void ride(Cycle c).


Exercici 2. 

- Afegeix un mètode wheels() a Cycle, que retorni el nombre de rodes. Modifica ride() per a invocar wheels() i verifica que funciona el polimorfisme.


Exercici 3. 

- Afegeix un mètode balance() a Unicycle i a Bicycle amb una implementació diferent a cada un, però no a Tricycle. Crea instàncies de tres tipus i generalitza-les per a formar un array d'objectes Cycle. Tracta d'invocar balance() a cada element de l'array. Realitza una especialització fent servir instanceof i invoca balance demostrant el que ocorre.


Exercici 4. 

- Crea una jerarquia d'herència Rossegador: Ratolí, Jerbu, Hamster. A la classe base proporciona els mètodes que són comuns als rossegadors (ensumar(), rossegar(), correr()) i substitueix aquests mètodes a les classes derivades per a obtenir diferents comportaments depenent del tipus específic de rossegador (per exemple, enviant un missatge a la consola). Crea un array d'objectes Rossegador, emplena'l amb diferents tipus específics de rossegadors i invoca els mètodes de la classe base demostrant què succeeix.


                                    Nivell 3


Exercici 1. 

- Crea una classe anomenada Base amb dos mètodes: metode1() i metode2(). En el primer mètode, invoca el segon. Defineix una classe anomenada Derivada que hereti de l'anterior i substitueix el segon mètode. Crea un objecte de la classe Derivada, realitza una generalització (upcasting) al tipus Base i crida al primer mètode. Demostra el que succeeix.



                                    Objectius


- Aprendre a utilitzar correctament Programació Orientada a 