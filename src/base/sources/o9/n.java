package o9;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashSet f48300a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f48301b = "goog.exo.core";

    public static synchronized void a(String str) {
        if (f48300a.add(str)) {
            f48301b += ", " + str;
        }
    }

    public static synchronized String b() {
        return f48301b;
    }
}
