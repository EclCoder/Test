package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class Asserts {
    private Asserts() {
        throw new AssertionError("Uninstantiable");
    }

    public static void checkMainThread(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        String strValueOf = String.valueOf(Thread.currentThread());
        String strValueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 56 + strValueOf2.length() + 1);
        sb2.append("checkMainThread: current thread ");
        sb2.append(strValueOf);
        sb2.append(" IS NOT the main thread ");
        sb2.append(strValueOf2);
        sb2.append("!");
        Log.e("Asserts", sb2.toString());
        throw new IllegalStateException(str);
    }

    public static void checkNotMainThread(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        String strValueOf = String.valueOf(Thread.currentThread());
        String strValueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 55 + strValueOf2.length() + 1);
        sb2.append("checkNotMainThread: current thread ");
        sb2.append(strValueOf);
        sb2.append(" IS the main thread ");
        sb2.append(strValueOf2);
        sb2.append("!");
        Log.e("Asserts", sb2.toString());
        throw new IllegalStateException(str);
    }

    public static void checkNotNull(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    public static void checkNull(Object obj) {
        if (obj != null) {
            throw new IllegalArgumentException("non-null reference");
        }
    }

    public static void checkState(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void checkNotNull(Object obj, Object obj2) {
        if (obj == null) {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
    }

    public static void checkNull(Object obj, Object obj2) {
        if (obj != null) {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
    }

    public static void checkState(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
