# IRA PICTURE [![Build Status](https://travis-ci.org/nomensa/jquery.hide-show.svg)](https://travis-ci.org/nomensa/jquery.hide-show.svg?branch=master)

   ```https://developer.android.com/guide/topics/resources/runtime-changes.```
  
## Handle configuration changes `android:configChanges`

``The most commonly used values are "orientation", "screenSize", and "keyboardHidden". The "orientation" value prevents restarts when the screen orientation changes. The "screenSize" value also prevents restarts when orientation changes, but beginning in Android 3.2 (API level 13). If you want to manually handle configuration changes in your app you must declare both the "orientation" and "screenSize" values in the android:configChanges attributes. The "keyboardHidden" value prevents restarts when the keyboard availability changes. You can declare multiple configuration values in the attribute by separating them with a pipe | character.``

```java
<activity
    android:name=".SplashActivity"
    android:configChanges="orientation|screenSize"
    android:theme="@style/Theme.AppCompat.NoActionBar">
    <intent-filter>
	<action android:name="android.intent.action.MAIN" />

	<category android:name="android.intent.category.LAUNCHER" />
    </intent-filter>
</activity>
```
<p class="note"><strong>Note:</strong> In order to receive implicit intents, you must include the
<code><a href="https://developer.android.com/reference/android/content/Intent.html#CATEGORY_DEFAULT">CATEGORY_DEFAULT</a></code> category in the intent filter. The methods
<code><a href="https://developer.android.com/reference/android/app/Activity.html#startActivity(android.content.Intent)">startActivity()</a></code> and
<code><a href="https://developer.android.com/reference/android/app/Activity.html#startActivityForResult(android.content.Intent, int)">startActivityForResult()</a></code> treat all intents
as if they declared the <code><a href="https://developer.android.com/reference/android/content/Intent.html#CATEGORY_DEFAULT">CATEGORY_DEFAULT</a></code> category.
If you do not declare it in your intent filter, no implicit intents will resolve to
your activity.</p>

## Research about this library: hawk
<img align="right" src="https://github.com/orhanobut/hawk/raw/master/art/hawk-logo.png" width="128" height="128" style="max-width:100%;"> 
<img src = "https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/x.png" width="75px" height="40px"/>  ```java compile "com.orhanobut:hawk:2.0.1" ```

## We Research about "Observe Design Pattern"

When to use it:
1. When one object changes its state,then all other dependents object must automatically change their state to maintain consistency
2. When subject doesn't know about number of observers it has.
3. When an object should be able to notify other objects without knowing who objects are.


