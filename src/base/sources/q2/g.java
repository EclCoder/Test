package q2;

import com.google.firebase.installations.ktx.gUsI.dmHT;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import t1.o;
import w1.c0;
import w1.n;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f50339a;

    public g(o oVar) {
        this.f50339a = oVar;
    }

    private static String a(int i10) {
        switch (i10) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return MimeTypes.VIDEO_MP4V;
            case 826496577:
            case 828601953:
            case 875967048:
                return MimeTypes.VIDEO_H264;
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    private static String b(int i10) {
        if (i10 == 1) {
            return MimeTypes.AUDIO_RAW;
        }
        if (i10 == 85) {
            return MimeTypes.AUDIO_MPEG;
        }
        if (i10 == 255) {
            return MimeTypes.AUDIO_AAC;
        }
        if (i10 == 8192) {
            return MimeTypes.AUDIO_AC3;
        }
        if (i10 != 8193) {
            return null;
        }
        return MimeTypes.AUDIO_DTS;
    }

    private static a c(u uVar) {
        uVar.U(4);
        int iT = uVar.t();
        int iT2 = uVar.t();
        uVar.U(4);
        int iT3 = uVar.t();
        String strA = a(iT3);
        if (strA != null) {
            o.b bVar = new o.b();
            bVar.t0(iT).Y(iT2).o0(strA);
            return new g(bVar.K());
        }
        n.h("StreamFormatChunk", "Ignoring track with unsupported compression " + iT3);
        return null;
    }

    public static a d(int i10, u uVar) {
        if (i10 == 2) {
            return c(uVar);
        }
        if (i10 == 1) {
            return e(uVar);
        }
        n.h("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + c0.m0(i10));
        return null;
    }

    @Override // q2.a
    public int getType() {
        return 1718776947;
    }

    private static a e(u uVar) {
        int iY;
        int iY2 = uVar.y();
        String strB = b(iY2);
        if (strB == null) {
            n.h("StreamFormatChunk", dmHT.SwXKBbuq + iY2);
            return null;
        }
        int iY3 = uVar.y();
        int iT = uVar.t();
        uVar.U(6);
        int iB0 = c0.b0(uVar.y());
        if (uVar.a() > 0) {
            iY = uVar.y();
        } else {
            iY = 0;
        }
        byte[] bArr = new byte[iY];
        uVar.l(bArr, 0, iY);
        o.b bVar = new o.b();
        bVar.o0(strB).N(iY3).p0(iT);
        if (MimeTypes.AUDIO_RAW.equals(strB) && iB0 != 0) {
            bVar.i0(iB0);
        }
        if (MimeTypes.AUDIO_AAC.equals(strB) && iY > 0) {
            bVar.b0(com.google.common.collect.c0.D(bArr));
        }
        return new g(bVar.K());
    }
}
