package t1;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashSet f52950a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f52951b = "media3.common";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f52952c = 0;

    public static synchronized void a(String str) {
        if (f52950a.add(str)) {
            f52951b += ", " + str;
        }
    }

    public static synchronized String b() {
        return f52951b;
    }
}
