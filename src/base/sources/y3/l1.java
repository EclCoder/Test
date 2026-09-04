package y3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f57230c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f57231d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f57232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a2 f57233b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p1 a(TypedValue value, p1 p1Var, p1 expectedNavType, String str, String foundType) throws XmlPullParserException {
            kotlin.jvm.internal.s.h(value, "value");
            kotlin.jvm.internal.s.h(expectedNavType, "expectedNavType");
            kotlin.jvm.internal.s.h(foundType, "foundType");
            if (p1Var == null || p1Var == expectedNavType) {
                return p1Var == null ? expectedNavType : p1Var;
            }
            throw new XmlPullParserException("Type is " + str + " but found " + foundType + ": " + value.data);
        }

        private a() {
        }
    }

    public l1(Context context, a2 navigatorProvider) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(navigatorProvider, "navigatorProvider");
        this.f57232a = context;
        this.f57233b = navigatorProvider;
    }

    private final d1 a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i10) throws XmlPullParserException, IOException {
        int depth;
        a2 a2Var = this.f57233b;
        String name = xmlResourceParser.getName();
        kotlin.jvm.internal.s.g(name, "getName(...)");
        d1 d1VarC = a2Var.d(name).c();
        d1VarC.B(this.f57232a, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                if (kotlin.jvm.internal.s.c("argument", name2)) {
                    f(resources, d1VarC, attributeSet, i10);
                } else if (kotlin.jvm.internal.s.c("deepLink", name2)) {
                    g(resources, d1VarC, attributeSet);
                } else if (kotlin.jvm.internal.s.c("action", name2)) {
                    c(resources, d1VarC, attributeSet, xmlResourceParser, i10);
                } else {
                    Resources resources2 = resources;
                    XmlResourceParser xmlResourceParser2 = xmlResourceParser;
                    AttributeSet attributeSet2 = attributeSet;
                    int i11 = i10;
                    if (kotlin.jvm.internal.s.c("include", name2) && (d1VarC instanceof g1)) {
                        TypedArray typedArrayObtainAttributes = resources2.obtainAttributes(attributeSet2, e2.f57198i);
                        kotlin.jvm.internal.s.g(typedArrayObtainAttributes, "obtainAttributes(...)");
                        ((g1) d1VarC).I(b(typedArrayObtainAttributes.getResourceId(e2.f57199j, 0)));
                        fl.g0 g0Var = fl.g0.f38750a;
                        typedArrayObtainAttributes.recycle();
                    } else if (d1VarC instanceof g1) {
                        ((g1) d1VarC).I(a(resources2, xmlResourceParser2, attributeSet2, i11));
                    }
                    resources = resources2;
                    attributeSet = attributeSet2;
                    xmlResourceParser = xmlResourceParser2;
                    i10 = i11;
                }
            }
        }
        return d1VarC;
    }

    private final void c(Resources resources, d1 d1Var, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i10) throws XmlPullParserException, IOException {
        fl.q[] qVarArr;
        int depth;
        Context context = this.f57232a;
        int[] NavAction = z3.a.f58587a;
        kotlin.jvm.internal.s.g(NavAction, "NavAction");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NavAction, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(z3.a.f58588b, 0);
        u uVar = new u(typedArrayObtainStyledAttributes.getResourceId(z3.a.f58589c, 0), null, null, 6, null);
        m1.a aVar = new m1.a();
        aVar.d(typedArrayObtainStyledAttributes.getBoolean(z3.a.f58592f, false));
        aVar.l(typedArrayObtainStyledAttributes.getBoolean(z3.a.f58598l, false));
        aVar.g(typedArrayObtainStyledAttributes.getResourceId(z3.a.f58595i, -1), typedArrayObtainStyledAttributes.getBoolean(z3.a.f58596j, false), typedArrayObtainStyledAttributes.getBoolean(z3.a.f58597k, false));
        aVar.b(typedArrayObtainStyledAttributes.getResourceId(z3.a.f58590d, -1));
        aVar.c(typedArrayObtainStyledAttributes.getResourceId(z3.a.f58591e, -1));
        aVar.e(typedArrayObtainStyledAttributes.getResourceId(z3.a.f58593g, -1));
        aVar.f(typedArrayObtainStyledAttributes.getResourceId(z3.a.f58594h, -1));
        uVar.e(aVar.a());
        Map mapH = gl.l0.h();
        if (mapH.isEmpty()) {
            qVarArr = new fl.q[0];
        } else {
            ArrayList arrayList = new ArrayList(mapH.size());
            for (Map.Entry entry : mapH.entrySet()) {
                arrayList.add(fl.w.a((String) entry.getKey(), entry.getValue()));
            }
            qVarArr = (fl.q[]) arrayList.toArray(new fl.q[0]);
        }
        Bundle bundleA = j0.e.a((fl.q[]) Arrays.copyOf(qVarArr, qVarArr.length));
        n4.k.a(bundleA);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && kotlin.jvm.internal.s.c("argument", xmlResourceParser.getName())) {
                e(resources, bundleA, attributeSet, i10);
            }
        }
        if (!n4.c.v(n4.c.a(bundleA))) {
            uVar.d(bundleA);
        }
        d1Var.C(resourceId, uVar);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final v d(TypedArray typedArray, Resources resources, int i10) throws XmlPullParserException {
        int iValueOf;
        v.a aVar = new v.a();
        aVar.c(typedArray.getBoolean(z3.a.f58603q, false));
        ThreadLocal threadLocal = f57231d;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = typedValue;
        String string = typedArray.getString(z3.a.f58602p);
        Object objL = null;
        p1 p1VarA = string != null ? k1.a(p1.f57270c, string, resources.getResourcePackageName(i10)) : null;
        int i11 = z3.a.f58601o;
        if (typedArray.getValue(i11, typedValue2)) {
            p1 p1Var = p1.f57272e;
            if (p1VarA == p1Var) {
                int i12 = typedValue2.resourceId;
                if (i12 != 0) {
                    iValueOf = Integer.valueOf(i12);
                } else {
                    if (typedValue2.type != 16 || typedValue2.data != 0) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue2.string) + "' for " + p1VarA.b() + ". Must be a reference to a resource.");
                    }
                    iValueOf = 0;
                }
            } else {
                int i13 = typedValue2.resourceId;
                if (i13 != 0) {
                    if (p1VarA != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue2.string) + "' for " + p1VarA.b() + ". You must use a \"" + p1Var.b() + "\" type to reference other resources.");
                    }
                    iValueOf = Integer.valueOf(i13);
                    p1VarA = p1Var;
                } else if (p1VarA == p1.f57284q) {
                    objL = typedArray.getString(i11);
                } else {
                    int i14 = typedValue2.type;
                    if (i14 == 3) {
                        String string2 = typedValue2.string.toString();
                        if (p1VarA == null) {
                            p1VarA = p1.f57270c.b(string2);
                        }
                        objL = p1VarA.l(string2);
                    } else if (i14 == 4) {
                        p1VarA = f57230c.a(typedValue2, p1VarA, p1.f57278k, string, "float");
                        objL = Float.valueOf(typedValue2.getFloat());
                    } else if (i14 == 5) {
                        p1VarA = f57230c.a(typedValue2, p1VarA, p1.f57271d, string, "dimension");
                        objL = Integer.valueOf((int) typedValue2.getDimension(resources.getDisplayMetrics()));
                    } else if (i14 == 18) {
                        p1VarA = f57230c.a(typedValue2, p1VarA, p1.f57281n, string, "boolean");
                        objL = Boolean.valueOf(typedValue2.data != 0);
                    } else {
                        if (i14 < 16 || i14 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue2.type);
                        }
                        p1 p1Var2 = p1.f57278k;
                        if (p1VarA == p1Var2) {
                            p1VarA = f57230c.a(typedValue2, p1VarA, p1Var2, string, "float");
                            objL = Float.valueOf(typedValue2.data);
                        } else {
                            p1VarA = f57230c.a(typedValue2, p1VarA, p1.f57271d, string, "integer");
                            objL = Integer.valueOf(typedValue2.data);
                        }
                    }
                }
            }
            objL = iValueOf;
        }
        if (objL != null) {
            aVar.b(objL);
        }
        if (p1VarA != null) {
            aVar.d(p1VarA);
        }
        return aVar.a();
    }

    private final void e(Resources resources, Bundle bundle, AttributeSet attributeSet, int i10) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, z3.a.f58599m);
        kotlin.jvm.internal.s.g(typedArrayObtainAttributes, "obtainAttributes(...)");
        String string = typedArrayObtainAttributes.getString(z3.a.f58600n);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        v vVarD = d(typedArrayObtainAttributes, resources, i10);
        if (vVarD.b()) {
            vVarD.e(string, bundle);
        }
        fl.g0 g0Var = fl.g0.f38750a;
        typedArrayObtainAttributes.recycle();
    }

    private final void f(Resources resources, d1 d1Var, AttributeSet attributeSet, int i10) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, z3.a.f58599m);
        kotlin.jvm.internal.s.g(typedArrayObtainAttributes, "obtainAttributes(...)");
        String string = typedArrayObtainAttributes.getString(z3.a.f58600n);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        d1Var.a(string, d(typedArrayObtainAttributes, resources, i10));
        fl.g0 g0Var = fl.g0.f38750a;
        typedArrayObtainAttributes.recycle();
    }

    private final void g(Resources resources, d1 d1Var, AttributeSet attributeSet) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, z3.a.f58604r);
        kotlin.jvm.internal.s.g(typedArrayObtainAttributes, "obtainAttributes(...)");
        String string = typedArrayObtainAttributes.getString(z3.a.f58607u);
        String string2 = typedArrayObtainAttributes.getString(z3.a.f58605s);
        String string3 = typedArrayObtainAttributes.getString(z3.a.f58606t);
        if ((string == null || string.length() == 0) && ((string2 == null || string2.length() == 0) && (string3 == null || string3.length() == 0))) {
            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
        }
        x0.a aVar = new x0.a();
        if (string != null) {
            String packageName = this.f57232a.getPackageName();
            kotlin.jvm.internal.s.g(packageName, "getPackageName(...)");
            aVar.d(bm.r.I(string, "${applicationId}", packageName, false, 4, null));
        }
        if (string2 != null && string2.length() != 0) {
            String packageName2 = this.f57232a.getPackageName();
            kotlin.jvm.internal.s.g(packageName2, "getPackageName(...)");
            aVar.b(bm.r.I(string2, "${applicationId}", packageName2, false, 4, null));
        }
        if (string3 != null) {
            String packageName3 = this.f57232a.getPackageName();
            kotlin.jvm.internal.s.g(packageName3, "getPackageName(...)");
            aVar.c(bm.r.I(string3, "${applicationId}", packageName3, false, 4, null));
        }
        d1Var.b(aVar.a());
        fl.g0 g0Var = fl.g0.f38750a;
        typedArrayObtainAttributes.recycle();
    }

    public final g1 b(int i10) {
        int next;
        Resources resources = this.f57232a.getResources();
        XmlResourceParser xml = resources.getXml(i10);
        kotlin.jvm.internal.s.g(xml, "getXml(...)");
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i10) + " line " + xml.getLineNumber(), e10);
                }
            } catch (Throwable th2) {
                xml.close();
                throw th2;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        kotlin.jvm.internal.s.e(resources);
        kotlin.jvm.internal.s.e(attributeSetAsAttributeSet);
        d1 d1VarA = a(resources, xml, attributeSetAsAttributeSet, i10);
        if (d1VarA instanceof g1) {
            g1 g1Var = (g1) d1VarA;
            xml.close();
            return g1Var;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
