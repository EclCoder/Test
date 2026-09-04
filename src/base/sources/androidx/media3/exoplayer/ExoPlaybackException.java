package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f4872q = w1.c0.s0(1001);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f4873r = w1.c0.s0(1002);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f4874s = w1.c0.s0(BackupConstant.SCENE_CLOSED_WITHOUT_SHOW);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f4875t = w1.c0.s0(1004);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f4876u = w1.c0.s0(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f4877v = w1.c0.s0(1006);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f4878j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f4879k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f4880l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t1.o f4881m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f4882n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.r.b f4883o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final boolean f4884p;

    private ExoPlaybackException(int i10, Throwable th2, int i11) {
        this(i10, th2, null, i11, null, -1, null, 4, false);
    }

    public static ExoPlaybackException h(Throwable th2, String str, int i10, t1.o oVar, int i11, boolean z10, int i12) {
        if (oVar == null) {
            i11 = 4;
        }
        return new ExoPlaybackException(1, th2, null, i12, str, i10, oVar, i11, z10);
    }

    public static ExoPlaybackException i(IOException iOException, int i10) {
        return new ExoPlaybackException(0, iOException, i10);
    }

    public static ExoPlaybackException j(RuntimeException runtimeException, int i10) {
        return new ExoPlaybackException(2, runtimeException, i10);
    }

    private static String k(int i10, String str, String str2, int i11, t1.o oVar, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i11 + ", format=" + oVar + ", format_supported=" + w1.c0.V(i12);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    ExoPlaybackException g(androidx.media3.exoplayer.source.r.b bVar) {
        return new ExoPlaybackException((String) w1.c0.h(getMessage()), getCause(), this.f4619a, this.f4878j, this.f4879k, this.f4880l, this.f4881m, this.f4882n, bVar, this.f4620b, this.f4884p);
    }

    private ExoPlaybackException(int i10, Throwable th2, String str, int i11, String str2, int i12, t1.o oVar, int i13, boolean z10) {
        this(k(i10, str, str2, i12, oVar, i13), th2, i11, i10, str2, i12, oVar, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    private ExoPlaybackException(String str, Throwable th2, int i10, int i11, String str2, int i12, t1.o oVar, int i13, androidx.media3.exoplayer.source.r.b bVar, long j10, boolean z10) {
        super(str, th2, i10, Bundle.EMPTY, j10);
        w1.a.a(!z10 || i11 == 1);
        w1.a.a(th2 != null || i11 == 3);
        this.f4878j = i11;
        this.f4879k = str2;
        this.f4880l = i12;
        this.f4881m = oVar;
        this.f4882n = i13;
        this.f4883o = bVar;
        this.f4884p = z10;
    }
}
