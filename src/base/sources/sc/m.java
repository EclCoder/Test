package sc;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m implements Serializable {
    private static final long serialVersionUID = 0;

    m() {
    }

    public static m d() {
        return a.l();
    }

    public static m i(Object obj) {
        return new s(p.o(obj));
    }

    public abstract boolean equals(Object obj);

    public abstract Object g();

    public abstract boolean h();

    public abstract int hashCode();

    public abstract Object j(x xVar);

    public abstract Object k();
}
