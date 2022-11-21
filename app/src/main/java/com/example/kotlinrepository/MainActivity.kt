package com.example.kotlinrepository


import android.R
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_item)



        fun main(args: Array<String>) {
            val jobs = JobsRepository()

            jobs.insert(Jobs("Никита", "Тракторист"))
            jobs.insert(Jobs("Сергей", "Юрист"))


            println()

            jobs.findById(0)
            jobs.findById(1)
            println()
            jobs.delete(0)
            jobs.findById(0)
            jobs.findById(1)
            jobs.update(1, Jobs("Владимир", "Веломеханик"))
            jobs.findById(1)
            val list = findViewById<View>(R.id.list) as ListView

            // создаем адаптер

            // создаем адаптер
            val adapter: ArrayAdapter<String> =
                ArrayAdapter<String>(this, R.layout.simple_list_item_1, )

            // устанавливаем адаптер списку

            // устанавливаем адаптер списку
            list.adapter = adapter

        }
    }
}