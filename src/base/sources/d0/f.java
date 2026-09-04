package d0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class f {
    private static a a(a aVar, int i10, int i11, boolean z10, int i12) {
        if (aVar != null) {
            return aVar;
        }
        return z10 ? new a(i10, i12, i11) : new a(i10, i11);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayQ = k.q(resources, theme, attributeSet, b0.d.F);
        float fJ = k.j(typedArrayQ, xmlPullParser, "startX", b0.d.O, 0.0f);
        float fJ2 = k.j(typedArrayQ, xmlPullParser, "startY", b0.d.P, 0.0f);
        float fJ3 = k.j(typedArrayQ, xmlPullParser, "endX", b0.d.Q, 0.0f);
        float fJ4 = k.j(typedArrayQ, xmlPullParser, "endY", b0.d.R, 0.0f);
        float fJ5 = k.j(typedArrayQ, xmlPullParser, "centerX", b0.d.J, 0.0f);
        float fJ6 = k.j(typedArrayQ, xmlPullParser, "centerY", b0.d.K, 0.0f);
        int iK = k.k(typedArrayQ, xmlPullParser, "type", b0.d.I, 0);
        int iF = k.f(typedArrayQ, xmlPullParser, "startColor", b0.d.G, 0);
        boolean zP = k.p(xmlPullParser, "centerColor");
        int iF2 = k.f(typedArrayQ, xmlPullParser, "centerColor", b0.d.N, 0);
        int iF3 = k.f(typedArrayQ, xmlPullParser, "endColor", b0.d.H, 0);
        int iK2 = k.k(typedArrayQ, xmlPullParser, "tileMode", b0.d.M, 0);
        float fJ7 = k.j(typedArrayQ, xmlPullParser, "gradientRadius", b0.d.L, 0.0f);
        typedArrayQ.recycle();
        a aVarA = a(c(resources, xmlPullParser, attributeSet, theme), iF, iF3, zP, iF2);
        if (iK != 1) {
            return iK != 2 ? new LinearGradient(fJ, fJ2, fJ3, fJ4, aVarA.f36063a, aVarA.f36064b, d(iK2)) : new SweepGradient(fJ5, fJ6, aVarA.f36063a, aVarA.f36064b);
        }
        if (fJ7 > 0.0f) {
            return new RadialGradient(fJ5, fJ6, fJ7, aVarA.f36063a, aVarA.f36064b, d(iK2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    private static a c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayQ = k.q(resources, theme, attributeSet, b0.d.S);
                int i10 = b0.d.T;
                boolean zHasValue = typedArrayQ.hasValue(i10);
                int i11 = b0.d.U;
                boolean zHasValue2 = typedArrayQ.hasValue(i11);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color = typedArrayQ.getColor(i10, 0);
                float f10 = typedArrayQ.getFloat(i11, 0.0f);
                typedArrayQ.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f10));
            }
        }
        if (arrayList2.size() > 0) {
            return new a(arrayList2, arrayList);
        }
        return null;
    }

    private static Shader.TileMode d(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f36063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float[] f36064b;

        a(List list, List list2) {
            int size = list.size();
            this.f36063a = new int[size];
            this.f36064b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f36063a[i10] = ((Integer) list.get(i10)).intValue();
                this.f36064b[i10] = ((Float) list2.get(i10)).floatValue();
            }
        }

        a(int i10, int i11) {
            this.f36063a = new int[]{i10, i11};
            this.f36064b = new float[]{0.0f, 1.0f};
        }

        a(int i10, int i11, int i12) {
            this.f36063a = new int[]{i10, i11, i12};
            this.f36064b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
