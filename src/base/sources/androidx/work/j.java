package androidx.work;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f7987a = l.f("InputMerger");

    public static j a(String str) {
        try {
            return (j) Class.forName(str).newInstance();
        } catch (Exception e10) {
            l.c().b(f7987a, "Trouble instantiating + " + str, e10);
            return null;
        }
    }

    public abstract e b(List list);
}
