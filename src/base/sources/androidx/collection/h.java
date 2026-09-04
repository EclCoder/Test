package androidx.collection;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f1909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1910b;

    public /* synthetic */ h(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public static /* synthetic */ String e(h hVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return hVar.d(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public final float a() {
        if (this.f1910b == 0) {
            s.d.d("FloatList is empty.");
        }
        return this.f1909a[0];
    }

    public final float b(int i10) {
        if (i10 < 0 || i10 >= this.f1910b) {
            s.d.c("Index must be between 0 and size");
        }
        return this.f1909a[i10];
    }

    public final int c() {
        return this.f1910b;
    }

    public final String d(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated) {
        kotlin.jvm.internal.s.h(separator, "separator");
        kotlin.jvm.internal.s.h(prefix, "prefix");
        kotlin.jvm.internal.s.h(postfix, "postfix");
        kotlin.jvm.internal.s.h(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr = this.f1909a;
        int i11 = this.f1910b;
        for (int i12 = 0; i12 < i11; i12++) {
            float f10 = fArr[i12];
            if (i12 == i10) {
                sb2.append(truncated);
                String string = sb2.toString();
                kotlin.jvm.internal.s.g(string, "toString(...)");
                return string;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            sb2.append(f10);
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        kotlin.jvm.internal.s.g(string2, "toString(...)");
        return string2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            int i10 = hVar.f1910b;
            int i11 = this.f1910b;
            if (i10 == i11) {
                float[] fArr = this.f1909a;
                float[] fArr2 = hVar.f1909a;
                yl.f fVarM = yl.g.m(0, i11);
                int iA = fVarM.a();
                int iB = fVarM.b();
                if (iA > iB) {
                    return true;
                }
                while (fArr[iA] == fArr2[iA]) {
                    if (iA == iB) {
                        return true;
                    }
                    iA++;
                }
                return false;
            }
        }
        return false;
    }

    public final float f() {
        if (this.f1910b == 0) {
            s.d.d("FloatList is empty.");
        }
        return this.f1909a[this.f1910b - 1];
    }

    public int hashCode() {
        float[] fArr = this.f1909a;
        int i10 = this.f1910b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Float.hashCode(fArr[i11]) * 31;
        }
        return iHashCode;
    }

    public String toString() {
        return e(this, null, "[", "]", 0, null, 25, null);
    }

    private h(int i10) {
        this.f1909a = i10 == 0 ? j.a() : new float[i10];
    }
}
