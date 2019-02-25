#### Effects

Anything other than just a warm CPU.

Input/Output <!-- .element: class="fragment" data-fragment-index="1" -->
 - Network  <!-- .element: class="fragment" data-fragment-index="2" -->
 - Display  <!-- .element: class="fragment" data-fragment-index="3" -->
 - File  <!-- .element: class="fragment" data-fragment-index="4" -->
 - Disk  <!-- .element: class="fragment" data-fragment-index="5" -->
 - Database  <!-- .element: class="fragment" data-fragment-index="6" -->
 - etc...  <!-- .element: class="fragment" data-fragment-index="7" -->


================================

#### Side Effects

> In computer science, a function or expression is said to have a side effect if it modifies some state outside its local environment, that is to say has an observable interaction with the outside world *besides returning a value.*

-- Wikipedia

================================

##### Side Effects Example:

```tut
def addTwo(i: Int): Int = {
  println(s"It was ${i}, launch the missiles!!")
  i + 2
}
val j = addTwo(2)
```
