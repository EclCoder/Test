package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class e1 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Field f21726a;

        void a(Object obj, int i10) {
            try {
                this.f21726a.set(obj, Integer.valueOf(i10));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        void b(Object obj, Object obj2) {
            try {
                this.f21726a.set(obj, obj2);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        private b(Field field) {
            this.f21726a = field;
            field.setAccessible(true);
        }
    }

    static b a(Class cls, String str) {
        try {
            return new b(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e10) {
            throw new AssertionError(e10);
        }
    }

    static void b(r0 r0Var, ObjectInputStream objectInputStream) {
        c(r0Var, objectInputStream, objectInputStream.readInt());
    }

    static void c(r0 r0Var, ObjectInputStream objectInputStream, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            r0Var.s(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    static void d(o0 o0Var, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(o0Var.g().size());
        for (Map.Entry entry : o0Var.g().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    static void e(r0 r0Var, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(r0Var.entrySet().size());
        for (r0.a aVar : r0Var.entrySet()) {
            objectOutputStream.writeObject(aVar.d());
            objectOutputStream.writeInt(aVar.getCount());
        }
    }
}
