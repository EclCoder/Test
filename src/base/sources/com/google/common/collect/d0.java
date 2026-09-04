package com.google.common.collect;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class d0 extends f0 implements k0 {
    private static final long serialVersionUID = 0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends f0.c {
        public d0 d() {
            return (d0) super.a();
        }

        public a e(Object obj, Object obj2) {
            super.c(obj, obj2);
            return this;
        }
    }

    d0(e0 e0Var, int i10) {
        super(e0Var, i10);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i10 = objectInputStream.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException("Invalid key count " + i10);
        }
        e0.a aVarG = e0.g();
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            int i13 = objectInputStream.readInt();
            if (i13 <= 0) {
                throw new InvalidObjectException("Invalid value count " + i13);
            }
            c0.a aVarR = c0.r();
            for (int i14 = 0; i14 < i13; i14++) {
                Object object2 = objectInputStream.readObject();
                Objects.requireNonNull(object2);
                aVarR.a(object2);
            }
            aVarG.g(object, aVarR.m());
            i11 += i13;
        }
        try {
            f0.e.f21746a.b(this, aVarG.d());
            f0.e.f21747b.a(this, i11);
        } catch (IllegalArgumentException e10) {
            throw ((InvalidObjectException) new InvalidObjectException(e10.getMessage()).initCause(e10));
        }
    }

    static d0 w(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return y();
        }
        e0.a aVar = new e0.a(collection.size());
        Iterator it = collection.iterator();
        int size = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            c0 c0VarX = comparator == null ? c0.x(collection2) : c0.K(comparator, collection2);
            if (!c0VarX.isEmpty()) {
                aVar.g(key, c0VarX);
                size += c0VarX.size();
            }
        }
        return new d0(aVar.d(), size);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        e1.d(this, objectOutputStream);
    }

    public static d0 y() {
        return t.f21876g;
    }

    @Override // com.google.common.collect.o0
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public c0 get(Object obj) {
        c0 c0Var = (c0) this.f21733e.get(obj);
        return c0Var == null ? c0.C() : c0Var;
    }
}
