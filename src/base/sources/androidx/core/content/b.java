package androidx.core.content;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {
        static Object a(Intent intent, String str, Class cls) {
            return intent.getParcelableExtra(str, cls);
        }
    }

    public static Object a(Intent intent, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(intent, str, cls);
        }
        Parcelable parcelableExtra = intent.getParcelableExtra(str);
        if (cls.isInstance(parcelableExtra)) {
            return parcelableExtra;
        }
        return null;
    }
}
