package tech.bumbii

interface Worker {
    fun work()
}

class Programmer : Worker {
    override fun work() = println("Programmer work()")
}

class Tester : Worker {
    override fun work() = println("Tester work()")
}

class Manager(worker: Worker) : Worker by worker {
    fun manage() = println("Manager manage()")
//    override fun work() = println("Manager work()")
}

fun main() {
    val programmer = Programmer()
    val programmerManager = Manager(programmer)
    val tester = Tester()
    val testerManager = Manager(tester)

    programmerManager.work()
    programmerManager.manage()

    testerManager.work()
    testerManager.manage()
}