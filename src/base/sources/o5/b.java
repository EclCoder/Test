package o5;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b implements n5.b {
    @Override // n5.b
    public Class a(String str) {
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                return contextClassLoader.loadClass(str);
            }
        } catch (ClassNotFoundException | SecurityException unused) {
        }
        try {
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            if (systemClassLoader != null) {
                return systemClassLoader.loadClass(str);
            }
        } catch (ClassNotFoundException | Error | IllegalStateException | SecurityException unused2) {
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException | LinkageError unused3) {
            return null;
        }
    }
}
