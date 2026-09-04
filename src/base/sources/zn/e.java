package zn;

import java.io.IOException;
import java.security.PrivilegedAction;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class e implements PrivilegedAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ClassLoader f59013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f59014b;

    e(ClassLoader classLoader, String str) {
        this.f59013a = classLoader;
        this.f59014b = str;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        try {
            ClassLoader classLoader = this.f59013a;
            return classLoader != null ? classLoader.getResources(this.f59014b) : ClassLoader.getSystemResources(this.f59014b);
        } catch (IOException e10) {
            if (h.t()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Exception while trying to find configuration file ");
                stringBuffer.append(this.f59014b);
                stringBuffer.append(":");
                stringBuffer.append(e10.getMessage());
                h.v(stringBuffer.toString());
            }
            return null;
        } catch (NoSuchMethodError unused) {
            return null;
        }
    }
}
