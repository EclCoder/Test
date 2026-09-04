package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.o0;
import androidx.appcompat.widget.y;
import h.j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import n0.t;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class g extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Class[] f917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Class[] f918f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object[] f919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object[] f920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Context f921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f922d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Class[] f923c = {MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f925b;

        public a(Object obj, String str) {
            this.f924a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f925b = cls.getMethod(str, f923c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f925b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f925b.invoke(this.f924a, menuItem)).booleanValue();
                }
                this.f925b.invoke(this.f924a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class b {
        n0.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Menu f926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f929d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f930e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f931f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f932g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f933h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f934i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f935j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private CharSequence f936k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private CharSequence f937l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f938m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private char f939n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f940o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private char f941p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f942q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f943r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f944s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f945t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f946u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f947v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f948w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private String f949x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private String f950y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private String f951z;

        public b(Menu menu) {
            this.f926a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f921c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f944s).setVisible(this.f945t).setEnabled(this.f946u).setCheckable(this.f943r >= 1).setTitleCondensed(this.f937l).setIcon(this.f938m);
            int i10 = this.f947v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f951z != null) {
                if (g.this.f921c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f951z));
            }
            if (this.f943r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof m.c) {
                    ((m.c) menuItem).h(true);
                }
            }
            String str = this.f949x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f917e, g.this.f919a));
                z10 = true;
            }
            int i11 = this.f948w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            n0.b bVar = this.A;
            if (bVar != null) {
                t.a(menuItem, bVar);
            }
            t.c(menuItem, this.B);
            t.g(menuItem, this.C);
            t.b(menuItem, this.f939n, this.f940o);
            t.f(menuItem, this.f941p, this.f942q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                t.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                t.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f933h = true;
            i(this.f926a.add(this.f927b, this.f934i, this.f935j, this.f936k));
        }

        public SubMenu b() {
            this.f933h = true;
            SubMenu subMenuAddSubMenu = this.f926a.addSubMenu(this.f927b, this.f934i, this.f935j, this.f936k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.f933h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f921c.obtainStyledAttributes(attributeSet, j.f40125y1);
            this.f927b = typedArrayObtainStyledAttributes.getResourceId(j.A1, 0);
            this.f928c = typedArrayObtainStyledAttributes.getInt(j.C1, 0);
            this.f929d = typedArrayObtainStyledAttributes.getInt(j.D1, 0);
            this.f930e = typedArrayObtainStyledAttributes.getInt(j.E1, 0);
            this.f931f = typedArrayObtainStyledAttributes.getBoolean(j.B1, true);
            this.f932g = typedArrayObtainStyledAttributes.getBoolean(j.f40130z1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            o0 o0VarU = o0.u(g.this.f921c, attributeSet, j.F1);
            this.f934i = o0VarU.n(j.I1, 0);
            this.f935j = (o0VarU.k(j.L1, this.f928c) & (-65536)) | (o0VarU.k(j.M1, this.f929d) & 65535);
            this.f936k = o0VarU.p(j.N1);
            this.f937l = o0VarU.p(j.O1);
            this.f938m = o0VarU.n(j.G1, 0);
            this.f939n = c(o0VarU.o(j.P1));
            this.f940o = o0VarU.k(j.W1, 4096);
            this.f941p = c(o0VarU.o(j.Q1));
            this.f942q = o0VarU.k(j.f39998a2, 4096);
            int i10 = j.R1;
            if (o0VarU.s(i10)) {
                this.f943r = o0VarU.a(i10, false) ? 1 : 0;
            } else {
                this.f943r = this.f930e;
            }
            this.f944s = o0VarU.a(j.J1, false);
            this.f945t = o0VarU.a(j.K1, this.f931f);
            this.f946u = o0VarU.a(j.H1, this.f932g);
            this.f947v = o0VarU.k(j.f40004b2, -1);
            this.f951z = o0VarU.o(j.S1);
            this.f948w = o0VarU.n(j.T1, 0);
            this.f949x = o0VarU.o(j.V1);
            String strO = o0VarU.o(j.U1);
            this.f950y = strO;
            boolean z10 = strO != null;
            if (z10 && this.f948w == 0 && this.f949x == null) {
                this.A = (n0.b) e(strO, g.f918f, g.this.f920b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = o0VarU.p(j.X1);
            this.C = o0VarU.p(j.f40010c2);
            int i11 = j.Z1;
            if (o0VarU.s(i11)) {
                this.E = y.e(o0VarU.k(i11, -1), this.E);
            } else {
                this.E = null;
            }
            int i12 = j.Y1;
            if (o0VarU.s(i12)) {
                this.D = o0VarU.c(i12);
            } else {
                this.D = null;
            }
            o0VarU.x();
            this.f933h = false;
        }

        public void h() {
            this.f927b = 0;
            this.f928c = 0;
            this.f929d = 0;
            this.f930e = 0;
            this.f931f = true;
            this.f932g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f917e = clsArr;
        f918f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f921c = context;
        Object[] objArr = {context};
        this.f919a = objArr;
        this.f920b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                }
                throw new RuntimeException("Expecting menu, got " + name);
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z11 && name2.equals(str)) {
                        z11 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            n0.b bVar2 = bVar.A;
                            if (bVar2 == null || !bVar2.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z10 = true;
                    }
                }
            } else if (!z11) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z11 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.f922d == null) {
            this.f922d = a(this.f921c);
        }
        return this.f922d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof g0.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z10 = false;
        try {
            try {
                layout = this.f921c.getResources().getLayout(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof androidx.appcompat.view.menu.e) {
                    androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) menu;
                    if (eVar.H()) {
                        eVar.i0();
                        z10 = true;
                    }
                }
                c(layout, attributeSetAsAttributeSet, menu);
                if (z10) {
                    ((androidx.appcompat.view.menu.e) menu).h0();
                }
                if (layout != null) {
                    layout.close();
                }
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th2) {
            if (z10) {
                ((androidx.appcompat.view.menu.e) menu).h0();
            }
            if (layout != null) {
                layout.close();
            }
            throw th2;
        }
    }
}
