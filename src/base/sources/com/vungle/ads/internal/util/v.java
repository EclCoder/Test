package com.vungle.ads.internal.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class v extends ObjectInputStream {
    private final List<Class<?>> allowed;

    /* JADX WARN: Multi-variable type inference failed */
    public v(InputStream inputStream, List<? extends Class<?>> list) {
        super(inputStream);
        this.allowed = list;
    }

    @Override // java.io.ObjectInputStream
    protected Class<?> resolveClass(ObjectStreamClass desc) throws ClassNotFoundException, IOException {
        kotlin.jvm.internal.s.h(desc, "desc");
        Class<?> c10 = super.resolveClass(desc);
        if (this.allowed == null || Number.class.isAssignableFrom(c10) || kotlin.jvm.internal.s.c(String.class, c10) || kotlin.jvm.internal.s.c(Boolean.class, c10) || c10.isArray() || this.allowed.contains(c10)) {
            kotlin.jvm.internal.s.g(c10, "c");
            return c10;
        }
        throw new IOException("Deserialization is not allowed for " + desc.getName());
    }
}
