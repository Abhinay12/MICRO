# MICRO

registry-service  is the main registry system through which dervice services  are connected

For Routing Zuul server is used to transfer the call  based on request

http://localhost:8761/ecommerce/ecommerce-service   will redirect to ecommerce srvice



In ecommerce srvice we are using Feign Client to get the Payment info by calling above API it will return the response as "Hello Abhinay Responsed on : Fri Apr 02 21:59:00 IST 2021ECommomData"
