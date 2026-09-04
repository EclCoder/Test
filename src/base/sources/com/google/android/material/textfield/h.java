package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class h extends mc.i {
    b J;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c extends h {
        c(b bVar) {
            super(bVar);
        }

        @Override // mc.i
        protected void x(Canvas canvas) {
            if (this.J.f21401w.isEmpty()) {
                super.x(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.J.f21401w);
            } else {
                canvas.clipRect(this.J.f21401w, Region.Op.DIFFERENCE);
            }
            super.x(canvas);
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h J0(b bVar) {
        return new c(bVar);
    }

    static h K0(mc.p pVar) {
        if (pVar == null) {
            pVar = new mc.p();
        }
        return J0(new b(pVar, new RectF()));
    }

    boolean L0() {
        return !this.J.f21401w.isEmpty();
    }

    void M0() {
        N0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void N0(float f10, float f11, float f12, float f13) {
        if (f10 == this.J.f21401w.left && f11 == this.J.f21401w.top && f12 == this.J.f21401w.right && f13 == this.J.f21401w.bottom) {
            return;
        }
        this.J.f21401w.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    void O0(RectF rectF) {
        N0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // mc.i, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.J = new b(this.J);
        return this;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b extends mc.i.c {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final RectF f21401w;

        @Override // mc.i.c, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVarJ0 = h.J0(this);
            hVarJ0.invalidateSelf();
            return hVarJ0;
        }

        private b(mc.p pVar, RectF rectF) {
            super(pVar, null);
            this.f21401w = rectF;
        }

        private b(b bVar) {
            super(bVar);
            this.f21401w = bVar.f21401w;
        }
    }

    private h(b bVar) {
        super(bVar);
        this.J = bVar;
    }
}
