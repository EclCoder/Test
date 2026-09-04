package t9;

import java.util.UUID;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements s9.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f53178d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f53179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f53180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f53181c;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z10;
        if ("Amazon".equals(r0.f48427c)) {
            String str = r0.f48428d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        f53178d = z10;
    }

    public l(UUID uuid, byte[] bArr, boolean z10) {
        this.f53179a = uuid;
        this.f53180b = bArr;
        this.f53181c = z10;
    }
}
