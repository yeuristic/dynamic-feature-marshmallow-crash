# Usage:
run `./install app:bundleDebug`
this will use fake install manager  
Don't run the project directly by pressing play in Android Studio, because it will include the DF module at install time.  
The issue will only happend if we deliver the DF module on-demand, so use my `install` script to reproduce this.
