let target = Packages.org.mozilla.javascript.android.MissingSignatureMethods

assertEquals("available", target.available() + "")

if (android.os.Build.VERSION.SDK_INT >= 33) {
    assertEquals("null", target.missingParameter(null) + "")
    assertEquals(null, target.missingReturn())
}

"success"
