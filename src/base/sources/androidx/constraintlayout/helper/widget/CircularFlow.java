package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.f;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class CircularFlow extends VirtualLayout {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static int f1996v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static float f1997w;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ConstraintLayout f1998l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f1999m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float[] f2000n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int[] f2001o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f2002p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f2003q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f2004r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f2005s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Float f2006t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Integer f2007u;

    public CircularFlow(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    private void A() {
        this.f1998l = (ConstraintLayout) getParent();
        for (int i10 = 0; i10 < this.f2540b; i10++) {
            View viewQ = this.f1998l.q(this.f2539a[i10]);
            if (viewQ != null) {
                int i11 = f1996v;
                float f10 = f1997w;
                int[] iArr = this.f2001o;
                if (iArr == null || i10 >= iArr.length) {
                    Integer num = this.f2007u;
                    if (num == null || num.intValue() == -1) {
                        Log.e("CircularFlow", "Added radius to view with id: " + ((String) this.f2547i.get(Integer.valueOf(viewQ.getId()))));
                    } else {
                        this.f2002p++;
                        if (this.f2001o == null) {
                            this.f2001o = new int[1];
                        }
                        int[] radius = getRadius();
                        this.f2001o = radius;
                        radius[this.f2002p - 1] = i11;
                    }
                } else {
                    i11 = iArr[i10];
                }
                float[] fArr = this.f2000n;
                if (fArr == null || i10 >= fArr.length) {
                    Float f11 = this.f2006t;
                    if (f11 == null || f11.floatValue() == -1.0f) {
                        Log.e("CircularFlow", "Added angle to view with id: " + ((String) this.f2547i.get(Integer.valueOf(viewQ.getId()))));
                    } else {
                        this.f2003q++;
                        if (this.f2000n == null) {
                            this.f2000n = new float[1];
                        }
                        float[] angles = getAngles();
                        this.f2000n = angles;
                        angles[this.f2003q - 1] = f10;
                    }
                } else {
                    f10 = fArr[i10];
                }
                ConstraintLayout.b bVar = (ConstraintLayout.b) viewQ.getLayoutParams();
                bVar.f2608r = f10;
                bVar.f2604p = this.f1999m;
                bVar.f2606q = i11;
                viewQ.setLayoutParams(bVar);
            }
        }
        h();
    }

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f2003q = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                y(str.substring(i10).trim());
                return;
            } else {
                y(str.substring(i10, iIndexOf).trim());
                i10 = iIndexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f2002p = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                z(str.substring(i10).trim());
                return;
            } else {
                z(str.substring(i10, iIndexOf).trim());
                i10 = iIndexOf + 1;
            }
        }
    }

    private void y(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.f2541c == null || (fArr = this.f2000n) == null) {
            return;
        }
        if (this.f2003q + 1 > fArr.length) {
            this.f2000n = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.f2000n[this.f2003q] = Integer.parseInt(str);
        this.f2003q++;
    }

    private void z(String str) {
        int[] iArr;
        if (str == null || str.length() == 0 || this.f2541c == null || (iArr = this.f2001o) == null) {
            return;
        }
        if (this.f2002p + 1 > iArr.length) {
            this.f2001o = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.f2001o[this.f2002p] = (int) (Integer.parseInt(str) * this.f2541c.getResources().getDisplayMetrics().density);
        this.f2002p++;
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f2000n, this.f2003q);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.f2001o, this.f2002p);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    protected void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.f2858f1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.B1) {
                    this.f1999m = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                } else if (index == f.f3092x1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f2004r = string;
                    setAngles(string);
                } else if (index == f.A1) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f2005s = string2;
                    setRadius(string2);
                } else if (index == f.f3105y1) {
                    Float fValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, f1997w));
                    this.f2006t = fValueOf;
                    setDefaultAngle(fValueOf.floatValue());
                } else if (index == f.f3118z1) {
                    Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, f1996v));
                    this.f2007u = numValueOf;
                    setDefaultRadius(numValueOf.intValue());
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2004r;
        if (str != null) {
            this.f2000n = new float[1];
            setAngles(str);
        }
        String str2 = this.f2005s;
        if (str2 != null) {
            this.f2001o = new int[1];
            setRadius(str2);
        }
        Float f10 = this.f2006t;
        if (f10 != null) {
            setDefaultAngle(f10.floatValue());
        }
        Integer num = this.f2007u;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        A();
    }

    public void setDefaultAngle(float f10) {
        f1997w = f10;
    }

    public void setDefaultRadius(int i10) {
        f1996v = i10;
    }
}
