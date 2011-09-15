package com.codebearing.cx

import ru.circumflex.orm._

class Country extends Record[String, Country] {
	def PRIMARY_KEY = code
	def relation = Country
	val code = "code" VARCHAR (2) DEFAULT ("'ch'") NOT_NULL
	val name = "name" TEXT

	def this(code: String, name: String) = {
		this()
		this.code.set(code)
		this.name.set(name)

		save
	}

	override def toString = name.getOrElse("Unknown")
}

object Country extends Country with Table[String, Country]

object Main {
	def main(args: Array[String]) {
		val country = new Country("au", "Australia")
	}
}