package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import x.j;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class Barrier extends ConstraintHelper {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f2536j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f2537k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private x.a f2538l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void x(x.e eVar, int i10, boolean z10) {
        this.f2537k = i10;
        if (z10) {
            int i11 = this.f2536j;
            if (i11 == 5) {
                this.f2537k = 1;
            } else if (i11 == 6) {
                this.f2537k = 0;
            }
        } else {
            int i12 = this.f2536j;
            if (i12 == 5) {
                this.f2537k = 0;
            } else if (i12 == 6) {
                this.f2537k = 1;
            }
        }
        if (eVar instanceof x.a) {
            ((x.a) eVar).F1(this.f2537k);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f2538l.z1();
    }

    public int getMargin() {
        return this.f2538l.B1();
    }

    public int getType() {
        return this.f2536j;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        this.f2538l = new x.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.f2858f1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.f3066v1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f3053u1) {
                    this.f2538l.E1(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == f.f3079w1) {
                    this.f2538l.G1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f2542d = this.f2538l;
        w();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void p(c.a aVar, j jVar, ConstraintLayout.b bVar, SparseArray sparseArray) {
        super.p(aVar, jVar, bVar, sparseArray);
        if (jVar instanceof x.a) {
            x.a aVar2 = (x.a) jVar;
            x(aVar2, aVar.f2694e.f2726h0, ((x.f) jVar.M()).V1());
            aVar2.E1(aVar.f2694e.f2742p0);
            aVar2.G1(aVar.f2694e.f2728i0);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void q(x.e eVar, boolean z10) {
        x(eVar, this.f2536j, z10);
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f2538l.E1(z10);
    }

    public void setDpMargin(int i10) {
        this.f2538l.G1((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f2538l.G1(i10);
    }

    public void setType(int i10) {
        this.f2536j = i10;
    }

    public Barrier(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        super.setVisibility(8);
    }
}
