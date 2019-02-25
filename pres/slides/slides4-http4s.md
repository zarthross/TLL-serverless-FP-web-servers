## Http4s

![Http4s](https://http4s.org/images/http4s-logo.svg) <!-- .element: height="150px"-->

- FP Http Server for Scala
- [http4s.org](https://http4s.org)
- Typelevel project
- (I'm a contributor)

================================

#### Anatomy of a Http4s App.

```tut:invisible
import cats._, cats.data._, cats.effect._
trait Request[F[_]]
trait Response[F[_]]
```
```tut:book
type HttpApp[F[_]]= Kleisli[F, Request[F], Response[F]]
```

Note:
What if you want to make a partial app?
You don't want those partials to return not founds?

================================

#### Anatomy of a Http4s Routes.

```tut:book
type HttpRoutes[F[_]] =
  Kleisli[OptionT[F, ?], Request[F], Response[F]]
```

Note:
The OptionT here allows the HttpRoutes Function
to be partial
