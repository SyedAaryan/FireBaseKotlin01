// Top-level build file where you can add configuration options common to all sub-projects/modules.


buildscript {
    dependencies {
        // Add this line
        classpath("com.google.gms:google-services:4.3.15")
    }
}
plugins {
    id("com.android.application") version "8.2.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}