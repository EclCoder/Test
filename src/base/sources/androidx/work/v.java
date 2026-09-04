package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    protected v() {
    }

    public static v d(Context context) {
        return b5.i.k(context);
    }

    public static void e(Context context, b bVar) {
        b5.i.e(context, bVar);
    }

    public abstract o a(String str);

    public final o b(w wVar) {
        return c(Collections.singletonList(wVar));
    }

    public abstract o c(List list);
}
