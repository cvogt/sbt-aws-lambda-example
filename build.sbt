enablePlugins(AwsLambdaPlugin)

lambdaHandlers := Seq(
  "function1"                 -> "org.cvogt.Lambda::helloWorld"
)

// or, instead of the above, for just one function/handler
//
// lambdaName := Some("function1")
//
// handlerName := Some("com.gilt.example.Lambda::handleRequest1")

s3Bucket := Some("aws-lambda-jars")

awsLambdaMemory := Some(192)

awsLambdaTimeout := Some(30)

roleArn := Some("arn:aws:iam::040110051033:role/lambda_basic_execution")
