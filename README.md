# android-fun-facts-with-lambdas
Example of lambdas in Android with new Android Studio/build tools preview.

With the release of the Android N preview and it's new build tools there is now official support for lambda expressions
first introduced in Java 8.  Significantly this support is backward-compatable with previous OS versions.  All you need is the
latest preview build of Android Studio 2.1, SDK, and build tools.  (YMMV, Things May Break, etc.)  

[Java 8 Language Features in Android N](http://developer.android.com/preview/j8-jack.html)

[Setting up the Android N Preview](http://developer.android.com/preview/setup-sdk.html)

It's a simple app with a button/click handler that updates a displayed trivia fact. The upper button uses a lambda expression for
the click handler and the lower one uses a method reference.  The app is originally from a [Treehouse](http://teamtreehouse.com)
course, an earlier version of https://github.com/treehouse/android-fun-facts-github.
