package com.jucaicedoa.appsbasicas1.apps.app3

sealed class taskCategory(var estaSeleccionada: Boolean = true) {
    object personal : taskCategory()
    object negocios : taskCategory()
    object otros : taskCategory()
}
