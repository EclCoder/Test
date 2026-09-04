package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class j0 implements i0 {
    j0() {
    }

    private static int a(int i10, Object obj, Object obj2) {
        h0 h0Var = (h0) obj;
        g0 g0Var = (g0) obj2;
        int iA = 0;
        if (h0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : h0Var.entrySet()) {
            iA += g0Var.a(i10, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    private static h0 b(Object obj, Object obj2) {
        h0 h0VarP = (h0) obj;
        h0 h0Var = (h0) obj2;
        if (!h0Var.isEmpty()) {
            if (!h0VarP.m()) {
                h0VarP = h0VarP.p();
            }
            h0VarP.o(h0Var);
        }
        return h0VarP;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public Map forMapData(Object obj) {
        return (h0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public g0.a forMapMetadata(Object obj) {
        return ((g0) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public Map forMutableMapData(Object obj) {
        return (h0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public int getSerializedSize(int i10, Object obj, Object obj2) {
        return a(i10, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public boolean isImmutable(Object obj) {
        return !((h0) obj).m();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public Object mergeFrom(Object obj, Object obj2) {
        return b(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public Object newMapField(Object obj) {
        return h0.i().p();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public Object toImmutable(Object obj) {
        ((h0) obj).n();
        return obj;
    }
}
