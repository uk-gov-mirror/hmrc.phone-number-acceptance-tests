import sbt.*

object Dependencies {

  val test: Seq[ModuleID] = Seq(
    "uk.gov.hmrc"                  %% "api-test-runner"          % "0.10.0",
    "uk.gov.hmrc.mongo"            %% "hmrc-mongo-test-play-30"  % "2.12.0"
  ).map(_ % Test)
}
