package bn;

import an.f;
import gl.j0;
import gl.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f9190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f9191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Random f9192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f9194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f9195f;

    public /* synthetic */ e(d dVar, float f10, Random random, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, f10, (i10 & 4) != 0 ? new Random() : random);
    }

    private final b c(an.b bVar, cn.a aVar) {
        this.f9193d++;
        cn.d dVar = (cn.d) bVar.m().get(this.f9192c.nextInt(bVar.m().size()));
        an.e.a aVarD = d(bVar.j(), aVar);
        return new b(new cn.e(aVarD.a(), aVarD.b()), ((Number) bVar.d().get(this.f9192c.nextInt(bVar.d().size()))).intValue(), dVar.f() * this.f9191b, j(dVar), f(bVar.l()), bVar.p(), bVar.h(), null, h(bVar), bVar.e(), k(bVar.k()) * bVar.k().c(), k(bVar.k()) * bVar.k().b(), this.f9191b, 128, null);
    }

    private final an.e.a d(an.e eVar, cn.a aVar) {
        if (eVar instanceof an.e.a) {
            an.e.a aVar2 = (an.e.a) eVar;
            return new an.e.a(aVar2.a(), aVar2.b());
        }
        if (eVar instanceof an.e.c) {
            an.e.c cVar = (an.e.c) eVar;
            return new an.e.a(aVar.getWidth() * ((float) cVar.b()), aVar.getHeight() * ((float) cVar.c()));
        }
        if (!(eVar instanceof an.e.b)) {
            throw new NoWhenBranchMatchedException();
        }
        an.e.b bVar = (an.e.b) eVar;
        an.e.a aVarD = d(bVar.b(), aVar);
        an.e.a aVarD2 = d(bVar.a(), aVar);
        return new an.e.a((this.f9192c.nextFloat() * (aVarD2.a() - aVarD.a())) + aVarD.a(), (this.f9192c.nextFloat() * (aVarD2.b() - aVarD.b())) + aVarD.b());
    }

    private final double e(an.b bVar) {
        if (bVar.o() == 0) {
            return bVar.c();
        }
        int iC = bVar.c() - (bVar.o() / 2);
        return (((double) ((bVar.c() + (bVar.o() / 2)) - iC)) * this.f9192c.nextDouble()) + ((double) iC);
    }

    private final cn.c f(List list) {
        return (cn.c) list.get(this.f9192c.nextInt(list.size()));
    }

    private final float g(an.b bVar) {
        return bVar.i() == -1.0f ? bVar.n() : ((bVar.i() - bVar.n()) * this.f9192c.nextFloat()) + bVar.n();
    }

    private final cn.e h(an.b bVar) {
        float fG = g(bVar);
        double radians = Math.toRadians(e(bVar));
        return new cn.e(((float) Math.cos(radians)) * fG, fG * ((float) Math.sin(radians)));
    }

    private final boolean i() {
        return this.f9190a.b() != 0 && this.f9194e >= ((float) this.f9190a.b());
    }

    private final float j(cn.d dVar) {
        return dVar.d() + (dVar.d() * this.f9192c.nextFloat() * dVar.e());
    }

    private final float k(f fVar) {
        if (!fVar.a()) {
            return 0.0f;
        }
        return fVar.d() + (fVar.d() * fVar.e() * ((this.f9192c.nextFloat() * 2.0f) - 1.0f));
    }

    @Override // bn.a
    public List a(float f10, an.b party, cn.a drawArea) {
        s.h(party, "party");
        s.h(drawArea, "drawArea");
        this.f9195f += f10;
        float fB = this.f9190a.b() / 1000.0f;
        if (this.f9194e == 0.0f && f10 > fB) {
            this.f9195f = fB;
        }
        List listL = r.l();
        if (this.f9195f >= this.f9190a.a() && !i()) {
            yl.f fVar = new yl.f(1, (int) (this.f9195f / this.f9190a.a()));
            listL = new ArrayList(r.v(fVar, 10));
            Iterator it = fVar.iterator();
            while (it.hasNext()) {
                ((j0) it).nextInt();
                listL.add(c(party, drawArea));
            }
            this.f9195f %= this.f9190a.a();
        }
        this.f9194e += f10 * 1000;
        return listL;
    }

    @Override // bn.a
    public boolean b() {
        return this.f9190a.b() > 0 && this.f9194e >= ((float) this.f9190a.b());
    }

    public e(d emitterConfig, float f10, Random random) {
        s.h(emitterConfig, "emitterConfig");
        s.h(random, "random");
        this.f9190a = emitterConfig;
        this.f9191b = f10;
        this.f9192c = random;
    }
}
