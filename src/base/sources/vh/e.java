package vh;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface e {
    default void a(Activity activity, List list, List list2, boolean z10, h hVar) {
        if (hVar == null) {
            return;
        }
        hVar.b(list2, z10);
    }

    default void b(Activity activity, List list, List list2, boolean z10, h hVar) {
        if (hVar == null) {
            return;
        }
        hVar.a(list2, z10);
    }

    default void d(Activity activity, List list, h hVar) {
        y.c(activity, new ArrayList(list), this, hVar);
    }

    default void c(Activity activity, List list, boolean z10, h hVar) {
    }
}
