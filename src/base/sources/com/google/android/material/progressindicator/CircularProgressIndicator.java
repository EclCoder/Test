package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class CircularProgressIndicator extends a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f20693r = sb.l.M;

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, sb.c.f51608g);
    }

    private void v() {
        c cVar = new c((CircularProgressIndicatorSpec) this.f20710a);
        setIndeterminateDrawable(j.v(getContext(), (CircularProgressIndicatorSpec) this.f20710a, cVar));
        setProgressDrawable(f.B(getContext(), (CircularProgressIndicatorSpec) this.f20710a, cVar));
    }

    public int getIndeterminateAnimationType() {
        return ((CircularProgressIndicatorSpec) this.f20710a).f20694q;
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.f20710a).f20697t;
    }

    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.f20710a).f20696s;
    }

    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.f20710a).f20695r;
    }

    public void setIndeterminateAnimationType(int i10) {
        if (((CircularProgressIndicatorSpec) this.f20710a).f20694q == i10) {
            return;
        }
        if (t() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        b bVar = this.f20710a;
        ((CircularProgressIndicatorSpec) bVar).f20694q = i10;
        ((CircularProgressIndicatorSpec) bVar).h();
        getIndeterminateDrawable().A(i10 == 1 ? new e(getContext(), (CircularProgressIndicatorSpec) this.f20710a) : new d((CircularProgressIndicatorSpec) this.f20710a));
        q();
        invalidate();
    }

    public void setIndicatorDirection(int i10) {
        ((CircularProgressIndicatorSpec) this.f20710a).f20697t = i10;
        invalidate();
    }

    public void setIndicatorInset(int i10) {
        b bVar = this.f20710a;
        if (((CircularProgressIndicatorSpec) bVar).f20696s != i10) {
            ((CircularProgressIndicatorSpec) bVar).f20696s = i10;
            invalidate();
        }
    }

    public void setIndicatorSize(int i10) {
        int iMax = Math.max(i10, getTrackThickness() * 2);
        b bVar = this.f20710a;
        if (((CircularProgressIndicatorSpec) bVar).f20695r != iMax) {
            ((CircularProgressIndicatorSpec) bVar).f20695r = iMax;
            ((CircularProgressIndicatorSpec) bVar).h();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.a
    public void setTrackThickness(int i10) {
        super.setTrackThickness(i10);
        ((CircularProgressIndicatorSpec) this.f20710a).h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public CircularProgressIndicatorSpec j(Context context, AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, f20693r);
        v();
        this.f20720k = true;
    }
}
