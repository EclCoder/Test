package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class v extends m {
    int P;
    ArrayList N = new ArrayList();
    private boolean O = true;
    boolean Q = false;
    private int R = 0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f7460a;

        a(m mVar) {
            this.f7460a = mVar;
        }

        @Override // androidx.transition.m.g
        public void e(m mVar) {
            this.f7460a.b0();
            mVar.X(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        v f7462a;

        b(v vVar) {
            this.f7462a = vVar;
        }

        @Override // androidx.transition.s, androidx.transition.m.g
        public void b(m mVar) {
            v vVar = this.f7462a;
            if (vVar.Q) {
                return;
            }
            vVar.i0();
            this.f7462a.Q = true;
        }

        @Override // androidx.transition.m.g
        public void e(m mVar) {
            v vVar = this.f7462a;
            int i10 = vVar.P - 1;
            vVar.P = i10;
            if (i10 == 0) {
                vVar.Q = false;
                vVar.p();
            }
            mVar.X(this);
        }
    }

    private void n0(m mVar) {
        this.N.add(mVar);
        mVar.f7430r = this;
    }

    private void w0() {
        b bVar = new b(this);
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((m) obj).b(bVar);
        }
        this.P = this.N.size();
    }

    @Override // androidx.transition.m
    public void V(View view) {
        super.V(view);
        int size = this.N.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((m) this.N.get(i10)).V(view);
        }
    }

    @Override // androidx.transition.m
    public void Z(View view) {
        super.Z(view);
        int size = this.N.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((m) this.N.get(i10)).Z(view);
        }
    }

    @Override // androidx.transition.m
    protected void b0() {
        if (this.N.isEmpty()) {
            i0();
            p();
            return;
        }
        w0();
        int i10 = 0;
        if (this.O) {
            ArrayList arrayList = this.N;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((m) obj).b0();
            }
            return;
        }
        for (int i11 = 1; i11 < this.N.size(); i11++) {
            ((m) this.N.get(i11 - 1)).b(new a((m) this.N.get(i11)));
        }
        m mVar = (m) this.N.get(0);
        if (mVar != null) {
            mVar.b0();
        }
    }

    @Override // androidx.transition.m
    protected void cancel() {
        super.cancel();
        int size = this.N.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((m) this.N.get(i10)).cancel();
        }
    }

    @Override // androidx.transition.m
    public void d0(m.f fVar) {
        super.d0(fVar);
        this.R |= 8;
        int size = this.N.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((m) this.N.get(i10)).d0(fVar);
        }
    }

    @Override // androidx.transition.m
    public void f0(g gVar) {
        super.f0(gVar);
        this.R |= 4;
        if (this.N != null) {
            for (int i10 = 0; i10 < this.N.size(); i10++) {
                ((m) this.N.get(i10)).f0(gVar);
            }
        }
    }

    @Override // androidx.transition.m
    public void g(x xVar) {
        if (M(xVar.f7465b)) {
            ArrayList arrayList = this.N;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                m mVar = (m) obj;
                if (mVar.M(xVar.f7465b)) {
                    mVar.g(xVar);
                    xVar.f7466c.add(mVar);
                }
            }
        }
    }

    @Override // androidx.transition.m
    public void g0(u uVar) {
        super.g0(uVar);
        this.R |= 2;
        int size = this.N.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((m) this.N.get(i10)).g0(uVar);
        }
    }

    @Override // androidx.transition.m
    void i(x xVar) {
        super.i(xVar);
        int size = this.N.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((m) this.N.get(i10)).i(xVar);
        }
    }

    @Override // androidx.transition.m
    public void j(x xVar) {
        if (M(xVar.f7465b)) {
            ArrayList arrayList = this.N;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                m mVar = (m) obj;
                if (mVar.M(xVar.f7465b)) {
                    mVar.j(xVar);
                    xVar.f7466c.add(mVar);
                }
            }
        }
    }

    @Override // androidx.transition.m
    String j0(String str) {
        String strJ0 = super.j0(str);
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strJ0);
            sb2.append("\n");
            sb2.append(((m) this.N.get(i10)).j0(str + "  "));
            strJ0 = sb2.toString();
        }
        return strJ0;
    }

    @Override // androidx.transition.m
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public v b(m.g gVar) {
        return (v) super.b(gVar);
    }

    @Override // androidx.transition.m
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public v c(View view) {
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            ((m) this.N.get(i10)).c(view);
        }
        return (v) super.c(view);
    }

    @Override // androidx.transition.m
    /* JADX INFO: renamed from: m */
    public m clone() {
        v vVar = (v) super.clone();
        vVar.N = new ArrayList();
        int size = this.N.size();
        for (int i10 = 0; i10 < size; i10++) {
            vVar.n0(((m) this.N.get(i10)).clone());
        }
        return vVar;
    }

    public v m0(m mVar) {
        n0(mVar);
        long j10 = this.f7415c;
        if (j10 >= 0) {
            mVar.c0(j10);
        }
        if ((this.R & 1) != 0) {
            mVar.e0(x());
        }
        if ((this.R & 2) != 0) {
            mVar.g0(B());
        }
        if ((this.R & 4) != 0) {
            mVar.f0(A());
        }
        if ((this.R & 8) != 0) {
            mVar.d0(w());
        }
        return this;
    }

    @Override // androidx.transition.m
    void o(ViewGroup viewGroup, y yVar, y yVar2, ArrayList arrayList, ArrayList arrayList2) {
        long jE = E();
        int size = this.N.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) this.N.get(i10);
            if (jE > 0 && (this.O || i10 == 0)) {
                long jE2 = mVar.E();
                if (jE2 > 0) {
                    mVar.h0(jE2 + jE);
                } else {
                    mVar.h0(jE);
                }
            }
            mVar.o(viewGroup, yVar, yVar2, arrayList, arrayList2);
        }
    }

    public m o0(int i10) {
        if (i10 < 0 || i10 >= this.N.size()) {
            return null;
        }
        return (m) this.N.get(i10);
    }

    public int p0() {
        return this.N.size();
    }

    @Override // androidx.transition.m
    public m q(View view, boolean z10) {
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            ((m) this.N.get(i10)).q(view, z10);
        }
        return super.q(view, z10);
    }

    @Override // androidx.transition.m
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public v X(m.g gVar) {
        return (v) super.X(gVar);
    }

    @Override // androidx.transition.m
    public m r(Class cls, boolean z10) {
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            ((m) this.N.get(i10)).r(cls, z10);
        }
        return super.r(cls, z10);
    }

    @Override // androidx.transition.m
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public v Y(View view) {
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            ((m) this.N.get(i10)).Y(view);
        }
        return (v) super.Y(view);
    }

    @Override // androidx.transition.m
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public v c0(long j10) {
        ArrayList arrayList;
        super.c0(j10);
        if (this.f7415c >= 0 && (arrayList = this.N) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((m) this.N.get(i10)).c0(j10);
            }
        }
        return this;
    }

    @Override // androidx.transition.m
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public v e0(TimeInterpolator timeInterpolator) {
        this.R |= 1;
        ArrayList arrayList = this.N;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((m) this.N.get(i10)).e0(timeInterpolator);
            }
        }
        return (v) super.e0(timeInterpolator);
    }

    public v u0(int i10) {
        if (i10 == 0) {
            this.O = true;
            return this;
        }
        if (i10 == 1) {
            this.O = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
    }

    @Override // androidx.transition.m
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public v h0(long j10) {
        return (v) super.h0(j10);
    }
}
