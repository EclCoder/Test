package zn;

import java.security.PrivilegedAction;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class c implements PrivilegedAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f59009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ClassLoader f59010b;

    c(String str, ClassLoader classLoader) {
        this.f59009a = str;
        this.f59010b = classLoader;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        return h.c(this.f59009a, this.f59010b);
    }
}
