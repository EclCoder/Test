package gn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class x implements Iterable, ul.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f39772b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f39773c = new x(new String[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f39774a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f39775a = new ArrayList(20);

        public final a a(String name, String value) {
            kotlin.jvm.internal.s.h(name, "name");
            kotlin.jvm.internal.s.h(value, "value");
            return hn.j.b(this, name, value);
        }

        public final a b(String line) {
            kotlin.jvm.internal.s.h(line, "line");
            int iE0 = bm.r.e0(line, ':', 1, false, 4, null);
            if (iE0 != -1) {
                String strSubstring = line.substring(0, iE0);
                kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
                String strSubstring2 = line.substring(iE0 + 1);
                kotlin.jvm.internal.s.g(strSubstring2, "substring(...)");
                c(strSubstring, strSubstring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                c("", line);
                return this;
            }
            String strSubstring3 = line.substring(1);
            kotlin.jvm.internal.s.g(strSubstring3, "substring(...)");
            c("", strSubstring3);
            return this;
        }

        public final a c(String name, String value) {
            kotlin.jvm.internal.s.h(name, "name");
            kotlin.jvm.internal.s.h(value, "value");
            return hn.j.c(this, name, value);
        }

        public final x d() {
            return hn.j.d(this);
        }

        public final String e(String name) {
            kotlin.jvm.internal.s.h(name, "name");
            return hn.j.f(this, name);
        }

        public final List f() {
            return this.f39775a;
        }

        public final a g(String name) {
            kotlin.jvm.internal.s.h(name, "name");
            return hn.j.m(this, name);
        }

        public final a h(String name, String value) {
            kotlin.jvm.internal.s.h(name, "name");
            kotlin.jvm.internal.s.h(value, "value");
            return hn.j.n(this, name, value);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x a(Map map) {
            kotlin.jvm.internal.s.h(map, "<this>");
            return hn.j.o(map);
        }

        public final x b(String... namesAndValues) {
            kotlin.jvm.internal.s.h(namesAndValues, "namesAndValues");
            return hn.j.i((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        private b() {
        }
    }

    public x(String[] namesAndValues) {
        kotlin.jvm.internal.s.h(namesAndValues, "namesAndValues");
        this.f39774a = namesAndValues;
    }

    public final String a(String name) {
        kotlin.jvm.internal.s.h(name, "name");
        return hn.j.h(this.f39774a, name);
    }

    public final String[] b() {
        return this.f39774a;
    }

    public final String d(int i10) {
        return hn.j.k(this, i10);
    }

    public boolean equals(Object obj) {
        return hn.j.e(this, obj);
    }

    public final a f() {
        return hn.j.l(this);
    }

    public final Map g() {
        TreeMap treeMap = new TreeMap(bm.r.C(o0.f43602a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strD = d(i10);
            Locale US = Locale.US;
            kotlin.jvm.internal.s.g(US, "US");
            String lowerCase = strD.toLowerCase(US);
            kotlin.jvm.internal.s.g(lowerCase, "toLowerCase(...)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(h(i10));
        }
        return treeMap;
    }

    public final String h(int i10) {
        return hn.j.q(this, i10);
    }

    public int hashCode() {
        return hn.j.g(this);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return hn.j.j(this);
    }

    public final List k(String name) {
        kotlin.jvm.internal.s.h(name, "name");
        return hn.j.r(this, name);
    }

    public final int size() {
        return this.f39774a.length / 2;
    }

    public String toString() {
        return hn.j.p(this);
    }
}
