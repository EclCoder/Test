package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a extends c {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        transient sc.x f21862g;

        a(Map map, sc.x xVar) {
            super(map);
            this.f21862g = (sc.x) sc.p.o(xVar);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            this.f21862g = (sc.x) object;
            Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            C((Map) object2);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f21862g);
            objectOutputStream.writeObject(v());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.d
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public List w() {
            return (List) this.f21862g.get();
        }

        @Override // com.google.common.collect.f
        Map i() {
            return y();
        }

        @Override // com.google.common.collect.f
        Set k() {
            return z();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static abstract class b extends AbstractCollection {
        b() {
        }

        abstract o0 a();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().h(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    static boolean a(o0 o0Var, Object obj) {
        if (obj == o0Var) {
            return true;
        }
        if (obj instanceof o0) {
            return o0Var.g().equals(((o0) obj).g());
        }
        return false;
    }

    public static k0 b(Map map, sc.x xVar) {
        return new a(map, xVar);
    }
}
