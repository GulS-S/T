import javax.xml.transform.Result
import scala.io.StdIn.readLine


object Rev {
  def main(args: Array[String]) {
    var str1 = "HELLO, SCALA!"
    var str2 = "and goodbye python";
    val finalStr1 = str1.replaceAll("!", " ")
    val result = str1.toLowerCase()
    implicit class Reverse(val x: StringContext) {
      def revrs(args: Any*): String = {
        val res = x.s(args: _*)
        res.reverse
      }
    }
    println(finalStr1 + str2);
    println(result);
    println(revrs"$str1")

    println("Введите годовой доход:")
    val yearProfit = readLine().toInt
    println("Введите размер премии:")
    val yearbonus = readLine().toFloat
    println("Введите сумму компенсации за питание:")
    val yeareatbonus = readLine().toInt

    val MonthSalary = ((yearProfit + ((yearProfit * yearbonus) / 100) + yeareatbonus) * 0.87) / 12

    println(s"Заработанная плата за месяц: $MonthSalary")

    val FirstList = List(100, 150, 200, 80, 120, 75)

    for (n <- FirstList) {
      if ((n > 75) && (n < 200))
        println(n, "middle")
    }

    val commonSalary = FirstList.sum
    val countPerson = FirstList.size
    val averageSalary = FirstList.sum / FirstList.size
    println(s"Средняя заработанная плата: $averageSalary")
    val Dev = ((averageSalary - MonthSalary) / averageSalary * 100).round
    println(s"Отклонение от средней заработанной платы: $Dev%")

    println("Введите дополнительный бонус к зп (+) или вычет из зп (-):")
    val AddBonus = readLine().toFloat
    val newMonthSalary = MonthSalary + AddBonus
    println(s"Заработанная плата c доп. бонусом или с вычетом: $newMonthSalary")

    val SecondList = List.apply(100, 150, 200, 80, 120, 75, MonthSalary)
    val minSalary = SecondList.reduceLeft(_ min _)
    println(s"Минимальная аработанная плата: $minSalary")
    val maxSalary = SecondList.reduceLeft(_ max _)
    println(s"Максимальная заработанная плата: $maxSalary")


    val ThirdList = List(100, 150, 200, 80, 120, 75, 390, 90, 130).sortWith(_ < _)
    println(s"Заработанная плата по возрастанию: $ThirdList")


    val numberEmployee = ThirdList.indexWhere(element => element > 130)
    println(s"Номер сотрудника с з/п 130: $numberEmployee")

    println("Заработанная плата c учетом инфляции:")
        for (n <- ThirdList)
            println(n+(n*0.7))

  }


}


