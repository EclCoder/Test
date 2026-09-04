package e2;

import java.util.UUID;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class l implements b2.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f37053d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f37054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f37055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f37056c;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z10;
        if ("Amazon".equals(c0.f55771c)) {
            String str = c0.f55772d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        f37053d = z10;
    }

    public l(UUID uuid, byte[] bArr, boolean z10) {
        this.f37054a = uuid;
        this.f37055b = bArr;
        this.f37056c = z10;
    }
}
