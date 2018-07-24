def length[A](ls: List[A]): Int = {
  ls.length
}

def lengthRecursive[A](ls: List[A]): Int = {
  def lengthR(n: Int, l: List[A]): Int = l match {
    case Nil => n
    case _ :: tail => lengthR(n+1, tail)
  }
  lengthR(0, ls)
}
