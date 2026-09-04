package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class LinearProgressIndicator extends a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f20699r = sb.l.R;

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, f20699r);
        v();
        this.f20720k = true;
    }

    private void v() {
        k kVar = new k((LinearProgressIndicatorSpec) this.f20710a);
        setIndeterminateDrawable(j.w(getContext(), (LinearProgressIndicatorSpec) this.f20710a, kVar));
        setProgressDrawable(f.C(getContext(), (LinearProgressIndicatorSpec) this.f20710a, kVar));
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.f20710a).f20700q;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.f20710a).f20701r;
    }

    public int getTrackInnerCornerRadius() {
        return ((LinearProgressIndicatorSpec) this.f20710a).f20705v;
    }

    public Integer getTrackStopIndicatorPadding() {
        return ((LinearProgressIndicatorSpec) this.f20710a).f20704u;
    }

    public int getTrackStopIndicatorSize() {
        return ((LinearProgressIndicatorSpec) this.f20710a).f20703t;
    }

    @Override // com.google.android.material.progressindicator.a, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b bVar = this.f20710a;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) bVar;
        boolean z11 = true;
        if (((LinearProgressIndicatorSpec) bVar).f20701r != 1 && ((getLayoutDirection() != 1 || ((LinearProgressIndicatorSpec) this.f20710a).f20701r != 2) && (getLayoutDirection() != 0 || ((LinearProgressIndicatorSpec) this.f20710a).f20701r != 3))) {
            z11 = false;
        }
        linearProgressIndicatorSpec.f20702s = z11;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        int paddingLeft = i10 - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i11 - (getPaddingTop() + getPaddingBottom());
        j indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        f progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    @Override // com.google.android.material.progressindicator.a
    public void r(int i10, boolean z10) {
        b bVar = this.f20710a;
        if (bVar != null && ((LinearProgressIndicatorSpec) bVar).f20700q == 0 && isIndeterminate()) {
            return;
        }
        super.r(i10, z10);
    }

    public void setIndeterminateAnimationType(int i10) {
        if (((LinearProgressIndicatorSpec) this.f20710a).f20700q == i10) {
            return;
        }
        if (t() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        b bVar = this.f20710a;
        ((LinearProgressIndicatorSpec) bVar).f20700q = i10;
        ((LinearProgressIndicatorSpec) bVar).h();
        if (i10 == 0) {
            getIndeterminateDrawable().A(new l((LinearProgressIndicatorSpec) this.f20710a));
        } else {
            getIndeterminateDrawable().A(new m(getContext(), (LinearProgressIndicatorSpec) this.f20710a));
        }
        q();
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.a
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.f20710a).h();
    }

    public void setIndicatorDirection(int i10) {
        b bVar = this.f20710a;
        ((LinearProgressIndicatorSpec) bVar).f20701r = i10;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) bVar;
        boolean z10 = true;
        if (i10 != 1 && ((getLayoutDirection() != 1 || ((LinearProgressIndicatorSpec) this.f20710a).f20701r != 2) && (getLayoutDirection() != 0 || i10 != 3))) {
            z10 = false;
        }
        linearProgressIndicatorSpec.f20702s = z10;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.a
    public void setTrackCornerRadius(int i10) {
        super.setTrackCornerRadius(i10);
        ((LinearProgressIndicatorSpec) this.f20710a).h();
        invalidate();
    }

    public void setTrackInnerCornerRadius(int i10) {
        b bVar = this.f20710a;
        if (((LinearProgressIndicatorSpec) bVar).f20705v != i10) {
            ((LinearProgressIndicatorSpec) bVar).f20705v = Math.round(Math.min(i10, ((LinearProgressIndicatorSpec) bVar).f20730a / 2.0f));
            b bVar2 = this.f20710a;
            ((LinearProgressIndicatorSpec) bVar2).f20707x = false;
            ((LinearProgressIndicatorSpec) bVar2).f20708y = true;
            ((LinearProgressIndicatorSpec) bVar2).h();
            invalidate();
        }
    }

    public void setTrackInnerCornerRadiusFraction(float f10) {
        b bVar = this.f20710a;
        if (((LinearProgressIndicatorSpec) bVar).f20706w != f10) {
            ((LinearProgressIndicatorSpec) bVar).f20706w = Math.min(f10, 0.5f);
            b bVar2 = this.f20710a;
            ((LinearProgressIndicatorSpec) bVar2).f20707x = true;
            ((LinearProgressIndicatorSpec) bVar2).f20708y = true;
            ((LinearProgressIndicatorSpec) bVar2).h();
            invalidate();
        }
    }

    public void setTrackStopIndicatorPadding(Integer num) {
        if (Objects.equals(((LinearProgressIndicatorSpec) this.f20710a).f20704u, num)) {
            return;
        }
        ((LinearProgressIndicatorSpec) this.f20710a).f20704u = num;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i10) {
        b bVar = this.f20710a;
        if (((LinearProgressIndicatorSpec) bVar).f20703t != i10) {
            ((LinearProgressIndicatorSpec) bVar).f20703t = i10;
            ((LinearProgressIndicatorSpec) bVar).h();
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public LinearProgressIndicatorSpec j(Context context, AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }
}
