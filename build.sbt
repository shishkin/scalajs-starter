lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSBundlerPlugin)
  .settings(
    inThisBuild(
      List(
        organization := "com.example",
        version := "0.1-SNAPSHOT",
        scalaVersion := "2.12.8"
      )),
    name := "scalajs-starter",
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "0.9.6",
      "org.scalatest" %%% "scalatest" % "3.0.5" % "test"
    ),
    version in webpack := "4.27.1",
    version in startWebpackDevServer := "3.1.10",
    npmDevDependencies in Compile ++=
      Seq("html-webpack-plugin" -> "^3.2.0"),
    npmDependencies in Compile ++= Seq(),
    scalaJSUseMainModuleInitializer := true,
    webpackConfigFile := Some(baseDirectory.value / "webpack.config.js")
  )
