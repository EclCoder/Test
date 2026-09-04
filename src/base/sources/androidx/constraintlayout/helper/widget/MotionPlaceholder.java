package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.VirtualLayout;
import x.f;
import x.i;
import x.l;
import x.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class MotionPlaceholder extends VirtualLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    l f2049l;

    public MotionPlaceholder(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    protected void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        this.f2542d = new l();
        w();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    protected void onMeasure(int i10, int i11) {
        x(this.f2049l, i10, i11);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public void x(m mVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            mVar.H1(mode, size, mode2, size2);
            setMeasuredDimension(mVar.C1(), mVar.B1());
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void v(f fVar, i iVar, SparseArray sparseArray) {
    }
}
