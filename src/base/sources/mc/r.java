package mc;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f45700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f45701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f45702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f45703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f45704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f45705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f45706g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f45707h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f45708i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f45709c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Matrix f45710d;

        a(List list, Matrix matrix) {
            this.f45709c = list;
            this.f45710d = matrix;
        }

        @Override // mc.r.g
        public void a(Matrix matrix, lc.a aVar, int i10, Canvas canvas) {
            Iterator it = this.f45709c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f45710d, aVar, i10, canvas);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f45712c;

        public b(d dVar) {
            this.f45712c = dVar;
        }

        @Override // mc.r.g
        public void a(Matrix matrix, lc.a aVar, int i10, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f45712c.k(), this.f45712c.o(), this.f45712c.l(), this.f45712c.j()), i10, this.f45712c.m(), this.f45712c.n());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e f45713c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f45714d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f45715e;

        public c(e eVar, float f10, float f11) {
            this.f45713c = eVar;
            this.f45714d = f10;
            this.f45715e = f11;
        }

        @Override // mc.r.g
        public void a(Matrix matrix, lc.a aVar, int i10, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f45713c.f45724c - this.f45715e, this.f45713c.f45723b - this.f45714d), 0.0f);
            this.f45727a.set(matrix);
            this.f45727a.preTranslate(this.f45714d, this.f45715e);
            this.f45727a.preRotate(c());
            aVar.b(canvas, this.f45727a, rectF, i10);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f45713c.f45724c - this.f45715e) / (this.f45713c.f45723b - this.f45714d)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class d extends f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final RectF f45716h = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f45717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f45718c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f45719d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f45720e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f45721f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f45722g;

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f45720e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f45717b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f45719d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f45721f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f45722g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f45718c;
        }

        private void p(float f10) {
            this.f45720e = f10;
        }

        private void q(float f10) {
            this.f45717b = f10;
        }

        private void r(float f10) {
            this.f45719d = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f10) {
            this.f45721f = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f10) {
            this.f45722g = f10;
        }

        private void u(float f10) {
            this.f45718c = f10;
        }

        @Override // mc.r.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f45725a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f45716h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class e extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f45723b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f45724c;

        @Override // mc.r.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f45725a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f45723b, this.f45724c);
            path.transform(matrix);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Matrix f45725a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static abstract class g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Matrix f45726b = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matrix f45727a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, lc.a aVar, int i10, Canvas canvas);

        public final void b(lc.a aVar, int i10, Canvas canvas) {
            a(f45726b, aVar, i10, canvas);
        }
    }

    public r() {
        n(0.0f, 0.0f);
    }

    private void b(float f10) {
        if (g() == f10) {
            return;
        }
        float fG = ((f10 - g()) + 360.0f) % 360.0f;
        if (fG > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(fG);
        this.f45707h.add(new b(dVar));
        p(f10);
    }

    private void c(g gVar, float f10, float f11) {
        b(f10);
        this.f45707h.add(gVar);
        p(f11);
    }

    private float g() {
        return this.f45704e;
    }

    private float h() {
        return this.f45705f;
    }

    private void p(float f10) {
        this.f45704e = f10;
    }

    private void q(float f10) {
        this.f45705f = f10;
    }

    private void r(float f10) {
        this.f45702c = f10;
    }

    private void s(float f10) {
        this.f45703d = f10;
    }

    private void t(float f10) {
        this.f45700a = f10;
    }

    private void u(float f10) {
        this.f45701b = f10;
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.s(f14);
        dVar.t(f15);
        this.f45706g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        c(bVar, f14, z10 ? (180.0f + f16) % 360.0f : f16);
        double d10 = f16;
        r(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        s(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f45706g.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((f) this.f45706g.get(i10)).a(matrix, path);
        }
    }

    boolean e() {
        return this.f45708i;
    }

    g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f45707h), new Matrix(matrix));
    }

    float i() {
        return this.f45702c;
    }

    float j() {
        return this.f45703d;
    }

    float k() {
        return this.f45700a;
    }

    float l() {
        return this.f45701b;
    }

    public void m(float f10, float f11) {
        e eVar = new e();
        eVar.f45723b = f10;
        eVar.f45724c = f11;
        this.f45706g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f10);
        s(f11);
    }

    public void n(float f10, float f11) {
        o(f10, f11, 270.0f, 0.0f);
    }

    public void o(float f10, float f11, float f12, float f13) {
        t(f10);
        u(f11);
        r(f10);
        s(f11);
        p(f12);
        q((f12 + f13) % 360.0f);
        this.f45706g.clear();
        this.f45707h.clear();
        this.f45708i = false;
    }
}
