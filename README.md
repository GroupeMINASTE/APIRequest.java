# APIRequest

[![License](https://img.shields.io/github/license/GroupeMINASTE/APIRequest.java)](LICENSE)
[![Issues](https://img.shields.io/github/issues/GroupeMINASTE/APIRequest.java)]()
[![Pull Requests](https://img.shields.io/github/issues-pr/GroupeMINASTE/APIRequest.java)]()
[![Code Size](https://img.shields.io/github/languages/code-size/GroupeMINASTE/APIRequest.java)]()
[![CodeFactor](https://www.codefactor.io/repository/github/groupeminaste/apirequest.java/badge)](https://www.codefactor.io/repository/github/groupeminaste/apirequest.java)
[![Open Source Helpers](https://www.codetriage.com/groupeminaste/apirequest.java/badges/users.svg)](https://www.codetriage.com/groupeminaste/apirequest.java)

An android library to interact with a REST API

## Installation

Add the following to your `build.gradle` file:

```groovy
repositories {
    mavenCentral()
}

dependencies {
    implementation 'me.nathanfallet.apirequest:apirequest:1.0.4'
}
```

## Usage

```kotlin
// When your app starts, set the default configuration
APIConfiguration.current = APIConfiguration("api.example.com")

// And then call your API
// This is an equivalent to get `https://api.example.com/path/to/api?custom=parameter` and parse the response from JSON
APIRequest("GET", "/path/to/api")
    .with("custom", "parameter")
    .execute { result, status ->
        
    }
```

See the [full documentation](documentation.md) for a complete guide.

## Example

See the embedded app for a sample

## Donate to the developer

Feel free to make a donation to help the developer to make more great content! [Donate now](https://paypal.me/paynathanfallet)

## iOS version

This package is also available for iOS: [APIRequest.swift](https://github.com/GroupeMINASTE/APIRequest.swift)
