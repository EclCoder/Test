package com.googlecode.mp4parser.util;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class AndroidLogger extends Logger {
    private static final String TAG = "isoparser";
    String name;

    public AndroidLogger(String str) {
        this.name = str;
    }

    @Override // com.googlecode.mp4parser.util.Logger
    public void logDebug(String str) {
        Log.d(TAG, String.valueOf(this.name) + ":" + str);
    }

    @Override // com.googlecode.mp4parser.util.Logger
    public void logError(String str) {
        Log.e(TAG, String.valueOf(this.name) + ":" + str);
    }

    @Override // com.googlecode.mp4parser.util.Logger
    public void logWarn(String str) {
        Log.w(TAG, String.valueOf(this.name) + ":" + str);
    }
}
