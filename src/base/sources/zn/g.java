package zn;

import java.security.PrivilegedAction;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class g implements PrivilegedAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f59016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f59017b;

    g(String str, String str2) {
        this.f59016a = str;
        this.f59017b = str2;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        return System.getProperty(this.f59016a, this.f59017b);
    }
}
