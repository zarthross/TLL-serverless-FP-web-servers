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
