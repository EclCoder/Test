package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }
    }

    public static j0.k a(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return j0.k.b(e.b(context));
        }
        Object objB = b(context);
        return objB != null ? j0.k.i(a.a(objB)) : j0.k.d();
    }

    private static Object b(Context context) {
        return context.getSystemService("locale");
    }
}
