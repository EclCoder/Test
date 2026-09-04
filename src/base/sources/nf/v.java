package nf;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import gl.j0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f47646a = new v();

    private v() {
    }

    private final Typeface b(String str) {
        try {
            Typeface typefaceCreateFromFile = Typeface.createFromFile(str);
            kotlin.jvm.internal.s.e(typefaceCreateFromFile);
            return typefaceCreateFromFile;
        } catch (Throwable th2) {
            wp.a.j(th2, "Failed to load typeface from %s; falling back", str);
            Typeface typeface = Typeface.DEFAULT;
            kotlin.jvm.internal.s.e(typeface);
            return typeface;
        }
    }

    private final float c(Context context, float f10) {
        return f10 / context.getResources().getDisplayMetrics().scaledDensity;
    }

    private final og.a d(w wVar) {
        File file = new File("/system/fonts/" + wVar.k());
        if (file.exists()) {
            return new og.a(file.getAbsolutePath(), ql.f.q(file));
        }
        File file2 = new File("/system/fonts/Roboto-Regular.ttf");
        if (file2.exists()) {
            return new og.a(file2.getAbsolutePath(), ql.f.q(file2));
        }
        m0.c cVarA = og.b.a();
        return cVarA != null ? new og.a((String) cVarA.f45059a, (String) cVarA.f45060b) : new og.a("/system/fonts/Roboto-Regular.ttf", "Roboto");
    }

    private final String e(String str, TextPaint textPaint, float f10) {
        int i10 = 0;
        List listJ = new bm.o("\\s+").j(str, 0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
            if (!bm.r.h0((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty() || textPaint.measureText(str) <= f10) {
            return str;
        }
        ArrayList arrayList2 = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            String str2 = (String) obj2;
            if (textPaint.measureText(sb2.length() == 0 ? str2 : ((Object) sb2) + ' ' + str2) <= f10) {
                if (sb2.length() != 0) {
                    sb2.append(' ');
                }
                sb2.append(str2);
            } else {
                if (sb2.length() > 0) {
                    arrayList2.add(sb2);
                    sb2 = new StringBuilder();
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            arrayList2.add(sb2);
        }
        return gl.r.l0(arrayList2, "\n", null, null, 0, null, null, 62, null);
    }

    public final List a(Context context, List cards, w preset, int i10, int i11) {
        boolean z10;
        int iD;
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(cards, "cards");
        kotlin.jvm.internal.s.h(preset, "preset");
        og.a aVarD = d(preset);
        float f10 = i11;
        float fC = yl.g.c(preset.i() * f10, 16.0f);
        float fM = fC * preset.m();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(fC);
        textPaint.setColor(preset.h());
        v vVar = f47646a;
        String strB = aVarD.b();
        kotlin.jvm.internal.s.g(strB, "getFontPath(...)");
        textPaint.setTypeface(vVar.b(strB));
        float f11 = i10;
        float f12 = 0.85f * f11;
        List list = cards;
        ArrayList arrayList = new ArrayList(gl.r.v(list, 10));
        int i12 = 0;
        for (Object obj : list) {
            float f13 = f11;
            int i13 = i12 + 1;
            if (i12 < 0) {
                gl.r.u();
            }
            m mVar = (m) obj;
            String string = bm.r.V0(mVar.e()).toString();
            if (string.length() == 0) {
                string = " ";
            }
            String strE = f47646a.e(string, textPaint, f12);
            long jE = yl.g.e(mVar.c() - mVar.d(), 1L);
            m mVar2 = (m) gl.r.e0(cards, i13);
            Float fValueOf = null;
            Long lValueOf = mVar2 != null ? Long.valueOf(mVar2.d()) : null;
            float f14 = f10;
            long jE2 = yl.g.e(yl.g.g(yl.g.e(jE, 1200L), lValueOf != null ? yl.g.e((lValueOf.longValue() - mVar.d()) - 60, 150L) : Long.MAX_VALUE), 150L);
            StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(strE, 0, strE.length(), textPaint, yl.g.d((int) (0.99f * f13), 1)).setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(true).build();
            kotlin.jvm.internal.s.g(staticLayoutBuild, "build(...)");
            Iterator it = yl.g.m(0, staticLayoutBuild.getLineCount()).iterator();
            if (it.hasNext()) {
                j0 j0Var = (j0) it;
                float lineWidth = staticLayoutBuild.getLineWidth(j0Var.nextInt());
                while (it.hasNext()) {
                    lineWidth = Math.max(lineWidth, staticLayoutBuild.getLineWidth(j0Var.nextInt()));
                }
                fValueOf = Float.valueOf(lineWidth);
            }
            if (fValueOf != null) {
                z10 = true;
                iD = yl.g.d((int) fValueOf.floatValue(), 1);
            } else {
                z10 = true;
                iD = 1;
            }
            int i14 = (int) (fM * 2.0f);
            int iF = yl.g.f(iD + i14, (int) (0.97f * f13));
            int iF2 = yl.g.f(staticLayoutBuild.getHeight() + i14 + 8, i11);
            float fC2 = yl.g.c((i10 - iF) / 2.0f, 0.0f);
            float fH = yl.g.h((preset.n() * f14) - (iF2 / 2.0f), 0.0f, yl.g.c(i11 - iF2, 0.0f));
            Matrix matrix = new Matrix();
            matrix.setTranslate(fC2, fH);
            aVarD = aVarD;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new qh.j(null, strE, aVarD, preset.h(), 1.0f, Layout.Alignment.ALIGN_CENTER, f47646a.c(context, fC), 0.0f, 0.0f, matrix, iF, iF2, f13, f14, mVar.d(), jE2, true, preset.l(), fM, 1, null));
            arrayList = arrayList2;
            fC = fC;
            f12 = f12;
            f11 = f13;
            f10 = f14;
            textPaint = textPaint;
            i12 = i13;
        }
        return arrayList;
    }
}
