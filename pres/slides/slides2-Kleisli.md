# Kleisli Arrow

Note:
Lets talk about

================================

### Function Composition

```tut:invisible
import scala.reflect.runtime.universe._

trait A
trait B
trait C
```
```tut
def f: A => B = ???
def g: B => C = ???

def GoF = g compose f // A => B => C
def F_G = f andThen g // A => B => C
```

================================

### Effectful Function Composition

```tut:invisible
import cats.effect._, cats._, cats.data._
```
```tut:nofail
def fe: A => IO[B] = ???
def ge: B => IO[C] = ???

def Fe_Ge = fe andThen ge // A => IO[B] ...?
```

================================

### Kleisli

```tut
def fk = Kleisli(fe) // fe: A => IO[B]
def gk = Kleisli(ge) // ge: B => IO[C]

def Fk_Gk_k = fk andThen gk // A => IO[B] ~ B => IO[C]
def Fk_Gk = Fk_Gk_k.run
```

--------------------------------

## Conceptual Refresher

Questions?
