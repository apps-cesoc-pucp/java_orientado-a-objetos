# BATALLA POKEMON V2
En esta versión de la batalla Pokemón, verás sobre Herencia y Polimorfismo de 
las clases. Para ello, deberás crear tu propia clase de pokemon que desees:
- Class Pikachu
- Class Charmander
- Class Squirtle
- etc

... la cual heredará todos los atributos y métodos de `class Pokemon`(Esta clase 
ya se encuentra implementada y lista para usarse, junto a `class Referi`).

## PASOS A SEGUIR
1. Crea la clase [_inserte aqui el nombre de su pokemon_]. Recordar la estructura de
 un Pokemon:<br>
 __ATRIBUTOS__
 - nombre
 - ataque
 - defensa
 - vida<br>
__PISTA:__ Recuerda colocar la palabra `extends` para que tu pokemon herede de 
`class Pokemon`.
2. Implementa el **constructor** de tu pokemon de tal modo que inicialice los atributos
 mencionados arriba.
 ```java
 public class Pikachu extends Pokemon{
     // CONSTRUCTOR
     public Pikachu(){
         // los datos dentro de super dependen de tu pokemon
         super("Pikachu", 100, 100, 50);
         // ingrese inicializaciones a atributos extra de Pikachu aquí
   }
 } 
 ```
 __PISTA:__ Revisar el constructor de `class Pokemon` para entender el uso de `super`.<br>
__OBSERVACIÓN:__ `super()` siempre va al inicio del constructor de la clase hijo si es que 
deseas llamar al constructor de la clase padre.<br>

3. Sobreescribe los métodos de la clase `Pokemon` dentro de tu clase creada. Los métodos
a sobreescribir son los siguientes:
- void atacar(Pokemon)<br>
Debes colocar un `switch` y pedirle al entrenador qué ataque quiere realizar, y de acuerdo
a su elección, debes ejecutar una función que modifique el valor del ataque de tu pokemon, 
además de agregar palabras del réferi.
```java
int decision = pedirDecisionAEntrenador();
swith(decision){
    case 1: ataqueRapido();
            break;
    case 2: impactrueno();
            break;
    ...
}
```
Recuerda implementar estos métodos y modificar el valor del ataque.
__DATO:__ Usa `Scanner in = new Scanner(System.in)` para leer el caracter del entrenador
al momento de elegir el ataque de su pokemon. <br>
La sobreescritura deberá quedar de la siguiente manera:
```java
@Override
public void atacar(Pokemon pokemon){
    int decision = pedirDecisionAEntrenador();
    switch(){
        ...
    }
    super.atacar(pokemon);
}
```
Recuerda usar `super.atacar(pokemon)` para llamar al método del padre.
- void defenderse(Pokemon)<br>
No es necesario sobreescribir este método.

<br><br>
## LOGRADO
Hasta el momento, has creado una clase de pokemon(supongamos `class Pikachu`) que hereda 
de `class Pokemon` todos sus métodos y sus atributos, y has reconfigurado 
(sobreescrito - `@Override`) uno de sus métodos. Luego, cuando la clase `Referi` 
lo llama, trata al objeto `Pikachu` como un objeto`Pokemon`, pero se ejecuta el método
que has sobreescrito en class `Pikachu`... esto es __POLIMORFISMO__: cuando una clase
hereda de otra, no solo recibe métodos y atributos, sino que también puede ser tratada
como su clase padre. Eso sí, solo puede usar los métodos de su clase padre, pero para
eso existe el truco de `@Override` o sobreescribir un método del padre.