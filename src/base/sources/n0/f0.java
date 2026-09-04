package n0;

import android.content.Context;
import android.view.PointerIcon;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointerIcon f46593a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {
        static PointerIcon a(Context context, int i10) {
            return PointerIcon.getSystemIcon(context, i10);
        }
    }

    private f0(PointerIcon pointerIcon) {
        this.f46593a = pointerIcon;
    }

    public static f0 b(Context context, int i10) {
        return new f0(a.a(context, i10));
    }

    public Object a() {
        return this.f46593a;
    }
}
