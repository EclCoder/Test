package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import x5.o;
import x5.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class Registry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f11119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h6.a f11120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h6.e f11121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h6.f f11122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.data.f f11123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e6.f f11124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h6.b f11125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h6.d f11126h = new h6.d();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final h6.c f11127i = new h6.c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final m0.d f11128j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public NoModelLoaderAvailableException(Object obj, List list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }

        public NoModelLoaderAvailableException(Class cls, Class cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        m0.d dVarE = n6.a.e();
        this.f11128j = dVarE;
        this.f11119a = new p(dVarE);
        this.f11120b = new h6.a();
        this.f11121c = new h6.e();
        this.f11122d = new h6.f();
        this.f11123e = new com.bumptech.glide.load.data.f();
        this.f11124f = new e6.f();
        this.f11125g = new h6.b();
        r(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    private List f(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f11121c.d(cls, cls2)) {
            for (Class cls5 : this.f11124f.b(cls4, cls3)) {
                arrayList.add(new com.bumptech.glide.load.engine.i(cls, cls4, cls5, this.f11121c.b(cls, cls4), this.f11124f.a(cls4, cls5), this.f11128j));
            }
        }
        return arrayList;
    }

    public Registry a(Class cls, Class cls2, r5.i iVar) {
        e("legacy_append", cls, cls2, iVar);
        return this;
    }

    public Registry b(Class cls, Class cls2, o oVar) {
        this.f11119a.a(cls, cls2, oVar);
        return this;
    }

    public Registry c(Class cls, r5.d dVar) {
        this.f11120b.a(cls, dVar);
        return this;
    }

    public Registry d(Class cls, r5.j jVar) {
        this.f11122d.a(cls, jVar);
        return this;
    }

    public Registry e(String str, Class cls, Class cls2, r5.i iVar) {
        this.f11121c.a(str, iVar, cls, cls2);
        return this;
    }

    public List g() {
        List listB = this.f11125g.b();
        if (listB.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return listB;
    }

    public q h(Class cls, Class cls2, Class cls3) {
        Class cls4;
        Class cls5;
        Class cls6;
        q qVarA = this.f11127i.a(cls, cls2, cls3);
        q qVar = null;
        if (this.f11127i.c(qVarA)) {
            return null;
        }
        if (qVarA != null) {
            return qVarA;
        }
        List listF = f(cls, cls2, cls3);
        if (listF.isEmpty()) {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
        } else {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
            qVar = new q(cls4, cls5, cls6, listF, this.f11128j);
        }
        this.f11127i.d(cls4, cls5, cls6, qVar);
        return qVar;
    }

    public List i(Object obj) {
        return this.f11119a.d(obj);
    }

    public List j(Class cls, Class cls2, Class cls3) {
        List listA = this.f11126h.a(cls, cls2, cls3);
        if (listA == null) {
            listA = new ArrayList();
            Iterator it = this.f11119a.c(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : this.f11121c.d((Class) it.next(), cls2)) {
                    if (!this.f11124f.b(cls4, cls3).isEmpty() && !listA.contains(cls4)) {
                        listA.add(cls4);
                    }
                }
            }
            this.f11126h.b(cls, cls2, cls3, Collections.unmodifiableList(listA));
        }
        return listA;
    }

    public r5.j k(t5.c cVar) {
        r5.j jVarB = this.f11122d.b(cVar.b());
        if (jVarB != null) {
            return jVarB;
        }
        throw new NoResultEncoderAvailableException(cVar.b());
    }

    public com.bumptech.glide.load.data.e l(Object obj) {
        return this.f11123e.a(obj);
    }

    public r5.d m(Object obj) {
        r5.d dVarB = this.f11120b.b(obj.getClass());
        if (dVarB != null) {
            return dVarB;
        }
        throw new NoSourceEncoderAvailableException(obj.getClass());
    }

    public boolean n(t5.c cVar) {
        return this.f11122d.b(cVar.b()) != null;
    }

    public Registry o(ImageHeaderParser imageHeaderParser) {
        this.f11125g.a(imageHeaderParser);
        return this;
    }

    public Registry p(com.bumptech.glide.load.data.e.a aVar) {
        this.f11123e.b(aVar);
        return this;
    }

    public Registry q(Class cls, Class cls2, e6.e eVar) {
        this.f11124f.c(cls, cls2, eVar);
        return this;
    }

    public final Registry r(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.f11121c.e(arrayList);
        return this;
    }
}
