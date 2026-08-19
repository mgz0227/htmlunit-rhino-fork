package org.mozilla.javascript.android;

import android.app.LocaleManager;

public final class MissingSignatureMethods {

    private MissingSignatureMethods() {}

    public static String available() {
        return "available";
    }

    public static String missingParameter(LocaleManager localeManager) {
        return localeManager == null ? "null" : "available";
    }

    public static LocaleManager missingReturn() {
        return null;
    }
}
