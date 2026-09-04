package jc;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.util.Xml;
import com.google.api.client.auth.openidconnect.SMoW.mDXVAtwcaFMHJ;
import h.j;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f42215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f42216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f42217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f42219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f42220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f42221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f42222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f42223i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f42224j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f42225k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f42226l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f42227m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ColorStateList f42228n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f42229o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f42230p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f42231q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f42232r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Typeface f42233s;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends d0.h.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f42234a;

        a(f fVar) {
            this.f42234a = fVar;
        }

        @Override // d0.h.c
        public void f(int i10) {
            d.this.f42231q = true;
            this.f42234a.a(i10);
        }

        @Override // d0.h.c
        public void g(Typeface typeface) {
            d dVar = d.this;
            dVar.f42233s = Typeface.create(typeface, dVar.f42220f);
            d.this.f42231q = true;
            this.f42234a.b(d.this.f42233s, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f42236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextPaint f42237b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f42238c;

        b(Context context, TextPaint textPaint, f fVar) {
            this.f42236a = context;
            this.f42237b = textPaint;
            this.f42238c = fVar;
        }

        @Override // jc.f
        public void a(int i10) {
            this.f42238c.a(i10);
        }

        @Override // jc.f
        public void b(Typeface typeface, boolean z10) {
            d.this.t(this.f42236a, this.f42237b, typeface);
            this.f42238c.b(typeface, z10);
        }
    }

    public d(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, j.f40011c3);
        q(typedArrayObtainStyledAttributes.getDimension(j.f40017d3, 0.0f));
        p(c.a(context, typedArrayObtainStyledAttributes, j.f40035g3));
        this.f42215a = c.a(context, typedArrayObtainStyledAttributes, j.f40041h3);
        this.f42216b = c.a(context, typedArrayObtainStyledAttributes, j.f40047i3);
        this.f42220f = typedArrayObtainStyledAttributes.getInt(j.f40029f3, 0);
        this.f42221g = typedArrayObtainStyledAttributes.getInt(j.f40023e3, 1);
        int iG = c.g(typedArrayObtainStyledAttributes, j.f40082p3, j.f40072n3);
        this.f42230p = typedArrayObtainStyledAttributes.getResourceId(iG, 0);
        this.f42218d = typedArrayObtainStyledAttributes.getString(iG);
        this.f42222h = typedArrayObtainStyledAttributes.getBoolean(j.f40092r3, false);
        this.f42217c = c.a(context, typedArrayObtainStyledAttributes, j.f40052j3);
        this.f42223i = typedArrayObtainStyledAttributes.getFloat(j.f40057k3, 0.0f);
        this.f42224j = typedArrayObtainStyledAttributes.getFloat(j.f40062l3, 0.0f);
        this.f42225k = typedArrayObtainStyledAttributes.getFloat(j.f40067m3, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, m.f51985g7);
        int i11 = m.f52000h7;
        this.f42226l = typedArrayObtainStyledAttributes2.hasValue(i11);
        this.f42227m = typedArrayObtainStyledAttributes2.getFloat(i11, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f42219e = typedArrayObtainStyledAttributes2.getString(c.g(typedArrayObtainStyledAttributes2, m.f52045k7, m.f52015i7));
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f42233s == null && (str = this.f42218d) != null) {
            this.f42233s = Typeface.create(str, this.f42220f);
        }
        if (this.f42233s == null) {
            int i10 = this.f42221g;
            if (i10 == 1) {
                this.f42233s = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f42233s = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f42233s = Typeface.DEFAULT;
            } else {
                this.f42233s = Typeface.MONOSPACE;
            }
            this.f42233s = Typeface.create(this.f42233s, this.f42220f);
        }
    }

    private Typeface j(Context context) {
        Typeface typefaceCreate;
        if (this.f42232r) {
            return null;
        }
        this.f42232r = true;
        String strN = n(context, this.f42230p);
        if (strN == null || (typefaceCreate = Typeface.create(strN, 0)) == Typeface.DEFAULT) {
            return null;
        }
        return Typeface.create(typefaceCreate, this.f42220f);
    }

    private boolean m(Context context) {
        if (e.a()) {
            f(context);
            return true;
        }
        if (this.f42231q) {
            return true;
        }
        int i10 = this.f42230p;
        if (i10 == 0) {
            return false;
        }
        Typeface typefaceC = d0.h.c(context, i10);
        if (typefaceC != null) {
            this.f42233s = typefaceC;
            this.f42231q = true;
            return true;
        }
        Typeface typefaceJ = j(context);
        if (typefaceJ == null) {
            return false;
        }
        this.f42233s = typefaceJ;
        this.f42231q = true;
        return true;
    }

    private static String n(Context context, int i10) {
        Resources resources = context.getResources();
        if (i10 != 0 && resources.getResourceTypeName(i10).equals("font")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                while (xml.getEventType() != 1) {
                    if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), b0.d.f8239h);
                        String string = typedArrayObtainAttributes.getString(b0.d.f8247p);
                        typedArrayObtainAttributes.recycle();
                        return string;
                    }
                    xml.next();
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public Typeface e() {
        d();
        return this.f42233s;
    }

    public void g(Context context, TextPaint textPaint, f fVar) {
        t(context, textPaint, e());
        h(context, new b(context, textPaint, fVar));
    }

    public void h(Context context, f fVar) {
        if (!m(context)) {
            d();
        }
        int i10 = this.f42230p;
        if (i10 == 0) {
            this.f42231q = true;
        }
        if (this.f42231q) {
            fVar.b(this.f42233s, true);
            return;
        }
        try {
            d0.h.i(context, i10, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f42231q = true;
            fVar.a(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f42218d, e10);
            this.f42231q = true;
            fVar.a(-3);
        }
    }

    public String i() {
        return this.f42219e;
    }

    public ColorStateList k() {
        return this.f42228n;
    }

    public float l() {
        return this.f42229o;
    }

    public void o(String str) {
        this.f42219e = str;
    }

    public void p(ColorStateList colorStateList) {
        this.f42228n = colorStateList;
    }

    public void q(float f10) {
        this.f42229o = f10;
    }

    public void r(Context context, TextPaint textPaint, f fVar) {
        s(context, textPaint, fVar);
        ColorStateList colorStateList = this.f42228n;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f42225k;
        float f11 = this.f42223i;
        float f12 = this.f42224j;
        ColorStateList colorStateList2 = this.f42217c;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void s(Context context, TextPaint textPaint, f fVar) {
        Typeface typeface;
        if (m(context) && this.f42231q && (typeface = this.f42233s) != null) {
            t(context, textPaint, typeface);
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void t(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = h.a(context, typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f42220f & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f42229o);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(null);
            textPaint.setFontVariationSettings(this.f42219e);
        }
        if (this.f42226l) {
            textPaint.setLetterSpacing(this.f42227m);
        }
    }

    public Typeface f(Context context) {
        if (this.f42231q) {
            return this.f42233s;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceG = d0.h.g(context, this.f42230p);
                this.f42233s = typefaceG;
                if (typefaceG != null) {
                    this.f42233s = Typeface.create(typefaceG, this.f42220f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", mDXVAtwcaFMHJ.KUYQM + this.f42218d, e10);
            }
        }
        d();
        this.f42231q = true;
        return this.f42233s;
    }
}
