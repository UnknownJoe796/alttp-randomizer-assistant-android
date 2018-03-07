package com.ivieleague.randomizer.logic



fun <T> T.flattenRecursive(action: (T) -> Iterable<T>): Sequence<T> {
    val queue = ArrayList<T>()
    queue.add(this)
    return object : Sequence<T> {
        override fun iterator(): Iterator<T> = object : Iterator<T> {
            override fun hasNext(): Boolean = queue.isNotEmpty()
            override fun next(): T {
                val item = queue.removeAt(0)
                queue.addAll(action(item))
                return item
            }
        }
    }
}