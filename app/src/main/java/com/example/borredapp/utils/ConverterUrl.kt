package com.example.borredapp.utils

class ConverterUrl() {

    /*
    * This class generates urls for retrofit.
    *
    * All the functions of this class have a conditional that checks the number of participants.
    * If the number of participants is 0, a url is generated without filtering by number of participants.
    * */

    fun getUrlByTypes(participants:Int,type:String):String{
        return if (participants!=0){
            "$SEARCH_BY_TYPE$type&participants=$participants"
        } else{
            SEARCH_BY_TYPE + type
        }
    }

    fun getUrlByKey(participants: Int ,key : String) : String {
        return if (participants!=0) {
             "$SEARCH_BY_KEY$key&participants=$participants"
        } else {
             SEARCH_BY_KEY + key
        }
    }

    fun getUrlByPrice(participants: Int, price: Float ) :String {
        return if (participants!=0){
             "$SEARCH_BY_PRICE$price&participants=$participants"
        } else {
             SEARCH_BY_PRICE + price
        }

    }

    fun getUrlByPriceRange(participants: Int, minPrice: Float, maxPrice :Float) :String {
        return if (participants!=0){
            "$SEARCH_BY_PRICE_RANGE$minPrice&maxprice=$maxPrice&participants=$participants"
        }else{
            "$SEARCH_BY_PRICE_RANGE$minPrice&maxprice=$maxPrice"
        }

    }

    fun getActivityByAccessibility( participants: Int , accessibility :Float) : String {
        return if(participants!=0){
            "$SEARCH_BY_ACCESSIBILITY$accessibility&participants=$participants"
        }else{
            SEARCH_BY_ACCESSIBILITY + accessibility
        }

    }

    fun getActivityByAccessibilityRange(
        participants: Int,
        minAccessibility :Float,
        maxAccessibility :Float) : String{
        return if (participants!=0){
            "$SEARCH_BY_PRICE_RANGE$minAccessibility&maxaccessibility=&$maxAccessibility&participants=$participants"
        }else {
            "$SEARCH_BY_ACCESSIBILITY_RANGE$minAccessibility&maxaccessibility=$maxAccessibility"
        }
    }
}