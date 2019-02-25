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

def GoF = g compose f
def GoF2 = f andThen g
```

================================

### Effectful Function Composition

```tut:invisible
import cats.effect._, cats._, cats.data._
```
```tut:nofail
def ef: A => IO[B] = ???
def eg: B => IO[C] = ???

def GoF = eg compose ef
```

================================

### Kleisli

```tut
def ef: A => IO[B] = ???
def kf = Kleisli(ef)
def eg: B => IO[C] = ???
def kg = Kleisli(eg)

def GoFK = kg compose kf
def GoF = GoFK.run
```

--------------------------------

## Conceptual Refresher

Questions?
