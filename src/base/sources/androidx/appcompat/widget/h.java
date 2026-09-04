package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final PorterDuff.Mode f1592b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static h f1593c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f0 f1594a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements f0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f1595a = {h.e.R, h.e.P, h.e.f39896a};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f1596b = {h.e.f39910o, h.e.B, h.e.f39915t, h.e.f39911p, h.e.f39912q, h.e.f39914s, h.e.f39913r};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f1597c = {h.e.O, h.e.Q, h.e.f39906k, h.e.K, h.e.L, h.e.M, h.e.N};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f1598d = {h.e.f39918w, h.e.f39904i, h.e.f39917v};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f1599e = {h.e.J, h.e.S};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[] f1600f = {h.e.f39898c, h.e.f39902g, h.e.f39899d, h.e.f39903h};

        a() {
        }

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i10) {
            int iC = k0.c(context, h.a.f39867t);
            return new ColorStateList(new int[][]{k0.f1633b, k0.f1636e, k0.f1634c, k0.f1640i}, new int[]{k0.b(context, h.a.f39865r), e0.a.g(iC, i10), e0.a.g(iC, i10), i10});
        }

        private ColorStateList i(Context context) {
            return h(context, k0.c(context, h.a.f39864q));
        }

        private ColorStateList j(Context context) {
            return h(context, k0.c(context, h.a.f39865r));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i10 = h.a.f39871x;
            ColorStateList colorStateListE = k0.e(context, i10);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = k0.f1633b;
                iArr2[0] = k0.b(context, i10);
                iArr[1] = k0.f1637f;
                iArr2[1] = k0.c(context, h.a.f39866s);
                iArr[2] = k0.f1640i;
                iArr2[2] = k0.c(context, i10);
            } else {
                int[] iArr3 = k0.f1633b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = k0.f1637f;
                iArr2[1] = k0.c(context, h.a.f39866s);
                iArr[2] = k0.f1640i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(f0 f0Var, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable drawableI = f0Var.i(context, h.e.F);
            Drawable drawableI2 = f0Var.i(context, h.e.G);
            if ((drawableI instanceof BitmapDrawable) && drawableI.getIntrinsicWidth() == dimensionPixelSize && drawableI.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableI;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableI.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableI2 instanceof BitmapDrawable) && drawableI2.getIntrinsicWidth() == dimensionPixelSize && drawableI2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableI2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableI2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = h.f1592b;
            }
            drawableMutate.setColorFilter(h.e(i10, mode));
        }

        @Override // androidx.appcompat.widget.f0.c
        public Drawable a(f0 f0Var, Context context, int i10) {
            if (i10 == h.e.f39905j) {
                return new LayerDrawable(new Drawable[]{f0Var.i(context, h.e.f39904i), f0Var.i(context, h.e.f39906k)});
            }
            if (i10 == h.e.f39920y) {
                return l(f0Var, context, h.d.f39889g);
            }
            if (i10 == h.e.f39919x) {
                return l(f0Var, context, h.d.f39890h);
            }
            if (i10 == h.e.f39921z) {
                return l(f0Var, context, h.d.f39891i);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.f0.c
        public ColorStateList b(Context context, int i10) {
            if (i10 == h.e.f39908m) {
                return i.a.a(context, h.c.f39879e);
            }
            if (i10 == h.e.I) {
                return i.a.a(context, h.c.f39882h);
            }
            if (i10 == h.e.H) {
                return k(context);
            }
            if (i10 == h.e.f39901f) {
                return j(context);
            }
            if (i10 == h.e.f39897b) {
                return g(context);
            }
            if (i10 == h.e.f39900e) {
                return i(context);
            }
            if (i10 == h.e.D || i10 == h.e.E) {
                return i.a.a(context, h.c.f39881g);
            }
            if (f(this.f1596b, i10)) {
                return k0.e(context, h.a.f39868u);
            }
            if (f(this.f1599e, i10)) {
                return i.a.a(context, h.c.f39878d);
            }
            if (f(this.f1600f, i10)) {
                return i.a.a(context, h.c.f39877c);
            }
            if (i10 == h.e.A) {
                return i.a.a(context, h.c.f39880f);
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0050  */
        /* JADX WARN: Code duplicated, block: B:25:0x0061  */
        /* JADX WARN: Code duplicated, block: B:27:0x0065 A[RETURN] */
        @Override // androidx.appcompat.widget.f0.c
        public boolean c(Context context, int i10, Drawable drawable) {
            int i11;
            boolean z10;
            int iRound;
            Drawable drawableMutate;
            PorterDuff.Mode mode = h.f1592b;
            if (!f(this.f1595a, i10)) {
                if (f(this.f1597c, i10)) {
                    i11 = h.a.f39866s;
                } else {
                    if (f(this.f1598d, i10)) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    } else {
                        if (i10 == h.e.f39916u) {
                            iRound = Math.round(40.8f);
                            i11 = 16842800;
                            mode = mode;
                        } else if (i10 != h.e.f39907l) {
                            i11 = 0;
                            z10 = false;
                            iRound = -1;
                        }
                        z10 = true;
                    }
                    mode = mode;
                    iRound = -1;
                    i11 = 16842801;
                    z10 = true;
                }
                if (z10) {
                    return false;
                }
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(h.e(k0.c(context, i11), mode));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                return true;
            }
            i11 = h.a.f39868u;
            z10 = true;
            iRound = -1;
            if (z10) {
                return false;
            }
            drawableMutate = drawable.mutate();
            drawableMutate.setColorFilter(h.e(k0.c(context, i11), mode));
            if (iRound != -1) {
                drawableMutate.setAlpha(iRound);
            }
            return true;
        }

        @Override // androidx.appcompat.widget.f0.c
        public PorterDuff.Mode d(int i10) {
            if (i10 == h.e.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.f0.c
        public boolean e(Context context, int i10, Drawable drawable) {
            if (i10 == h.e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i11 = h.a.f39868u;
                m(drawableFindDrawableByLayerId, k0.c(context, i11), h.f1592b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), k0.c(context, i11), h.f1592b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), k0.c(context, h.a.f39866s), h.f1592b);
                return true;
            }
            if (i10 != h.e.f39920y && i10 != h.e.f39919x && i10 != h.e.f39921z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), k0.b(context, h.a.f39868u), h.f1592b);
            Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
            int i12 = h.a.f39866s;
            m(drawableFindDrawableByLayerId2, k0.c(context, i12), h.f1592b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), k0.c(context, i12), h.f1592b);
            return true;
        }
    }

    public static synchronized h b() {
        try {
            if (f1593c == null) {
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f1593c;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        return f0.k(i10, mode);
    }

    public static synchronized void h() {
        if (f1593c == null) {
            h hVar = new h();
            f1593c = hVar;
            hVar.f1594a = f0.g();
            f1593c.f1594a.t(new a());
        }
    }

    static void i(Drawable drawable, m0 m0Var, int[] iArr) {
        f0.v(drawable, m0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f1594a.i(context, i10);
    }

    synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f1594a.j(context, i10, z10);
    }

    synchronized ColorStateList f(Context context, int i10) {
        return this.f1594a.l(context, i10);
    }

    public synchronized void g(Context context) {
        this.f1594a.r(context);
    }
}
