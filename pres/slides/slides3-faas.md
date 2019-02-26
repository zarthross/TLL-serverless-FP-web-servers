### What is AWS Lambda?

- FaaS (Function as a Service) <!-- .element: class="fragment" data-fragment-index="1" -->
- 'Serverless' <!-- .element: class="fragment" data-fragment-index="2" -->
  - ... other peoples servers <!-- .element: class="fragment" data-fragment-index="3"  -->
- A way to execute some code in response to some event <!-- .element: class="fragment" data-fragment-index="4" -->

================================

### Event?

In AWS Lambda
- AWS Simple Queue Service messages
- AWS DynamoDB updates
- AWS S3 Uploads
- Http Requests (AWS Api Gateway)
- AWS CloudWatch Events
- AWS IoT button
- [etc...](https://docs.aws.amazon.com/lambda/latest/dg/invoking-lambda-function.html#intro-core-components-event-sources)

================================

## Why FaaS?

- Cost <!-- .element: class="fragment" data-fragment-index="1" -->
 - Pay only when your code is actually run <!-- .element: class="fragment" data-fragment-index="2" -->
 - Cheaper <!-- .element: class="fragment" data-fragment-index="3" -->
- 'Elastic' <!-- .element: class="fragment" data-fragment-index="4" -->
 - Auto up/down scaling without worry <!-- .element: class="fragment" data-fragment-index="5" -->
 - As many functions run as needed to meet load <!-- .element: class="fragment" data-fragment-index="6" -->
- Maintainability <!-- .element: class="fragment" data-fragment-index="7" -->
 - 'No' pesky servers to update. <!-- .element: class="fragment" data-fragment-index="8" -->
- Cost! <!-- .element: class="fragment" data-fragment-index="9" -->
 - Yes it's listed twice. <!-- .element: class="fragment" data-fragment-index="10" -->

================================

## Why NOT FaaS?

- Latency  <!-- .element: class="fragment" data-fragment-index="1" -->
 - Cold Functions  <!-- .element: class="fragment" data-fragment-index="2" -->
- Time Limited  <!-- .element: class="fragment" data-fragment-index="3" -->
- Debugging/Profiling is painful  <!-- .element: class="fragment" data-fragment-index="4" -->
 - Can't just attach a debugger.  <!-- .element: class="fragment" data-fragment-index="5" -->
- Vendor Lock in.  <!-- .element: class="fragment" data-fragment-index="6" -->

Note:
Keep your lambda integration code small
to reduce vendor lock in.

My function has a cold start of about 20 seconds
with a jar file of 40mb.

--------------------------------

## What is AWS Api Gateway

- An API Gateway <!-- .element: class="fragment" data-fragment-index="1" -->
- Basically a Proxy for APIs <!-- .element: class="fragment" data-fragment-index="2" -->

================================

## AWS API Gateway - Features

- Monitoring/Logging (CloudWatch)
- Scalable
- Websockets
- Security Controls
- Cacheable
- Proxy
 - Amazon EC2
 - AWS Lambda
 - VPCs/Private Data centers
 - AND MUCH MORE <!-- .element: class="fragment" data-fragment-index="1" -->

================================

## AWS API Gateway + AWS Lambda?

================================

Http Request  ->
![Math](https://upload.wikimedia.org/wikipedia/commons/3/3b/Function_machine2.svg) <!-- .element: style="background-color:#ffffffff;" -->
->  Http Response

================================

### AWS API Gateway Request

```javascript
{
"resource": "Resource path",
"path": "Path parameter",
"httpMethod": "Incoming request's method name"
"headers": {/*String containing incoming request headers*/}
"multiValueHeaders": {/*List of strings containing incoming request headers*/}
"queryStringParameters": {/*query string parameters*/}
"multiValueQueryStringParameters": {/*List of query string parameters*/}
"pathParameters":  {/*path parameters*/}
"stageVariables": {/*Applicable stage variables*/}
"requestContext": {/*Request context, including authorizer-returned key-value pairs*/}
"body": "A JSON string of the request payload."
"isBase64Encoded": true|false
/*A boolean flag to indicate if the applicable request payload is Base64-encode*/
}
```
<!-- .element: class="stretch"-->

================================

### AWS API Gateway Response
```javascript
{
"isBase64Encoded": true|false,
"statusCode": httpStatusCode,
"headers": { "headerName": "headerValue", ... },
"multiValueHeaders": {
    "headerName": ["headerValue", "headerValue2", ...], ...
},
"body": "..."
}
```

================================

## What about the JVM code?

```scala
def handle(requestStream:  java.io.InputStream,
           responseStream: java.io.OutputStream): Unit
```
<!-- .element: class="fragment" data-fragment-index="1" -->

Note:
And this is it! You just have to handle the request and response!
