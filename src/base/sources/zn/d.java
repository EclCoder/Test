package zn;

import java.security.PrivilegedAction;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class d implements PrivilegedAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ClassLoader f59011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f59012b;

    d(ClassLoader classLoader, String str) {
        this.f59011a = classLoader;
        this.f59012b = str;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        ClassLoader classLoader = this.f59011a;
        return classLoader != null ? classLoader.getResourceAsStream(this.f59012b) : ClassLoader.getSystemResourceAsStream(this.f59012b);
    }
}
