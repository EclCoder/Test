package com.facebook.ads.redexgen.core;

import android.system.ErrnoException;
import android.system.OsConstants;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C10205k {
    public static boolean A00(Throwable th2) {
        return (th2 instanceof ErrnoException) && ((ErrnoException) th2).errno == OsConstants.EACCES;
    }
}
