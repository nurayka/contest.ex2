object Solution {
  def tribonacci(n: Int): Int = {
 if (n==0){return n}
  var t0=0;
  var t1=1;
  var t2=1;
  var t=1;
  for(i<-3 to n ){
    t=t0+t1+t2;
    t0=t1;
    t1=t2;
    t2=t;
  }
  t
  }
}
