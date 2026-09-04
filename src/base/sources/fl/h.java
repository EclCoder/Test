package fl;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements k, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f38751a;

    public h(Object obj) {
        this.f38751a = obj;
    }

    @Override // fl.k
    public Object getValue() {
        return this.f38751a;
    }

    @Override // fl.k
    public boolean isInitialized() {
        return true;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
