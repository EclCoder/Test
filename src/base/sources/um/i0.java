package um;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a0.a f54769a = new a0.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a0.a f54770b = new a0.a();

    private static final Map b(rm.f fVar, kotlinx.serialization.json.b bVar) {
        String lowerCase;
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean zD = d(bVar, fVar);
        m(fVar, bVar);
        int iE = fVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            List listG = fVar.g(i10);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listG) {
                if (obj instanceof kotlinx.serialization.json.y) {
                    arrayList.add(obj);
                }
            }
            kotlinx.serialization.json.y yVar = (kotlinx.serialization.json.y) gl.r.x0(arrayList);
            if (yVar != null && (strArrNames = yVar.names()) != null) {
                for (String lowerCase2 : strArrNames) {
                    if (zD) {
                        lowerCase2 = lowerCase2.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.s.g(lowerCase2, "toLowerCase(...)");
                    }
                    c(linkedHashMap, fVar, lowerCase2, i10);
                }
            }
            if (zD) {
                lowerCase = fVar.f(i10).toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.s.g(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                c(linkedHashMap, fVar, lowerCase, i10);
            }
        }
        return linkedHashMap.isEmpty() ? gl.l0.h() : linkedHashMap;
    }

    private static final void c(Map map, rm.f fVar, String str, int i10) {
        String str2 = kotlin.jvm.internal.s.c(fVar.d(), rm.m.b.f51420a) ? "enum value" : "property";
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i10));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for " + str2 + ' ' + fVar.f(i10) + " is already one of the names for " + str2 + ' ' + fVar.f(((Number) gl.l0.i(map, str)).intValue()) + " in " + fVar);
    }

    private static final boolean d(kotlinx.serialization.json.b bVar, rm.f fVar) {
        return bVar.e().h() && kotlin.jvm.internal.s.c(fVar.d(), rm.m.b.f51420a);
    }

    public static final Map e(final kotlinx.serialization.json.b bVar, final rm.f descriptor) {
        kotlin.jvm.internal.s.h(bVar, "<this>");
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        return (Map) kotlinx.serialization.json.i0.a(bVar).b(descriptor, f54769a, new tl.a() { // from class: um.h0
            @Override // tl.a
            public final Object invoke() {
                return i0.f(descriptor, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map f(rm.f fVar, kotlinx.serialization.json.b bVar) {
        return b(fVar, bVar);
    }

    public static final a0.a g() {
        return f54769a;
    }

    public static final String h(rm.f fVar, kotlinx.serialization.json.b json, int i10) {
        kotlin.jvm.internal.s.h(fVar, "<this>");
        kotlin.jvm.internal.s.h(json, "json");
        m(fVar, json);
        return fVar.f(i10);
    }

    public static final int i(rm.f fVar, kotlinx.serialization.json.b json, String name) {
        kotlin.jvm.internal.s.h(fVar, "<this>");
        kotlin.jvm.internal.s.h(json, "json");
        kotlin.jvm.internal.s.h(name, "name");
        if (d(json, fVar)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.s.g(lowerCase, "toLowerCase(...)");
            return l(fVar, json, lowerCase);
        }
        m(fVar, json);
        int iC = fVar.c(name);
        return (iC == -3 && json.e().o()) ? l(fVar, json, name) : iC;
    }

    public static final int j(rm.f fVar, kotlinx.serialization.json.b json, String name, String suffix) {
        kotlin.jvm.internal.s.h(fVar, "<this>");
        kotlin.jvm.internal.s.h(json, "json");
        kotlin.jvm.internal.s.h(name, "name");
        kotlin.jvm.internal.s.h(suffix, "suffix");
        int i10 = i(fVar, json, name);
        if (i10 != -3) {
            return i10;
        }
        throw new SerializationException(fVar.i() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static /* synthetic */ int k(rm.f fVar, kotlinx.serialization.json.b bVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        return j(fVar, bVar, str, str2);
    }

    private static final int l(rm.f fVar, kotlinx.serialization.json.b bVar, String str) {
        Integer num = (Integer) e(bVar, fVar).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final kotlinx.serialization.json.z m(rm.f fVar, kotlinx.serialization.json.b json) {
        kotlin.jvm.internal.s.h(fVar, "<this>");
        kotlin.jvm.internal.s.h(json, "json");
        if (kotlin.jvm.internal.s.c(fVar.d(), rm.n.a.f51421a)) {
            json.e().l();
        }
        return null;
    }
}
