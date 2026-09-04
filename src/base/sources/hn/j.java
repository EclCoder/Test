package hn;

import bm.r;
import fl.q;
import fl.w;
import gn.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j {
    private static final String a(char c10) {
        String string = Integer.toString(c10, bm.a.a(16));
        s.g(string, "toString(...)");
        if (string.length() >= 2) {
            return string;
        }
        return '0' + string;
    }

    public static final x.a b(x.a aVar, String name, String value) {
        s.h(aVar, "<this>");
        s.h(name, "name");
        s.h(value, "value");
        s(name);
        t(value, name);
        c(aVar, name, value);
        return aVar;
    }

    public static final x.a c(x.a aVar, String name, String value) {
        s.h(aVar, "<this>");
        s.h(name, "name");
        s.h(value, "value");
        aVar.f().add(name);
        aVar.f().add(r.V0(value).toString());
        return aVar;
    }

    public static final x d(x.a aVar) {
        s.h(aVar, "<this>");
        return new x((String[]) aVar.f().toArray(new String[0]));
    }

    public static final boolean e(x xVar, Object obj) {
        s.h(xVar, "<this>");
        return (obj instanceof x) && Arrays.equals(xVar.b(), ((x) obj).b());
    }

    public static final String f(x.a aVar, String name) {
        s.h(aVar, "<this>");
        s.h(name, "name");
        int size = aVar.f().size() - 2;
        int iB = nl.c.b(size, 0, -2);
        if (iB > size) {
            return null;
        }
        while (!r.A(name, (String) aVar.f().get(size), true)) {
            if (size == iB) {
                return null;
            }
            size -= 2;
        }
        return (String) aVar.f().get(size + 1);
    }

    public static final int g(x xVar) {
        s.h(xVar, "<this>");
        return Arrays.hashCode(xVar.b());
    }

    public static final String h(String[] namesAndValues, String name) {
        s.h(namesAndValues, "namesAndValues");
        s.h(name, "name");
        int length = namesAndValues.length - 2;
        int iB = nl.c.b(length, 0, -2);
        if (iB > length) {
            return null;
        }
        while (!r.A(name, namesAndValues[length], true)) {
            if (length == iB) {
                return null;
            }
            length -= 2;
        }
        return namesAndValues[length + 1];
    }

    public static final x i(String... inputNamesAndValues) {
        s.h(inputNamesAndValues, "inputNamesAndValues");
        if (inputNamesAndValues.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr = (String[]) Arrays.copyOf(inputNamesAndValues, inputNamesAndValues.length);
        int length = strArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (strArr[i11] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr[i11] = r.V0(inputNamesAndValues[i11]).toString();
        }
        int iB = nl.c.b(0, strArr.length - 1, 2);
        if (iB >= 0) {
            while (true) {
                String str = strArr[i10];
                String str2 = strArr[i10 + 1];
                s(str);
                t(str2, str);
                if (i10 == iB) {
                    break;
                }
                i10 += 2;
            }
        }
        return new x(strArr);
    }

    public static final Iterator j(x xVar) {
        s.h(xVar, "<this>");
        int size = xVar.size();
        q[] qVarArr = new q[size];
        for (int i10 = 0; i10 < size; i10++) {
            qVarArr[i10] = w.a(xVar.d(i10), xVar.h(i10));
        }
        return kotlin.jvm.internal.c.a(qVarArr);
    }

    public static final String k(x xVar, int i10) {
        s.h(xVar, "<this>");
        String str = (String) gl.j.X(xVar.b(), i10 * 2);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i10 + ']');
    }

    public static final x.a l(x xVar) {
        s.h(xVar, "<this>");
        x.a aVar = new x.a();
        gl.r.A(aVar.f(), xVar.b());
        return aVar;
    }

    public static final x.a m(x.a aVar, String name) {
        s.h(aVar, "<this>");
        s.h(name, "name");
        int i10 = 0;
        while (i10 < aVar.f().size()) {
            if (r.A(name, (String) aVar.f().get(i10), true)) {
                aVar.f().remove(i10);
                aVar.f().remove(i10);
                i10 -= 2;
            }
            i10 += 2;
        }
        return aVar;
    }

    public static final x.a n(x.a aVar, String name, String value) {
        s.h(aVar, "<this>");
        s.h(name, "name");
        s.h(value, "value");
        s(name);
        t(value, name);
        aVar.g(name);
        c(aVar, name, value);
        return aVar;
    }

    public static final x o(Map map) {
        s.h(map, "<this>");
        String[] strArr = new String[map.size() * 2];
        int i10 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String string = r.V0(str).toString();
            String string2 = r.V0(str2).toString();
            s(string);
            t(string2, string);
            strArr[i10] = string;
            strArr[i10 + 1] = string2;
            i10 += 2;
        }
        return new x(strArr);
    }

    public static final String p(x xVar) {
        s.h(xVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        int size = xVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strD = xVar.d(i10);
            String strH = xVar.h(i10);
            sb2.append(strD);
            sb2.append(": ");
            if (m.y(strD)) {
                strH = "██";
            }
            sb2.append(strH);
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public static final String q(x xVar, int i10) {
        s.h(xVar, "<this>");
        String str = (String) gl.j.X(xVar.b(), (i10 * 2) + 1);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i10 + ']');
    }

    public static final List r(x xVar, String name) {
        s.h(xVar, "<this>");
        s.h(name, "name");
        int size = xVar.size();
        List listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (r.A(name, xVar.d(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(xVar.h(i10));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            s.g(listUnmodifiableList, "unmodifiableList(...)");
        }
        return listUnmodifiableList == null ? gl.r.l() : listUnmodifiableList;
    }

    public static final void s(String name) {
        s.h(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = name.charAt(i10);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(("Unexpected char 0x" + a(cCharAt) + " at " + i10 + " in header name: " + name).toString());
            }
        }
    }

    public static final void t(String value, String name) {
        s.h(value, "value");
        s.h(name, "name");
        int length = value.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = value.charAt(i10);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected char 0x");
                sb2.append(a(cCharAt));
                sb2.append(" at ");
                sb2.append(i10);
                sb2.append(" in ");
                sb2.append(name);
                sb2.append(" value");
                sb2.append(m.y(name) ? "" : ": " + value);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }
}
