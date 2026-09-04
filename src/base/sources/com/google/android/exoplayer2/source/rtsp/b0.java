package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.bytedance.sdk.openadsdk.core.bug.sk.hnj.UfZs.NhHRaDJCHtCTJR;
import com.google.android.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ob.p0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f17927c;

    private b0(long j10, int i10, Uri uri) {
        this.f17925a = j10;
        this.f17926b = i10;
        this.f17927c = uri;
    }

    static Uri b(String str, Uri uri) {
        ob.a.a(((String) ob.a.e(uri.getScheme())).equals("rtsp"));
        Uri uri2 = Uri.parse(str);
        if (uri2.isAbsolute()) {
            return uri2;
        }
        Uri uri3 = Uri.parse("rtsp://" + str);
        String string = uri.toString();
        if (((String) ob.a.e(uri3.getHost())).equals(uri.getHost())) {
            return uri3;
        }
        if (string.endsWith("/")) {
            return p0.e(string, str);
        }
        return p0.e(string + "/", str);
    }

    public static com.google.common.collect.c0 a(String str, Uri uri) throws ParserException {
        com.google.common.collect.c0.a aVar = new com.google.common.collect.c0.a();
        String[] strArrY0 = r0.Y0(str, ",");
        int length = strArrY0.length;
        int i10 = 0;
        while (i10 < length) {
            String str2 = strArrY0[i10];
            String[] strArrY1 = r0.Y0(str2, ";");
            int length2 = strArrY1.length;
            int i11 = i10;
            long j10 = C.TIME_UNSET;
            int i12 = 0;
            Uri uriB = null;
            int i13 = -1;
            while (true) {
                if (i12 < length2) {
                    String str3 = strArrY1[i12];
                    try {
                        String[] strArrZ0 = r0.Z0(str3, "=");
                        String str4 = strArrZ0[0];
                        String str5 = strArrZ0[1];
                        int iHashCode = str4.hashCode();
                        String[] strArr = strArrY0;
                        if (iHashCode != 113759) {
                            if (iHashCode != 116079) {
                                if (iHashCode != 1524180539 || !str4.equals("rtptime")) {
                                    throw ParserException.c(str4, null);
                                }
                                j10 = Long.parseLong(str5);
                                i12++;
                                strArrY0 = strArr;
                            } else {
                                if (!str4.equals("url")) {
                                    throw ParserException.c(str4, null);
                                }
                                uriB = b(str5, uri);
                                i12++;
                                strArrY0 = strArr;
                            }
                        } else {
                            if (!str4.equals(NhHRaDJCHtCTJR.ihAPBIJlvCV)) {
                                throw ParserException.c(str4, null);
                            }
                            i13 = Integer.parseInt(str5);
                            i12++;
                            strArrY0 = strArr;
                        }
                    } catch (Exception e10) {
                        throw ParserException.c(str3, e10);
                    }
                } else {
                    String[] strArr2 = strArrY0;
                    if (uriB == null || uriB.getScheme() == null || (i13 == -1 && j10 == C.TIME_UNSET)) {
                        throw ParserException.c(str2, null);
                    }
                    aVar.a(new b0(j10, i13, uriB));
                    i10 = i11 + 1;
                    strArrY0 = strArr2;
                }
            }
        }
        return aVar.m();
    }
}
