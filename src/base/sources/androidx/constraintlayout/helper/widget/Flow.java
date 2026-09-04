package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.c;
import androidx.constraintlayout.widget.f;
import x.e;
import x.g;
import x.j;
import x.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class Flow extends VirtualLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private g f2008l;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    protected void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        this.f2008l = new g();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.f2858f1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.f2871g1) {
                    this.f2008l.I2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f2884h1) {
                    this.f2008l.N1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f3014r1) {
                    this.f2008l.S1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f3027s1) {
                    this.f2008l.P1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f2897i1) {
                    this.f2008l.Q1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f2910j1) {
                    this.f2008l.T1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f2923k1) {
                    this.f2008l.R1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f2936l1) {
                    this.f2008l.O1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.W1) {
                    this.f2008l.N2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == f.M1) {
                    this.f2008l.C2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == f.V1) {
                    this.f2008l.M2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == f.G1) {
                    this.f2008l.w2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == f.O1) {
                    this.f2008l.E2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == f.I1) {
                    this.f2008l.y2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == f.Q1) {
                    this.f2008l.G2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == f.K1) {
                    this.f2008l.A2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.F1) {
                    this.f2008l.v2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.N1) {
                    this.f2008l.D2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.H1) {
                    this.f2008l.x2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.P1) {
                    this.f2008l.F2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.T1) {
                    this.f2008l.K2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.J1) {
                    this.f2008l.z2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == f.S1) {
                    this.f2008l.J2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == f.L1) {
                    this.f2008l.B2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.U1) {
                    this.f2008l.L2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.R1) {
                    this.f2008l.H2(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f2542d = this.f2008l;
        w();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    protected void onMeasure(int i10, int i11) {
        x(this.f2008l, i10, i11);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void p(c.a aVar, j jVar, ConstraintLayout.b bVar, SparseArray sparseArray) {
        super.p(aVar, jVar, bVar, sparseArray);
        if (jVar instanceof g) {
            g gVar = (g) jVar;
            int i10 = bVar.Z;
            if (i10 != -1) {
                gVar.I2(i10);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void q(e eVar, boolean z10) {
        this.f2008l.y1(z10);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f2008l.v2(f10);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f2008l.w2(i10);
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f2008l.x2(f10);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f2008l.y2(i10);
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f2008l.z2(i10);
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f2008l.A2(f10);
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f2008l.B2(i10);
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f2008l.C2(i10);
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.f2008l.D2(f10);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i10) {
        this.f2008l.E2(i10);
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.f2008l.F2(f10);
        requestLayout();
    }

    public void setLastVerticalStyle(int i10) {
        this.f2008l.G2(i10);
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f2008l.H2(i10);
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f2008l.I2(i10);
        requestLayout();
    }

    public void setPadding(int i10) {
        this.f2008l.N1(i10);
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f2008l.O1(i10);
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f2008l.Q1(i10);
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f2008l.R1(i10);
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f2008l.T1(i10);
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f2008l.J2(i10);
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f2008l.K2(f10);
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f2008l.L2(i10);
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f2008l.M2(i10);
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f2008l.N2(i10);
        requestLayout();
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

    public Flow(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
