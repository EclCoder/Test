package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class r0 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f3692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i1 f3693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f3694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f3695d;

    private r0(i1 i1Var, o oVar, n0 n0Var) {
        this.f3693b = i1Var;
        this.f3694c = oVar.e(n0Var);
        this.f3695d = oVar;
        this.f3692a = n0Var;
    }

    private int c(i1 i1Var, Object obj) {
        return i1Var.i(i1Var.g(obj));
    }

    private void d(i1 i1Var, o oVar, Object obj, b1 b1Var, n nVar) throws Throwable {
        i1 i1Var2;
        Object objF = i1Var.f(obj);
        r rVarD = oVar.d(obj);
        while (b1Var.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                i1Var2 = i1Var;
                o oVar2 = oVar;
                b1 b1Var2 = b1Var;
                n nVar2 = nVar;
                try {
                    if (!f(b1Var2, nVar2, oVar2, rVarD, i1Var2, objF)) {
                        i1Var2.o(obj, objF);
                        return;
                    }
                    b1Var = b1Var2;
                    nVar = nVar2;
                    oVar = oVar2;
                    i1Var = i1Var2;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    i1Var2.o(obj, objF);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                i1Var2 = i1Var;
            }
        }
        i1Var.o(obj, objF);
    }

    static r0 e(i1 i1Var, o oVar, n0 n0Var) {
        return new r0(i1Var, oVar, n0Var);
    }

    private boolean f(b1 b1Var, n nVar, o oVar, r rVar, i1 i1Var, Object obj) throws InvalidProtocolBufferException {
        int tag = b1Var.getTag();
        int uInt32 = 0;
        if (tag != n1.f3625a) {
            if (n1.b(tag) != 2) {
                return b1Var.skipField();
            }
            Object objB = oVar.b(nVar, this.f3692a, n1.a(tag));
            if (objB == null) {
                return i1Var.m(obj, b1Var, 0);
            }
            oVar.h(b1Var, objB, nVar, rVar);
            return true;
        }
        Object objB2 = null;
        g bytes = null;
        while (b1Var.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = b1Var.getTag();
            if (tag2 == n1.f3627c) {
                uInt32 = b1Var.readUInt32();
                objB2 = oVar.b(nVar, this.f3692a, uInt32);
            } else if (tag2 == n1.f3628d) {
                if (objB2 != null) {
                    oVar.h(b1Var, objB2, nVar, rVar);
                } else {
                    bytes = b1Var.readBytes();
                }
            } else if (!b1Var.skipField()) {
                break;
            }
        }
        if (b1Var.getTag() != n1.f3626b) {
            throw InvalidProtocolBufferException.g();
        }
        if (bytes != null) {
            if (objB2 != null) {
                oVar.i(bytes, objB2, nVar, rVar);
            } else {
                i1Var.d(obj, uInt32, bytes);
            }
        }
        return true;
    }

    private void g(i1 i1Var, Object obj, o1 o1Var) {
        i1Var.s(i1Var.g(obj), o1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public void a(Object obj, b1 b1Var, n nVar) throws Throwable {
        d(this.f3693b, this.f3695d, obj, b1Var, nVar);
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public void b(Object obj, o1 o1Var) {
        Iterator itN = this.f3695d.c(obj).n();
        if (itN.hasNext()) {
            android.support.v4.media.session.b.a(((Map.Entry) itN.next()).getKey());
            throw null;
        }
        g(this.f3693b, obj, o1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public boolean equals(Object obj, Object obj2) {
        if (!this.f3693b.g(obj).equals(this.f3693b.g(obj2))) {
            return false;
        }
        if (this.f3694c) {
            return this.f3695d.c(obj).equals(this.f3695d.c(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public int getSerializedSize(Object obj) {
        int iC = c(this.f3693b, obj);
        return this.f3694c ? iC + this.f3695d.c(obj).f() : iC;
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public int hashCode(Object obj) {
        int iHashCode = this.f3693b.g(obj).hashCode();
        return this.f3694c ? (iHashCode * 53) + this.f3695d.c(obj).hashCode() : iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public final boolean isInitialized(Object obj) {
        return this.f3695d.c(obj).k();
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public void makeImmutable(Object obj) {
        this.f3693b.j(obj);
        this.f3695d.f(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public void mergeFrom(Object obj, Object obj2) {
        e1.F(this.f3693b, obj, obj2);
        if (this.f3694c) {
            e1.D(this.f3695d, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public Object newInstance() {
        n0 n0Var = this.f3692a;
        return n0Var instanceof v ? ((v) n0Var).E() : n0Var.newBuilderForType().buildPartial();
    }
}
