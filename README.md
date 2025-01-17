### Version
[![](https://jitpack.io/v/dangiashish/custom-calendar.svg)](https://jitpack.io/#dangiashish/custom-calendar)

### Gradle

Add repository in your `settings.gradle`

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```
#### OR
in your `settings.gradle.kts`
```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven( url = "https://jitpack.io")
    }
}

```

Updated

```gradle
pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
        maven( url = "https://jitpack.io")
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven( url = "https://jitpack.io")
    }
}
```
### Add dependency :

Add dependency in your `build.gradle` (module-level) file :

```groovy
dependencies{

    implementation 'com.github.dangiashish:custom-calendar:Tag'
}
```
#### OR
Add dependency in your `build.gradle.kts` (module-level) file :

```groovy
dependencies{

    implementation("com.github.dangiashish:custom-calendar:Tag")
}
```

#### Thank You !
