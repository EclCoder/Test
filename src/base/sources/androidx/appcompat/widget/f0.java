package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static f0 f1576i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakHashMap f1578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.collection.u f1579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.collection.v f1580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakHashMap f1581d = new WeakHashMap(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TypedValue f1582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f1584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final PorterDuff.Mode f1575h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a f1577j = new a(6);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static class a extends androidx.collection.n {
        public a(int i10) {
            super(i10);
        }

        private static int b(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter c(int i10, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(b(i10, mode)));
        }

        PorterDuffColorFilter d(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(b(i10, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public interface c {
        Drawable a(f0 f0Var, Context context, int i10);

        ColorStateList b(Context context, int i10);

        boolean c(Context context, int i10, Drawable drawable);

        PorterDuff.Mode d(int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    private synchronized boolean a(Context context, long j10, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            androidx.collection.l lVar = (androidx.collection.l) this.f1581d.get(context);
            if (lVar == null) {
                lVar = new androidx.collection.l();
                this.f1581d.put(context, lVar);
            }
            lVar.i(j10, new WeakReference(constantState));
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void b(Context context, int i10, ColorStateList colorStateList) {
        if (this.f1578a == null) {
            this.f1578a = new WeakHashMap();
        }
        androidx.collection.v vVar = (androidx.collection.v) this.f1578a.get(context);
        if (vVar == null) {
            vVar = new androidx.collection.v();
            this.f1578a.put(context, vVar);
        }
        vVar.b(i10, colorStateList);
    }

    private void c(Context context) {
        if (this.f1583f) {
            return;
        }
        this.f1583f = true;
        Drawable drawableI = i(context, k.a.f42769a);
        if (drawableI == null || !p(drawableI)) {
            this.f1583f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long d(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable e(Context context, int i10) {
        if (this.f1582e == null) {
            this.f1582e = new TypedValue();
        }
        TypedValue typedValue = this.f1582e;
        context.getResources().getValue(i10, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        c cVar = this.f1584g;
        Drawable drawableA = cVar == null ? null : cVar.a(this, context, i10);
        if (drawableA != null) {
            drawableA.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, jD, drawableA);
        }
        return drawableA;
    }

    private static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized f0 g() {
        try {
            if (f1576i == null) {
                f0 f0Var = new f0();
                f1576i = f0Var;
                o(f0Var);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f1576i;
    }

    private synchronized Drawable h(Context context, long j10) {
        androidx.collection.l lVar = (androidx.collection.l) this.f1581d.get(context);
        if (lVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) lVar.e(j10);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            lVar.j(j10);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter k(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterC;
        a aVar = f1577j;
        porterDuffColorFilterC = aVar.c(i10, mode);
        if (porterDuffColorFilterC == null) {
            porterDuffColorFilterC = new PorterDuffColorFilter(i10, mode);
            aVar.d(i10, mode, porterDuffColorFilterC);
        }
        return porterDuffColorFilterC;
    }

    private ColorStateList m(Context context, int i10) {
        androidx.collection.v vVar;
        WeakHashMap weakHashMap = this.f1578a;
        if (weakHashMap == null || (vVar = (androidx.collection.v) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) vVar.f(i10);
    }

    private static void o(f0 f0Var) {
    }

    private static boolean p(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.g) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable u(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList colorStateListL = l(context, i10);
        if (colorStateListL != null) {
            Drawable drawableR = f0.a.r(drawable.mutate());
            f0.a.o(drawableR, colorStateListL);
            PorterDuff.Mode modeN = n(i10);
            if (modeN != null) {
                f0.a.p(drawableR, modeN);
            }
            return drawableR;
        }
        c cVar = this.f1584g;
        if ((cVar == null || !cVar.e(context, i10, drawable)) && !w(context, i10, drawable) && z10) {
            return null;
        }
        return drawable;
    }

    static void v(Drawable drawable, m0 m0Var, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = m0Var.f1657d;
        if (z10 || m0Var.f1656c) {
            drawable.setColorFilter(f(z10 ? m0Var.f1654a : null, m0Var.f1656c ? m0Var.f1655b : f1575h, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public synchronized Drawable i(Context context, int i10) {
        return j(context, i10, false);
    }

    synchronized Drawable j(Context context, int i10, boolean z10) {
        Drawable drawableQ;
        try {
            c(context);
            drawableQ = q(context, i10);
            if (drawableQ == null) {
                drawableQ = e(context, i10);
            }
            if (drawableQ == null) {
                drawableQ = androidx.core.content.a.getDrawable(context, i10);
            }
            if (drawableQ != null) {
                drawableQ = u(context, i10, z10, drawableQ);
            }
            if (drawableQ != null) {
                y.b(drawableQ);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return drawableQ;
    }

    synchronized ColorStateList l(Context context, int i10) {
        ColorStateList colorStateListM;
        colorStateListM = m(context, i10);
        if (colorStateListM == null) {
            c cVar = this.f1584g;
            colorStateListM = cVar == null ? null : cVar.b(context, i10);
            if (colorStateListM != null) {
                b(context, i10, colorStateListM);
            }
        }
        return colorStateListM;
    }

    PorterDuff.Mode n(int i10) {
        c cVar = this.f1584g;
        if (cVar == null) {
            return null;
        }
        return cVar.d(i10);
    }

    public synchronized void r(Context context) {
        androidx.collection.l lVar = (androidx.collection.l) this.f1581d.get(context);
        if (lVar != null) {
            lVar.b();
        }
    }

    synchronized Drawable s(Context context, y0 y0Var, int i10) {
        try {
            Drawable drawableQ = q(context, i10);
            if (drawableQ == null) {
                drawableQ = y0Var.a(i10);
            }
            if (drawableQ == null) {
                return null;
            }
            return u(context, i10, false, drawableQ);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void t(c cVar) {
        this.f1584g = cVar;
    }

    boolean w(Context context, int i10, Drawable drawable) {
        c cVar = this.f1584g;
        return cVar != null && cVar.c(context, i10, drawable);
    }

    private Drawable q(Context context, int i10) {
        int next;
        androidx.collection.u uVar = this.f1579b;
        if (uVar == null || uVar.isEmpty()) {
            return null;
        }
        androidx.collection.v vVar = this.f1580c;
        if (vVar != null) {
            String str = (String) vVar.f(i10);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f1579b.get(str) == null)) {
                return null;
            }
        } else {
            this.f1580c = new androidx.collection.v();
        }
        if (this.f1582e == null) {
            this.f1582e = new TypedValue();
        }
        TypedValue typedValue = this.f1582e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(PvZsvNiPV.cLuGrtiZeyDQpOI)) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1580c.b(i10, name);
                b bVar = (b) this.f1579b.get(name);
                if (bVar != null) {
                    drawableH = bVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableH != null) {
                    drawableH.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, jD, drawableH);
                }
            } catch (Exception e10) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e10);
            }
        }
        if (drawableH == null) {
            this.f1580c.b(i10, "appcompat_skip_skip");
        }
        return drawableH;
    }
}
