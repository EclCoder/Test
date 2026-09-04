package j0;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {
        static Object a(Bundle bundle, String str, Class cls) {
            return bundle.getParcelable(str, cls);
        }

        static ArrayList b(Bundle bundle, String str, Class cls) {
            return bundle.getParcelableArrayList(str, cls);
        }
    }

    public static Object a(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static ArrayList b(Bundle bundle, String str, Class cls) {
        return Build.VERSION.SDK_INT >= 34 ? a.b(bundle, str, cls) : bundle.getParcelableArrayList(str);
    }
}
