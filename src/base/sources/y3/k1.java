package y3;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class k1 {
    public static /* synthetic */ p1 a(p1.b bVar, String str, String str2) {
        if (str == null || !str.startsWith("java")) {
            return bVar.a(str, str2);
        }
        try {
            return bVar.a("j$" + str.substring(4), str2);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof ClassNotFoundException) {
                return bVar.a(str, str2);
            }
            throw e10;
        }
    }
}
