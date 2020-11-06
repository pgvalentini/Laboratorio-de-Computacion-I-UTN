package TP_05;

public class Ej_01 {
/*1- Explique brevemente en qué consisten los siguientes Algoritmos Fundamentales.

Algoritmos de Ordenación:

Ordenamiento por Inserción
Este algoritmo propone ir tomando los valores de a uno y luego ir colocándolos 
en la posición correcta con respecto a las anteriores ya ordenadas.

Algoritmo de la burbuja
Este algoritmo consiste en comparar cada elemento de la lista con el siguiente 
(por parejas), si no están en el orden correcto, se intercambian entre sí sus valores. 
El valor más pequeño flota hasta el principio de la lista

Ordenamiento por selección
Inicialmente se recorre toda la lista buscando el menor de todos los elementos, 
una vez terminada la recorrida el menor elemento se coloca al inicio de la lista recorrida.
En la siguiente iteración se recorre nuevamente la lista pero comenzando en el segundo
elemento (ya que al haber insertado el menor encontrado al inicio ya lo consideramos ordenado).
El procedimiento continúa hasta que el último elemento recorrido es el menor de su subconjunto.

Algoritmo Quick-Sort
Este tipo de algoritmos se basa en la técnica "divide y vencerás", lo que supone
que es más rápido y fácil ordenar dos arreglos o listas de datos pequeños, que un arreglo o lista más grande.
El algoritmo trabaja de la siguiente forma: 
• Elegir un elemento de la lista de elementos a ordenar, al que llamaremos pivote.
• Resituar los demás elementos de la lista a cada lado del pivote, de manera
que a un lado queden todos los menores que él, y al otro los mayores. Los 
• Repetir este proceso de forma recursiva para cada sublista mientras éstas 
contengan más de un elemento. Una vez terminado este proceso todos los elementos estarán ordenados.

Algoritmos de Búsqueda:
Búsqueda Secuencial
Este algoritmo busca el elemento dado, recorriendo secuencialmente la lista desde
un elemento al siguiente, comenzando en la primera posición de la lista y se detiene
cuando encuentra el elemento buscado o bien se alcanza el final de la lista sin haberlo encontrado.

Búsqueda Binaria
Este algoritmo se utiliza cuando disponemos de una lista ordenada, lo que nos permite facilitar la búsqueda.
Para poder realizar la búsqueda binaria, tenemos que conocer los extremos y el 
valor medio de la lista. Si el valor del medio coincide con el buscado finaliza la búsqueda,
si no determina si es menor o mayor, depende si está del lado izquierdo o derecho del valor medio.
Esto es para volver a determinar los extremos de esa mitad y realizar nuevamente la búsqueda….
Esto tantas veces que sea necesario para encontrar el valor deseado.


Algoritmos de Recorrido:
Para visualizar o consultar los datos almacenados en un árbol se necesita recorrer
el árbol o visitar los nodos del mismo. Al contrario de las listas, los árboles binarios 
no tienen realmente un primer valor, un segundo valor, tercer valor, etc.
Se puede afirmar que el raíz viene el primero, pero ¿quién viene a continuación?
Existen diferentes métodos de recorrido de árbol ya que la mayoría de las 
aplicaciones binarias son bastante sensibles al orden en el que se visitan los nodos,
de forma que será preciso elegir cuidadosamente el tipo de recorrido.

Recorrido de Profundidad
En el recorrido en profundidad, el proceso exige un camino desde el nodo raıź a
través de un hijo, al descendiente más lejano del primer hijo antes de proseguir a 
un segundo hijo. Es muy pareceido a un arbol genealogico, primero tendremos que
realizar el recorrido por un hijo hasta el final, antes de pasar por otro.

Recorrido de Anchura
El proceso se realiza horizontalmente desde el raıź a
todos sus hijos, a continuación, a los hijos de sus hijos y así ́ sucesivamente hasta
que todos los nodos han sido procesados. 
Si tomamos el ejemplo anterior del árbol genealogico vemos que primero pasamos por
los hijos, luego por los nietos y asi sucesivamente hasta acabar las lineas descendientes

*/
}
