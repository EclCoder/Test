package x;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import y.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f56413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f56414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f56415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f56416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f56417f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    u.i f56420i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashSet f56412a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f56418g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f56419h = Integer.MIN_VALUE;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, a aVar) {
        this.f56415d = eVar;
        this.f56416e = aVar;
    }

    public boolean a(d dVar, int i10) {
        return b(dVar, i10, Integer.MIN_VALUE, false);
    }

    public boolean b(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            q();
            return true;
        }
        if (!z10 && !p(dVar)) {
            return false;
        }
        this.f56417f = dVar;
        if (dVar.f56412a == null) {
            dVar.f56412a = new HashSet();
        }
        HashSet hashSet = this.f56417f.f56412a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f56418g = i10;
        this.f56419h = i11;
        return true;
    }

    public void c(int i10, ArrayList arrayList, o oVar) {
        HashSet hashSet = this.f56412a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                y.i.a(((d) it.next()).f56415d, i10, arrayList, oVar);
            }
        }
    }

    public HashSet d() {
        return this.f56412a;
    }

    public int e() {
        if (this.f56414c) {
            return this.f56413b;
        }
        return 0;
    }

    public int f() {
        d dVar;
        if (this.f56415d.X() == 8) {
            return 0;
        }
        return (this.f56419h == Integer.MIN_VALUE || (dVar = this.f56417f) == null || dVar.f56415d.X() != 8) ? this.f56418g : this.f56419h;
    }

    public final d g() {
        switch (this.f56416e) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
                return this.f56415d.S;
            case TOP:
                return this.f56415d.T;
            case RIGHT:
                return this.f56415d.Q;
            case BOTTOM:
                return this.f56415d.R;
            default:
                throw new AssertionError(this.f56416e.name());
        }
    }

    public e h() {
        return this.f56415d;
    }

    public u.i i() {
        return this.f56420i;
    }

    public d j() {
        return this.f56417f;
    }

    public a k() {
        return this.f56416e;
    }

    public boolean l() {
        HashSet hashSet = this.f56412a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).g().o()) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        HashSet hashSet = this.f56412a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean n() {
        return this.f56414c;
    }

    public boolean o() {
        return this.f56417f != null;
    }

    public boolean p(d dVar) {
        if (dVar == null) {
            return false;
        }
        a aVarK = dVar.k();
        a aVar = this.f56416e;
        if (aVarK == aVar) {
            return aVar != a.BASELINE || (dVar.h().b0() && h().b0());
        }
        switch (aVar) {
            case NONE:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case RIGHT:
                boolean z10 = aVarK == a.LEFT || aVarK == a.RIGHT;
                if (dVar.h() instanceof h) {
                    return z10 || aVarK == a.CENTER_X;
                }
                return z10;
            case TOP:
            case BOTTOM:
                boolean z11 = aVarK == a.TOP || aVarK == a.BOTTOM;
                if (dVar.h() instanceof h) {
                    return z11 || aVarK == a.CENTER_Y;
                }
                return z11;
            case BASELINE:
                return (aVarK == a.LEFT || aVarK == a.RIGHT) ? false : true;
            case CENTER:
                return (aVarK == a.BASELINE || aVarK == a.CENTER_X || aVarK == a.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(this.f56416e.name());
        }
    }

    public void q() {
        HashSet hashSet;
        d dVar = this.f56417f;
        if (dVar != null && (hashSet = dVar.f56412a) != null) {
            hashSet.remove(this);
            if (this.f56417f.f56412a.size() == 0) {
                this.f56417f.f56412a = null;
            }
        }
        this.f56412a = null;
        this.f56417f = null;
        this.f56418g = 0;
        this.f56419h = Integer.MIN_VALUE;
        this.f56414c = false;
        this.f56413b = 0;
    }

    public void r() {
        this.f56414c = false;
        this.f56413b = 0;
    }

    public void s(u.c cVar) {
        u.i iVar = this.f56420i;
        if (iVar == null) {
            this.f56420i = new u.i(u.i.a.UNRESTRICTED, null);
        } else {
            iVar.e();
        }
    }

    public void t(int i10) {
        this.f56413b = i10;
        this.f56414c = true;
    }

    public String toString() {
        return this.f56415d.v() + ":" + this.f56416e.toString();
    }

    public void u(int i10) {
        if (o()) {
            this.f56419h = i10;
        }
    }
}
