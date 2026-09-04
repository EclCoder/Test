package y;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    p f57075d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f57077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f57078g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f57072a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f57073b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f57074c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    a f57076e = a.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f57079h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    g f57080i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f57081j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    List f57082k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    List f57083l = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f57075d = pVar;
    }

    @Override // y.d
    public void a(d dVar) {
        Iterator it = this.f57083l.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f57081j) {
                return;
            }
        }
        this.f57074c = true;
        d dVar2 = this.f57072a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f57073b) {
            this.f57075d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        for (f fVar2 : this.f57083l) {
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f57081j) {
            g gVar = this.f57080i;
            if (gVar != null) {
                if (!gVar.f57081j) {
                    return;
                } else {
                    this.f57077f = this.f57079h * gVar.f57078g;
                }
            }
            d(fVar.f57078g + this.f57077f);
        }
        d dVar3 = this.f57072a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f57082k.add(dVar);
        if (this.f57081j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f57083l.clear();
        this.f57082k.clear();
        this.f57081j = false;
        this.f57078g = 0;
        this.f57074c = false;
        this.f57073b = false;
    }

    public void d(int i10) {
        if (this.f57081j) {
            return;
        }
        this.f57081j = true;
        this.f57078g = i10;
        for (d dVar : this.f57082k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f57075d.f57125b.v());
        sb2.append(":");
        sb2.append(this.f57076e);
        sb2.append("(");
        sb2.append(this.f57081j ? Integer.valueOf(this.f57078g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f57083l.size());
        sb2.append(":d=");
        sb2.append(this.f57082k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
