package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class r {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final RectF f1693l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static ConcurrentHashMap f1694m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1695a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1696b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f1697c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f1698d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f1699e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f1700f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1701g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextPaint f1702h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextView f1703i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f1704j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d f1705k;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, d dVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                dVar.a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b extends d {
        b() {
        }

        @Override // androidx.appcompat.widget.r.d
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) r.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c extends b {
        c() {
        }

        @Override // androidx.appcompat.widget.r.b, androidx.appcompat.widget.r.d
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.r.d
        boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class d {
        d() {
        }

        abstract void a(StaticLayout.Builder builder, TextView textView);

        boolean b(TextView textView) {
            return ((Boolean) r.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    r(TextView textView) {
        this.f1703i = textView;
        this.f1704j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1705k = new c();
        } else {
            this.f1705k = new b();
        }
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i10 : iArr) {
                if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    private void c() {
        this.f1695a = 0;
        this.f1698d = -1.0f;
        this.f1699e = -1.0f;
        this.f1697c = -1.0f;
        this.f1700f = new int[0];
        this.f1696b = false;
    }

    private int e(RectF rectF) {
        int length = this.f1700f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = 1;
        int i11 = length - 1;
        int i12 = 0;
        while (i10 <= i11) {
            int i13 = (i10 + i11) / 2;
            if (x(this.f1700f[i13], rectF)) {
                int i14 = i13 + 1;
                i12 = i10;
                i10 = i14;
            } else {
                i12 = i13 - 1;
                i11 = i12;
            }
        }
        return this.f1700f[i12];
    }

    private static Method k(String str) {
        try {
            Method declaredMethod = (Method) f1694m.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            f1694m.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    static Object m(Object obj, String str, Object obj2) {
        try {
            return k(str).invoke(obj, null);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    private void s(float f10) {
        if (f10 != this.f1703i.getPaint().getTextSize()) {
            this.f1703i.getPaint().setTextSize(f10);
            boolean zIsInLayout = this.f1703i.isInLayout();
            if (this.f1703i.getLayout() != null) {
                this.f1696b = false;
                try {
                    Method methodK = k("nullLayouts");
                    if (methodK != null) {
                        methodK.invoke(this.f1703i, null);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (zIsInLayout) {
                    this.f1703i.forceLayout();
                } else {
                    this.f1703i.requestLayout();
                }
                this.f1703i.invalidate();
            }
        }
    }

    private boolean u() {
        if (y() && this.f1695a == 1) {
            if (!this.f1701g || this.f1700f.length == 0) {
                int iFloor = ((int) Math.floor((this.f1699e - this.f1698d) / this.f1697c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round(this.f1698d + (i10 * this.f1697c));
                }
                this.f1700f = b(iArr);
            }
            this.f1696b = true;
        } else {
            this.f1696b = false;
        }
        return this.f1696b;
    }

    private void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f1700f = b(iArr);
            w();
        }
    }

    private boolean w() {
        int[] iArr = this.f1700f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f1701g = z10;
        if (z10) {
            this.f1695a = 1;
            this.f1698d = iArr[0];
            this.f1699e = iArr[length - 1];
            this.f1697c = -1.0f;
        }
        return z10;
    }

    private boolean x(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1703i.getText();
        TransformationMethod transformationMethod = this.f1703i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1703i)) != null) {
            text = transformation;
        }
        int maxLines = this.f1703i.getMaxLines();
        l(i10);
        StaticLayout staticLayoutD = d(text, (Layout.Alignment) m(this.f1703i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutD.getLineCount() <= maxLines && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) && ((float) staticLayoutD.getHeight()) <= rectF.bottom;
    }

    private boolean y() {
        return !(this.f1703i instanceof AppCompatEditText);
    }

    private void z(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f1695a = 1;
        this.f1698d = f10;
        this.f1699e = f11;
        this.f1697c = f12;
        this.f1701g = false;
    }

    void a() {
        if (n()) {
            if (this.f1696b) {
                if (this.f1703i.getMeasuredHeight() <= 0 || this.f1703i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f1705k.b(this.f1703i) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : (this.f1703i.getMeasuredWidth() - this.f1703i.getTotalPaddingLeft()) - this.f1703i.getTotalPaddingRight();
                int height = (this.f1703i.getHeight() - this.f1703i.getCompoundPaddingBottom()) - this.f1703i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1693l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fE = e(rectF);
                        if (fE != this.f1703i.getTextSize()) {
                            t(0, fE);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            this.f1696b = true;
        }
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        return a.a(charSequence, alignment, i10, i11, this.f1703i, this.f1702h, this.f1705k);
    }

    int f() {
        return Math.round(this.f1699e);
    }

    int g() {
        return Math.round(this.f1698d);
    }

    int h() {
        return Math.round(this.f1697c);
    }

    int[] i() {
        return this.f1700f;
    }

    int j() {
        return this.f1695a;
    }

    void l(int i10) {
        TextPaint textPaint = this.f1702h;
        if (textPaint == null) {
            this.f1702h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1702h.set(this.f1703i.getPaint());
        this.f1702h.setTextSize(i10);
    }

    boolean n() {
        return y() && this.f1695a != 0;
    }

    void o(AttributeSet attributeSet, int i10) {
        int resourceId;
        Context context = this.f1704j;
        int[] iArr = h.j.f40044i0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        TextView textView = this.f1703i;
        n0.q0.k0(textView, textView.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        int i11 = h.j.f40069n0;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f1695a = typedArrayObtainStyledAttributes.getInt(i11, 0);
        }
        int i12 = h.j.f40064m0;
        float dimension = typedArrayObtainStyledAttributes.hasValue(i12) ? typedArrayObtainStyledAttributes.getDimension(i12, -1.0f) : -1.0f;
        int i13 = h.j.f40054k0;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i13) ? typedArrayObtainStyledAttributes.getDimension(i13, -1.0f) : -1.0f;
        int i14 = h.j.f40049j0;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i14) ? typedArrayObtainStyledAttributes.getDimension(i14, -1.0f) : -1.0f;
        int i15 = h.j.f40059l0;
        if (typedArrayObtainStyledAttributes.hasValue(i15) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i15, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!y()) {
            this.f1695a = 0;
            return;
        }
        if (this.f1695a == 1) {
            if (!this.f1701g) {
                DisplayMetrics displayMetrics = this.f1704j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    void p(int i10, int i11, int i12, int i13) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f1704j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    void q(int[] iArr, int i10) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1704j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f1700f = b(iArrCopyOf);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1701g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    void r(int i10) {
        if (y()) {
            if (i10 == 0) {
                c();
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            }
            DisplayMetrics displayMetrics = this.f1704j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    void t(int i10, float f10) {
        Context context = this.f1704j;
        s(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
