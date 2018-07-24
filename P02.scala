def penultimate[A](l: List[A]): A = {
  l.init.last
}

def penultimateRecursive[A](l: List[A]): A = l match {
  case h::_::Nil => h
  case _::tail => penultimateRecursive(tail)
  case _ => throw new Exception("No such element!")
}
