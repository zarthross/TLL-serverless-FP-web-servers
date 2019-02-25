![Tulsa Lambda Lunch](https://secure.meetupstatic.com/photos/event/5/1/3/7/600_458660791.jpeg)
<!-- .element: height="400px" -->

#### Tulsa Lambda Lunch

11:30am~12:30pm every last Tuesday

================================

[< Insert Obligatory Event Intro Here >](https://github.com/techlahoma/Event-Intro)

--------------------------------

#### Pure FP Web Apps in AWS Lambda using Http4s

![Cats](https://typelevel.org/cats/img/cats-logo.svg)  <!-- .element: height="150px"-->
![FS2](https://user-images.githubusercontent.com/118078/50014823-04c38d00-ff93-11e8-9b46-088f72555c07.png) <!-- .element: height="150px"-->
![Http4s](https://http4s.org/images/http4s-logo.svg) <!-- .element: height="150px"-->
![Aws Lambda](/images/AWS-Lambda.png) <!-- .element: height="150px"-->

--------------------------------

## Conceptual Refresher:

- Pure Functions
- Effect (Side or Otherwise)
- Kleisli  Arrow

--------------------------------

### Pure Functions

`Pure` Function  === Math Function

![Math](https://upload.wikimedia.org/wikipedia/commons/3/3b/Function_machine2.svg) <!-- .element: style="background-color:#ffffffff;" -->

================================

> A function is a process or a relation that associates each element x of a set X, the domain of the function, to a single element y of another set Y (possibly the same set), the codomain of the function

-- Wikipedia

================================

![Func](https://upload.wikimedia.org/wikipedia/commons/d/df/Function_color_example_3.svg) <!-- .element: style="background-color:#ffffffff;" -->

Note:
It maps ALL elements from X into elements on Y, nothing more.

================================

### Referentially Transparent

>  An expression is called referentially transparent if it can be replaced with its corresponding value without changing the program's behavior

-- Wikipedia

================================

#### Referentially Transparent (Example)

```tut
def addTwo(i: Int): Int = i + 2

val add2Twice = addTwo(2) + addTwo(2)

val addedTwo = addTwo(2)
val add2TwicePt2 = addedTwo   +  addedTwo

add2Twice == add2TwicePt2
```

================================

#### Not Referentially Transparent
##### (see Side Effect)

```tut:invisible
import scala.util.Random
```
```tut
def addRandom(i: Int): Int = i + Random.nextInt(10)

val addRandomTwice = addRandom(2) + addRandom(2)

val addedRandom = addRandom(2)
val addRandomTwicePt2 = addedRandom +  addedRandom

addRandomTwice == addRandomTwicePt2
```
