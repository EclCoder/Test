package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f1611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h1.f f1612b;

    j(TextView textView) {
        this.f1611a = textView;
        this.f1612b = new h1.f(textView, false);
    }

    InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f1612b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f1612b.b();
    }

    void c(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f1611a.getContext().obtainStyledAttributes(attributeSet, h.j.f40044i0, i10, 0);
        try {
            int i11 = h.j.f40114w0;
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(i11) ? typedArrayObtainStyledAttributes.getBoolean(i11, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    void d(boolean z10) {
        this.f1612b.c(z10);
    }

    void e(boolean z10) {
        this.f1612b.d(z10);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f1612b.e(transformationMethod);
    }
}
