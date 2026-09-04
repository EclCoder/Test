package n5;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static d f46849f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Set f46844a = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Set f46845b = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Set f46846c = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Set f46847d = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static boolean f46848e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static boolean f46850g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static boolean f46851h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static boolean f46852i = true;

    public static int a(StringBuilder sb2, String str, int i10, StackTraceElement stackTraceElement, boolean z10, boolean z11, String str2) {
        if (i10 <= 0) {
            return 0;
        }
        if (f46849f == null) {
            throw new IllegalArgumentException("Stack trace element serializer not initialized.");
        }
        sb2.append(str2);
        if (i10 == 1) {
            sb2.append(f46849f.b(stackTraceElement, z10, z11));
            return 0;
        }
        sb2.append(String.format("%s%s ... %d more", f46849f.a(stackTraceElement), str, Integer.valueOf(i10 - 1)));
        if (!z11) {
            return 0;
        }
        sb2.append(f46849f.c(stackTraceElement));
        return 0;
    }

    public static boolean b(String str, Set set) {
        return c(str, set) != null;
    }

    public static String c(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str.startsWith(str2)) {
                return str2;
            }
        }
        return null;
    }

    public static StackTraceElement[] d(f fVar, int i10) {
        ArrayList arrayList = new ArrayList();
        if (fVar != null) {
            e[] eVarArrD = fVar.d();
            for (int i11 = 0; i11 < eVarArrD.length && i11 < i10; i11++) {
                arrayList.add(eVarArrD[i11].a());
            }
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
    }

    public static StackTraceElement[] e(f fVar, Set set, Set set2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (fVar != null) {
            for (e eVar : fVar.d()) {
                String className = eVar.a().getClassName();
                if (!k(className)) {
                    if (b(className, set)) {
                        arrayList.addAll(arrayList2);
                        arrayList.add(eVar.a());
                    } else if (!b(className, set2)) {
                        arrayList2.add(eVar.a());
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(arrayList2);
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
    }

    public static String f(f fVar) {
        return h(fVar, f46844a, f46845b, f46846c, 0, f46848e, f46850g);
    }

    public static String g(f fVar, String str, boolean z10, boolean z11, Set set, Set set2, Set set3, int i10, boolean z12, boolean z13, boolean z14, boolean z15) {
        Set set4;
        Set set5;
        StackTraceElement[] stackTraceElementArrE;
        StackTraceElement stackTraceElement;
        StringBuilder sb2 = new StringBuilder();
        if (fVar == null) {
            return "";
        }
        String strB = fVar.b();
        if (i10 > 0) {
            stackTraceElementArrE = d(fVar, i10);
            set4 = set;
            set5 = set3;
        } else {
            set4 = set;
            set5 = set3;
            stackTraceElementArrE = e(fVar, set4, set5);
        }
        StackTraceElement[] stackTraceElementArr = stackTraceElementArrE;
        String strC = fVar.c();
        if (k(strC)) {
            strC = fVar.c();
        }
        if (z10) {
            sb2.append(System.lineSeparator());
            sb2.append(str);
            sb2.append("Caused by: ");
        } else if (z11) {
            sb2.append(System.lineSeparator());
            sb2.append(str);
            sb2.append("Suppressed: ");
        }
        sb2.append(strB);
        if (!k(strC)) {
            sb2.append(": ");
            sb2.append(strC);
        }
        int length = stackTraceElementArr.length;
        int i11 = 0;
        String str2 = null;
        int i12 = 0;
        StackTraceElement stackTraceElement2 = null;
        while (i11 < length) {
            StackTraceElement stackTraceElement3 = stackTraceElementArr[i11];
            String strC2 = c(stackTraceElement3.getClassName(), set2);
            if (strC2 == null) {
                String str3 = str2;
                int i13 = i12;
                StackTraceElement stackTraceElement4 = stackTraceElement2;
                int iA = a(sb2, str3, i13, stackTraceElement4, z14, z13, str);
                sb2.append(System.lineSeparator());
                sb2.append(str);
                sb2.append("\tat ");
                if (f46849f == null) {
                    throw new IllegalArgumentException("Stack trace element serializer not initialized.");
                }
                sb2.append(str);
                sb2.append(f46849f.b(stackTraceElement3, z14, z13));
                stackTraceElement = stackTraceElement4;
                str2 = null;
                i12 = iA;
            } else if (strC2.equals(str2)) {
                str2 = str2;
                stackTraceElement = stackTraceElement2;
                i12++;
            } else {
                stackTraceElement = stackTraceElement3;
                a(sb2, str2, i12, stackTraceElement2, z14, z13, str);
                sb2.append(System.lineSeparator());
                sb2.append(str);
                sb2.append("\tat ");
                i12 = 1;
                str2 = strC2;
            }
            i11++;
            stackTraceElement2 = stackTraceElement;
        }
        a(sb2, str2, i12, stackTraceElement2, z14, z13, str);
        f[] fVarArrE = fVar.e();
        if (fVarArrE != null && fVarArrE.length > 0 && z15) {
            int i14 = 0;
            for (int length2 = fVarArrE.length; i14 < length2; length2 = length2) {
                f[] fVarArr = fVarArrE;
                sb2.append(g(fVarArr[i14], str + "\t", false, true, set4, set2, set5, i10, z12, z13, z14, z15));
                i14++;
                set4 = set;
                set5 = set3;
                fVarArrE = fVarArr;
            }
        }
        f fVarA = fVar.a();
        if (fVarA != null && !b(strB, f46847d) && !z12) {
            sb2.append(g(fVarA, str, true, false, set, set2, set3, i10, z12, z13, z14, z15));
        }
        return sb2.toString();
    }

    public static String h(f fVar, Set set, Set set2, Set set3, int i10, boolean z10, boolean z11) {
        return i(fVar, set, set2, set3, i10, z10, z11, f46851h);
    }

    public static String i(f fVar, Set set, Set set2, Set set3, int i10, boolean z10, boolean z11, boolean z12) {
        return j(fVar, false, false, set, set2, set3, i10, z10, z11, z12, f46852i);
    }

    public static String j(f fVar, boolean z10, boolean z11, Set set, Set set2, Set set3, int i10, boolean z12, boolean z13, boolean z14, boolean z15) {
        return g(fVar, "", z10, z11, set, set2, set3, i10, z12, z13, z14, z15);
    }

    public static boolean k(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static String l(Class cls) {
        String string;
        int iLastIndexOf;
        if (cls == null) {
            return null;
        }
        try {
            URL resource = cls.getClassLoader().getResource(cls.getName().replace('.', '/') + ".class");
            if (resource == null || (iLastIndexOf = (string = resource.toString()).lastIndexOf(33)) <= 0) {
                return null;
            }
            String strSubstring = string.substring(0, iLastIndexOf);
            int iLastIndexOf2 = strSubstring.lastIndexOf(47);
            if (iLastIndexOf2 > 0) {
                strSubstring = strSubstring.substring(iLastIndexOf2 + 1);
            }
            int iLastIndexOf3 = strSubstring.lastIndexOf(92);
            return iLastIndexOf3 > 0 ? strSubstring.substring(iLastIndexOf3 + 1) : strSubstring;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String m(String str, String str2) {
        boolean z10 = str != null;
        boolean z11 = str2 != null;
        if (!z10 && !z11) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" [");
        if (z10) {
            sb2.append(str);
        }
        if (z11) {
            if (!z10) {
                sb2.append(str2);
            } else if (!str.contains(str2)) {
                sb2.append(":");
                sb2.append(str2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public static String n(String str) {
        int iLastIndexOf;
        return (str != null && (iLastIndexOf = str.lastIndexOf(".")) >= 0) ? str.substring(0, iLastIndexOf) : "";
    }

    public static void o(String str) {
        f46844a.add(str);
    }

    public static void p(d dVar) {
        f46849f = dVar;
    }

    public static String q(c cVar, Class cls, String str) {
        try {
            Package r10 = cls.getPackage();
            if (r10 != null) {
                return r10.getImplementationVersion();
            }
            Package packageA = cVar.a(cls.getClassLoader(), str);
            if (packageA != null) {
                return packageA.getImplementationVersion();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
