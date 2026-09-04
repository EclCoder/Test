package y4;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f57375c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f57376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f57377b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a extends k {
        a(String str, String str2) {
            super(str, str2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b extends k {
        b(String str, String str2) {
            super(str, str2);
        }
    }

    k(String str, String str2) {
        this.f57376a = str;
        this.f57377b = str2;
        f57375c.add(this);
    }
}
