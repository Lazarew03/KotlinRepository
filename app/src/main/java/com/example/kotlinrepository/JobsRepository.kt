package com.example.kotlinrepository

class JobsRepository {
    val LJobss = mutableListOf<Jobs>()

    fun findById(id: Int) : Int?{
        var findIndex: Int? = null
        for( i in 0..LJobss.size){
            if(LJobss[i].id == id){
                findIndex = i
                println("Работник ${LJobss[i].name} найден")
            } else {
                findIndex = null
                println("Работник не найден")
            }
            break
        }
        return findIndex
    }

    fun insert(jobs: Jobs) {
        jobs.id = LJobss.size
        print("id: " + jobs.id + " ")
        LJobss.add(jobs)
        println("${jobs.name} добвален")
    }

    fun update(id: Int, jobs: Jobs) {
        var searchPhone: Int? = findById(id)
        if (searchPhone != null) {
            jobs.id = id
            LJobss[searchPhone] = jobs
        }
    }
    fun delete(id: Int) {
        var jobs: Int? = findById(id)
        if (jobs != null) {
            LJobss.removeAt(jobs)
        }
    }
}