package androidx.transition;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static j a(ViewGroup viewGroup) {
        android.support.v4.media.session.b.a(viewGroup.getTag(h.f7389c));
        return null;
    }

    static void b(ViewGroup viewGroup, j jVar) {
        viewGroup.setTag(h.f7389c, jVar);
    }
}
