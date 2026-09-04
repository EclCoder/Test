package k4;

import androidx.room.h;
import p4.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends d {
    public a(h hVar) {
        super(hVar);
    }

    protected abstract void g(f fVar, Object obj);

    public final void h(Object obj) {
        f fVarA = a();
        try {
            g(fVarA, obj);
            fVarA.b0();
        } finally {
            f(fVarA);
        }
    }
}
