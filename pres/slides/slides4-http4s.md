## Http4s

![Http4s](https://http4s.org/images/http4s-logo.svg) <!-- .element: height="150px"-->

- FP Http Server for Scala
- [http4s.org](https://http4s.org)
- Typelevel project
- (I'm a contributor)

Note:
Lets talk about Http4s now... and what makes it special

================================

#### Anatomy of a Http4s App.

```tut:invisible
import cats._, cats.data._, cats.effect._
trait Request[F[_]]
trait Response[F[_]]
```
```scala
type HttpApp[F[_]] = Kleisli[F, Request[F], Response[F]]
// HttpApp[F[_]] === Request[F] => F[Response[F]]
```

Note:
What if you want to make a partial app?
You don't want those partials to return not founds?

================================

#### Anatomy of a Http4s Routes.

```scala
type HttpRoutes[F[_]] =
  Kleisli[OptionT[F, ?], Request[F], Response[F]]
// HttpRoutes[F[_]] === Request[F] => F[Option[Response[F]]]
```

Note:
The OptionT here allows the HttpRoutes Function
to be partial

================================

##### Doesn't that look like an AWS Lambda?

```
Request => Response
```
<!-- .element: class="fragment" data-fragment-index="1" -->

Note:
A lot of frameworks use MVC Style,
Like Spring Boot, Play Framework, Django

================================

###### How do we convert a `HttpApp[F]` into a lambda function?

1. Read Request from InputStream. <!-- .element: class="fragment" data-fragment-index="1" -->
1. Run HttpApp <!-- .element: class="fragment" data-fragment-index="2" -->
1. Write Response to OutputStream <!-- .element: class="fragment" data-fragment-index="3" -->
1. ??? <!-- .element: class="fragment" data-fragment-index="4" -->
1. COST SAVINGS!!! <!-- .element: class="fragment" data-fragment-index="5" -->
