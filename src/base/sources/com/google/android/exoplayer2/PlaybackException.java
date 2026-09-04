package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class PlaybackException extends Exception implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f16423c = ob.r0.y0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f16424d = ob.r0.y0(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f16425e = ob.r0.y0(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f16426f = ob.r0.y0(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f16427g = ob.r0.y0(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g.a f16428h = new g.a() { // from class: com.google.android.exoplayer2.u1
        @Override // com.google.android.exoplayer2.g.a
        public final g a(Bundle bundle) {
            return new PlaybackException(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16430b;

    protected PlaybackException(Bundle bundle) {
        this(bundle.getString(f16425e), c(bundle), bundle.getInt(f16423c, 1000), bundle.getLong(f16424d, SystemClock.elapsedRealtime()));
    }

    private static RemoteException a(String str) {
        return new RemoteException(str);
    }

    private static Throwable b(Class cls, String str) {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    private static Throwable c(Bundle bundle) {
        String string = bundle.getString(f16426f);
        String string2 = bundle.getString(f16427g);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, PlaybackException.class.getClassLoader());
            Throwable thB = Throwable.class.isAssignableFrom(cls) ? b(cls, string2) : null;
            return thB == null ? a(string2) : thB;
        } catch (Throwable unused) {
            return a(string2);
        }
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f16423c, this.f16429a);
        bundle.putLong(f16424d, this.f16430b);
        bundle.putString(f16425e, getMessage());
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(f16426f, cause.getClass().getName());
            bundle.putString(f16427g, cause.getMessage());
        }
        return bundle;
    }

    protected PlaybackException(String str, Throwable th2, int i10, long j10) {
        super(str, th2);
        this.f16429a = i10;
        this.f16430b = j10;
    }
}
