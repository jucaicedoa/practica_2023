package com.jucaicedoa.appsbasicas1.apps.app3

sealed class taskCategory {
    object personal:taskCategory()
    object negocios: taskCategory()
    object otros: taskCategory()
}
