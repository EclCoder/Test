package fl;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 implements k, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private tl.a f38752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f38753b;

    public h0(tl.a initializer) {
        kotlin.jvm.internal.s.h(initializer, "initializer");
        this.f38752a = initializer;
        this.f38753b = d0.f38744a;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new h(getValue());
    }

    @Override // fl.k
    public Object getValue() {
        if (this.f38753b == d0.f38744a) {
            tl.a aVar = this.f38752a;
            kotlin.jvm.internal.s.e(aVar);
            this.f38753b = aVar.invoke();
            this.f38752a = null;
        }
        return this.f38753b;
    }

    @Override // fl.k
    public boolean isInitialized() {
        return this.f38753b != d0.f38744a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
