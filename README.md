# Dog API App

The purpose of this app is to generate random dog images when a user click the "NEW PUP" button.

## Issues

I am currently only getting build errors:
```bash
> A failure occurred while executing com.android.build.gradle.internal.tasks.CheckAarMetadataWorkAction
   > The minCompileSdk (31) specified in a
     dependency's AAR metadata (META-INF/com/android/build/gradle/aar-metadata.properties)
     is greater than this module's compileSdkVersion (android-30).
     Dependency: androidx.core:core-ktx:1.7.0.
     AAR metadata file: C:\Users\19178\.gradle\caches\transforms-2\files-2.1\1feeb76a5144ab87511629eac88d4f4c\core-ktx-1.7.0\META-INF\com\android\build\gradle\aar-metadata.properties.

```
And
```bash
The minCompileSdk (31) specified in a
dependency's AAR metadata (META-INF/com/android/build/gradle/aar-metadata.properties)
is greater than this module's compileSdkVersion (android-30).
Dependency: androidx.core:core-ktx:1.7.0.
AAR metadata file: C:\Users\19178\.gradle\caches\transforms-2\files-2.1\1feeb76a5144ab87511629eac88d4f4c\core-ktx-1.7.0\META-INF\com\android\build\gradle\aar-metadata.properties.

```
