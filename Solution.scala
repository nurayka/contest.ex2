object Solution {
  def tribonacci(n: Int): Int = {
val dp=Array(0,1,1)
    if (n<=2){
    return dp(n)
    }
    for (i<-3 until(n)){
val a=dp(0)+dp(1)+dp(1)
      dp(0)=dp(1)
      dp(1)=dp(2)
      dp(2)=a
    }
    dp(2)
  }
}
