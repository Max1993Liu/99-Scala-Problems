def nth[A](n: Int, ls: List[A]): A = {
  if (ls.length < n) throw new Exception("No such element")
  ls(n)
}

def nthRecursive[A](n: Int, ls: List[A]): A = (n, ls) match {
  case (0, h::_) => h
  case (_, h::tail) => nthRecursive(n-1, tail)
  case (_, Nil) => throw new Exception("No such element")
}
