enablePlugins(TutPlugin)

scalaVersion in ThisBuild := "2.12.8"

tutSourceDirectory := baseDirectory.value / "src/slides"
watchSources += baseDirectory.value / "src/slides"
tut := {
	val r = tut.value
	val revealFolder = baseDirectory.value / "reveal.js"
	tutTargetDirectory.value.listFiles().foreach(
		file => Sync.copy(file, revealFolder / file.name)
	)
	r
}

scalacOptions ++= Seq(
	"-Ypartial-unification",
	"-feature",                          // Emit warning and location for usages of features that should be imported explicitly.
	"-language:existentials",            // Existential types (besides wildcard types) can be written and inferred
	"-language:experimental.macros",     // Allow macro definition (besides implementation and application)
	"-language:higherKinds",             // Allow higher-kinded types
	"-language:implicitConversions"     // Allow definition of implicit functions called views
)

libraryDependencies ++= Seq(
	"org.typelevel" %% "cats-effect" % "0.10.1",
	"org.typelevel" %% "cats-core" % "1.2.0",
	"org.typelevel" %% "cats-mtl-core" % "0.2.1",
	"com.github.mpilquist" %% "simulacrum" % "0.13.0"
)

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.7")
