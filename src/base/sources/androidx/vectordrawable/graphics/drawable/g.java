package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import com.mbridge.msdk.MBridgeConstans;
import d0.k;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class g extends androidx.vectordrawable.graphics.drawable.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f7509k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h f7510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuffColorFilter f7511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorFilter f7512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f7513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable.ConstantState f7515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f7516h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Matrix f7517i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f7518j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b extends f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f7545b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f7544a = e0.d.d(string2);
            }
            this.f7546c = k.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.p(xmlPullParser, "pathData")) {
                TypedArray typedArrayQ = k.q(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f7482d);
                f(typedArrayQ, xmlPullParser);
                typedArrayQ.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f7565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        C0097g f7566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ColorStateList f7567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f7568d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f7569e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Bitmap f7570f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ColorStateList f7571g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f7572h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f7573i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f7574j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f7575k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Paint f7576l;

        public h(h hVar) {
            this.f7567c = null;
            this.f7568d = g.f7509k;
            if (hVar != null) {
                this.f7565a = hVar.f7565a;
                C0097g c0097g = new C0097g(hVar.f7566b);
                this.f7566b = c0097g;
                if (hVar.f7566b.f7553e != null) {
                    c0097g.f7553e = new Paint(hVar.f7566b.f7553e);
                }
                if (hVar.f7566b.f7552d != null) {
                    this.f7566b.f7552d = new Paint(hVar.f7566b.f7552d);
                }
                this.f7567c = hVar.f7567c;
                this.f7568d = hVar.f7568d;
                this.f7569e = hVar.f7569e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f7570f.getWidth() && i11 == this.f7570f.getHeight();
        }

        public boolean b() {
            return !this.f7575k && this.f7571g == this.f7567c && this.f7572h == this.f7568d && this.f7574j == this.f7569e && this.f7573i == this.f7566b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f7570f == null || !a(i10, i11)) {
                this.f7570f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f7575k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f7570f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f7576l == null) {
                Paint paint = new Paint();
                this.f7576l = paint;
                paint.setFilterBitmap(true);
            }
            this.f7576l.setAlpha(this.f7566b.getRootAlpha());
            this.f7576l.setColorFilter(colorFilter);
            return this.f7576l;
        }

        public boolean f() {
            return this.f7566b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f7566b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f7565a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.f7566b.g(iArr);
            this.f7575k |= zG;
            return zG;
        }

        public void i() {
            this.f7571g = this.f7567c;
            this.f7572h = this.f7568d;
            this.f7573i = this.f7566b.getRootAlpha();
            this.f7574j = this.f7569e;
            this.f7575k = false;
        }

        public void j(int i10, int i11) {
            this.f7570f.eraseColor(0);
            this.f7566b.b(new Canvas(this.f7570f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new g(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new g(this);
        }

        public h() {
            this.f7567c = null;
            this.f7568d = g.f7509k;
            this.f7566b = new C0097g();
        }
    }

    g() {
        this.f7514f = true;
        this.f7516h = new float[9];
        this.f7517i = new Matrix();
        this.f7518j = new Rect();
        this.f7510b = new h();
    }

    static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    public static g b(Resources resources, int i10, Resources.Theme theme) {
        g gVar = new g();
        gVar.f7508a = d0.h.e(resources, i10, theme);
        gVar.f7515g = new i(gVar.f7508a.getConstantState());
        return gVar;
    }

    private void d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f7510b;
        C0097g c0097g = hVar.f7566b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c0097g.f7556h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if (MBridgeConstans.DYNAMIC_VIEW_WX_PATH.equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f7532b.add(cVar);
                    if (cVar.getPathName() != null) {
                        c0097g.f7564p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f7565a = cVar.f7547d | hVar.f7565a;
                    z10 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f7532b.add(bVar);
                    if (bVar.getPathName() != null) {
                        c0097g.f7564p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f7565a = bVar.f7547d | hVar.f7565a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f7532b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        c0097g.f7564p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f7565a = dVar2.f7541k | hVar.f7565a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean e() {
        return isAutoMirrored() && f0.a.f(this) == 1;
    }

    private static PorterDuff.Mode f(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f7510b;
        C0097g c0097g = hVar.f7566b;
        hVar.f7568d = f(k.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListG = k.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListG != null) {
            hVar.f7567c = colorStateListG;
        }
        hVar.f7569e = k.e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f7569e);
        c0097g.f7559k = k.j(typedArray, xmlPullParser, "viewportWidth", 7, c0097g.f7559k);
        float fJ = k.j(typedArray, xmlPullParser, "viewportHeight", 8, c0097g.f7560l);
        c0097g.f7560l = fJ;
        if (c0097g.f7559k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fJ <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c0097g.f7557i = typedArray.getDimension(3, c0097g.f7557i);
        float dimension = typedArray.getDimension(2, c0097g.f7558j);
        c0097g.f7558j = dimension;
        if (c0097g.f7557i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        c0097g.setAlpha(k.j(typedArray, xmlPullParser, "alpha", 4, c0097g.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            c0097g.f7562n = string;
            c0097g.f7564p.put(string, c0097g);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    Object c(String str) {
        return this.f7510b.f7566b.f7564p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f7508a;
        if (drawable == null) {
            return false;
        }
        f0.a.b(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f7518j);
        if (this.f7518j.width() <= 0 || this.f7518j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f7512d;
        if (colorFilter == null) {
            colorFilter = this.f7511c;
        }
        canvas.getMatrix(this.f7517i);
        this.f7517i.getValues(this.f7516h);
        float fAbs = Math.abs(this.f7516h[0]);
        float fAbs2 = Math.abs(this.f7516h[4]);
        float fAbs3 = Math.abs(this.f7516h[1]);
        float fAbs4 = Math.abs(this.f7516h[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.f7518j.width() * fAbs);
        int iHeight = (int) (this.f7518j.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f7518j;
        canvas.translate(rect.left, rect.top);
        if (e()) {
            canvas.translate(this.f7518j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f7518j.offsetTo(0, 0);
        this.f7510b.c(iMin, iMin2);
        if (!this.f7514f) {
            this.f7510b.j(iMin, iMin2);
        } else if (!this.f7510b.b()) {
            this.f7510b.j(iMin, iMin2);
            this.f7510b.i();
        }
        this.f7510b.d(canvas, colorFilter, this.f7518j);
        canvas.restoreToCount(iSave);
    }

    void g(boolean z10) {
        this.f7514f = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f7508a;
        return drawable != null ? f0.a.d(drawable) : this.f7510b.f7566b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f7508a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f7510b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f7508a;
        return drawable != null ? f0.a.e(drawable) : this.f7512d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f7508a != null) {
            return new i(this.f7508a.getConstantState());
        }
        this.f7510b.f7565a = getChangingConfigurations();
        return this.f7510b;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f7508a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f7510b.f7566b.f7558j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f7508a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f7510b.f7566b.f7557i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    PorterDuffColorFilter i(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f7508a;
        return drawable != null ? f0.a.h(drawable) : this.f7510b.f7569e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        h hVar = this.f7510b;
        if (hVar == null) {
            return false;
        }
        if (hVar.g()) {
            return true;
        }
        ColorStateList colorStateList = this.f7510b.f7567c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f7513e && super.mutate() == this) {
            this.f7510b = new h(this.f7510b);
            this.f7513e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f7510b;
        ColorStateList colorStateList = hVar.f7567c;
        if (colorStateList == null || (mode = hVar.f7568d) == null) {
            z10 = false;
        } else {
            this.f7511c = i(this.f7511c, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z10;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f7510b.f7566b.getRootAlpha() != i10) {
            this.f7510b.f7566b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            f0.a.j(drawable, z10);
        } else {
            this.f7510b.f7569e = z10;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            f0.a.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            f0.a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f7510b;
        if (hVar.f7567c != colorStateList) {
            hVar.f7567c = colorStateList;
            this.f7511c = i(this.f7511c, colorStateList, hVar.f7568d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            f0.a.p(drawable, mode);
            return;
        }
        h hVar = this.f7510b;
        if (hVar.f7568d != mode) {
            hVar.f7568d = mode;
            this.f7511c = i(this.f7511c, hVar.f7567c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f7508a;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f7577a;

        public i(Drawable.ConstantState constantState) {
            this.f7577a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f7577a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f7577a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g();
            gVar.f7508a = (VectorDrawable) this.f7577a.newDrawable();
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            g gVar = new g();
            gVar.f7508a = (VectorDrawable) this.f7577a.newDrawable(resources);
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            g gVar = new g();
            gVar.f7508a = (VectorDrawable) this.f7577a.newDrawable(resources, theme);
            return gVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f7512d = colorFilter;
            invalidateSelf();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static abstract class f extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected e0.d.b[] f7544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f7545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f7546c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f7547d;

        public f() {
            super();
            this.f7544a = null;
            this.f7546c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            e0.d.b[] bVarArr = this.f7544a;
            if (bVarArr != null) {
                e0.d.b.h(bVarArr, path);
            }
        }

        public e0.d.b[] getPathData() {
            return this.f7544a;
        }

        public String getPathName() {
            return this.f7545b;
        }

        public void setPathData(e0.d.b[] bVarArr) {
            if (e0.d.b(this.f7544a, bVarArr)) {
                e0.d.k(this.f7544a, bVarArr);
            } else {
                this.f7544a = e0.d.f(bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f7544a = null;
            this.f7546c = 0;
            this.f7545b = fVar.f7545b;
            this.f7547d = fVar.f7547d;
            this.f7544a = e0.d.f(fVar.f7544a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            f0.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f7510b;
        hVar.f7566b = new C0097g();
        TypedArray typedArrayQ = k.q(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f7479a);
        h(typedArrayQ, xmlPullParser, theme);
        typedArrayQ.recycle();
        hVar.f7565a = getChangingConfigurations();
        hVar.f7575k = true;
        d(resources, xmlPullParser, attributeSet, theme);
        this.f7511c = i(this.f7511c, hVar.f7567c, hVar.f7568d);
    }

    g(h hVar) {
        this.f7514f = true;
        this.f7516h = new float[9];
        this.f7517i = new Matrix();
        this.f7518j = new Rect();
        this.f7510b = hVar;
        this.f7511c = i(this.f7511c, hVar.f7567c, hVar.f7568d);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f7519e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        d0.d f7520f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f7521g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        d0.d f7522h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f7523i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f7524j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f7525k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f7526l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f7527m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Paint.Cap f7528n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Paint.Join f7529o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f7530p;

        c() {
            this.f7521g = 0.0f;
            this.f7523i = 1.0f;
            this.f7524j = 1.0f;
            this.f7525k = 0.0f;
            this.f7526l = 1.0f;
            this.f7527m = 0.0f;
            this.f7528n = Paint.Cap.BUTT;
            this.f7529o = Paint.Join.MITER;
            this.f7530p = 4.0f;
        }

        private Paint.Cap e(int i10, Paint.Cap cap) {
            if (i10 == 0) {
                return Paint.Cap.BUTT;
            }
            if (i10 != 1) {
                return i10 != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        private Paint.Join f(int i10, Paint.Join join) {
            if (i10 == 0) {
                return Paint.Join.MITER;
            }
            if (i10 != 1) {
                return i10 != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f7519e = null;
            if (k.p(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f7545b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f7544a = e0.d.d(string2);
                }
                this.f7522h = k.i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f7524j = k.j(typedArray, xmlPullParser, "fillAlpha", 12, this.f7524j);
                this.f7528n = e(k.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f7528n);
                this.f7529o = f(k.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f7529o);
                this.f7530p = k.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f7530p);
                this.f7520f = k.i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f7523i = k.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f7523i);
                this.f7521g = k.j(typedArray, xmlPullParser, "strokeWidth", 4, this.f7521g);
                this.f7526l = k.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f7526l);
                this.f7527m = k.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f7527m);
                this.f7525k = k.j(typedArray, xmlPullParser, "trimPathStart", 5, this.f7525k);
                this.f7546c = k.k(typedArray, xmlPullParser, "fillType", 13, this.f7546c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean a() {
            return this.f7522h.i() || this.f7520f.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean b(int[] iArr) {
            return this.f7520f.j(iArr) | this.f7522h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayQ = k.q(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f7481c);
            h(typedArrayQ, xmlPullParser, theme);
            typedArrayQ.recycle();
        }

        float getFillAlpha() {
            return this.f7524j;
        }

        int getFillColor() {
            return this.f7522h.e();
        }

        float getStrokeAlpha() {
            return this.f7523i;
        }

        int getStrokeColor() {
            return this.f7520f.e();
        }

        float getStrokeWidth() {
            return this.f7521g;
        }

        float getTrimPathEnd() {
            return this.f7526l;
        }

        float getTrimPathOffset() {
            return this.f7527m;
        }

        float getTrimPathStart() {
            return this.f7525k;
        }

        void setFillAlpha(float f10) {
            this.f7524j = f10;
        }

        void setFillColor(int i10) {
            this.f7522h.k(i10);
        }

        void setStrokeAlpha(float f10) {
            this.f7523i = f10;
        }

        void setStrokeColor(int i10) {
            this.f7520f.k(i10);
        }

        void setStrokeWidth(float f10) {
            this.f7521g = f10;
        }

        void setTrimPathEnd(float f10) {
            this.f7526l = f10;
        }

        void setTrimPathOffset(float f10) {
            this.f7527m = f10;
        }

        void setTrimPathStart(float f10) {
            this.f7525k = f10;
        }

        c(c cVar) {
            super(cVar);
            this.f7521g = 0.0f;
            this.f7523i = 1.0f;
            this.f7524j = 1.0f;
            this.f7525k = 0.0f;
            this.f7526l = 1.0f;
            this.f7527m = 0.0f;
            this.f7528n = Paint.Cap.BUTT;
            this.f7529o = Paint.Join.MITER;
            this.f7530p = 4.0f;
            this.f7519e = cVar.f7519e;
            this.f7520f = cVar.f7520f;
            this.f7521g = cVar.f7521g;
            this.f7523i = cVar.f7523i;
            this.f7522h = cVar.f7522h;
            this.f7546c = cVar.f7546c;
            this.f7524j = cVar.f7524j;
            this.f7525k = cVar.f7525k;
            this.f7526l = cVar.f7526l;
            this.f7527m = cVar.f7527m;
            this.f7528n = cVar.f7528n;
            this.f7529o = cVar.f7529o;
            this.f7530p = cVar.f7530p;
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class C0097g {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final Matrix f7548q = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Path f7549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Path f7550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Matrix f7551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Paint f7552d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Paint f7553e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private PathMeasure f7554f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f7555g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final d f7556h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f7557i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f7558j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f7559k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f7560l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f7561m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        String f7562n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Boolean f7563o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final androidx.collection.a f7564p;

        public C0097g() {
            this.f7551c = new Matrix();
            this.f7557i = 0.0f;
            this.f7558j = 0.0f;
            this.f7559k = 0.0f;
            this.f7560l = 0.0f;
            this.f7561m = 255;
            this.f7562n = null;
            this.f7563o = null;
            this.f7564p = new androidx.collection.a();
            this.f7556h = new d();
            this.f7549a = new Path();
            this.f7550b = new Path();
        }

        private static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            d dVar2 = dVar;
            dVar2.f7531a.set(matrix);
            dVar2.f7531a.preConcat(dVar2.f7540j);
            canvas.save();
            int i12 = 0;
            while (i12 < dVar2.f7532b.size()) {
                e eVar = (e) dVar2.f7532b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar2.f7531a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar2, (f) eVar, canvas, i10, i11, colorFilter);
                }
                i12++;
                dVar2 = dVar;
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f7559k;
            float f11 = i11 / this.f7560l;
            float fMin = Math.min(f10, f11);
            Matrix matrix = dVar.f7531a;
            this.f7551c.set(matrix);
            this.f7551c.postScale(f10, f11);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            fVar.d(this.f7549a);
            Path path = this.f7549a;
            this.f7550b.reset();
            if (fVar.c()) {
                this.f7550b.setFillType(fVar.f7546c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f7550b.addPath(path, this.f7551c);
                canvas.clipPath(this.f7550b);
                return;
            }
            c cVar = (c) fVar;
            float f12 = cVar.f7525k;
            if (f12 != 0.0f || cVar.f7526l != 1.0f) {
                float f13 = cVar.f7527m;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f7526l + f13) % 1.0f;
                if (this.f7554f == null) {
                    this.f7554f = new PathMeasure();
                }
                this.f7554f.setPath(this.f7549a, false);
                float length = this.f7554f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f7554f.getSegment(f16, length, path, true);
                    this.f7554f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f7554f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f7550b.addPath(path, this.f7551c);
            if (cVar.f7522h.l()) {
                d0.d dVar2 = cVar.f7522h;
                if (this.f7553e == null) {
                    Paint paint = new Paint(1);
                    this.f7553e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f7553e;
                if (dVar2.h()) {
                    Shader shaderF = dVar2.f();
                    shaderF.setLocalMatrix(this.f7551c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f7524j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(g.a(dVar2.e(), cVar.f7524j));
                }
                paint2.setColorFilter(colorFilter);
                this.f7550b.setFillType(cVar.f7546c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f7550b, paint2);
            }
            if (cVar.f7520f.l()) {
                d0.d dVar3 = cVar.f7520f;
                if (this.f7552d == null) {
                    Paint paint3 = new Paint(1);
                    this.f7552d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f7552d;
                Paint.Join join = cVar.f7529o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f7528n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f7530p);
                if (dVar3.h()) {
                    Shader shaderF2 = dVar3.f();
                    shaderF2.setLocalMatrix(this.f7551c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f7523i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(g.a(dVar3.e(), cVar.f7523i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f7521g * fMin * fE);
                canvas.drawPath(this.f7550b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f7556h, f7548q, canvas, i10, i11, colorFilter);
        }

        public boolean f() {
            if (this.f7563o == null) {
                this.f7563o = Boolean.valueOf(this.f7556h.a());
            }
            return this.f7563o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f7556h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f7561m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f7561m = i10;
        }

        public C0097g(C0097g c0097g) {
            this.f7551c = new Matrix();
            this.f7557i = 0.0f;
            this.f7558j = 0.0f;
            this.f7559k = 0.0f;
            this.f7560l = 0.0f;
            this.f7561m = 255;
            this.f7562n = null;
            this.f7563o = null;
            androidx.collection.a aVar = new androidx.collection.a();
            this.f7564p = aVar;
            this.f7556h = new d(c0097g.f7556h, aVar);
            this.f7549a = new Path(c0097g.f7549a);
            this.f7550b = new Path(c0097g.f7550b);
            this.f7557i = c0097g.f7557i;
            this.f7558j = c0097g.f7558j;
            this.f7559k = c0097g.f7559k;
            this.f7560l = c0097g.f7560l;
            this.f7555g = c0097g.f7555g;
            this.f7561m = c0097g.f7561m;
            this.f7562n = c0097g.f7562n;
            String str = c0097g.f7562n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f7563o = c0097g.f7563o;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matrix f7531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ArrayList f7532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f7533c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f7534d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f7535e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f7536f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f7537g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f7538h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f7539i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final Matrix f7540j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f7541k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int[] f7542l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f7543m;

        public d(d dVar, androidx.collection.a aVar) {
            f bVar;
            super();
            this.f7531a = new Matrix();
            this.f7532b = new ArrayList();
            this.f7533c = 0.0f;
            this.f7534d = 0.0f;
            this.f7535e = 0.0f;
            this.f7536f = 1.0f;
            this.f7537g = 1.0f;
            this.f7538h = 0.0f;
            this.f7539i = 0.0f;
            Matrix matrix = new Matrix();
            this.f7540j = matrix;
            this.f7543m = null;
            this.f7533c = dVar.f7533c;
            this.f7534d = dVar.f7534d;
            this.f7535e = dVar.f7535e;
            this.f7536f = dVar.f7536f;
            this.f7537g = dVar.f7537g;
            this.f7538h = dVar.f7538h;
            this.f7539i = dVar.f7539i;
            this.f7542l = dVar.f7542l;
            String str = dVar.f7543m;
            this.f7543m = str;
            this.f7541k = dVar.f7541k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f7540j);
            ArrayList arrayList = dVar.f7532b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = arrayList.get(i10);
                if (obj instanceof d) {
                    this.f7532b.add(new d((d) obj, aVar));
                } else {
                    if (obj instanceof c) {
                        bVar = new c((c) obj);
                    } else {
                        if (!(obj instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) obj);
                    }
                    this.f7532b.add(bVar);
                    Object obj2 = bVar.f7545b;
                    if (obj2 != null) {
                        aVar.put(obj2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f7540j.reset();
            this.f7540j.postTranslate(-this.f7534d, -this.f7535e);
            this.f7540j.postScale(this.f7536f, this.f7537g);
            this.f7540j.postRotate(this.f7533c, 0.0f, 0.0f);
            this.f7540j.postTranslate(this.f7538h + this.f7534d, this.f7539i + this.f7535e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f7542l = null;
            this.f7533c = k.j(typedArray, xmlPullParser, "rotation", 5, this.f7533c);
            this.f7534d = typedArray.getFloat(1, this.f7534d);
            this.f7535e = typedArray.getFloat(2, this.f7535e);
            this.f7536f = k.j(typedArray, xmlPullParser, "scaleX", 3, this.f7536f);
            this.f7537g = k.j(typedArray, xmlPullParser, "scaleY", 4, this.f7537g);
            this.f7538h = k.j(typedArray, xmlPullParser, "translateX", 6, this.f7538h);
            this.f7539i = k.j(typedArray, xmlPullParser, "translateY", 7, this.f7539i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f7543m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean a() {
            for (int i10 = 0; i10 < this.f7532b.size(); i10++) {
                if (((e) this.f7532b.get(i10)).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i10 = 0; i10 < this.f7532b.size(); i10++) {
                zB |= ((e) this.f7532b.get(i10)).b(iArr);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayQ = k.q(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f7480b);
            e(typedArrayQ, xmlPullParser);
            typedArrayQ.recycle();
        }

        public String getGroupName() {
            return this.f7543m;
        }

        public Matrix getLocalMatrix() {
            return this.f7540j;
        }

        public float getPivotX() {
            return this.f7534d;
        }

        public float getPivotY() {
            return this.f7535e;
        }

        public float getRotation() {
            return this.f7533c;
        }

        public float getScaleX() {
            return this.f7536f;
        }

        public float getScaleY() {
            return this.f7537g;
        }

        public float getTranslateX() {
            return this.f7538h;
        }

        public float getTranslateY() {
            return this.f7539i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f7534d) {
                this.f7534d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f7535e) {
                this.f7535e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f7533c) {
                this.f7533c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f7536f) {
                this.f7536f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f7537g) {
                this.f7537g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f7538h) {
                this.f7538h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f7539i) {
                this.f7539i = f10;
                d();
            }
        }

        public d() {
            super();
            this.f7531a = new Matrix();
            this.f7532b = new ArrayList();
            this.f7533c = 0.0f;
            this.f7534d = 0.0f;
            this.f7535e = 0.0f;
            this.f7536f = 1.0f;
            this.f7537g = 1.0f;
            this.f7538h = 0.0f;
            this.f7539i = 0.0f;
            this.f7540j = new Matrix();
            this.f7543m = null;
        }
    }
}
