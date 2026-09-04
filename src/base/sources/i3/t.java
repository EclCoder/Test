package i3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import o2.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0.a f40971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f40973e;

    public t(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        w1.a.a((bArr2 == null) ^ (i10 == 0));
        this.f40969a = z10;
        this.f40970b = str;
        this.f40972d = i10;
        this.f40973e = bArr2;
        this.f40971c = new o0.a(a(str), bArr, i11, i12);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(C.CENC_TYPE_cbc1)) {
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
                w1.n.h("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
