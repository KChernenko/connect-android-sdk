# Connect Android SDK
This repository contains code for the Zendesk Connect Android SDK.

It's written in Java, XML, and Kotlin. It uses the Gradle build system.

## Documentation

The developer documentation can be found [here](https://developer.zendesk.com/embeddables/docs/connect/android).

The Javadoc can be found [here](https://zendesk.github.io/mobile_sdk_javadocs/?m=connect).

## Dependencies

| Dependency | Version |
| :--- | :---: |
| Min SDK | 19 |
| Target SDK | 28 |
| androidx.appcompat:appcompat | 1.0.1 |
| androidx.annotation:annotation | 1.0.1 |
| androidx.work:work-runtime | 2.1.0 |
| com.google.android.material:material | 1.0.0 |
| com.google.firebase:firebase-messaging | 19.0.1 |
| com.google.dagger:dagger | 2.23.2 |
| com.google.code.gson:gson | 2.8.5 |
| com.squareup.retrofit2:retrofit | 2.6.0 |
| com.squareup.retrofit2:converter-gson | 2.6.0 |
| com.squareup.tape2:tape | 2.0.0-beta1 |

## Structure

This repo has a number of modules:
* **`ConnectSDK`** - provides an API for interacting with the Connect back-end
* **`NetworkClient`** - networking client used to send requests. Generated by our code generation tool `Tribble`
* **`ConnectSampleApp`** - sample application to act as the host app for testing the SDK during development

## Getting Started

### Prerequisites

You'll need [Android Studio](http://developer.android.com/sdk/index.html) and a [JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) installed on your machine.

### Environment setup

To be able to run the sample application, you are required to provide a Connect private API key.
Create or update your `~/.gradle/gradle.properties` to include the following:

* `CONNECT_PRIVATE_KEY=<your-private-key>`

## Testing

Please run all tests before opening a pull request. This can be done by running `./gradlew test`.

## Contribute

Please see our [CONTRIBUTING.md](.github/CONTRIBUTING.md) file for details on how to contribute.
