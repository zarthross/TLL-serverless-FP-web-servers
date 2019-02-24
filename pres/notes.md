
Things to install:
http://www.scala-sbt.org/
http://serverless.com/
https://github.com/sapessi/serverless-sam

# Goals:
1. Take my standard http4s/rho app with a postgres database and make into an aws lambda function.
2. Make it so it can still run as a standard http4s app (for local development)
3. Make deployment into AWS push button



## Testing:

1. `serverless sam export  -o template.yml`
1. Edit the `timeout` in the generated template (or you'll get time out)
1. `sam local start-api`

### Conceptual Refresher:

- First Class Functions
- Effect (Side or Otherwise)
- Pure Functions
 - Referential Transparency
 - No Side Effects
- Kleisli  Arrow


# AWS Specifics Lambda
https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-lambda-proxy-integrations.html#api-gateway-simple-proxy-for-lambda-input-format
#https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-lambda-proxy-integrations.html#api-gateway-simple-proxy-for-lambda-output-format

## Important things to say:
The app MUST be stateless


# References
- Motivation: https://github.com/howardjohn/scala-server-lambda
- https://serverless.com/framework/docs/providers/aws/


Java/Spring app Lambda: https://github.com/awslabs/aws-serverless-java-container
