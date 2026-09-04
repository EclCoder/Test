package j0;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        static void b(Configuration configuration, k kVar) {
            configuration.setLocales((LocaleList) kVar.h());
        }
    }

    public static k a(Configuration configuration) {
        return k.i(a.a(configuration));
    }

    public static void b(Configuration configuration, k kVar) {
        a.b(configuration, kVar);
    }
}
