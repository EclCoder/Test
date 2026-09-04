package j8;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(Context context, String[] strArr, String str, File file, j8.c cVar);
    }

    /* JADX INFO: renamed from: j8.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0639b {
        void a(String str);

        String b(String str);

        String c(String str);

        String[] d();

        void e(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
    }

    public static void a(Context context, String str) {
        b(context, str, null, null);
    }

    public static void b(Context context, String str, String str2, c cVar) {
        new j8.c().f(context, str, str2, cVar);
    }
}
