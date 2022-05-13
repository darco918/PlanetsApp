package com.example.aistesuniverseexplorer.models

import android.content.res.Resources
import android.util.Log
import com.example.aistesuniverseexplorer.R
import java.util.*

class Planet(
    index: Int, name: String, mass: Double, gravity: Double, imgResourceValues: Array<Int>, imgSmallResourceValues: Array<Int>,
) {
    private var pIndex = index
    private var pName = name
    private var pMass = mass
    private var pGravity = gravity
    private var pImgResourceValues = imgResourceValues
    private var pImgSmallResourceValues = imgSmallResourceValues
    private var pNumColonies = 1
    private var pNumMilitaryBases = 0
    private var pForceField = false

    override fun toString(): String {
        return "Index: " + pIndex.toString() + " name: " + pName + " mass: " +
                pMass.toString() + " gravity " + pGravity + " number of colonies: " +pNumColonies.toString() + " number of military bases: " +
                pNumMilitaryBases.toString() + " force field: " + pForceField.toString() + "\n"
    }

    fun getPlanetFromResources(index: Int, res: Resources): Planet
    {
//        val array = res.obtainTypedArray(R.array.planets)
//        for(el in 1..array.length()){
//            if (index == el){
//                val aux = array.getIndex(el)
//                //return Planet(index, )
//                Log.d("AUX", "Aux: "aux.toString())
//            }
//        }
         if(index == 0)  return Planet(0,"Mercury", 0.33, 3.7, arrayOf(R.drawable.mercury),
            arrayOf(R.drawable.mercury2))
        else if(index == 1) return Planet(0,"Mercury", 0.33, 3.7, arrayOf(R.drawable.mercury) ,arrayOf(R.drawable.mercury2))
        return Planet(0,"Mercury", 0.33, 3.7, arrayOf(R.drawable.mercury) ,arrayOf(R.drawable.mercury2))
    }
    fun getIndex(): Int{
        return pIndex
    }

    fun setIndex(index:Int){
        pIndex = index
    }

    fun getName(): String{
        return pName
    }

    fun setName(name:String){
        pName = name
    }

    fun getGravity(): Double{
        return pGravity
    }

    fun setGravity(g:Double){
        pGravity = g
    }

    fun getMass(): Double{
        return pMass
    }

    fun setMass(g:Double){
        pMass = g
    }
}

