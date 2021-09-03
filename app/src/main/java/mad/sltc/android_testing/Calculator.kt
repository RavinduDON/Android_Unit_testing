package mad.sltc.android_testing

class Calculator {

    fun addFunction(no1: Double, no2: Double): Double {
        val answer: Double
        answer = no1 + no2
        return answer
    }

    fun substactFunction(no1: Double, no2: Double): Double {
        val answer: Double
        answer = no1 - no2
        return answer
    }

    fun multiFunction(no1: Double, no2: Double): Double {
        val answer: Double
        answer = no1 * no2
        return answer
    }

    fun divFunction(no1: Double, no2: Double): Double {
        val answer: Double
        answer = no1 / no2
        return answer
    }
    fun output(ans:Double): String {
        return "Answer is $ans";
    }

}