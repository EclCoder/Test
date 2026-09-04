package co;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v implements Serializable, Cloneable {
    private static final long serialVersionUID = 8950662842175091068L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f10165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f10166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f10167c;

    public v(String str, int i10, int i11) {
        this.f10165a = (String) ip.a.h(str, "Protocol name");
        this.f10166b = ip.a.g(i10, "Protocol major version");
        this.f10167c = ip.a.g(i11, "Protocol minor version");
    }

    public int b(v vVar) {
        ip.a.h(vVar, "Protocol version");
        ip.a.b(this.f10165a.equals(vVar.f10165a), "Versions for different protocols cannot be compared: %s %s", this, vVar);
        int iG = g() - vVar.g();
        return iG == 0 ? i() - vVar.i() : iG;
    }

    public Object clone() {
        return super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f10165a.equals(vVar.f10165a) && this.f10166b == vVar.f10166b && this.f10167c == vVar.f10167c;
    }

    public final int g() {
        return this.f10166b;
    }

    public final int hashCode() {
        return (this.f10165a.hashCode() ^ (this.f10166b * DefaultOggSeeker.MATCH_BYTE_RANGE)) ^ this.f10167c;
    }

    public final int i() {
        return this.f10167c;
    }

    public final String j() {
        return this.f10165a;
    }

    public boolean k(v vVar) {
        return vVar != null && this.f10165a.equals(vVar.f10165a);
    }

    public final boolean l(v vVar) {
        return k(vVar) && b(vVar) <= 0;
    }

    public String toString() {
        return this.f10165a + '/' + Integer.toString(this.f10166b) + '.' + Integer.toString(this.f10167c);
    }
}
