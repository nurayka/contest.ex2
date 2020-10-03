object Solution {
  def tribonacci(n: Int): Int = {
    val dp=Array(0,1,1)
    val m =List((n+1),3)
    dp=dp(0)* m.max((n+1),3)

  }

  }