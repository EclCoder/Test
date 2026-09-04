package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class c0 implements b0 {
    c0() {
    }

    static x.b d(Object obj, long j10) {
        return (x.b) l1.z(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void a(Object obj, long j10) {
        d(obj, j10).makeImmutable();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void b(Object obj, Object obj2, long j10) {
        x.b bVarD = d(obj, j10);
        x.b bVarD2 = d(obj2, j10);
        int size = bVarD.size();
        int size2 = bVarD2.size();
        if (size > 0 && size2 > 0) {
            if (!bVarD.isModifiable()) {
                bVarD = bVarD.mutableCopyWithCapacity(size2 + size);
            }
            bVarD.addAll(bVarD2);
        }
        if (size > 0) {
            bVarD2 = bVarD;
        }
        l1.O(obj, j10, bVarD2);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public List c(Object obj, long j10) {
        x.b bVarD = d(obj, j10);
        if (bVarD.isModifiable()) {
            return bVarD;
        }
        int size = bVarD.size();
        x.b bVarMutableCopyWithCapacity = bVarD.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        l1.O(obj, j10, bVarMutableCopyWithCapacity);
        return bVarMutableCopyWithCapacity;
    }
}
