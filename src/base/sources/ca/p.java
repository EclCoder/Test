package ca;

import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ob.u;
import u9.b0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0.a f9836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f9838e;

    public p(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        ob.a.a((bArr2 == null) ^ (i10 == 0));
        this.f9834a = z10;
        this.f9835b = str;
        this.f9837d = i10;
        this.f9838e = bArr2;
        this.f9836c = new b0.a(a(str), bArr, i11, i12);
    }

    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(mTFeqtajA.vyQcXGporuJKFtY)) {
                    b10 = 0;
                }
                break;
            case 3046671:
                if (str.equals(C.CENC_TYPE_cbcs)) {
                    b10 = 1;
                }
                break;
            case 3049879:
                if (str.equals(C.CENC_TYPE_cenc)) {
                    b10 = 2;
                }
                break;
            case 3049895:
                if (str.equals(C.CENC_TYPE_cens)) {
                    b10 = 3;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 1:
                return 2;
            default:
                u.i("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
