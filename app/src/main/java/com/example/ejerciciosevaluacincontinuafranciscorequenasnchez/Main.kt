package com.example.ejerciciosevaluacincontinuafranciscorequenasnchez

fun main(){
    print("Ejercicio 1: ")
    Pares(5)
    println("Ejercicio 2: "+compararTexto("Hola","Holaa"))
    print("Ejercicio 3: ")
    esMayorQue10YMenorQue20(22,18)
    print("Ejercicio 4: ")
    evaluarCalificacion(95)
    println("Ejercicio 5: "+sumarNumeros(1,2,3,4,5))
    val array= intArrayOf(1,2,3,4,5)
    println("Ejercicio 6: "+invertirArray(array).contentToString())
    print("Ejercicio 7: ")
    listaFrutas()
    print("Ejercicio 8: ")
    listaColores()
    println("Ejercicio 9: ")
    imprimirNumeros()
    println(" ")
    println("Ejercicio 10: ")
    imprimirLista(listOf(1,2,3,4,5))
    println("Ejercicio 11: ")
    imprimirNumerosHastaN(10)

    println(" ")

    println("Ejercicio 12: ")
    imprimirNumerosPositivos(listOf(1,2,3,-4,5))

    println("Ejercicio 13: "+esPrimo(7))

    println("Ejercicio 14: "+encontrarPrimoMayorQue100(103))


}
//1. Escribe una función llamada esPar que tome un número como argumento y devuelva true si es par y false si es impar.
fun Pares(numero:Int):Boolean{
    var par= false
    if(numero%2==0) {
        par = true
        println("El numero es par")
    }
        println("El numero es impar")

    return par
}

//2. Crea una función llamada compararTexto que tome dos cadenas de texto como argumentos y determine si son iguales utilizando tanto equals() como el operador

fun compararTexto(cadena1:String,cadena2:String):Boolean{
    var coincidir= false
    if(cadena1.equals(cadena2)){
        coincidir=true
    }
    return coincidir
}
//3. Implementa una función llamada esMayorQue10YMenorQue20 que tome dos números
// como argumentos y devuelva true si ambos números son mayores que 10 y menores que 20, y false en caso contrario.
fun esMayorQue10YMenorQue20(numero1:Int,numero2:Int):Boolean{
    var rango=false
    if(numero1>10 && numero1<20 && numero2>10 && numero2<20){
        rango=true
        println("Los numeros estan en el rango")
    }else{
        println("Los numeros no estan en el rango")
    }

    return rango
}
//4. Crea una función llamada evaluarCalificacion que tome la calificación de un estudiante (un número entre 0 y 100)
// como argumento y devuelva una letra de calificación (A, B, C, D, F) utilizando una estructura when.
fun evaluarCalificacion(calificacion:Int){
    when(calificacion){
        in 90..100 -> println("A")
        in 80..90 -> println("B")
        in 70..80 -> println("C")
        in 60..70 -> println("D")
        in 0..60 -> println("F")
    else -> println("La calificacion no es valida")
    }
}
//5. Define una función llamada sumarNumeros que tome un número variable de argumentos utilizando vararg y devuelva la suma de todos los números.
fun sumarNumeros(vararg numeros:Int):Int{
    var suma=0
    for(numero in numeros){
        suma+=numero
    }
    return suma
}
//6. Implementa una función llamada invertirArray que tome un array de números como argumento y devuelva un nuevo array con los elementos en orden inverso.

fun invertirArray(array:IntArray):IntArray{
    val arrayInvertido=IntArray(array.size)
    for(i in array.indices){
        arrayInvertido[i]=array[array.size-1-i]
    }
    return arrayInvertido
}

//7. Crea una lista inmutable de nombres de frutas y agrega una fruta adicional a la lista.
fun listaFrutas(){
    val nuevaLista= mutableListOf<String>()
    nuevaLista.add("Manzana")
    println(nuevaLista.toString())

}

//8. Utiliza una lista mutable para almacenar nombres de colores y elimina un color de la lista.
fun listaColores(){
    var colores=mutableListOf<String>()
    colores.add("Rojo")
    colores.add("Verde")
    colores.add("Azul")
    colores.remove("Rojo")
    println(colores.toString())
}

//9. Escribe una función llamada imprimirNumeros que utilice un bucle for para imprimir los números del 1 al 10.

fun imprimirNumeros(){
    println("Los numeros del 1 al 10 son: ")
    for(i in 1..10){
        print(" "+i)
    }
}

//10. Define una función llamada imprimirLista que tome una lista de números como argumento
// y utilice un bucle forEach para imprimir cada número en la lista.
fun imprimirLista(lista:List<Int>){
    lista.forEach{numero->
        println(numero)
    }
}

//11. Implementa una función llamada imprimirNumerosHastaN que tome un número como argumento
// y utilice un bucle while para imprimir los números del 1 al número dado.
fun imprimirNumerosHastaN(numero:Int){
    var i=1
    while(i<=numero){
        print(" "+i)
        i++
    }
}
//12. Crea una función llamada imprimirNumerosPositivos que utilice un bucle do-while para
// imprimir números positivos hasta que se alcance un número negativo.
fun imprimirNumerosPositivos(numeros:List<Int>){
    var i=0
    do{
        if(numeros[i]>=0){
            println(numeros[i])
        }
        i++
    }while(numeros[i]<0)

}
//13. Define una función llamada esPrimo que tome un número como argumento
// y devuelva true si es primo y false si no lo es. Utiliza una declaración
// return para salir de la función una vez que se determine si el número es primo.
fun esPrimo(numero:Int):Boolean{
    var primo=true
    if(numero<=1){
        return primo
    }
    for(i in 2 until numero){
        if(numero%i==0){
            primo=false
            return primo
        }
        }
    return primo
}
//14. Implementa una función llamada encontrarPrimoMayorQue100 que utilice un bucle for
// para encontrar el primer número primo mayor que 100. Utiliza una declaración break
// para salir del bucle una vez que se encuentre el número primo.
fun encontrarPrimoMayorQue100(numero:Int):Boolean{
    var primo=false

    while(!primo){
        for(i in 2 until numero){
            if(numero%i==0){
                primo=false
                break
            }else{
                primo=true
                return primo

            }

            }
    }
    return primo
}
