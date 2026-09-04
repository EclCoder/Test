package com.google.android.exoplayer2.source.rtsp;

import com.bytedance.sdk.component.adexpress.hnj.qor.FCv.giNWGaNAgVQoO;
import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f17998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.common.collect.e0 f17999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18000e;

    public h(v0 v0Var, int i10, int i11, Map map, String str) {
        this.f17996a = i10;
        this.f17997b = i11;
        this.f17998c = v0Var;
        this.f17999d = com.google.common.collect.e0.j(map);
        this.f18000e = str;
    }

    public static String a(String str) {
        String strF = sc.c.f(str);
        strF.getClass();
        switch (strF) {
            case "MPEG4-GENERIC":
            case "MP4A-LATM":
                return MimeTypes.AUDIO_AAC;
            case "L8":
            case "L16":
                return MimeTypes.AUDIO_RAW;
            case "AC3":
                return MimeTypes.AUDIO_AC3;
            case "AMR":
                return MimeTypes.AUDIO_AMR_NB;
            case "VP8":
                return MimeTypes.VIDEO_VP8;
            case "VP9":
                return MimeTypes.VIDEO_VP9;
            case "H264":
                return MimeTypes.VIDEO_H264;
            case "H265":
                return MimeTypes.VIDEO_H265;
            case "OPUS":
                return MimeTypes.AUDIO_OPUS;
            case "PCMA":
                return MimeTypes.AUDIO_ALAW;
            case "PCMU":
                return MimeTypes.AUDIO_MLAW;
            case "AMR-WB":
                return MimeTypes.AUDIO_AMR_WB;
            case "MP4V-ES":
                return MimeTypes.VIDEO_MP4V;
            case "H263-1998":
            case "H263-2000":
                return MimeTypes.VIDEO_H263;
            default:
                throw new IllegalArgumentException(str);
        }
    }

    public static int b(String str) {
        ob.a.a(str.equals("L8") || str.equals("L16"));
        return str.equals("L8") ? 3 : 268435456;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.f17996a == hVar.f17996a && this.f17997b == hVar.f17997b && this.f17998c.equals(hVar.f17998c) && this.f17999d.equals(hVar.f17999d) && this.f18000e.equals(hVar.f18000e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((Sdk$SDKError.b.AD_RESPONSE_TIMED_OUT_VALUE + this.f17996a) * 31) + this.f17997b) * 31) + this.f17998c.hashCode()) * 31) + this.f17999d.hashCode()) * 31) + this.f18000e.hashCode();
    }

    static boolean c(a aVar) {
        String strF = sc.c.f(aVar.f17908j.f17919b);
        strF.getClass();
        byte b10 = -1;
        switch (strF.hashCode()) {
            case -1922091719:
                if (strF.equals("MPEG4-GENERIC")) {
                    b10 = 0;
                }
                break;
            case 2412:
                if (strF.equals("L8")) {
                    b10 = 1;
                }
                break;
            case 64593:
                if (strF.equals("AC3")) {
                    b10 = 2;
                }
                break;
            case 64934:
                if (strF.equals("AMR")) {
                    b10 = 3;
                }
                break;
            case 74609:
                if (strF.equals("L16")) {
                    b10 = 4;
                }
                break;
            case 85182:
                if (strF.equals("VP8")) {
                    b10 = 5;
                }
                break;
            case 85183:
                if (strF.equals("VP9")) {
                    b10 = 6;
                }
                break;
            case 2194728:
                if (strF.equals("H264")) {
                    b10 = 7;
                }
                break;
            case 2194729:
                if (strF.equals("H265")) {
                    b10 = 8;
                }
                break;
            case 2433087:
                if (strF.equals("OPUS")) {
                    b10 = 9;
                }
                break;
            case 2450119:
                if (strF.equals("PCMA")) {
                    b10 = 10;
                }
                break;
            case 2450139:
                if (strF.equals("PCMU")) {
                    b10 = 11;
                }
                break;
            case 1061166827:
                if (strF.equals("MP4A-LATM")) {
                    b10 = 12;
                }
                break;
            case 1934494802:
                if (strF.equals("AMR-WB")) {
                    b10 = 13;
                }
                break;
            case 1959269366:
                if (strF.equals(giNWGaNAgVQoO.GefvTXcGm)) {
                    b10 = 14;
                }
                break;
            case 2137188397:
                if (strF.equals("H263-1998")) {
                    b10 = 15;
                }
                break;
            case 2137209252:
                if (strF.equals("H263-2000")) {
                    b10 = 16;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return true;
            default:
                return false;
        }
    }
}
