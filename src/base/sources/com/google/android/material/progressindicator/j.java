package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class j extends g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private h f20835r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private i f20836s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Drawable f20837t;

    j(Context context, b bVar, h hVar, i iVar) {
        super(context, bVar);
        B(hVar);
        A(iVar);
    }

    static j v(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec, c cVar) {
        j jVar = new j(context, circularProgressIndicatorSpec, cVar, circularProgressIndicatorSpec.f20694q == 1 ? new e(context, circularProgressIndicatorSpec) : new d(circularProgressIndicatorSpec));
        jVar.C(androidx.vectordrawable.graphics.drawable.g.b(context.getResources(), sb.f.f51736c, null));
        return jVar;
    }

    static j w(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec, k kVar) {
        return new j(context, linearProgressIndicatorSpec, kVar, linearProgressIndicatorSpec.f20700q == 0 ? new l(linearProgressIndicatorSpec) : new m(context, linearProgressIndicatorSpec));
    }

    private boolean z() {
        ic.a aVar = this.f20800c;
        return aVar != null && aVar.a(this.f20798a.getContentResolver()) == 0.0f;
    }

    void A(i iVar) {
        this.f20836s = iVar;
        iVar.e(this);
    }

    void B(h hVar) {
        this.f20835r = hVar;
    }

    public void C(Drawable drawable) {
        this.f20837t = drawable;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0109  */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        Drawable drawable;
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.f20813p)) {
            int i11 = 0;
            if (z() && (drawable = this.f20837t) != null) {
                drawable.setBounds(getBounds());
                this.f20837t.setTint(this.f20799b.f20734e[0]);
                this.f20837t.draw(canvas);
                return;
            }
            canvas.save();
            this.f20835r.h(canvas, getBounds(), h(), m(), l());
            int i12 = this.f20799b.f20738i;
            int alpha = getAlpha();
            b bVar = this.f20799b;
            boolean z10 = (bVar instanceof LinearProgressIndicatorSpec) || ((bVar instanceof CircularProgressIndicatorSpec) && ((CircularProgressIndicatorSpec) bVar).f20698u);
            boolean z11 = z10 && i12 == 0 && !bVar.b(false);
            if (!z11) {
                if (z10) {
                    h.a aVar = (h.a) this.f20836s.f20834b.get(0);
                    List list = this.f20836s.f20834b;
                    h.a aVar2 = (h.a) list.get(list.size() - 1);
                    h hVar = this.f20835r;
                    if (hVar instanceof k) {
                        i10 = i12;
                        hVar.d(canvas, this.f20811n, 0.0f, aVar.f20821a, this.f20799b.f20735f, alpha, i10);
                        canvas2 = canvas;
                        this.f20835r.d(canvas2, this.f20811n, aVar2.f20822b, 1.0f, this.f20799b.f20735f, alpha, i10);
                    } else {
                        canvas2 = canvas;
                        i10 = i12;
                        canvas.save();
                        canvas.rotate(aVar2.f20827g);
                        this.f20835r.d(canvas2, this.f20811n, aVar2.f20822b, aVar.f20821a + 1.0f, this.f20799b.f20735f, alpha, i10);
                        canvas.restore();
                    }
                } else {
                    canvas2 = canvas;
                }
                while (i11 < this.f20836s.f20834b.size()) {
                    h.a aVar3 = (h.a) this.f20836s.f20834b.get(i11);
                    aVar3.f20826f = i();
                    this.f20835r.c(canvas, this.f20811n, aVar3, getAlpha());
                    if (i11 <= 0 && !z11 && z10) {
                        this.f20835r.d(canvas2, this.f20811n, ((h.a) this.f20836s.f20834b.get(i11 - 1)).f20822b, aVar3.f20821a, this.f20799b.f20735f, alpha, i10);
                    }
                    i11++;
                    canvas2 = canvas;
                }
                canvas.restore();
            }
            canvas2 = canvas;
            this.f20835r.d(canvas2, this.f20811n, 0.0f, 1.0f, this.f20799b.f20735f, alpha, 0);
            i10 = i12;
            while (i11 < this.f20836s.f20834b.size()) {
                h.a aVar4 = (h.a) this.f20836s.f20834b.get(i11);
                aVar4.f20826f = i();
                this.f20835r.c(canvas, this.f20811n, aVar4, getAlpha());
                if (i11 <= 0) {
                }
                i11++;
                canvas2 = canvas;
            }
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f20835r.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f20835r.f();
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean l() {
        return super.l();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ void o(androidx.vectordrawable.graphics.drawable.b bVar) {
        super.o(bVar);
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean s(boolean z10, boolean z11, boolean z12) {
        return super.s(z10, z11, z12);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.g
    boolean t(boolean z10, boolean z11, boolean z12) {
        Drawable drawable;
        boolean zT = super.t(z10, z11, z12);
        if (z() && (drawable = this.f20837t) != null) {
            return drawable.setVisible(z10, z11);
        }
        if (!isRunning()) {
            this.f20836s.a();
        }
        if (!z10 || !z12) {
            return zT;
        }
        this.f20836s.g();
        return zT;
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean u(androidx.vectordrawable.graphics.drawable.b bVar) {
        return super.u(bVar);
    }

    i x() {
        return this.f20836s;
    }

    h y() {
        return this.f20835r;
    }
}
