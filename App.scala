package org.example
import scalaj.http._
//import.scala.annotation.tailrec

/**
 * @author ${user.name}
 */

  object HelloScal {
    def main(args: Array[String]) {
      println("Hello, Scala!")
    }
  }
//------------------------------------------------------------------------------
  object HelloScala {
    def main(args: Array[String]) {
      val mystring = "Hello, Scala!"
      val my1 = mystring.reverse
      val my2 = mystring.toLowerCase
      val my3 = my2.replace("!", "")
      val mynewstring = my3 + " and goodbye python!"
      println(my1)
      println(my2)
      println(my3)
      println(mynewstring)
    }
  }

//------------------------------------------------------------------------------------------
  object HelloScal {
    def main(args: Array[String]) {
      val yearsalary = scala.io.StdIn.readInt()
      println("Введите годовой доход (gross):" + yearsalary)
      val bonus = scala.io.StdIn.readFloat()
      println("Введите размер премии:" + bonus)
      val eatbonus = scala.io.StdIn.readInt()
      println("Введите размер компенсации питания:" + eatbonus)

      val netMonthlySalary = (yearsalary + bonus + eatbonus) / 12
      println(netMonthlySalary)

    }
  }

//-------------------------------------------------------------------------------------------------
  object HelloScal {
    def main(args: Array[String]) {
      val salaries = List(100, 150, 200, 80, 120, 75)
      val bonuses = List(30, 20, 25, 10, 25, 8)
      val eatbonuses = List(5, 6, 8, 3, 8, 2)
      //val netSalary = (salaries, bonuses, eatbonuses).zipped.map(_+_+_)
      val netSalary = List(salaries, bonuses, eatbonuses).transpose.map(_.sum)
      val netAverage = (netSalary.sum) / netSalary.length
      val bias = netSalary.map(_ - (netAverage))
      val biaspr = bias.map(_ * 100 / (netAverage))

      println("Отклонение чистой зп каждого сотрудника от средней:" + biaspr + "%")

    }
  }
//------------------------------------------------------------------------------------
  object HelloScal {
    def main(args: Array[String]) {

      val salaries = List(100, 150, 200, 80, 120, 75)
      val bonuses = List(30, 20, 25, 10, 25, 8)
      val eatbonuses = List(5, 6, 8, 3, 8, 2)
      //val netSalary = (salaries, bonuses, eatbonuses).zipped.map(_+_+_)
      val netSalary = List(salaries, bonuses, eatbonuses).transpose.map(_.sum)
      val netAverage = (netSalary.sum) / netSalary.length
      val bias = netSalary.map(_ - (netAverage))
      val biaspr = bias.map(_ * 100 / (netAverage))

      println("Отклонение чистой зп каждого сотрудника от средней:" + biaspr + "%")
      val maxim = salaries.max
      val minim = salaries.min
      println(maxim)
      println(minim)
      //Add 350 and 90
      val salariesN = 350 :: salaries
      val salariesNew = 90 :: salariesN
      //Sort
      val sortedSalaries = salariesNew.sorted
      //add 130
      println(sortedSalaries)

      for (n <- sortedSalaries) {
        if ((n <= 200) && (n >= 90)) println(f"$n middle")
      }

      val salariesUplifted = sortedSalaries.map(_ * 1.07)
      println(salariesUplifted)
    }
  }
//----------------------------------------------------------------------------
//i.    *Ваши сотрудники остались недовольны и просят индексацию на уровень рынка.
// Попробуйте повторить ту же операцию, как и в предыдущем задании,
// но теперь вам нужно проиндексировать зарплаты на процент отклонения от среднего по рынку с учетом уровня специалиста.
// На вход вашей программе подается 3 значения – среднее значение зарплаты на рынке для каждого уровня специалистов
// (junior, middle и senior)
object HelloScal {
  def main(args: Array[String]) {

    val avg_salary_by_market = 175
    val worker_salary = List(100, 120, 160, 80, 60, 200, 258, 168)
    var middle_salary = List[Int]()
    for (i <- worker_salary)
      {
        if((i >= 100)&&(i<=200))
          {
            middle_salary = i +: middle_salary
          }
      }
    println(middle_salary)

    val avg_middle_salary = middle_salary.sum / middle_salary.size

    println(avg_middle_salary)

    val avg_middle_salary_diff: Double = 1- avg_middle_salary.toDouble / avg_salary_by_market.toDouble
    println(avg_middle_salary_diff)

    var new_middle_salary = List[Double]()
    for (i <- middle_salary)
      {
        new_middle_salary = ((i + i*avg_middle_salary_diff) +: new_middle_salary)
      }
    println(new_middle_salary)

//k.  *Попробуйте деанонимизировать ваших сотрудников – составьте структуру, которая позволит иметь знания о том,
    // сколько зарабатывает каждый сотрудник(Фамилия и имя).

    val workerSalaryMap = Map(
      "Ivanov" -> 138,
      "Petrov" -> 158,
      "Sidorov" -> 258
    )
    println(workerSalaryMap)


//l.     *Выведите фамилию и имя сотрудников с самой высокой и самой низкой зарплатой
    // (только не рассказывайте им об этом факте).
    var  MaxSalary = 0
    var WorkerWithMaxSalary = ""
    for ( (i,j) <- workerSalaryMap)
      {
        println(i,j)
        if (j > MaxSalary)
          { MaxSalary = j
            WorkerWithMaxSalary = i
          }
      }
    println(WorkerWithMaxSalary)

    val weight = 80
    val height = 1.7

    val index = weight/(height*height)
    def indexMass(weight: Int, height:Double): Double = {
      val index = weight/(height*height)

      index
    }
    println(index, indexMass(80, 1.7))

    def factorial(n: Int): Int = {
      if (n <= 0) 1
      else {
        var fact = n * factorial(n - 1)
        fact
      }
    }
      println(factorial(5))


    }
  }
