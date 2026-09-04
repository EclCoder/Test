package ml;

import com.google.api.client.auth.openidconnect.SMoW.mDXVAtwcaFMHJ;
import gl.j;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class c extends gl.d implements a, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Enum[] f46472b;

    public c(Enum[] entries) {
        s.h(entries, "entries");
        this.f46472b = entries;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new d(this.f46472b);
    }

    @Override // gl.b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return h((Enum) obj);
        }
        return false;
    }

    @Override // gl.b
    public int d() {
        return this.f46472b.length;
    }

    public boolean h(Enum element) {
        s.h(element, "element");
        return ((Enum) j.X(this.f46472b, element.ordinal())) == element;
    }

    @Override // gl.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return m((Enum) obj);
        }
        return -1;
    }

    @Override // gl.d, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Enum get(int i10) {
        gl.d.f39316a.b(i10, this.f46472b.length);
        return this.f46472b[i10];
    }

    @Override // gl.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return n((Enum) obj);
        }
        return -1;
    }

    public int m(Enum element) {
        s.h(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) j.X(this.f46472b, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    public int n(Enum r10) {
        s.h(r10, mDXVAtwcaFMHJ.LZxRFDFXSI);
        return m(r10);
    }
}
