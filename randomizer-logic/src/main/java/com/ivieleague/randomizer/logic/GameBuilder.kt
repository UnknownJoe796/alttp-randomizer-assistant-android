package com.ivieleague.randomizer.logic

object GameBuilder {
    fun has(item:String): Requirement = Requirement.Has(item)
    fun has(item:String, min:Int, sure:Int): Requirement = Requirement.HasMultiple(item, min, sure)
    infix fun Requirement.and(other: Requirement): Requirement {
        return if(this is Requirement.And) {
            if(other is Requirement.And){
                Requirement.And(this.sub + other.sub)
            } else {
                Requirement.And(this.sub + other)
            }
        } else {
            if(other is Requirement.And){
                Requirement.And(other.sub + this)
            } else {
                Requirement.And(listOf(this, other))
            }
        }
    }
    infix fun Requirement.or(other: Requirement): Requirement {
        return if(this is Requirement.Or) {
            if(other is Requirement.Or){
                Requirement.Or(this.sub + other.sub)
            } else {
                Requirement.Or(this.sub + other)
            }
        } else {
            if(other is Requirement.Or){
                Requirement.Or(other.sub + this)
            } else {
                Requirement.Or(listOf(this, other))
            }
        }
    }
}