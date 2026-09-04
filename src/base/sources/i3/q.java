package i3;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    private static int a(int i10, w1.u uVar, int i11) {
        if (i10 == 12) {
            return PsExtractor.VIDEO_STREAM_MASK;
        }
        if (i10 == 13) {
            return AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL;
        }
        if (i10 == 21 && uVar.a() >= 8 && uVar.f() + 8 <= i11) {
            int iP = uVar.p();
            int iP2 = uVar.p();
            if (iP >= 12 && iP2 == 1936877170) {
                return uVar.H();
            }
        }
        return -2147483647;
    }

    public static t1.u b(w1.u uVar, int i10) {
        uVar.U(12);
        while (uVar.f() < i10) {
            int iF = uVar.f();
            int iP = uVar.p();
            if (uVar.p() == 1935766900) {
                if (iP < 16) {
                    return null;
                }
                uVar.U(4);
                int i11 = -1;
                int i12 = 0;
                for (int i13 = 0; i13 < 2; i13++) {
                    int iG = uVar.G();
                    int iG2 = uVar.G();
                    if (iG == 0) {
                        i11 = iG2;
                    } else if (iG == 1) {
                        i12 = iG2;
                    }
                }
                int iA = a(i11, uVar, i10);
                if (iA == -2147483647) {
                    return null;
                }
                return new t1.u(new d3.d(iA, i12));
            }
            uVar.T(iF + iP);
        }
        return null;
    }
}
