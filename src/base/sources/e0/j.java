package e0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q f37008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final androidx.collection.n f37009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Paint f37010c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a extends k0.i.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d0.h.c f37011a;

        public a(d0.h.c cVar) {
            this.f37011a = cVar;
        }

        @Override // k0.i.c
        public void a(int i10) {
            d0.h.c cVar = this.f37011a;
            if (cVar != null) {
                cVar.f(i10);
            }
        }

        @Override // k0.i.c
        public void b(Typeface typeface) {
            d0.h.c cVar = this.f37011a;
            if (cVar != null) {
                cVar.g(typeface);
            }
        }
    }

    static {
        s4.a.a("TypefaceCompat static init");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            f37008a = new p();
        } else if (i10 >= 29) {
            f37008a = new o();
        } else if (i10 >= 28) {
            f37008a = new n();
        } else if (i10 >= 26) {
            f37008a = new m();
        } else if (l.k()) {
            f37008a = new l();
        } else {
            f37008a = new k();
        }
        f37009b = new androidx.collection.n(16);
        f37010c = null;
        s4.a.b();
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, k0.i.b[] bVarArr, int i10) {
        s4.a.a("TypefaceCompat.createFromFontInfo");
        try {
            return f37008a.b(context, cancellationSignal, bVarArr, i10);
        } finally {
            s4.a.b();
        }
    }

    public static Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i10) {
        s4.a.a("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f37008a.c(context, cancellationSignal, list, i10);
        } finally {
            s4.a.b();
        }
    }

    public static Typeface d(Context context, d0.e.a aVar, Resources resources, int i10, String str, int i11, int i12, d0.h.c cVar, Handler handler, boolean z10) {
        Typeface typefaceA;
        if (aVar instanceof d0.e.d) {
            d0.e.d dVar = (d0.e.d) aVar;
            Typeface typefaceI = i(dVar);
            if (typefaceI != null) {
                if (cVar != null) {
                    cVar.d(typefaceI, handler);
                }
                f37009b.put(f(resources, i10, str, i11, i12), typefaceI);
                return typefaceI;
            }
            typefaceA = k0.i.c(context, dVar.b(), i12, !z10 ? cVar != null : dVar.a() != 0, z10 ? dVar.d() : -1, d0.h.c.e(handler), new a(cVar));
        } else {
            typefaceA = f37008a.a(context, (d0.e.b) aVar, resources, i12);
            if (cVar != null) {
                if (typefaceA != null) {
                    cVar.d(typefaceA, handler);
                } else {
                    cVar.c(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f37009b.put(f(resources, i10, str, i11, i12), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface e(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface typefaceE = f37008a.e(context, resources, i10, str, i12);
        if (typefaceE != null) {
            f37009b.put(f(resources, i10, str, i11, i12), typefaceE);
        }
        return typefaceE;
    }

    private static String f(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface g(Resources resources, int i10, String str, int i11, int i12) {
        return (Typeface) f37009b.get(f(resources, i10, str, i11, i12));
    }

    public static Typeface h(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    private static Typeface i(d0.e.d dVar) {
        FontFamily fontFamilyBuild;
        Typeface typefaceH;
        String strC = dVar.c();
        if (!TextUtils.isEmpty(strC) && (typefaceH = h(strC)) != null) {
            return typefaceH;
        }
        List listB = dVar.b();
        if (listB.size() == 1) {
            return h(((k0.e) listB.get(0)).h());
        }
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        for (int i10 = 0; i10 < listB.size(); i10++) {
            if (h(((k0.e) listB.get(i10)).h()) == null) {
                return null;
            }
        }
        Typeface.CustomFallbackBuilder customFallbackBuilderA = null;
        for (int i11 = 0; i11 < listB.size(); i11++) {
            k0.e eVar = (k0.e) listB.get(i11);
            if (i11 == listB.size() - 1 && TextUtils.isEmpty(eVar.i())) {
                customFallbackBuilderA.setSystemFallback(eVar.h());
                break;
            }
            Font fontJ = j(h(eVar.h()));
            if (fontJ == null) {
                Log.w("TypefaceCompat", "Unable identify the primary font for " + eVar.h() + ". Falling back to provider font.");
                return null;
            }
            if (TextUtils.isEmpty(eVar.i())) {
                fontFamilyBuild = f.a(fontJ).build();
            } else {
                try {
                    h.a();
                    i.a();
                    fontFamilyBuild = f.a(e.a(fontJ).setFontVariationSettings(eVar.i()).build()).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
            if (customFallbackBuilderA == null) {
                customFallbackBuilderA = g.a(fontFamilyBuild);
            } else {
                customFallbackBuilderA.addCustomFallback(fontFamilyBuild);
            }
        }
        return customFallbackBuilderA.build();
    }

    public static Font j(Typeface typeface) {
        if (f37010c == null) {
            f37010c = new Paint();
        }
        f37010c.setTextSize(10.0f);
        f37010c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f37010c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
