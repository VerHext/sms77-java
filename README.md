# sms77 java client
This is an unoffical client to interact with sms77.io API. 
You can easy send SMS or fetch status reports directly from java.

This lib is not offical linked to the Company SMS77.

# Example

1. First we need to create a api instance. We can use the `SMS77Builder`.
To interact with this rest api, we need a api token. You can get that from your personal settings page. Visit: https://app.sms77.io/settings#httpapi
To secure your application, you can limit the access by ip. For this example, we don't set any deep secturity adjustment.
This is a example code to build a api client instance.
```java
SMS77 client = new SMS77Builder().apiToken("INSERT_YOUR_API_TOKE_HERE")
                .build();
```

2. Now we can start to dispatch a new short message. For this we create a SMS constructor. 
The required fileds are `to` and `text`. By the way, you can use phonenumbers in any format. The SMS77.io api has a powerful integrated phone number parser.

*Notice* If you want test the api without any charge, set the property `debug(true)`. So the short message is not rely sent and ther is no cost.
```java
 SMS sms = new SMS();
    sms.debug(true);
    sms.to("017xxxxxx");
    sms.text("Test message. Say hello to the world!");

```

3. Send this message to the recipients
Now we are ready to send this short message.
```java
    SMSResponse response = client.dispatch().create(sms);
```
Yeah, we sent now a sms to the recipients. The SMSReponse includes a `json` object with a lot of useful information.

# License

This project is licensed under the MIT license.