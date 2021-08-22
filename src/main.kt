class Main {
    fun test(){
        println("这是计算斐波那契数列的程序")
        println("请输入项数：")
        var detect:Boolean = false
        val jk = arrayOf(false)
        var symbol:Boolean = false
        for(detect in jk)
        {
            try
            {
                val num = readLine()!!.toInt()
            }
            catch (e:NumberFormatException)
            {
                println("请输入正整数！")
            }
        }

        var result:Long
        var a:Long = 1
        var b:Long = 1
        var temp:Long
        if(num<=0)
        {
            throw Exception("请输入正整数！")
        }
        if(num==1) println("第 1 项是：1")
        if(num==2)
        {
            println("第 1 项是：1")
            println("第 2 项是：1")
        }
        if(num>2)
        {
            if(num<=92)
            {
                println("第 1 项是：1")
                println("第 2 项是：1")
                for (i in 3..num)
                {
                    result = a + b
                    println("第 $i 项是：$result")
                    temp = b
                    b = a + b
                    a = temp
                }
            }
        }
            if(num>92) println("您所计算的数值已超过Long类型范围，请计算92项及以前的数列")



    }
}


fun main(){
    Main().test()
}