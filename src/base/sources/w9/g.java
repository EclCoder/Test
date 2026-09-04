package w9;

import com.google.android.exoplayer2.v0;
import com.google.common.collect.c0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import ob.d0;
import ob.r0;
import ob.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f56013a;

    public g(v0 v0Var) {
        this.f56013a = v0Var;
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

    private static a c(d0 d0Var) {
        d0Var.V(4);
        int iU = d0Var.u();
        int iU2 = d0Var.u();
        d0Var.V(4);
        int iU3 = d0Var.u();
        String strA = a(iU3);
        if (strA != null) {
            v0.b bVar = new v0.b();
            bVar.n0(iU).S(iU2).g0(strA);
            return new g(bVar.G());
        }
        u.i("StreamFormatChunk", "Ignoring track with unsupported compression " + iU3);
        return null;
    }

    public static a d(int i10, d0 d0Var) {
        if (i10 == 2) {
            return c(d0Var);
        }
        if (i10 == 1) {
            return e(d0Var);
        }
        u.i("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + r0.p0(i10));
        return null;
    }

    private static a e(d0 d0Var) {
        int iZ = d0Var.z();
        String strB = b(iZ);
        if (strB == null) {
            u.i("StreamFormatChunk", "Ignoring track with unsupported format tag " + iZ);
            return null;
        }
        int iZ2 = d0Var.z();
        int iU = d0Var.u();
        d0Var.V(6);
        int iF0 = r0.f0(d0Var.N());
        int iZ3 = d0Var.z();
        byte[] bArr = new byte[iZ3];
        d0Var.l(bArr, 0, iZ3);
        v0.b bVar = new v0.b();
        bVar.g0(strB).J(iZ2).h0(iU);
        if (MimeTypes.AUDIO_RAW.equals(strB) && iF0 != 0) {
            bVar.a0(iF0);
        }
        if (MimeTypes.AUDIO_AAC.equals(strB) && iZ3 > 0) {
            bVar.V(c0.D(bArr));
        }
        return new g(bVar.G());
    }

    @Override // w9.a
    public int getType() {
        return 1718776947;
    }
}
