package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.myapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val arraylist_parent= arrayListOf<String>("Baringo","Bomet","Machakos")

        val arrayAdapter_parent= ArrayAdapter(applicationContext,R.layout.text_blue,arraylist_parent)
        binding.spParent.adapter=arrayAdapter_parent


        val arrayList_baringo= arrayListOf<String>("Cowmilk","Honey","Meatgoat")
        val arrayList_bomet= arrayListOf<String>("Cowmilk","Ind.Chicken","Irish potato")
        val arrayList_machakos= arrayListOf<String>("Cowmilk","Mango","Ind.Chicken")

        val arrayAdapter_child= ArrayAdapter(applicationContext,R.layout.text_red,arrayList_baringo)
        binding.spChild.adapter=arrayAdapter_child

        binding.spParent.onItemSelectedListener =object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, View: View?, position: Int, id: Long) {
                if (position==0){
                    val arrayAdapter_child= ArrayAdapter(applicationContext,R.layout.text_red,arrayList_baringo)
                    binding.spChild.adapter=arrayAdapter_child

                }

                if (position==1){
                    val arrayAdapter_child= ArrayAdapter(applicationContext,R.layout.text_red,arrayList_bomet)
                    binding.spChild.adapter=arrayAdapter_child

                }

                if (position==2){
                    val arrayAdapter_child= ArrayAdapter(applicationContext,R.layout.text_red,arrayList_machakos)
                    binding.spChild.adapter=arrayAdapter_child

                }

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }


        }
    }
}