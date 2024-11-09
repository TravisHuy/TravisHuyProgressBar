<!--lint disable-->
<a href="https://github.com/TravisHuy/TravisHuyProgressBar">  
<img src="https://github.com/user-attachments/assets/e956d2d2-7a01-4d02-9480-6ffff4e39b82">  
</br>	
<img src="https://github.com/user-attachments/assets/a3e59faf-9c4e-40be-82e4-4e198ad1f81a">  
</a>  
<h1 align="center">Android ProgressBar</h1>  
<p align="center">Just add the progress you want to view. </p>  
<li>Easy to use. </li>
<li>You can edit the color as like. </li>
<li>Use with Java or Kotlin.</p>
</br>

[![license](https://img.shields.io/github/license/denzcoskun/imageslideshow.svg?style=popout)](https://opensource.org/licenses/Apache-2.0)
[![](https://jitpack.io/v/TravisHuy/TravisHuyProgressBar.svg)](https://jitpack.io/#TravisHuy/TravisHuyProgressBar)
# TravisHuyProgressBar

`TravisHuyProgressBar` is a customizable progress bar for Android that allows you to set gradient colors, corner radius, and various other attributes. It supports custom progress values and background colors.

## Features

- **Custom Progress Bar**: Draws a progress bar with gradient colors.
- **Gradient Colors**: Supports setting gradient colors from XML or programmatically.
- **Corner Radius**: Allows customization of the corner radius.
- **Background Color**: Change the background color of the progress bar.
## Usage
- Add ProgressBar to your **layout**
```xml  
<com.nhathuy.travishuyprogressbar.TravisHuyProgressBar
        android:id="@+id/progressBar"
        android:layout_width="match_parent"
        android:layout_height="10dp"
        app:startColor="#F44336"
        app:endColor="#FFEB3B"
        app:backgroundColor="#E0E0E0"
        app:cornerRadius="2dp"
        app:progress="75"
        app:max="100" /> 
```  
-   You can change color.
```xml  
  app:startColor="#F44336"
  app:endColor="#FFEB3B"
```  
-   You can change backgroundColor.
```xml  
app:backgroundColor="#E0E0E0"  
```  
-   You can change progress and max.
```xml  
app:progress="75"
app:max="100
```  

### Adding ProgressBar to Your Activity

In your activity or fragment, you can set up the `TravisHuyProgressBar` as follows:

#### Kotlin

```kt
val progressBar = findViewById<TravisHuyProgressBar>(R.id.travis_huy_progress_bar)

// Set progress and max values
progressBar.setProgress(50)
progressBar.setMax(100)

// Set colors programmatically
progressBar.setStartColor(Color.RED)
progressBar.setEndColor(Color.BLUE)
progressBar.setBackgroundColor(Color.GRAY)
progressBar.setCornerRadius(8f)

// Set gradient colors
val gradientColors = intArrayOf(Color.RED, Color.YELLOW, Color.GREEN)
progressBar.setGradientColors(gradientColors)

#### Java

```java
TravisHuyProgressBar progressBar = findViewById(R.id.travis_huy_progress_bar);

// Set progress and max values
progressBar.setProgress(50);
progressBar.setMax(100);

// Set colors programmatically
progressBar.setStartColor(Color.RED);
progressBar.setEndColor(Color.BLUE);
progressBar.setBackgroundColor(Color.GRAY);
progressBar.setCornerRadius(8f);

// Set gradient colors
int[] gradientColors = {Color.RED, Color.YELLOW, Color.GREEN};
progressBar.setGradientColors(gradientColors);
 
```  

## Setup

```xml  
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}

dependencies {
	implementation 'com.github.TravisHuy:TravisHuyProgressBar:0.1.0'
}
```  

## 📄 License

Copyright 2024 Ho Nhat Huy

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

<a href="http://www.apache.org/licenses/LICENSE-2.0"><b>License</b></a>

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  
See the License for the specific language governing permissions and limitations under the License.
<!--lint enable-->
