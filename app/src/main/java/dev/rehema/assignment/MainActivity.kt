package dev.rehema.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.rehema.assignment.databinding.ActivityMainBinding
import java.math.BigInteger


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var numberList= displayFabonacciNumbers(100)
        println(numberList)
        binding.rvNumber.layoutManager=LinearLayoutManager(this)
        binding.rvNumber.adapter=NumberRecyclerViewAdapter(numberList)

    }

    fun displayFabonacciNumbers(size:Int):List<Int>{
        var list=ArrayList<Int>()
        var fn1=0
        var fn2=1
        var number=0
        while (number<=size){
            print(fn1)
            var add=fn1+fn2
            fn1=fn2
            fn2=add
            number++
            list+=add
        }
        return list
    }
}
