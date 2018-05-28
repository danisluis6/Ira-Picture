# LEVEL 1 [![Build Status](https://travis-ci.org/nomensa/jquery.hide-show.svg)](https://travis-ci.org/nomensa/jquery.hide-show.svg?branch=master)

   ```https://developer.android.com/guide/topics/resources/runtime-changes.```
  
## Content:
1. Setup Theme Splash and adjust color (PrimaryColor and StatusBarColor)
2. Build Structure SplashActivity > SharedMediaActivity > BaseActivity > ThemeActivity
3. Create Intent-Filter in SplashActivity and access data from Intent-Filter(Implicit Intent Filter)
4. Perform check permission when launch application at first.

## Structure: Folder
> <b>app</b>
>> Application.java

> di

>> component
>>> AppComponent.java<br>
>>> SplashComponent.java

>> module
>>> AppModule
>>> SplashModule

>> scope
>>> ActivityScope
> helper
>> ColorPalette

> other
>> ImplicitIntentFilter<br>
>> LogUtils<br>
>> PermissionCode<br>
>> PermissionUtils<br>
>> ThemeEditorUtils<br>
>> ToastUtils.java

> view
>> activity
>>> splash
>>>> SplashScreen.java

>>> SharedMediaActivity.java<br>
>>> ThemedActivity.java
>> fragment



