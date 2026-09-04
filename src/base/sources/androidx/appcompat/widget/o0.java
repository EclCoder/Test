package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypedArray f1666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TypedValue f1667c;

    private o0(Context context, TypedArray typedArray) {
        this.f1665a = context;
        this.f1666b = typedArray;
    }

    public static o0 t(Context context, int i10, int[] iArr) {
        return new o0(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static o0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new o0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static o0 v(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new o0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f1666b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f1666b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f1666b.hasValue(i10) || (resourceId = this.f1666b.getResourceId(i10, 0)) == 0 || (colorStateListA = i.a.a(this.f1665a, resourceId)) == null) ? this.f1666b.getColorStateList(i10) : colorStateListA;
    }

    public float d(int i10, float f10) {
        return this.f1666b.getDimension(i10, f10);
    }

    public int e(int i10, int i11) {
        return this.f1666b.getDimensionPixelOffset(i10, i11);
    }

    public int f(int i10, int i11) {
        return this.f1666b.getDimensionPixelSize(i10, i11);
    }

    public Drawable g(int i10) {
        int resourceId;
        return (!this.f1666b.hasValue(i10) || (resourceId = this.f1666b.getResourceId(i10, 0)) == 0) ? this.f1666b.getDrawable(i10) : i.a.b(this.f1665a, resourceId);
    }

    public Drawable h(int i10) {
        int resourceId;
        if (!this.f1666b.hasValue(i10) || (resourceId = this.f1666b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return h.b().d(this.f1665a, resourceId, true);
    }

    public float i(int i10, float f10) {
        return this.f1666b.getFloat(i10, f10);
    }

    public Typeface j(int i10, int i11, d0.h.c cVar) {
        int resourceId = this.f1666b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1667c == null) {
            this.f1667c = new TypedValue();
        }
        return d0.h.h(this.f1665a, resourceId, this.f1667c, i11, cVar);
    }

    public int k(int i10, int i11) {
        return this.f1666b.getInt(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f1666b.getInteger(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f1666b.getLayoutDimension(i10, i11);
    }

    public int n(int i10, int i11) {
        return this.f1666b.getResourceId(i10, i11);
    }

    public String o(int i10) {
        return this.f1666b.getString(i10);
    }

    public CharSequence p(int i10) {
        return this.f1666b.getText(i10);
    }

    public CharSequence[] q(int i10) {
        return this.f1666b.getTextArray(i10);
    }

    public TypedArray r() {
        return this.f1666b;
    }

    public boolean s(int i10) {
        return this.f1666b.hasValue(i10);
    }

    public TypedValue w(int i10) {
        return this.f1666b.peekValue(i10);
    }

    public void x() {
        this.f1666b.recycle();
    }
}
