package i8;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends ConcurrentHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f41202b = new f();
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f41203a;

    private f() {
        super(180, 0.8f, 4);
        this.f41203a = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String a(String str) {
        String str2 = (String) get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= 180) {
            synchronized (this.f41203a) {
                try {
                    if (size() >= 180) {
                        clear();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        String strIntern = str.intern();
        put(strIntern, strIntern);
        return strIntern;
    }
}
