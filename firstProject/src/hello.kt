import kotlin.random.Random

    fun main(args: Array<String>) {

        val firstNum: Int = Random.nextInt(50)
        val secondNum: Int = Random.nextInt(50)
        val thirdNum: Int = Random.nextInt(1,5)
        val emailArray = arrayOf ("fdhdfh@gfh.hgj", "fdhdfhgfh.hgj", "fdhdfh@gfhhgj")
        val emailIndex = Random.nextInt(emailArray.size)

        println("-------------------")
        println("first Num = $firstNum")
        println("second Num = $secondNum")
        println("max num is = " + getMaxInt(firstNum, secondNum) + " " + getResultComparison(firstNum, secondNum))
        println("third Num = $thirdNum")
        println("String Representation third Num(1-5)= " + getStringRepresentation(thirdNum))
        println("-------------------")
        println("Email = "+ emailArray[emailIndex] + " : " + "valid email = " + checkEmail(emailArray[emailIndex]))

    }

    fun getMaxInt (firstNum: Int, secondNum: Int): Int {

        return if (firstNum > secondNum) firstNum
        else secondNum
    }

    fun getResultComparison(firstNum: Int, secondNum: Int): String {

        return if (firstNum > secondNum) "firstNum is Larger"
        else if (firstNum < secondNum) "secondNum is Larger"
        else "is equals"
    }

    fun getStringRepresentation(num: Int): String {

        return when (num) {
            1 -> "one"
            2 -> "two"
            3 -> "three"
            4 -> "four"
            5 -> "five"
            else -> "input is invalid"
        }
    }

    fun checkEmail(email: String): Boolean {

      return email.contains('@')&&email.contains('.')
    }


