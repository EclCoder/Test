package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ExoPlaybackException extends PlaybackException {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final g.a f16403p = new g.a() { // from class: o9.f
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return ExoPlaybackException.d(bundle);
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f16404q = ob.r0.y0(1001);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f16405r = ob.r0.y0(1002);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f16406s = ob.r0.y0(BackupConstant.SCENE_CLOSED_WITHOUT_SHOW);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f16407t = ob.r0.y0(1004);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f16408u = ob.r0.y0(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f16409v = ob.r0.y0(1006);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f16410i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f16411j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f16412k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v0 f16413l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f16414m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ra.k f16415n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final boolean f16416o;

    private ExoPlaybackException(int i10, Throwable th2, int i11) {
        this(i10, th2, null, i11, null, -1, null, 4, false);
    }

    public static /* synthetic */ ExoPlaybackException d(Bundle bundle) {
        return new ExoPlaybackException(bundle);
    }

    public static ExoPlaybackException g(Throwable th2, String str, int i10, v0 v0Var, int i11, boolean z10, int i12) {
        if (v0Var == null) {
            i11 = 4;
        }
        return new ExoPlaybackException(1, th2, null, i12, str, i10, v0Var, i11, z10);
    }

    public static ExoPlaybackException h(IOException iOException, int i10) {
        return new ExoPlaybackException(0, iOException, i10);
    }

    public static ExoPlaybackException i(RuntimeException runtimeException) {
        return j(runtimeException, 1000);
    }

    public static ExoPlaybackException j(RuntimeException runtimeException, int i10) {
        return new ExoPlaybackException(2, runtimeException, i10);
    }

    private static String k(int i10, String str, String str2, int i11, v0 v0Var, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i11 + ", format=" + v0Var + ", format_supported=" + ob.r0.Z(i12);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    ExoPlaybackException e(ra.k kVar) {
        return new ExoPlaybackException((String) ob.r0.j(getMessage()), getCause(), this.f16429a, this.f16410i, this.f16411j, this.f16412k, this.f16413l, this.f16414m, kVar, this.f16430b, this.f16416o);
    }

    @Override // com.google.android.exoplayer2.PlaybackException, com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putInt(f16404q, this.f16410i);
        bundle.putString(f16405r, this.f16411j);
        bundle.putInt(f16406s, this.f16412k);
        v0 v0Var = this.f16413l;
        if (v0Var != null) {
            bundle.putBundle(f16407t, v0Var.toBundle());
        }
        bundle.putInt(f16408u, this.f16414m);
        bundle.putBoolean(f16409v, this.f16416o);
        return bundle;
    }

    private ExoPlaybackException(int i10, Throwable th2, String str, int i11, String str2, int i12, v0 v0Var, int i13, boolean z10) {
        this(k(i10, str, str2, i12, v0Var, i13), th2, i11, i10, str2, i12, v0Var, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    private ExoPlaybackException(Bundle bundle) {
        super(bundle);
        this.f16410i = bundle.getInt(f16404q, 2);
        this.f16411j = bundle.getString(f16405r);
        this.f16412k = bundle.getInt(f16406s, -1);
        Bundle bundle2 = bundle.getBundle(f16407t);
        this.f16413l = bundle2 == null ? null : (v0) v0.f18856p0.a(bundle2);
        this.f16414m = bundle.getInt(f16408u, 4);
        this.f16416o = bundle.getBoolean(f16409v, false);
        this.f16415n = null;
    }

    private ExoPlaybackException(String str, Throwable th2, int i10, int i11, String str2, int i12, v0 v0Var, int i13, ra.k kVar, long j10, boolean z10) {
        super(str, th2, i10, j10);
        ob.a.a(!z10 || i11 == 1);
        ob.a.a(th2 != null || i11 == 3);
        this.f16410i = i11;
        this.f16411j = str2;
        this.f16412k = i12;
        this.f16413l = v0Var;
        this.f16414m = i13;
        this.f16415n = kVar;
        this.f16416o = z10;
    }
}
