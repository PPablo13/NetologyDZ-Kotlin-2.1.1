package ru.netology

fun main(){
    val amount = 15459896 //вводим сумму перевода (переменная amount)
    val tax = amount*0.0075 //рассчитываем комиссию за перевод (переменная tax)
    if (tax < 35) {println("Комиссия за перевод составит: "+35)} //проверяем минимальное значение комиссии и выводим итог
    else {println("Комиссия за перевод составит: "+tax)}
}