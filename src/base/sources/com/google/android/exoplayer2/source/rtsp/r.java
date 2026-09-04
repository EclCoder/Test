package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f18080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f18081b;

    public r(m mVar, a aVar, Uri uri) {
        ob.a.b(aVar.f17907i.containsKey("control"), "missing attribute control");
        this.f18080a = b(aVar);
        this.f18081b = a(mVar, uri, (String) r0.j((String) aVar.f17907i.get("control")));
    }

    private static Uri a(m mVar, Uri uri, String str) {
        Uri uri2 = Uri.parse(str);
        if (uri2.isAbsolute()) {
            return uri2;
        }
        if (!TextUtils.isEmpty(mVar.d("Content-Base"))) {
            uri = Uri.parse(mVar.d("Content-Base"));
        } else if (!TextUtils.isEmpty(mVar.d("Content-Location"))) {
            uri = Uri.parse(mVar.d("Content-Location"));
        }
        return str.equals("*") ? uri : uri.buildUpon().appendEncodedPath(str).build();
    }

    /* JADX WARN: Code duplicated, block: B:65:0x016e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0170  */
    /* JADX WARN: Code duplicated, block: B:67:0x0172  */
    static h b(a aVar) {
        int iD;
        String str;
        boolean z10;
        v0.b bVar = new v0.b();
        int i10 = aVar.f17903e;
        if (i10 > 0) {
            bVar.I(i10);
        }
        a.c cVar = aVar.f17908j;
        int i11 = cVar.f17918a;
        String str2 = cVar.f17919b;
        String strA = h.a(str2);
        bVar.g0(strA);
        int i12 = aVar.f17908j.f17920c;
        if (MimeTypes.BASE_TYPE_AUDIO.equals(aVar.f17899a)) {
            iD = d(aVar.f17908j.f17921d, strA);
            bVar.h0(i12).J(iD);
        } else {
            iD = -1;
        }
        com.google.common.collect.e0 e0VarA = aVar.a();
        switch (strA.hashCode()) {
            case -1664118616:
                if (strA.equals(MimeTypes.VIDEO_H263)) {
                    bVar.n0(352).S(288);
                }
                break;
            case -1662541442:
                if (strA.equals(MimeTypes.VIDEO_H265)) {
                    ob.a.b(!e0VarA.isEmpty(), "missing attribute fmtp");
                    h(bVar, e0VarA);
                }
                break;
            case -1606874997:
                if (strA.equals(MimeTypes.AUDIO_AMR_WB)) {
                    if (iD == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ob.a.b(z10, "Multi channel AMR is not currently supported.");
                    ob.a.b(!e0VarA.isEmpty(), "fmtp parameters must include octet-align.");
                    ob.a.b(e0VarA.containsKey("octet-align"), "Only octet aligned mode is currently supported.");
                    ob.a.b(!e0VarA.containsKey("interleaving"), "Interleaving mode is not currently supported.");
                }
                break;
            case -53558318:
                if (strA.equals(MimeTypes.AUDIO_AAC)) {
                    ob.a.a(iD != -1);
                    ob.a.b(!e0VarA.isEmpty(), "missing attribute fmtp");
                    if (str2.equals("MP4A-LATM")) {
                        ob.a.b(e0VarA.containsKey("cpresent") && ((String) e0VarA.get("cpresent")).equals(MBridgeConstans.ENDCARD_URL_TYPE_PL), "Only supports cpresent=0 in AAC audio.");
                        String str3 = (String) e0VarA.get("config");
                        ob.a.f(str3, "AAC audio stream must include config fmtp parameter");
                        ob.a.b(str3.length() % 2 == 0, "Malformat MPEG4 config: " + str3);
                        q9.a.b bVarE = e(str3);
                        bVar.h0(bVarE.f50439a).J(bVarE.f50440b).K(bVarE.f50441c);
                    }
                    f(bVar, e0VarA, str2, iD, i12);
                }
                break;
            case 187078296:
                str = MimeTypes.AUDIO_AC3;
                strA.equals(str);
                break;
            case 187094639:
                if (strA.equals(MimeTypes.AUDIO_RAW)) {
                    bVar.a0(h.b(str2));
                }
                break;
            case 1187890754:
                if (strA.equals(MimeTypes.VIDEO_MP4V)) {
                    ob.a.a(!e0VarA.isEmpty());
                    i(bVar, e0VarA);
                }
                break;
            case 1331836730:
                if (strA.equals(MimeTypes.VIDEO_H264)) {
                    ob.a.b(!e0VarA.isEmpty(), "missing attribute fmtp");
                    g(bVar, e0VarA);
                }
                break;
            case 1503095341:
                if (strA.equals(MimeTypes.AUDIO_AMR_NB)) {
                    if (iD == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ob.a.b(z10, "Multi channel AMR is not currently supported.");
                    ob.a.b(!e0VarA.isEmpty(), "fmtp parameters must include octet-align.");
                    ob.a.b(e0VarA.containsKey("octet-align"), "Only octet aligned mode is currently supported.");
                    ob.a.b(!e0VarA.containsKey("interleaving"), "Interleaving mode is not currently supported.");
                }
                break;
            case 1504891608:
                if (strA.equals(MimeTypes.AUDIO_OPUS)) {
                    ob.a.a(iD != -1);
                    ob.a.b(i12 == 48000, "Invalid OPUS clock rate.");
                }
                break;
            case 1599127256:
                if (strA.equals(MimeTypes.VIDEO_VP8)) {
                    bVar.n0(Sdk$SDKError.b.WEBVIEW_ERROR_VALUE).S(PsExtractor.VIDEO_STREAM_MASK);
                }
                break;
            case 1599127257:
                if (strA.equals(MimeTypes.VIDEO_VP9)) {
                    bVar.n0(Sdk$SDKError.b.WEBVIEW_ERROR_VALUE).S(PsExtractor.VIDEO_STREAM_MASK);
                }
                break;
            case 1903231877:
                str = MimeTypes.AUDIO_ALAW;
                strA.equals(str);
                break;
            case 1903589369:
                str = MimeTypes.AUDIO_MLAW;
                strA.equals(str);
                break;
        }
        ob.a.a(i12 > 0);
        return new h(bVar.G(), i11, i12, e0VarA, str2);
    }

    private static byte[] c(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        int length = bArrDecode.length;
        byte[] bArr = ob.z.f48467a;
        byte[] bArr2 = new byte[length + bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(bArrDecode, 0, bArr2, bArr.length, bArrDecode.length);
        return bArr2;
    }

    private static int d(int i10, String str) {
        if (i10 != -1) {
            return i10;
        }
        return str.equals(MimeTypes.AUDIO_AC3) ? 6 : 1;
    }

    private static q9.a.b e(String str) {
        ob.c0 c0Var = new ob.c0(r0.K(str));
        ob.a.b(c0Var.h(1) == 0, "Only supports audio mux version 0.");
        ob.a.b(c0Var.h(1) == 1, "Only supports allStreamsSameTimeFraming.");
        c0Var.r(6);
        ob.a.b(c0Var.h(4) == 0, "Only supports one program.");
        ob.a.b(c0Var.h(3) == 0, "Only supports one numLayer.");
        try {
            return q9.a.e(c0Var, false);
        } catch (ParserException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    private static void f(v0.b bVar, com.google.common.collect.e0 e0Var, String str, int i10, int i11) {
        String str2 = (String) e0Var.get("profile-level-id");
        if (str2 == null && str.equals("MP4A-LATM")) {
            str2 = "30";
        }
        ob.a.b((str2 == null || str2.isEmpty()) ? false : true, "missing profile-level-id param");
        bVar.K("mp4a.40." + str2);
        bVar.V(com.google.common.collect.c0.D(q9.a.a(i11, i10)));
    }

    private static void g(v0.b bVar, com.google.common.collect.e0 e0Var) {
        ob.a.b(e0Var.containsKey("sprop-parameter-sets"), "missing sprop parameter");
        String[] strArrY0 = r0.Y0((String) ob.a.e((String) e0Var.get("sprop-parameter-sets")), ",");
        ob.a.b(strArrY0.length == 2, "empty sprop value");
        com.google.common.collect.c0 c0VarE = com.google.common.collect.c0.E(c(strArrY0[0]), c(strArrY0[1]));
        bVar.V(c0VarE);
        byte[] bArr = (byte[]) c0VarE.get(0);
        ob.z.c cVarL = ob.z.l(bArr, ob.z.f48467a.length, bArr.length);
        bVar.c0(cVarL.f48497h);
        bVar.S(cVarL.f48496g);
        bVar.n0(cVarL.f48495f);
        String str = (String) e0Var.get("profile-level-id");
        if (str == null) {
            bVar.K(ob.e.a(cVarL.f48490a, cVarL.f48491b, cVarL.f48492c));
            return;
        }
        bVar.K("avc1." + str);
    }

    private static void h(v0.b bVar, com.google.common.collect.e0 e0Var) {
        if (e0Var.containsKey("sprop-max-don-diff")) {
            int i10 = Integer.parseInt((String) ob.a.e((String) e0Var.get("sprop-max-don-diff")));
            ob.a.b(i10 == 0, "non-zero sprop-max-don-diff " + i10 + " is not supported");
        }
        ob.a.b(e0Var.containsKey("sprop-vps"), "missing sprop-vps parameter");
        String str = (String) ob.a.e((String) e0Var.get("sprop-vps"));
        ob.a.b(e0Var.containsKey("sprop-sps"), "missing sprop-sps parameter");
        String str2 = (String) ob.a.e((String) e0Var.get("sprop-sps"));
        ob.a.b(e0Var.containsKey("sprop-pps"), "missing sprop-pps parameter");
        com.google.common.collect.c0 c0VarF = com.google.common.collect.c0.F(c(str), c(str2), c((String) ob.a.e((String) e0Var.get("sprop-pps"))));
        bVar.V(c0VarF);
        byte[] bArr = (byte[]) c0VarF.get(1);
        ob.z.a aVarH = ob.z.h(bArr, ob.z.f48467a.length, bArr.length);
        bVar.c0(aVarH.f48483m);
        bVar.S(aVarH.f48482l).n0(aVarH.f48481k);
        bVar.K(ob.e.c(aVarH.f48471a, aVarH.f48472b, aVarH.f48473c, aVarH.f48474d, aVarH.f48478h, aVarH.f48479i));
    }

    private static void i(v0.b bVar, com.google.common.collect.e0 e0Var) {
        String str = (String) e0Var.get("config");
        if (str != null) {
            byte[] bArrK = r0.K(str);
            bVar.V(com.google.common.collect.c0.D(bArrK));
            Pair pairF = ob.e.f(bArrK);
            bVar.n0(((Integer) pairF.first).intValue()).S(((Integer) pairF.second).intValue());
        } else {
            bVar.n0(352).S(288);
        }
        String str2 = (String) e0Var.get("profile-level-id");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mp4v.");
        if (str2 == null) {
            str2 = "1";
        }
        sb2.append(str2);
        bVar.K(sb2.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f18080a.equals(rVar.f18080a) && this.f18081b.equals(rVar.f18081b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((Sdk$SDKError.b.AD_RESPONSE_TIMED_OUT_VALUE + this.f18080a.hashCode()) * 31) + this.f18081b.hashCode();
    }
}
