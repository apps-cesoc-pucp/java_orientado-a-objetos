# BATALLA POKEMON
Este proyecto consiste en crear clases para simular una batalla Pokemon.
Para ello, deberás crear tus propios pokemones e implementarlos correctamente 
en ataque y defensa.

## PASOS A SEGUIR
1. Crea una clase Pokemon con las siguientes características:

__ATRIBUTOS__
- [ ] nombre    (String)
- [ ] ataque    (int)
- [ ] defensa   (int)
- [ ] vida      (int)

**OBSERVACIÓN:** Recuerda realizar el __Encapsulamiento__ a los atributos de tu 
Pokemon, no querrás que otro entrenador Pokemon modifique directamente los puntos 
de vida de tu Pokemon. (Getters y Setters para los atributos con acceso Private)
  
  __CONSTRUCTOR__
  - [ ] Pokemon(String, int, int, int)<br>
  Este constructor debe recibir todos los datos necesarios del pokemon a crear
  
 __MÉTODOS__
 - [ ] void atacar(Pokemon): <br>
 Este método recibirá como parámetro al objeto Pokemon a atacar.
 Deberás disminuirle la vida de acuerdo al ataque de tu Pokemon, y, de acuerdo
 a tu suerte(`Math.random()`), tu pokemon podría aumentar su ataque hasta un 50% 
 de efecticidad. Además, tu oponente puede defenderse de tu ataque, no olvides 
 llamar al método defenderse del pokemon a quien estás atacando. Ah, y recuerda 
 narrar el ataque de tu pokemon, claro, como réferi.
 
 - [ ] void defenderse(Pokemon): <br>
 Este método recibirá como parámetro al objeto Pokemon atacante. De acuerdo a tu
 suerte(`Math.random()`), podrás defenderte del ataque de tu oponente esquivándolo.
 Nárralo con voz de réferi.
 
 __~¡¡ACABAS DE ARMAR TU PROPIO POKEMON!!~__
 
 Ahora debes crear al réferi que dará inicio a la batalla y declarará al ganador.
 2. Crea la clase Réferi con las siguientes características:
 
 __ATRIBUTOS__
 - [ ] NO HAY, NO EXISTE
 
 __MÉTODOS__
 - [ ] void presentarse(Pokemon, Pokemon)<br>
 Este método deberá imprimir un banner de Pokemon. Puedes usar 
 [esta pag.](http://patorjk.com/software/taag/#p=display&f=Graffiti&t=Type%20Something%20) 
 para generar tu banner. Después de esto, el réferi dará inicio a la batalla 
 mencionando a los dos pokemones a enfrentarse.
 
 - [ ] void iniciarBatallaPokemon(Pokemon, Pokemon) <br>
 _Este método dará inicio a la batalla, por lo que el código aquí será algo extenso._<br>
    - ~~Se decidirá quién será el primero en atacar. Para ello, puedes usar 
    un método auxiliar que permita decidir quién es el primero con piedra, 
    papel o tijera.~~
    - Inicia la batalla con un `while`, y se detendrá cuando uno de los
    pokemones se quede sin vida. Recuerda que cada pokemon debe turnarse para
    atacar al otro(PISTA: puedes usar una variable que maneje el turno de cada
    pokemon).
    
 
 - [ ] void declararGanador(Pokemon, Pokemon) <br>
 Este método declarará al ganador de acuerdo a la vida de cada uno: el que aún 
 posea vida para continuar será el ganador.
 