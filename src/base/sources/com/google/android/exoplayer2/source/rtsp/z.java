package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f18128c = new z(0, C.TIME_UNSET);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f18129d = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18131b;

    private z(long j10, long j11) {
        this.f18130a = j10;
        this.f18131b = j11;
    }

    public static String b(long j10) {
        return r0.D("npt=%.3f-", Double.valueOf(j10 / 1000.0d));
    }

    public static z d(String str) throws ParserException {
        long j10;
        Matcher matcher = f18129d.matcher(str);
        u.a(matcher.matches(), str);
        String strGroup = matcher.group(1);
        u.a(strGroup != null, str);
        long j11 = ((String) r0.j(strGroup)).equals("now") ? 0L : (long) (Float.parseFloat(strGroup) * 1000.0f);
        String strGroup2 = matcher.group(2);
        if (strGroup2 != null) {
            try {
                j10 = (long) (Float.parseFloat(strGroup2) * 1000.0f);
                u.a(j10 >= j11, str);
            } catch (NumberFormatException e10) {
                throw ParserException.c(strGroup2, e10);
            }
        } else {
            j10 = C.TIME_UNSET;
        }
        return new z(j11, j10);
    }

    public long a() {
        return this.f18131b - this.f18130a;
    }

    public boolean c() {
        return this.f18131b == C.TIME_UNSET;
    }
}
