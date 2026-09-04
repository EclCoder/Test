package mc;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class u extends t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f45733f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f45734g = 0.0f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            u uVar = u.this;
            if (uVar.f45730c == null || uVar.f45731d.isEmpty()) {
                return;
            }
            u uVar2 = u.this;
            RectF rectF = uVar2.f45731d;
            outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, uVar2.f45734g);
        }
    }

    u(View view) {
        n(view);
    }

    private float m() {
        RectF rectF;
        p pVar = this.f45730c;
        if (pVar == null || (rectF = this.f45731d) == null) {
            return 0.0f;
        }
        return pVar.f45663f.a(rectF);
    }

    private void n(View view) {
        view.setOutlineProvider(new a());
    }

    private boolean o() {
        p pVar;
        if (this.f45731d.isEmpty() || (pVar = this.f45730c) == null) {
            return false;
        }
        return pVar.E(this.f45731d);
    }

    private boolean p() {
        p pVar;
        if (!this.f45731d.isEmpty() && (pVar = this.f45730c) != null && this.f45729b && !pVar.E(this.f45731d) && q(this.f45730c)) {
            float fA = this.f45730c.A().a(this.f45731d);
            float fA2 = this.f45730c.C().a(this.f45731d);
            float fA3 = this.f45730c.s().a(this.f45731d);
            float fA4 = this.f45730c.u().a(this.f45731d);
            if (fA == 0.0f && fA3 == 0.0f && fA2 == fA4) {
                RectF rectF = this.f45731d;
                rectF.set(rectF.left - fA2, rectF.top, rectF.right, rectF.bottom);
                this.f45734g = fA2;
                return true;
            }
            if (fA == 0.0f && fA2 == 0.0f && fA3 == fA4) {
                RectF rectF2 = this.f45731d;
                rectF2.set(rectF2.left, rectF2.top - fA3, rectF2.right, rectF2.bottom);
                this.f45734g = fA3;
                return true;
            }
            if (fA2 == 0.0f && fA4 == 0.0f && fA == fA3) {
                RectF rectF3 = this.f45731d;
                rectF3.set(rectF3.left, rectF3.top, rectF3.right + fA, rectF3.bottom);
                this.f45734g = fA;
                return true;
            }
            if (fA3 == 0.0f && fA4 == 0.0f && fA == fA2) {
                RectF rectF4 = this.f45731d;
                rectF4.set(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom + fA);
                this.f45734g = fA;
                return true;
            }
        }
        return false;
    }

    private static boolean q(p pVar) {
        return (pVar.z() instanceof n) && (pVar.B() instanceof n) && (pVar.r() instanceof n) && (pVar.t() instanceof n);
    }

    @Override // mc.t
    void b(View view) {
        this.f45734g = m();
        this.f45733f = o() || p();
        view.setClipToOutline(!j());
        if (j()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // mc.t
    boolean j() {
        return !this.f45733f || this.f45728a;
    }
}
