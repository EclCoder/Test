package l6;

import java.security.MessageDigest;
import r5.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f43926b = new c();

    private c() {
    }

    public static c c() {
        return f43926b;
    }

    public String toString() {
        return "EmptySignature";
    }

    @Override // r5.e
    public void a(MessageDigest messageDigest) {
    }
}
