package ye;

import com.mbridge.msdk.MBridgeConstans;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements com.google.zxing.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f57524a = new j();

    @Override // com.google.zxing.e
    public ue.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map map) {
        if (aVar == com.google.zxing.a.UPC_A) {
            return this.f57524a.a(MBridgeConstans.ENDCARD_URL_TYPE_PL.concat(String.valueOf(str)), com.google.zxing.a.EAN_13, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(aVar)));
    }
}
