package com.squareup.moshi;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class c extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f.e f35451d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.squareup.moshi.b f35452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b[] f35453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i.a f35454c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements f.e {
        a() {
        }

        private void b(r rVar, Type type, Map map) {
            e eVar;
            Class clsG = u.g(type);
            boolean zI = vj.c.i(clsG);
            for (Field field : clsG.getDeclaredFields()) {
                if (c(zI, field.getModifiers()) && ((eVar = (e) field.getAnnotation(e.class)) == null || !eVar.ignore())) {
                    Type typeP = vj.c.p(type, clsG, field.getGenericType());
                    Set setJ = vj.c.j(field);
                    String name = field.getName();
                    f fVarF = rVar.f(typeP, setJ, name);
                    field.setAccessible(true);
                    String strL = vj.c.l(name, eVar);
                    b bVar = new b(strL, field, fVarF);
                    b bVar2 = (b) map.put(strL, bVar);
                    if (bVar2 != null) {
                        throw new IllegalArgumentException("Conflicting fields:\n    " + bVar2.f35456b + "\n    " + bVar.f35456b);
                    }
                }
            }
        }

        private boolean c(boolean z10, int i10) {
            if (Modifier.isStatic(i10) || Modifier.isTransient(i10)) {
                return false;
            }
            return Modifier.isPublic(i10) || Modifier.isProtected(i10) || !z10;
        }

        private void d(Type type, Class cls) {
            Class<?> clsG = u.g(type);
            if (cls.isAssignableFrom(clsG)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + clsG.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }

        @Override // com.squareup.moshi.f.e
        public f a(Type type, Set set, r rVar) {
            if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
                return null;
            }
            Class clsG = u.g(type);
            if (clsG.isInterface() || clsG.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (vj.c.i(clsG)) {
                d(type, List.class);
                d(type, Set.class);
                d(type, Map.class);
                d(type, Collection.class);
                String str = "Platform " + clsG;
                if (type instanceof ParameterizedType) {
                    str = str + " in " + type;
                }
                throw new IllegalArgumentException(str + " requires explicit JsonAdapter to be registered");
            }
            if (clsG.isAnonymousClass()) {
                throw new IllegalArgumentException("Cannot serialize anonymous class " + clsG.getName());
            }
            if (clsG.isLocalClass()) {
                throw new IllegalArgumentException("Cannot serialize local class " + clsG.getName());
            }
            if (clsG.getEnclosingClass() != null && !Modifier.isStatic(clsG.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize non-static nested class " + clsG.getName());
            }
            if (Modifier.isAbstract(clsG.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize abstract class " + clsG.getName());
            }
            if (vj.c.h(clsG)) {
                throw new IllegalArgumentException("Cannot serialize Kotlin type " + clsG.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
            }
            com.squareup.moshi.b bVarA = com.squareup.moshi.b.a(clsG);
            TreeMap treeMap = new TreeMap();
            while (type != Object.class) {
                b(rVar, type, treeMap);
                type = u.f(type);
            }
            return new c(bVarA, treeMap).nullSafe();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f35455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Field f35456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final f f35457c;

        b(String str, Field field, f fVar) {
            this.f35455a = str;
            this.f35456b = field;
            this.f35457c = fVar;
        }

        void a(i iVar, Object obj) throws IllegalAccessException {
            this.f35456b.set(obj, this.f35457c.fromJson(iVar));
        }

        void b(o oVar, Object obj) throws IllegalAccessException {
            this.f35457c.toJson(oVar, this.f35456b.get(obj));
        }
    }

    c(com.squareup.moshi.b bVar, Map map) {
        this.f35452a = bVar;
        this.f35453b = (b[]) map.values().toArray(new b[map.size()]);
        this.f35454c = i.a.a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    @Override // com.squareup.moshi.f
    public Object fromJson(i iVar) {
        try {
            Object objB = this.f35452a.b();
            try {
                iVar.h();
                while (iVar.q()) {
                    int iN0 = iVar.N0(this.f35454c);
                    if (iN0 == -1) {
                        iVar.W0();
                        iVar.X0();
                    } else {
                        this.f35453b[iN0].a(iVar, objB);
                    }
                }
                iVar.l();
                return objB;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw vj.c.s(e11);
        }
    }

    @Override // com.squareup.moshi.f
    public void toJson(o oVar, Object obj) {
        try {
            oVar.h();
            for (b bVar : this.f35453b) {
                oVar.t(bVar.f35455a);
                bVar.b(oVar, obj);
            }
            oVar.m();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonAdapter(" + this.f35452a + ")";
    }
}
