package o2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface p {
    int b(q qVar, i0 i0Var);

    void c(r rVar);

    boolean d(q qVar);

    default List f() {
        return com.google.common.collect.c0.C();
    }

    void release();

    void seek(long j10, long j11);

    default p e() {
        return this;
    }
}
